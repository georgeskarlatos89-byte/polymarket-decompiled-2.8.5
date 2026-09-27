package defpackage;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class rp1 extends OutputStream {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public rp1(FileOutputStream fileOutputStream) {
        this.b = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        switch (this.a) {
            case 0:
                return;
            default:
                ((FileOutputStream) this.b).flush();
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((tp1) this.b) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        bArr.getClass();
        switch (i3) {
            case 0:
                ((tp1) obj).m1395write(bArr, i, i2);
                return;
            default:
                ((FileOutputStream) obj).write(bArr, i, i2);
                return;
        }
    }

    public rp1(tp1 tp1Var) {
        this.b = tp1Var;
    }

    private final void e() {
    }

    private final void g() {
    }

    private final void o() {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        switch (this.a) {
            case 1:
                bArr.getClass();
                ((FileOutputStream) this.b).write(bArr);
                return;
            default:
                super.write(bArr);
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((tp1) obj).i0(i);
                return;
            default:
                ((FileOutputStream) obj).write(i);
                return;
        }
    }
}
