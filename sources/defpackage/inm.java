package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class inm implements Iterable, Serializable {
    public static final cnm b = new cnm(jum.b);
    public int a;

    static {
        int i = xjm.a;
    }

    public static int d(int i, int i2, int i3) {
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

    public static cnm f(byte[] bArr, int i, int i2) {
        d(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new cnm(bArr2);
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int c();

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int c = c();
            cnm cnmVar = (cnm) this;
            int i2 = c;
            for (int i3 = 0; i3 < c; i3++) {
                i2 = (i2 * 31) + cnmVar.c[i3];
            }
            if (i2 == 0) {
                i2 = 1;
            }
            this.a = i2;
            return i2;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new xv1(this);
    }

    public final String toString() {
        cnm gmmVar;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int c = c();
        if (c() <= 50) {
            concat = sgn.d(this);
        } else {
            cnm cnmVar = (cnm) this;
            int d = d(0, 47, cnmVar.c());
            if (d == 0) {
                gmmVar = b;
            } else {
                gmmVar = new gmm(d, cnmVar.c);
            }
            concat = sgn.d(gmmVar).concat("...");
        }
        return woa.r(m51.q("<ByteString@", hexString, " size=", c, " contents=\""), concat, "\">");
    }
}
