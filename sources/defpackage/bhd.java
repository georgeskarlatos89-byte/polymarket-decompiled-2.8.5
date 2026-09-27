package defpackage;

import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class bhd extends ResponseBody {
    public final MediaType a;
    public final long b;

    public bhd(MediaType mediaType, long j) {
        this.a = mediaType;
        this.b = j;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long get$contentLength() {
        return this.b;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        return this.a;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public final kq1 getBodySource() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
