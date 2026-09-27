package io.ably.lib.network;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class HttpBody {
    private final byte[] content;
    private final String contentType;

    public HttpBody(String str, byte[] bArr) {
        this.contentType = str;
        this.content = bArr;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof HttpBody;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HttpBody)) {
            return false;
        }
        HttpBody httpBody = (HttpBody) obj;
        if (!httpBody.canEqual(this)) {
            return false;
        }
        String contentType = getContentType();
        String contentType2 = httpBody.getContentType();
        if (contentType != null ? !contentType.equals(contentType2) : contentType2 != null) {
            return false;
        }
        if (Arrays.equals(getContent(), httpBody.getContent())) {
            return true;
        }
        return false;
    }

    public byte[] getContent() {
        return this.content;
    }

    public String getContentType() {
        return this.contentType;
    }

    public int hashCode() {
        int hashCode;
        String contentType = getContentType();
        if (contentType == null) {
            hashCode = 43;
        } else {
            hashCode = contentType.hashCode();
        }
        return Arrays.hashCode(getContent()) + ((hashCode + 59) * 59);
    }

    public String toString() {
        return "HttpBody(contentType=" + getContentType() + ", content=" + Arrays.toString(getContent()) + ")";
    }
}
