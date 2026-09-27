package bo.app;

import defpackage.dmk;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lg extends ByteArrayOutputStream {
    public final /* synthetic */ mg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg(mg mgVar, int i) {
        super(i);
        this.a = mgVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0) {
            int i2 = i - 1;
            if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                i = i2;
            }
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i, this.a.b.name());
        } catch (UnsupportedEncodingException e) {
            dmk.i(e);
            return null;
        }
    }
}
