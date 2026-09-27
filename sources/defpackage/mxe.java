package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class mxe extends ByteArrayOutputStream {
    public final /* synthetic */ int a;
    public final Object b;

    public mxe(vt1 vt1Var, int i) {
        this.a = 0;
        this.b = vt1Var;
        ((ByteArrayOutputStream) this).buf = vt1Var.m(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.a) {
            case 0:
                ((vt1) this.b).B(((ByteArrayOutputStream) this).buf);
                ((ByteArrayOutputStream) this).buf = null;
                super.close();
                return;
            default:
                super.close();
                return;
        }
    }

    public void e(int i) {
        vt1 vt1Var = (vt1) this.b;
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] m = vt1Var.m((i2 + i) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, m, 0, ((ByteArrayOutputStream) this).count);
        vt1Var.B(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = m;
    }

    public void finalize() {
        switch (this.a) {
            case 0:
                ((vt1) this.b).B(((ByteArrayOutputStream) this).buf);
                return;
            default:
                super.finalize();
                return;
        }
    }

    @Override // java.io.ByteArrayOutputStream
    public String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                int i2 = ((ByteArrayOutputStream) this).count;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (((ByteArrayOutputStream) this).buf[i3] == 13) {
                        i2 = i3;
                    }
                }
                try {
                    return new String(((ByteArrayOutputStream) this).buf, 0, i2, ((f1i) obj).c.name());
                } catch (UnsupportedEncodingException e) {
                    dmk.i(e);
                    return null;
                }
            case 2:
                int i4 = ((ByteArrayOutputStream) this).count;
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    if (((ByteArrayOutputStream) this).buf[i5] == 13) {
                        i4 = i5;
                    }
                }
                try {
                    return new String(((ByteArrayOutputStream) this).buf, 0, i4, ((f1i) obj).c.name());
                } catch (UnsupportedEncodingException e2) {
                    dmk.i(e2);
                    return null;
                }
            default:
                return super.toString();
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                synchronized (this) {
                    e(i2);
                    super.write(bArr, i, i2);
                }
                return;
            default:
                super.write(bArr, i, i2);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mxe(Closeable closeable, int i, int i2) {
        super(i);
        this.a = i2;
        this.b = closeable;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        switch (this.a) {
            case 0:
                synchronized (this) {
                    e(1);
                    super.write(i);
                }
                return;
            default:
                super.write(i);
                return;
        }
    }
}
