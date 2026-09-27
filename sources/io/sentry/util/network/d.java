package io.sentry.util.network;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class d {
    public final String a;
    public Integer b;
    public Long c;
    public Long d;
    public com.socure.docv.capturesdk.core.extractor.c e;
    public com.socure.docv.capturesdk.core.extractor.c f;

    public d(String str) {
        this.a = str;
    }

    public final String toString() {
        return "NetworkRequestData{method='" + this.a + "', statusCode=" + this.b + ", requestBodySize=" + this.c + ", responseBodySize=" + this.d + ", request=" + this.e + ", response=" + this.f + '}';
    }
}
