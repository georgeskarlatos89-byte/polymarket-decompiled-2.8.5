package com.polymarket.appwebview;

import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/polymarket/appwebview/PolyWebBridge;", "", "<init>", "(Ljava/lang/String;I)V", "HapticStyle", "PermissionKind", "PermissionStatus", "Companion", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PolyWebBridge {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ PolyWebBridge[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final String contractVersion;
    private static final String hostRefocusFlag;
    private static final String networkLoggingJS;
    private static final String notifyChannel;
    private static final String withReplyChannel;

    private static final /* synthetic */ PolyWebBridge[] $values() {
        return new PolyWebBridge[0];
    }

    static {
        PolyWebBridge[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
        notifyChannel = "polyJsBridge";
        withReplyChannel = "polyJsBridgeWithReply";
        contractVersion = "0.8.0";
        hostRefocusFlag = "__polyHostRefocus";
        networkLoggingJS = "(() => {\n  if (window.__polyNetLogInstalled) return;\n  window.__polyNetLogInstalled = true;\n\n  function now() { return (window.performance && performance.now) ? performance.now() : Date.now(); }\n  function emit(p) {\n    try {\n      if (window.PolyBridge && typeof window.PolyBridge.notify === 'function') {\n        window.PolyBridge.notify('httpLog', p);\n      }\n    } catch (e) {}\n  }\n\n  if (window.fetch) {\n    var origFetch = window.fetch.bind(window);\n    window.fetch = function (input, init) {\n      var url = (typeof input === 'string') ? input : (input && input.url) || String(input);\n      var verb = (init && init.method) || (input && input.method) || 'GET';\n      var t = now();\n      return origFetch(input, init).then(function (res) {\n        emit({ httpMethod: verb, url: url, status: res.status, durationMs: Math.round(now() - t) });\n        return res;\n      }, function (err) {\n        emit({ httpMethod: verb, url: url, error: String(err), durationMs: Math.round(now() - t) });\n        throw err;\n      });\n    };\n  }\n\n  var XHR = window.XMLHttpRequest;\n  if (XHR && XHR.prototype) {\n    var origOpen = XHR.prototype.open;\n    var origSend = XHR.prototype.send;\n    XHR.prototype.open = function (method, url) {\n      this.__polyMethod = method;\n      this.__polyUrl = url;\n      return origOpen.apply(this, arguments);\n    };\n    XHR.prototype.send = function () {\n      var self = this;\n      var t = now();\n      self.addEventListener('loadend', function () {\n        emit({ httpMethod: self.__polyMethod || 'GET', url: self.__polyUrl || '', status: self.status, durationMs: Math.round(now() - t) });\n      });\n      return origSend.apply(this, arguments);\n    };\n  }\n})();";
    }

    private PolyWebBridge(String str, int i) {
    }

    public static final /* synthetic */ String access$getContractVersion$cp() {
        return contractVersion;
    }

    public static final /* synthetic */ String access$getHostRefocusFlag$cp() {
        return hostRefocusFlag;
    }

    public static final /* synthetic */ String access$getNetworkLoggingJS$cp() {
        return networkLoggingJS;
    }

    public static final /* synthetic */ String access$getNotifyChannel$cp() {
        return notifyChannel;
    }

    public static final /* synthetic */ String access$getWithReplyChannel$cp() {
        return withReplyChannel;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static PolyWebBridge valueOf(String str) {
        return (PolyWebBridge) Enum.valueOf(PolyWebBridge.class, str);
    }

    public static PolyWebBridge[] values() {
        return (PolyWebBridge[]) $VALUES.clone();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u001dB\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u001e"}, d2 = {"Lcom/polymarket/appwebview/PolyWebBridge$HapticStyle;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "success", "error", "warning", "light", "soft", RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR, "heavy", "selection", "doubleTap", "none", "rigid", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class HapticStyle implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ HapticStyle[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final HapticStyle success = new HapticStyle("success", 0, "success", null, 2, null);
        public static final HapticStyle error = new HapticStyle("error", 1, "error", null, 2, null);
        public static final HapticStyle warning = new HapticStyle("warning", 2, "warning", null, 2, null);
        public static final HapticStyle light = new HapticStyle("light", 3, "light", null, 2, null);
        public static final HapticStyle soft = new HapticStyle("soft", 4, "soft", null, 2, null);
        public static final HapticStyle medium = new HapticStyle(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR, 5, RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR, null, 2, null);
        public static final HapticStyle heavy = new HapticStyle("heavy", 6, "heavy", null, 2, null);
        public static final HapticStyle selection = new HapticStyle("selection", 7, "selection", null, 2, null);
        public static final HapticStyle doubleTap = new HapticStyle("doubleTap", 8, "doubleTap", null, 2, null);
        public static final HapticStyle none = new HapticStyle("none", 9, "none", null, 2, null);
        public static final HapticStyle rigid = new HapticStyle("rigid", 10, "rigid", null, 2, null);

        private static final /* synthetic */ HapticStyle[] $values() {
            return new HapticStyle[]{success, error, warning, light, soft, medium, heavy, selection, doubleTap, none, rigid};
        }

        static {
            HapticStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ HapticStyle(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static HapticStyle valueOf(String str) {
            return (HapticStyle) Enum.valueOf(HapticStyle.class, str);
        }

        public static HapticStyle[] values() {
            return (HapticStyle[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/appwebview/PolyWebBridge$HapticStyle$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/appwebview/PolyWebBridge$HapticStyle;", "rawValue", "", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final HapticStyle init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -1867169789:
                        if (!rawValue.equals("success")) {
                            return null;
                        }
                        return HapticStyle.success;
                    case -1715965556:
                        if (rawValue.equals("selection")) {
                            return HapticStyle.selection;
                        }
                        return null;
                    case -1078030475:
                        if (rawValue.equals(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR)) {
                            return HapticStyle.medium;
                        }
                        return null;
                    case -806162926:
                        if (rawValue.equals("doubleTap")) {
                            return HapticStyle.doubleTap;
                        }
                        return null;
                    case 3387192:
                        if (rawValue.equals("none")) {
                            return HapticStyle.none;
                        }
                        return null;
                    case 3535914:
                        if (rawValue.equals("soft")) {
                            return HapticStyle.soft;
                        }
                        return null;
                    case 96784904:
                        if (rawValue.equals("error")) {
                            return HapticStyle.error;
                        }
                        return null;
                    case 99152071:
                        if (rawValue.equals("heavy")) {
                            return HapticStyle.heavy;
                        }
                        return null;
                    case 102970646:
                        if (rawValue.equals("light")) {
                            return HapticStyle.light;
                        }
                        return null;
                    case 108511787:
                        if (rawValue.equals("rigid")) {
                            return HapticStyle.rigid;
                        }
                        return null;
                    case 1124446108:
                        if (rawValue.equals("warning")) {
                            return HapticStyle.warning;
                        }
                        return null;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private HapticStyle(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0013B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\f¨\u0006\u0014"}, d2 = {"Lcom/polymarket/appwebview/PolyWebBridge$PermissionKind;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "notifications", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PermissionKind implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ PermissionKind[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final PermissionKind notifications = new PermissionKind("notifications", 0, "notifications", null, 2, null);
        private final String rawValue;

        private static final /* synthetic */ PermissionKind[] $values() {
            return new PermissionKind[]{notifications};
        }

        static {
            PermissionKind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ PermissionKind(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static PermissionKind valueOf(String str) {
            return (PermissionKind) Enum.valueOf(PermissionKind.class, str);
        }

        public static PermissionKind[] values() {
            return (PermissionKind[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/appwebview/PolyWebBridge$PermissionKind$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/appwebview/PolyWebBridge$PermissionKind;", "rawValue", "", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PermissionKind init(String rawValue) {
                rawValue.getClass();
                if (Intrinsics.areEqual(rawValue, "notifications")) {
                    return PermissionKind.notifications;
                }
                return null;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private PermissionKind(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0016B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0017"}, d2 = {"Lcom/polymarket/appwebview/PolyWebBridge$PermissionStatus;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "granted", "denied", "undetermined", "unsupported", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PermissionStatus implements RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ PermissionStatus[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final PermissionStatus granted = new PermissionStatus("granted", 0, "granted", null, 2, null);
        public static final PermissionStatus denied = new PermissionStatus("denied", 1, "denied", null, 2, null);
        public static final PermissionStatus undetermined = new PermissionStatus("undetermined", 2, "undetermined", null, 2, null);
        public static final PermissionStatus unsupported = new PermissionStatus("unsupported", 3, "unsupported", null, 2, null);

        private static final /* synthetic */ PermissionStatus[] $values() {
            return new PermissionStatus[]{granted, denied, undetermined, unsupported};
        }

        static {
            PermissionStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ PermissionStatus(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static PermissionStatus valueOf(String str) {
            return (PermissionStatus) Enum.valueOf(PermissionStatus.class, str);
        }

        public static PermissionStatus[] values() {
            return (PermissionStatus[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/appwebview/PolyWebBridge$PermissionStatus$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/appwebview/PolyWebBridge$PermissionStatus;", "rawValue", "", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PermissionStatus init(String rawValue) {
                rawValue.getClass();
                switch (rawValue.hashCode()) {
                    case -1335395429:
                        if (!rawValue.equals("denied")) {
                            return null;
                        }
                        return PermissionStatus.denied;
                    case 48636469:
                        if (rawValue.equals("unsupported")) {
                            return PermissionStatus.unsupported;
                        }
                        return null;
                    case 280295099:
                        if (rawValue.equals("granted")) {
                            return PermissionStatus.granted;
                        }
                        return null;
                    case 599585226:
                        if (rawValue.equals("undetermined")) {
                            return PermissionStatus.undetermined;
                        }
                        return null;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private PermissionStatus(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u0005\"\b\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082 J\u0014\u0010\u0015\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0017\u0010\u0016\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082 J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019J\u0011\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0082 J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0082 J\u0010\u0010#\u001a\u00020$2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0013\u0010%\u001a\u00020$2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0082 J\u0010\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020\u0005J\u0010\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010(\u001a\u00020\u0005J\u0010\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010(\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\u001b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0007R\u0014\u0010\u001d\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006-"}, d2 = {"Lcom/polymarket/appwebview/PolyWebBridge$Companion;", "", "<init>", "()V", "notifyChannel", "", "getNotifyChannel", "()Ljava/lang/String;", "withReplyChannel", "getWithReplyChannel", "contractVersion", "getContractVersion", "appHostInitJS", "H", "Lcom/polymarket/appwebview/PolyAppHost;", "host", "features", "", "Lcom/polymarket/appwebview/PolyBridgeFeatureDescriptor;", "(Lcom/polymarket/appwebview/PolyAppHost;Ljava/util/List;)Ljava/lang/String;", "Swift_Companion_appHostInitJS_0", "featureManifestJSON", "Swift_Companion_featureManifestJSON_1", "refreshViewportMetricsJS", "height", "", "Swift_Companion_refreshViewportMetricsJS_2", "hostRefocusFlag", "getHostRefocusFlag", "networkLoggingJS", "getNetworkLoggingJS", "polymarketApexHosts", "getPolymarketApexHosts", "()Ljava/util/List;", "Swift_Companion_polymarketApexHosts", "isPolymarketOrigin", "", "Swift_Companion_isPolymarketOrigin_3", "HapticStyle", "Lcom/polymarket/appwebview/PolyWebBridge$HapticStyle;", "rawValue", "PermissionKind", "Lcom/polymarket/appwebview/PolyWebBridge$PermissionKind;", "PermissionStatus", "Lcom/polymarket/appwebview/PolyWebBridge$PermissionStatus;", "AppWebView"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native String Swift_Companion_appHostInitJS_0(Object host, List<PolyBridgeFeatureDescriptor> features);

        private final native String Swift_Companion_featureManifestJSON_1(List<PolyBridgeFeatureDescriptor> features);

        private final native boolean Swift_Companion_isPolymarketOrigin_3(String host);

        private final native List<String> Swift_Companion_polymarketApexHosts();

        private final native String Swift_Companion_refreshViewportMetricsJS_2(double height);

        public final HapticStyle HapticStyle(String rawValue) {
            rawValue.getClass();
            return HapticStyle.INSTANCE.init(rawValue);
        }

        public final PermissionKind PermissionKind(String rawValue) {
            rawValue.getClass();
            return PermissionKind.INSTANCE.init(rawValue);
        }

        public final PermissionStatus PermissionStatus(String rawValue) {
            rawValue.getClass();
            return PermissionStatus.INSTANCE.init(rawValue);
        }

        public final <H extends PolyAppHost> String appHostInitJS(H host, List<PolyBridgeFeatureDescriptor> features) {
            host.getClass();
            features.getClass();
            return Swift_Companion_appHostInitJS_0(host, features);
        }

        public final String featureManifestJSON(List<PolyBridgeFeatureDescriptor> features) {
            features.getClass();
            return Swift_Companion_featureManifestJSON_1(features);
        }

        public final String getContractVersion() {
            return PolyWebBridge.access$getContractVersion$cp();
        }

        public final String getHostRefocusFlag() {
            return PolyWebBridge.access$getHostRefocusFlag$cp();
        }

        public final String getNetworkLoggingJS() {
            return PolyWebBridge.access$getNetworkLoggingJS$cp();
        }

        public final String getNotifyChannel() {
            return PolyWebBridge.access$getNotifyChannel$cp();
        }

        public final List<String> getPolymarketApexHosts() {
            return Swift_Companion_polymarketApexHosts();
        }

        public final String getWithReplyChannel() {
            return PolyWebBridge.access$getWithReplyChannel$cp();
        }

        public final boolean isPolymarketOrigin(String host) {
            return Swift_Companion_isPolymarketOrigin_3(host);
        }

        public final String refreshViewportMetricsJS(double height) {
            return Swift_Companion_refreshViewportMetricsJS_2(height);
        }

        private Companion() {
        }
    }
}
