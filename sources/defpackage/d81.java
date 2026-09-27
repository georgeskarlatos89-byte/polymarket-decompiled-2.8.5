package defpackage;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class d81 implements Serializable {
    public final String a;

    public d81(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }

    public final byte[] a() {
        char c;
        String str = this.a;
        if (str != null && !str.isEmpty()) {
            byte[] bytes = str.getBytes(ouh.a);
            int length = bytes.length;
            long j = (length * 6) >> 3;
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                int i2 = 0;
                int i3 = 0;
                while (i2 < bytes.length) {
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < 4 && i2 < length) {
                        int i6 = i2 + 1;
                        byte b = bytes[i2];
                        int f = rgn.f(b, 64) & rgn.g(b, 91);
                        int f2 = rgn.f(b, 96) & rgn.g(b, 123);
                        int f3 = rgn.f(b, 47) & rgn.g(b, 58);
                        int e = rgn.e(b, 45) | rgn.e(b, 43);
                        int e2 = rgn.e(b, 47) | rgn.e(b, 95);
                        byte[] bArr2 = bytes;
                        int h = rgn.h(f2, b - 71, 0) | rgn.h(f, b - 65, 0) | rgn.h(f3, b + 4, 0) | rgn.h(e, 62, 0) | rgn.h(e2, 63, 0) | rgn.h(f | f2 | f3 | e | e2, 0, -1);
                        if (h >= 0) {
                            i5 |= h << (18 - (i4 * 6));
                            i4++;
                        }
                        i2 = i6;
                        bytes = bArr2;
                    }
                    byte[] bArr3 = bytes;
                    if (i4 >= 2) {
                        int i7 = i3 + 1;
                        bArr[i3] = (byte) (i5 >> 16);
                        c = 3;
                        if (i4 >= 3) {
                            int i8 = i3 + 2;
                            bArr[i7] = (byte) (i5 >> 8);
                            if (i4 >= 4) {
                                i3 += 3;
                                bArr[i8] = (byte) i5;
                            } else {
                                i3 = i8;
                            }
                        } else {
                            i3 = i7;
                        }
                    } else {
                        c = 3;
                    }
                    bytes = bArr3;
                }
                return Arrays.copyOf(bArr, i3);
            }
            throw new IllegalArgumentException(j + " cannot be cast to int without changing its value.");
        }
        return new byte[0];
    }

    public final BigInteger b() {
        return new BigInteger(1, a());
    }

    public boolean equals(Object obj) {
        if (obj instanceof d81) {
            if (this.a.equals(((d81) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
