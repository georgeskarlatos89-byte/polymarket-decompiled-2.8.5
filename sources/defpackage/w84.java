package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class w84 {
    public int a;
    public Object b;

    public w84(n2o n2oVar, int i) {
        if (n2oVar != null) {
            if (i >= 0) {
                this.a = i;
                this.b = n2oVar;
                return;
            } else {
                dmk.v(hdi.l(i, "invalid index: ", new StringBuilder(String.valueOf(i).length() + 15)));
                throw null;
            }
        }
        dmk.v("format options cannot be null");
        throw null;
    }

    public static int d(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long e(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i);

    public void F() {
        int B;
        do {
            B = B();
            if (B != 0) {
                int i = this.a;
                if (i < 100) {
                    this.a = i + 1;
                    this.a--;
                } else {
                    throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
            } else {
                return;
            }
        } while (E(B));
    }

    public abstract void G(rc0 rc0Var, Object obj);

    public abstract void H(rc0 rc0Var, Object obj);

    public ByteBuffer a(int i, byte[] bArr) {
        int[] c = c(i, wb3.c(bArr));
        int[] iArr = (int[]) c.clone();
        wb3.b(iArr);
        for (int i2 = 0; i2 < c.length; i2++) {
            c[i2] = c[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(c, 0, 16);
        return order;
    }

    public abstract void b(int i);

    public abstract int[] c(int i, int[] iArr);

    public abstract int f();

    public abstract boolean g();

    public abstract int h();

    public abstract void i(int i);

    public void j(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length == h()) {
            int remaining = byteBuffer2.remaining();
            int i = remaining / 64;
            int i2 = i + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                ByteBuffer a = a(this.a + i3, bArr);
                if (i3 == i) {
                    qin.c(byteBuffer, byteBuffer2, a, remaining % 64);
                } else {
                    qin.c(byteBuffer, byteBuffer2, a, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + h());
    }

    public abstract int k(int i);

    public abstract boolean l();

    public abstract cw1 m();

    public abstract dw1 n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();

    public w84(wel welVar, int i) {
        if (welVar == null) {
            dmk.v("format options cannot be null");
            throw null;
        }
        if (i >= 0) {
            this.a = i;
            this.b = welVar;
        } else {
            dmk.v(ace.f(i, "invalid index: "));
            throw null;
        }
    }
}
