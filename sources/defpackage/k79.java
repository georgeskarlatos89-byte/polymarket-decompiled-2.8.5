package defpackage;

import com.appsflyer.internal.l;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class k79 {
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final long[] d;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        a = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        b = iArr2;
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        c = iArr3;
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        d = jArr;
    }

    public static final int a(long j) {
        if (0 <= j && j <= 2147483647L) {
            return (int) j;
        }
        gkj gkjVar = hkj.b;
        l.k(ozm.i(10, j), "The resulting string length is too big: ");
        return 0;
    }

    public static final int b(byte[] bArr, int i, int[] iArr, char[] cArr, int i2) {
        int i3 = iArr[bArr[i] & MessagePack.Code.EXT_TIMESTAMP];
        cArr[i2] = (char) (i3 >> 8);
        cArr[i2 + 1] = (char) (i3 & 255);
        return i2 + 2;
    }

    public static final byte c(int i, String str) {
        int[] iArr;
        int i2;
        int i3;
        char charAt = str.charAt(i);
        if ((charAt >>> '\b') == 0 && (i2 = (iArr = c)[charAt]) >= 0) {
            int i4 = i + 1;
            char charAt2 = str.charAt(i4);
            if ((charAt2 >>> '\b') == 0 && (i3 = iArr[charAt2]) >= 0) {
                return (byte) ((i2 << 4) | i3);
            }
            d(i4, str);
            throw null;
        }
        d(i, str);
        throw null;
    }

    public static final void d(int i, String str) {
        StringBuilder o = ace.o(i, "Expected a hexadecimal digit at index ", ", but was ");
        o.append(str.charAt(i));
        throw new NumberFormatException(o.toString());
    }

    public static final int e(int i, String str, char[] cArr) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i);
            } else {
                cArr[i] = str.charAt(0);
            }
        }
        return str.length() + i;
    }

    public static String f(byte[] bArr) {
        int[] iArr;
        q79.d.getClass();
        q79 q79Var = q79.e;
        bArr.getClass();
        q79Var.getClass();
        int length = bArr.length;
        h3 h3Var = l3.a;
        int length2 = bArr.length;
        h3Var.getClass();
        h3.a(0, length, length2);
        if (length == 0) {
            return "";
        }
        if (q79Var.a) {
            iArr = b;
        } else {
            iArr = a;
        }
        m79 m79Var = q79Var.b;
        if (m79Var.a) {
            if (m79Var.b) {
                char[] cArr = new char[a(length * 2)];
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    i = b(bArr, i2, iArr, cArr, i);
                }
                return new String(cArr);
            }
            if (length > 0) {
                char[] cArr2 = new char[a(length * 2)];
                int e = e(b(bArr, 0, iArr, cArr2, e(0, "", cArr2)), "", cArr2);
                for (int i3 = 1; i3 < length; i3++) {
                    e = e(b(bArr, i3, iArr, cArr2, e(e(e, "", cArr2), "", cArr2)), "", cArr2);
                }
                return new String(cArr2);
            }
            dmk.v("Failed requirement.");
            return null;
        }
        if (length > 0) {
            int i4 = (length - 1) / bd0.API_PRIORITY_OTHER;
            int i5 = length % bd0.API_PRIORITY_OTHER;
            if (i5 == 0) {
                i5 = Integer.MAX_VALUE;
            }
            int a2 = a((2 * length) + (((i5 - 1) / bd0.API_PRIORITY_OTHER) * 2) + i4);
            char[] cArr3 = new char[a2];
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                if (i7 == Integer.MAX_VALUE) {
                    cArr3[i6] = '\n';
                    i8 = 0;
                    i6++;
                    i7 = 0;
                } else if (i8 == Integer.MAX_VALUE) {
                    i6 = e(i6, "  ", cArr3);
                    i8 = 0;
                }
                if (i8 != 0) {
                    i6 = e(i6, "", cArr3);
                }
                i6 = e(b(bArr, i9, iArr, cArr3, e(i6, "", cArr3)), "", cArr3);
                i8++;
                i7++;
            }
            if (i6 == a2) {
                return new String(cArr3);
            }
            dmk.n("Check failed.");
            return null;
        }
        dmk.v("Failed requirement.");
        return null;
    }

    public static final long g(int i, long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return 0L;
        }
        long j3 = i;
        return (j + j3) / (j2 + j3);
    }
}
