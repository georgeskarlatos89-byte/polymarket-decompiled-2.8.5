package defpackage;

import java.io.InputStream;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ip5 extends InputStream {
    public final gp5 a;
    public final jp5 b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public ip5(gp5 gp5Var, jp5 jp5Var) {
        this.a = gp5Var;
        this.b = jp5Var;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.e) {
            this.a.close();
            this.e = true;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        pfn.f(!this.e);
        boolean z = this.d;
        gp5 gp5Var = this.a;
        if (!z) {
            gp5Var.a(this.b);
            this.d = true;
        }
        int read = gp5Var.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & MessagePack.Code.EXT_TIMESTAMP;
    }
}
