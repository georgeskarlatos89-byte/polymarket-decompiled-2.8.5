package defpackage;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class p1g extends RequestBody {
    public final RequestBody a;
    public final MediaType b;

    public p1g(RequestBody requestBody, MediaType mediaType) {
        this.a = requestBody;
        this.b = mediaType;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.a.contentLength();
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        return this.b;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(jq1 jq1Var) {
        this.a.writeTo(jq1Var);
    }
}
