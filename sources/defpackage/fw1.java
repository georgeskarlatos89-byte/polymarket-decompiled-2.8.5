package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class fw1 implements Iterable, Serializable {
    public static final cw1 b = new cw1(d5a.b);
    public static final aw1 c;
    public int a;

    static {
        aw1 gdnVar;
        if (xr.a()) {
            gdnVar = new f0o(26);
        } else {
            gdnVar = new gdn(26);
        }
        c = gdnVar;
    }

    public static int b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    f27.m(woa.l(i, i2, "Beginning index larger than ending index: ", ", "));
                    return 0;
                }
                f27.m(woa.l(i2, i3, "End index: ", " >= "));
                return 0;
            }
            f27.m(sv6.j(i, "Beginning index: ", " < 0"));
            return 0;
        }
        return i4;
    }

    public static cw1 c(byte[] bArr, int i, int i2) {
        b(i, i + i2, bArr.length);
        return new cw1(c.e(bArr, i, i2));
    }

    public abstract byte a(int i);

    public abstract void d(int i, byte[] bArr);

    public final byte[] f() {
        int size = size();
        if (size == 0) {
            return d5a.b;
        }
        byte[] bArr = new byte[size];
        d(size, bArr);
        return bArr;
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int size = size();
            cw1 cw1Var = (cw1) this;
            int h = cw1Var.h();
            int i2 = size;
            for (int i3 = h; i3 < h + size; i3++) {
                i2 = (i2 * 31) + cw1Var.d[i3];
            }
            if (i2 == 0) {
                i2 = 1;
            }
            this.a = i2;
            return i2;
        }
        return i;
    }

    public abstract int size();

    public final String toString() {
        cw1 yv1Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = r6m.a(this);
        } else {
            cw1 cw1Var = (cw1) this;
            int b2 = b(0, 47, cw1Var.size());
            if (b2 == 0) {
                yv1Var = b;
            } else {
                yv1Var = new yv1(cw1Var.d, cw1Var.h(), b2);
            }
            concat = r6m.a(yv1Var).concat("...");
        }
        return woa.r(m51.q("<ByteString@", hexString, " size=", size, " contents=\""), concat, "\">");
    }
}
