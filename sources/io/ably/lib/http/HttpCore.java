package io.ably.lib.http;

import com.google.gson.JsonParseException;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.m51;
import io.ably.lib.debug.DebugOptions;
import io.ably.lib.http.HttpAuth;
import io.ably.lib.http.HttpConstants;
import io.ably.lib.network.FailedConnectionException;
import io.ably.lib.network.HttpBody;
import io.ably.lib.network.HttpEngine;
import io.ably.lib.network.HttpEngineConfig;
import io.ably.lib.network.HttpEngineFactory;
import io.ably.lib.network.HttpRequest;
import io.ably.lib.network.HttpResponse;
import io.ably.lib.rest.Auth;
import io.ably.lib.transport.Defaults;
import io.ably.lib.transport.Hosts;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.ErrorResponse;
import io.ably.lib.types.Param;
import io.ably.lib.types.ProxyOptions;
import io.ably.lib.util.AgentHeaderCreator;
import io.ably.lib.util.Base64Coder;
import io.ably.lib.util.ClientOptionsUtils;
import io.ably.lib.util.Log;
import io.ably.lib.util.PlatformAgentProvider;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class HttpCore {
    private static final String TAG = "io.ably.lib.http.HttpCore";
    private final Auth auth;
    private Map<String, String> dynamicAgents;
    private final HttpEngine engine;
    final Hosts hosts;
    final ClientOptions options;
    private final PlatformAgentProvider platformAgentProvider;
    public final int port;
    private HttpAuth proxyAuth;
    public final String scheme;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class AuthRequiredException extends AblyException {
        private static final long serialVersionUID = 1;
        public Map<HttpAuth.Type, String> authChallenge;
        public boolean expired;
        public Map<HttpAuth.Type, String> proxyAuthChallenge;

        public AuthRequiredException(Throwable th, ErrorInfo errorInfo) {
            super(th, errorInfo);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public interface BodyHandler<T> {
        T[] handleResponseBody(String str, byte[] bArr);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public interface RequestBody {
        String getContentType();

        byte[] getEncoded();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class Response {
        public byte[] body;
        public int contentLength;
        public String contentType;
        public Map<String, List<String>> headers;
        public int statusCode;
        public String statusLine;

        public String getHeaderField(String str) {
            List<String> list;
            Map<String, List<String>> map = this.headers;
            if (map == null || (list = map.get(str.toLowerCase(Locale.ROOT))) == null || list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }

        public List<String> getHeaderFields(String str) {
            Map<String, List<String>> map = this.headers;
            if (map == null) {
                return null;
            }
            return map.get(str.toLowerCase(Locale.ROOT));
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public interface ResponseHandler<T> {
        T handleResponse(Response response, ErrorInfo errorInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    static {
        int i;
        boolean z;
        Field field = 0;
        try {
            field = Class.forName("android.os.Build$VERSION").getField("SDK_INT");
            i = field.getInt(field);
            z = field;
        } catch (Exception unused) {
            i = 0;
            z = field;
        }
        if (z && i < 8) {
            System.setProperty("httpCore.keepAlive", "false");
        }
    }

    public HttpCore(ClientOptions clientOptions, Auth auth, PlatformAgentProvider platformAgentProvider) {
        String str;
        this.options = clientOptions;
        this.auth = auth;
        this.platformAgentProvider = platformAgentProvider;
        if (clientOptions.tls) {
            str = "https://";
        } else {
            str = "http://";
        }
        this.scheme = str;
        this.port = Defaults.getPort(clientOptions);
        this.hosts = new Hosts(clientOptions.restHost, Defaults.HOST_REST, clientOptions);
        ProxyOptions proxyOptions = clientOptions.proxy;
        if (proxyOptions != null) {
            if (proxyOptions.host != null) {
                if (proxyOptions.port != 0) {
                    String str2 = proxyOptions.username;
                    if (str2 != null) {
                        String str3 = proxyOptions.password;
                        if (str3 != null) {
                            this.proxyAuth = new HttpAuth(str2, str3, proxyOptions.prefAuthType);
                        } else {
                            throw m51.f(40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "Unable to configure proxy without proxy password");
                        }
                    }
                } else {
                    throw m51.f(40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "Unable to configure proxy without proxy port");
                }
            } else {
                throw m51.f(40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "Unable to configure proxy without proxy host");
            }
        }
        HttpEngineFactory firstAvailable = HttpEngineFactory.getFirstAvailable();
        Log.v(TAG, "Using " + firstAvailable.getEngineType().name() + " HTTP Engine");
        this.engine = firstAvailable.create(new HttpEngineConfig(ClientOptionsUtils.convertToProxyConfig(clientOptions)));
    }

    private Map<String, String> collectRequestHeaders(URL url, String str, Param[] paramArr, RequestBody requestBody, boolean z, boolean z2) {
        byte[] bArr;
        Auth auth;
        HashMap hashMap = new HashMap();
        String first = Param.getFirst(paramArr, "Authorization");
        if (first == null && (auth = this.auth) != null) {
            first = auth.getAuthorizationHeader();
        }
        if (z && first != null) {
            hashMap.put("Authorization", first);
        }
        if (z2 && this.proxyAuth.hasChallenge()) {
            if (requestBody != null) {
                bArr = requestBody.getEncoded();
            } else {
                bArr = null;
            }
            hashMap.put(HttpConstants.Headers.PROXY_AUTHORIZATION, this.proxyAuth.getAuthorizationHeader(str, url.getPath(), bArr));
        }
        int i = 0;
        if (paramArr != null) {
            int length = paramArr.length;
            int i2 = 0;
            while (i < length) {
                Param param = paramArr[i];
                hashMap.put(param.key, param.value);
                if (param.key.equals(HttpConstants.Headers.ACCEPT)) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
        }
        if (i == 0) {
            hashMap.put(HttpConstants.Headers.ACCEPT, "application/json");
        }
        if (!hashMap.containsKey(Defaults.ABLY_PROTOCOL_VERSION_HEADER)) {
            hashMap.put(Defaults.ABLY_PROTOCOL_VERSION_HEADER, Defaults.ABLY_PROTOCOL_VERSION);
        }
        HashMap hashMap2 = new HashMap();
        Map<String, String> map = this.options.agents;
        if (map != null) {
            hashMap2.putAll(map);
        }
        Map<String, String> map2 = this.dynamicAgents;
        if (map2 != null) {
            hashMap2.putAll(map2);
        }
        hashMap.put(Defaults.ABLY_AGENT_HEADER, AgentHeaderCreator.create(hashMap2, this.platformAgentProvider));
        String str2 = this.options.clientId;
        if (str2 != null) {
            hashMap.put(Defaults.ABLY_CLIENT_ID_HEADER, Base64Coder.encodeString(str2));
        }
        return hashMap;
    }

    private Response executeRequest(HttpRequest httpRequest) {
        int length;
        HttpResponse execute = this.engine.call(httpRequest).execute();
        Response response = new Response();
        response.statusCode = execute.getCode();
        response.statusLine = execute.getMessage();
        Log.v(TAG, "HTTP response:");
        Map<String, List<String>> headers = execute.getHeaders();
        response.headers = new HashMap(headers.size(), 1.0f);
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            if (entry.getKey() != null) {
                response.headers.put(entry.getKey().toLowerCase(Locale.ROOT), entry.getValue());
                if (Log.level <= 2) {
                    for (String str : entry.getValue()) {
                        Log.v(TAG, entry.getKey() + ": " + str);
                    }
                }
            }
        }
        if (response.statusCode != 204 && execute.getBody() != null) {
            response.contentType = execute.getBody().getContentType();
            byte[] content = execute.getBody().getContent();
            response.body = content;
            if (content == null) {
                length = 0;
            } else {
                length = content.length;
            }
            response.contentLength = length;
            if (Log.level <= 2 && content != null) {
                Log.v(TAG, System.lineSeparator() + new String(response.body));
            }
        }
        return response;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private <T> T handleResponse(boolean z, Response response, ResponseHandler<T> responseHandler) {
        ErrorInfo errorInfo;
        List<String> headerFields;
        boolean z2;
        int i = response.statusCode;
        if (i != 0) {
            if (i >= 500 && i <= 504) {
                throw AblyException.fromErrorInfo(ErrorInfo.fromResponseStatus(response.statusLine, i));
            }
            if (i >= 200 && i < 300) {
                if (responseHandler != null) {
                    return responseHandler.handleResponse(response, null);
                }
            } else {
                byte[] bArr = response.body;
                if (bArr != null && bArr.length > 0) {
                    String str = response.contentType;
                    if (str != null && str.contains("msgpack")) {
                        try {
                            errorInfo = ErrorInfo.fromMsgpackBody(response.body);
                        } catch (IOException unused) {
                            System.err.println("Unable to parse msgpack error response");
                        }
                    } else {
                        String str2 = new String(response.body);
                        try {
                            ErrorResponse fromJSON = ErrorResponse.fromJSON(str2);
                            if (fromJSON != null) {
                                errorInfo = fromJSON.error;
                            }
                        } catch (JsonParseException unused2) {
                            System.err.println("Error message in unexpected format: ".concat(str2));
                        }
                    }
                    if (errorInfo == null) {
                        String headerField = response.getHeaderField("X-Ably-ErrorCode");
                        String headerField2 = response.getHeaderField("X-Ably-ErrorMessage");
                        if (headerField != null) {
                            try {
                                errorInfo = new ErrorInfo(headerField2, response.statusCode, Integer.parseInt(headerField));
                            } catch (NumberFormatException unused3) {
                            }
                        }
                    }
                    if (response.statusCode == 401) {
                        boolean z3 = false;
                        if (errorInfo != null && errorInfo.code == 40140) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        List<String> headerFields2 = response.getHeaderFields(HttpConstants.Headers.WWW_AUTHENTICATE);
                        if (headerFields2 != null && headerFields2.size() > 0) {
                            Map<HttpAuth.Type, String> sortAuthenticateHeaders = HttpAuth.sortAuthenticateHeaders(headerFields2);
                            String str3 = sortAuthenticateHeaders.get(HttpAuth.Type.X_ABLY_TOKEN);
                            if (str3 != null) {
                                if (str3.indexOf("stale") > -1) {
                                    z3 = true;
                                }
                                z2 |= z3;
                            }
                            AuthRequiredException authRequiredException = new AuthRequiredException(null, errorInfo);
                            authRequiredException.authChallenge = sortAuthenticateHeaders;
                            if (!z2) {
                                if (!z) {
                                    throw authRequiredException;
                                }
                            } else {
                                authRequiredException.expired = true;
                                throw authRequiredException;
                            }
                        }
                    }
                    if (response.statusCode != 407 && (headerFields = response.getHeaderFields(HttpConstants.Headers.PROXY_AUTHENTICATE)) != null && !headerFields.isEmpty()) {
                        AuthRequiredException authRequiredException2 = new AuthRequiredException(null, errorInfo);
                        authRequiredException2.proxyAuthChallenge = HttpAuth.sortAuthenticateHeaders(headerFields);
                        throw authRequiredException2;
                    }
                    if (errorInfo == null) {
                        errorInfo = ErrorInfo.fromResponseStatus(response.statusLine, response.statusCode);
                    }
                    Log.e(TAG, "Error response from server: err = " + errorInfo);
                    if (responseHandler == null) {
                        return responseHandler.handleResponse(response, errorInfo);
                    }
                    throw AblyException.fromErrorInfo(errorInfo);
                }
                errorInfo = null;
                if (errorInfo == null) {
                }
                if (response.statusCode == 401) {
                }
                if (response.statusCode != 407) {
                }
                if (errorInfo == null) {
                }
                Log.e(TAG, "Error response from server: err = " + errorInfo);
                if (responseHandler == null) {
                }
            }
        }
        return null;
    }

    public void authorize(boolean z) {
        this.auth.assertAuthorizationHeader(z);
    }

    public String getPreferredHost() {
        return this.hosts.getPreferredHost();
    }

    public String getPrimaryHost() {
        return this.hosts.getPrimaryHost();
    }

    public <T> T httpExecute(URL url, String str, Param[] paramArr, RequestBody requestBody, boolean z, boolean z2, ResponseHandler<T> responseHandler) {
        HttpBody httpBody;
        String str2;
        String str3;
        int i;
        HttpRequest.HttpRequestBuilder builder = HttpRequest.builder();
        HttpRequest.HttpRequestBuilder httpReadTimeout = builder.url(url).method(str).httpOpenTimeout(this.options.httpOpenTimeout).httpReadTimeout(this.options.httpRequestTimeout);
        DebugOptions.RawHttpListener rawHttpListener = null;
        if (requestBody != null) {
            httpBody = new HttpBody(requestBody.getContentType(), requestBody.getEncoded());
        } else {
            httpBody = null;
        }
        httpReadTimeout.body(httpBody);
        Map<String, String> collectRequestHeaders = collectRequestHeaders(url, str, paramArr, requestBody, z, z2);
        boolean containsKey = collectRequestHeaders.containsKey("Authorization");
        String str4 = collectRequestHeaders.get("Authorization");
        builder.headers(collectRequestHeaders);
        HttpRequest build = builder.build();
        if (Log.level <= 2 && build.getBody() != null && build.getBody().getContent() != null) {
            Log.v(TAG, System.lineSeparator() + new String(build.getBody().getContent()));
        }
        Map<String, List<String>> headers = build.getHeaders();
        if (Log.level <= 2) {
            String str5 = TAG;
            Log.v(str5, "HTTP request: " + url + ApiConstant.SPACE + str);
            if (containsKey) {
                Log.v(str5, "  Authorization: " + str4);
            }
            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                for (String str6 : entry.getValue()) {
                    Log.v(TAG, "  " + entry.getKey() + ": " + str6);
                }
            }
            if (requestBody != null) {
                String str7 = TAG;
                Log.v(str7, "  Content-Type: " + requestBody.getContentType());
                StringBuilder sb = new StringBuilder("  Content-Length: ");
                if (requestBody.getEncoded() != null) {
                    i = requestBody.getEncoded().length;
                } else {
                    i = 0;
                }
                sb.append(i);
                Log.v(str7, sb.toString());
            }
        }
        ClientOptions clientOptions = this.options;
        if (clientOptions instanceof DebugOptions) {
            DebugOptions.RawHttpListener rawHttpListener2 = ((DebugOptions) clientOptions).httpListener;
            if (rawHttpListener2 != null) {
                str2 = String.valueOf(Math.random()).substring(2);
                if (containsKey) {
                    str3 = str4;
                } else {
                    str3 = null;
                }
                Response onRawHttpRequest = rawHttpListener2.onRawHttpRequest(str2, build, str3, headers, requestBody);
                if (onRawHttpRequest != null) {
                    return (T) handleResponse(containsKey, onRawHttpRequest, responseHandler);
                }
            } else {
                str2 = null;
            }
            rawHttpListener = rawHttpListener2;
        } else {
            str2 = null;
        }
        try {
            Response executeRequest = executeRequest(build);
            if (rawHttpListener != null) {
                rawHttpListener.onRawHttpResponse(str2, str, executeRequest);
            }
            return (T) handleResponse(containsKey, executeRequest, responseHandler);
        } catch (FailedConnectionException e) {
            throw AblyException.fromThrowable(e);
        } catch (Exception e2) {
            if (e2.getCause() instanceof IOException) {
                throw AblyException.fromThrowable(e2.getCause());
            }
            throw AblyException.fromThrowable(e2);
        }
    }

    public <T> T httpExecuteWithRetry(URL url, String str, Param[] paramArr, RequestBody requestBody, ResponseHandler<T> responseHandler, boolean z) {
        HttpAuth httpAuth;
        if (z) {
            authorize(false);
        }
        boolean z2 = true;
        boolean z3 = true;
        while (true) {
            try {
                return (T) this.httpExecute(url, str, paramArr, requestBody, true, responseHandler);
            } catch (AuthRequiredException e) {
                if (e.authChallenge != null && z && e.expired && z2) {
                    this.authorize(true);
                    z2 = false;
                } else {
                    Map<HttpAuth.Type, String> map = e.proxyAuthChallenge;
                    if (map != null && z3 && (httpAuth = this.proxyAuth) != null) {
                        httpAuth.processAuthenticateHeaders(map);
                        z3 = false;
                    } else {
                        throw e;
                    }
                }
            }
        }
        throw e;
    }

    public HttpCore injectDynamicAgents(Map<String, String> map) {
        return new HttpCore(this, map);
    }

    public void setPreferredHost(String str) {
        this.hosts.setPreferredHost(str, false);
    }

    private HttpCore(HttpCore httpCore, Map<String, String> map) {
        this.options = httpCore.options;
        this.auth = httpCore.auth;
        this.platformAgentProvider = httpCore.platformAgentProvider;
        this.scheme = httpCore.scheme;
        this.port = httpCore.port;
        this.hosts = httpCore.hosts;
        this.proxyAuth = httpCore.proxyAuth;
        this.engine = httpCore.engine;
        this.dynamicAgents = map;
    }

    public <T> T httpExecute(URL url, String str, Param[] paramArr, RequestBody requestBody, boolean z, ResponseHandler<T> responseHandler) {
        return (T) httpExecute(url, str, paramArr, requestBody, z, this.engine.isUsingProxy() && this.proxyAuth != null, responseHandler);
    }
}
