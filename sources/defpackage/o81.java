package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class o81 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean[] h;

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1 A[LOOP:1: B:33:0x00bd->B:35:0x00c1, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o81(String str, char[] cArr) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        int i2 = 0;
        while (true) {
            if (i2 < cArr.length) {
                char c = cArr[i2];
                if (c < 128) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (bArr[c] == -1) {
                        bArr[c] = (byte) i2;
                        i2++;
                    } else {
                        dmk.v(wql.a("Duplicate character: %s", Character.valueOf(c)));
                        throw null;
                    }
                } else {
                    dmk.v(wql.a("Non-ASCII character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                this.a = str;
                this.b = cArr;
                try {
                    int length = cArr.length;
                    RoundingMode roundingMode = RoundingMode.UNNECESSARY;
                    RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
                    if (length > 0) {
                        switch (b1a.a[roundingMode2.ordinal()]) {
                            case 1:
                                if (length > 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (((length - 1) & length) == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                ofn.j(z & z2);
                            case 2:
                            case 3:
                                i = 31 - Integer.numberOfLeadingZeros(length);
                                break;
                            case 4:
                            case 5:
                                i = 32 - Integer.numberOfLeadingZeros(length - 1);
                                break;
                            case 6:
                            case 7:
                            case 8:
                                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length);
                                i = (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - length))) >>> 31);
                                break;
                            default:
                                f27.p();
                                break;
                        }
                        this.d = i;
                        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
                        int i3 = 1 << (3 - numberOfTrailingZeros);
                        this.e = i3;
                        this.f = i >> numberOfTrailingZeros;
                        this.c = cArr.length - 1;
                        this.g = bArr;
                        boolean[] zArr = new boolean[i3];
                        for (int i4 = 0; i4 < this.f; i4++) {
                            int i5 = this.d;
                            RoundingMode roundingMode3 = RoundingMode.CEILING;
                            zArr[vom.c(i4 * 8, i5)] = true;
                        }
                        this.h = zArr;
                        return;
                    }
                    dmk.v(sv6.j(length, "x (", ") must be > 0"));
                    i = 0;
                    this.d = i;
                    int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(i);
                    int i32 = 1 << (3 - numberOfTrailingZeros2);
                    this.e = i32;
                    this.f = i >> numberOfTrailingZeros2;
                    this.c = cArr.length - 1;
                    this.g = bArr;
                    boolean[] zArr2 = new boolean[i32];
                    while (i4 < this.f) {
                    }
                    this.h = zArr2;
                    return;
                } catch (ArithmeticException e) {
                    throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
                }
            }
        }
    }

    public final int a(char c) {
        if (c <= 127) {
            byte b = this.g[c];
            if (b == -1) {
                if (c > ' ' && c != 127) {
                    throw new IOException("Unrecognized character: " + c);
                }
                throw new IOException("Unrecognized character: 0x" + Integer.toHexString(c));
            }
            return b;
        }
        throw new IOException("Unrecognized character: 0x" + Integer.toHexString(c));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o81) && Arrays.equals(this.b, ((o81) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + 1237;
    }

    public final String toString() {
        return this.a;
    }
}
