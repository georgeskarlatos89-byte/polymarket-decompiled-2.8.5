package defpackage;

import java.io.InputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fq7 extends bq7 {
    public fq7(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.a.mark(bd0.API_PRIORITY_OTHER);
        } else {
            dmk.v("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void g(long j) {
        int i = this.b;
        if (i > j) {
            this.b = 0;
            this.a.reset();
        } else {
            j -= i;
        }
        e((int) j);
    }

    public fq7(byte[] bArr) {
        super(bArr);
        this.a.mark(bd0.API_PRIORITY_OTHER);
    }
}
