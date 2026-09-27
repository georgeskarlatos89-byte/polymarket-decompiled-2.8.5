package io.ably.lib.network;

import defpackage.ace;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class HttpResponse {
    private final HttpBody body;
    private final int code;
    private final Map<String, List<String>> headers;
    private final String message;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class HttpResponseBuilder {
        private HttpBody body;
        private int code;
        private Map<String, List<String>> headers;
        private String message;

        public HttpResponseBuilder body(HttpBody httpBody) {
            this.body = httpBody;
            return this;
        }

        public HttpResponse build() {
            return new HttpResponse(this.code, this.message, this.body, this.headers);
        }

        public HttpResponseBuilder code(int i) {
            this.code = i;
            return this;
        }

        public HttpResponseBuilder headers(Map<String, List<String>> map) {
            this.headers = map;
            return this;
        }

        public HttpResponseBuilder message(String str) {
            this.message = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("HttpResponse.HttpResponseBuilder(code=");
            sb.append(this.code);
            sb.append(", message=");
            sb.append(this.message);
            sb.append(", body=");
            sb.append(this.body);
            sb.append(", headers=");
            return ace.n(sb, this.headers, ")");
        }
    }

    public HttpResponse(int i, String str, HttpBody httpBody, Map<String, List<String>> map) {
        this.code = i;
        this.message = str;
        this.body = httpBody;
        this.headers = map;
    }

    public static HttpResponseBuilder builder() {
        return new HttpResponseBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof HttpResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        if (!httpResponse.canEqual(this) || getCode() != httpResponse.getCode()) {
            return false;
        }
        String message = getMessage();
        String message2 = httpResponse.getMessage();
        if (message != null ? !message.equals(message2) : message2 != null) {
            return false;
        }
        HttpBody body = getBody();
        HttpBody body2 = httpResponse.getBody();
        if (body != null ? !body.equals(body2) : body2 != null) {
            return false;
        }
        Map<String, List<String>> headers = getHeaders();
        Map<String, List<String>> headers2 = httpResponse.getHeaders();
        if (headers != null ? headers.equals(headers2) : headers2 == null) {
            return true;
        }
        return false;
    }

    public HttpBody getBody() {
        return this.body;
    }

    public int getCode() {
        return this.code;
    }

    public Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int code = getCode() + 59;
        String message = getMessage();
        int i = code * 59;
        int i2 = 43;
        if (message == null) {
            hashCode = 43;
        } else {
            hashCode = message.hashCode();
        }
        int i3 = i + hashCode;
        HttpBody body = getBody();
        int i4 = i3 * 59;
        if (body == null) {
            hashCode2 = 43;
        } else {
            hashCode2 = body.hashCode();
        }
        Map<String, List<String>> headers = getHeaders();
        int i5 = (i4 + hashCode2) * 59;
        if (headers != null) {
            i2 = headers.hashCode();
        }
        return i5 + i2;
    }

    public String toString() {
        return "HttpResponse(code=" + getCode() + ", message=" + getMessage() + ", body=" + getBody() + ", headers=" + getHeaders() + ")";
    }
}
