package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class i7l implements Iterable, Serializable {
    public static final h7l b = new h7l(l8l.a);
    public int a = 0;

    static {
        int i = d7l.a;
    }

    public static h7l j(byte[] bArr, int i, int i2) {
        try {
            return k(bArr, i, i2);
        } catch (p8l e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static h7l k(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return b;
        }
        m(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new h7l(bArr2);
    }

    public static int m(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    dmk.k("Beginning index larger than ending index: ", String.valueOf(i).length() + 44 + String.valueOf(i2).length(), ", ", i, i2);
                    return 0;
                }
                dmk.k("End index: ", String.valueOf(i2).length() + 15 + String.valueOf(i3).length(), " >= ", i2, i3);
                return 0;
            }
            dmk.j("Beginning index: ", String.valueOf(i).length() + 21, i, " < 0");
            return 0;
        }
        return i4;
    }

    public static /* synthetic */ boolean n(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        m(i, i4, bArr.length);
        m(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public abstract byte a(int i);

    public abstract int b();

    public abstract g7l c(int i, int i2);

    public abstract void d(int i, byte[] bArr);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof i7l) {
                i7l i7lVar = (i7l) obj;
                int b2 = b();
                if (b2 == i7lVar.b()) {
                    if (b2 != 0) {
                        int i = this.a;
                        int i2 = i7lVar.a;
                        if (i != 0 && i2 != 0 && i != i2) {
                            return false;
                        }
                        return h(i7lVar);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public abstract void f(t7l t7lVar);

    public abstract boolean h(i7l i7lVar);

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int b2 = b();
            i = i(b2, b2);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    public abstract int i(int i, int i2);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new xv1(this);
    }

    public final byte[] l() {
        int b2 = b();
        if (b2 == 0) {
            return l8l.a;
        }
        byte[] bArr = new byte[b2];
        d(b2, bArr);
        return bArr;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int b2 = b();
        if (b() <= 50) {
            concat = acn.c(l());
        } else {
            concat = acn.c(c(0, 47).l()).concat("...");
        }
        return woa.r(m51.q("<ByteString@", hexString, " size=", b2, " contents=\""), concat, "\">");
    }
}
