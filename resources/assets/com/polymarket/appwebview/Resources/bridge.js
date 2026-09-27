(function () {
  'use strict';

  if (window.PolyBridge) return;

  var NOTIFY_CHANNEL = 'polyJsBridge';
  var WITH_REPLY_CHANNEL = 'polyJsBridgeWithReply';

  function webkitHandler(channel) {
    var h =
      window.webkit &&
      window.webkit.messageHandlers &&
      window.webkit.messageHandlers[channel];
    return h && typeof h.postMessage === 'function' ? h : null;
  }

  function postNotify(envelope) {
    var webkit = webkitHandler(NOTIFY_CHANNEL);
    if (webkit) {
      webkit.postMessage(envelope);
      return;
    }
    var android = window[NOTIFY_CHANNEL];
    if (android && typeof android.postMessage === 'function') {
      android.postMessage(JSON.stringify(envelope));
      return;
    }
    console.warn('[PolyBridge] no notify transport available; dropped:', envelope);
  }

  var pendingReplies = {};
  var nextCallId = 1;

  function safeParse(text) {
    try {
      return JSON.parse(text);
    } catch (error) {
      return null;
    }
  }

  var androidWithReply = window[WITH_REPLY_CHANNEL];
  if (androidWithReply) {
    androidWithReply.onmessage = function (event) {
      var msg = safeParse(event && event.data);
      if (!msg || msg.callId == null) return;
      var pending = pendingReplies[msg.callId];
      if (!pending) return;
      delete pendingReplies[msg.callId];
      if ('error' in msg) {
        pending.reject(new Error(String(msg.error)));
      } else {
        pending.resolve(msg.result);
      }
    };
  }

  function postWithReply(envelope) {
    var webkit = webkitHandler(WITH_REPLY_CHANNEL);
    if (webkit) {
      return webkit.postMessage(envelope);
    }
    if (androidWithReply && typeof androidWithReply.postMessage === 'function') {
      var callId = nextCallId++;
      var promise = new Promise(function (resolve, reject) {
        pendingReplies[callId] = { resolve: resolve, reject: reject };
      });
      var withCallId = { method: envelope.method, callId: callId };
      if (envelope.data !== undefined) withCallId.data = envelope.data;
      androidWithReply.postMessage(JSON.stringify(withCallId));
      return promise;
    }
    return Promise.resolve('unsupported');
  }

  function notify(method, data) {
    var envelope = { method: method };
    if (data !== undefined && data !== null) envelope.data = data;
    postNotify(envelope);
  }

  function request(method, data) {
    var envelope = { method: method };
    if (data !== undefined && data !== null) envelope.data = data;
    return postWithReply(envelope);
  }

  var bridge = {
    notify: notify,
  };

  bridge.v1 = {
    haptics: function (style) {
      notify('haptics', { style: style });
    },
    close: function (metadata) {
      notify('close', metadata ? { metadata: metadata } : undefined);
    },
    open: function (url) {
      notify('open', { url: url });
    },
    logEvent: function (eventName, metadata) {
      var data = { eventName: eventName };
      if (metadata) data.metadata = metadata;
      notify('logEvent', data);
    },
    resetAuth: function () {
      notify('resetAuth');
    },
    pageReady: function (metadata) {
      notify('pageReady', metadata ? { metadata: metadata } : undefined);
    },
    requestPermission: function (permission) {
      return request('requestPermission', { permission: permission });
    },
    getDeviceAttestation: function () {
      return request('getDeviceAttestation');
    },
  };

  function featureNamespace(id, entry) {
    var namespace = { version: entry && entry.version ? String(entry.version) : '0.0.0' };
    var methods = (entry && entry.methods) || {};
    Object.keys(methods).forEach(function (name) {
      var wire = id + '.' + name;
      namespace[name] =
        methods[name] && methods[name].reply
          ? function (data) {
              return request(wire, data);
            }
          : function (data) {
              notify(wire, data);
            };
    });
    return Object.freeze(namespace);
  }

  var manifest = (window.PolyAppHost && window.PolyAppHost.features) || {};
  bridge.features = {};
  Object.keys(manifest).forEach(function (id) {
    bridge.features[id] = featureNamespace(id, manifest[id]);
  });
  Object.freeze(bridge.features);

  // A missing feature resolves `disabled` instead of throwing on an undefined method: the page treats a rejection as a consumed code.
  var DEPRECATED_ALIASES = {
    submitKycPrefillOtp: {
      feature: 'onboarding',
      method: 'submitKycPrefillOtp',
      args: function (otp, externalId) {
        return { otp: otp, externalId: externalId };
      },
    },
    initiateOriginalEmailOtp: {
      feature: 'onboarding',
      method: 'initiateOriginalEmailOtp',
      args: function () {
        return undefined;
      },
    },
    submitOriginalEmailOtp: {
      feature: 'onboarding',
      method: 'submitOriginalEmailOtp',
      args: function (otp) {
        return { otp: otp };
      },
    },
  };

  var warnedAliases = {};
  Object.keys(DEPRECATED_ALIASES).forEach(function (legacy) {
    var alias = DEPRECATED_ALIASES[legacy];
    bridge.v1[legacy] = function () {
      var replacement = 'PolyBridge.features.' + alias.feature + '.' + alias.method;
      if (!warnedAliases[legacy]) {
        warnedAliases[legacy] = true;
        console.warn('[PolyBridge] v1.' + legacy + ' is deprecated; use ' + replacement);
      }
      var feature = bridge.features[alias.feature];
      var target = feature && feature[alias.method];
      if (typeof target !== 'function') return Promise.resolve({ status: 'disabled' });
      return target(alias.args.apply(null, arguments));
    };
  });

  window.PolyBridge = bridge;
})();
