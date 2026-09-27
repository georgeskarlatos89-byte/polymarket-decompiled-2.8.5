package io.ably.lib.network;

import defpackage.ace;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class HttpRequest {
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String CONTENT_TYPE = "Content-Type";
    private final HttpBody body;
    private final Map<String, List<String>> headers;
    private final int httpOpenTimeout;
    private final int httpReadTimeout;
    private final String method;
    private final URL url;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class HttpRequestBuilder {
        private HttpBody body;
        private Map<String, List<String>> headers;
        private int httpOpenTimeout;
        private int httpReadTimeout;
        private String method;
        private URL url;

        public HttpRequestBuilder body(HttpBody httpBody) {
            this.body = httpBody;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this.url, this.method, this.httpOpenTimeout, this.httpReadTimeout, this.body, this.headers);
        }

        public HttpRequestBuilder headers(Map<String, String> map) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), Collections.singletonList(entry.getValue()));
            }
            this.headers = Collections.unmodifiableMap(hashMap);
            return this;
        }

        public HttpRequestBuilder httpOpenTimeout(int i) {
            this.httpOpenTimeout = i;
            return this;
        }

        public HttpRequestBuilder httpReadTimeout(int i) {
            this.httpReadTimeout = i;
            return this;
        }

        public HttpRequestBuilder method(String str) {
            this.method = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("HttpRequest.HttpRequestBuilder(url=");
            sb.append(this.url);
            sb.append(", method=");
            sb.append(this.method);
            sb.append(", httpOpenTimeout=");
            sb.append(this.httpOpenTimeout);
            sb.append(", httpReadTimeout=");
            sb.append(this.httpReadTimeout);
            sb.append(", body=");
            sb.append(this.body);
            sb.append(", headers=");
            return ace.n(sb, this.headers, ")");
        }

        public HttpRequestBuilder url(URL url) {
            this.url = url;
            return this;
        }
    }

    public HttpRequest(URL url, String str, int i, int i2, HttpBody httpBody, Map<String, List<String>> map) {
        this.url = url;
        this.method = str;
        this.httpOpenTimeout = i;
        this.httpReadTimeout = i2;
        this.body = httpBody;
        this.headers = map;
    }

    public static HttpRequestBuilder builder() {
        return new HttpRequestBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof HttpRequest;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        if (!httpRequest.canEqual(this) || getHttpOpenTimeout() != httpRequest.getHttpOpenTimeout() || getHttpReadTimeout() != httpRequest.getHttpReadTimeout()) {
            return false;
        }
        URL url = getUrl();
        URL url2 = httpRequest.getUrl();
        if (url != null ? !url.equals(url2) : url2 != null) {
            return false;
        }
        String method = getMethod();
        String method2 = httpRequest.getMethod();
        if (method != null ? !method.equals(method2) : method2 != null) {
            return false;
        }
        HttpBody body = getBody();
        HttpBody body2 = httpRequest.getBody();
        if (body != null ? !body.equals(body2) : body2 != null) {
            return false;
        }
        Map<String, List<String>> headers = getHeaders();
        Map<String, List<String>> headers2 = httpRequest.getHeaders();
        if (headers != null ? headers.equals(headers2) : headers2 == null) {
            return true;
        }
        return false;
    }

    public HttpBody getBody() {
        return this.body;
    }

    public Map<String, List<String>> getHeaders() {
        int length;
        HashMap hashMap = new HashMap(this.headers);
        HttpBody httpBody = this.body;
        if (httpBody != null) {
            if (httpBody.getContent() == null) {
                length = 0;
            } else {
                length = this.body.getContent().length;
            }
            hashMap.put("Content-Type", Collections.singletonList(this.body.getContentType()));
            hashMap.put("Content-Length", Collections.singletonList(Integer.toString(length)));
        }
        return hashMap;
    }

    public int getHttpOpenTimeout() {
        return this.httpOpenTimeout;
    }

    public int getHttpReadTimeout() {
        return this.httpReadTimeout;
    }

    public String getMethod() {
        return this.method;
    }

    public URL getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int httpReadTimeout = getHttpReadTimeout() + ((getHttpOpenTimeout() + 59) * 59);
        URL url = getUrl();
        int i = httpReadTimeout * 59;
        int i2 = 43;
        if (url == null) {
            hashCode = 43;
        } else {
            hashCode = url.hashCode();
        }
        int i3 = i + hashCode;
        String method = getMethod();
        int i4 = i3 * 59;
        if (method == null) {
            hashCode2 = 43;
        } else {
            hashCode2 = method.hashCode();
        }
        int i5 = i4 + hashCode2;
        HttpBody body = getBody();
        int i6 = i5 * 59;
        if (body == null) {
            hashCode3 = 43;
        } else {
            hashCode3 = body.hashCode();
        }
        Map<String, List<String>> headers = getHeaders();
        int i7 = (i6 + hashCode3) * 59;
        if (headers != null) {
            i2 = headers.hashCode();
        }
        return i7 + i2;
    }

    public String toString() {
        return "HttpRequest(url=" + getUrl() + ", method=" + getMethod() + ", httpOpenTimeout=" + getHttpOpenTimeout() + ", httpReadTimeout=" + getHttpReadTimeout() + ", body=" + getBody() + ", headers=" + getHeaders() + ")";
    }
}
