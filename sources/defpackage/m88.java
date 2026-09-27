package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class m88 {
    public long[] a = eig.a;
    public float[] b = n88.a;
    public int c;

    public m88(DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        if (((r11 & ((~r11) << 6)) & r22) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        r12 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        int i;
        boolean z2;
        ?? r18;
        int i2;
        long j;
        int i3;
        boolean z3 = true;
        if (obj == this) {
            return true;
        }
        int i4 = 0;
        if (!(obj instanceof m88)) {
            return false;
        }
        m88 m88Var = (m88) obj;
        float[] fArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i5 = 0;
        while (true) {
            long j2 = jArr[i5];
            long j3 = -9187201950435737472L;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                int i8 = i4;
                while (i8 < i7) {
                    if ((255 & j2) < 128) {
                        float f = fArr[(i5 << 3) + i8];
                        int hashCode = Float.hashCode(f) * (-862048943);
                        int i9 = hashCode ^ (hashCode << 16);
                        z2 = z3;
                        int i10 = i9 & 127;
                        r18 = i4;
                        int i11 = m88Var.c;
                        int i12 = (i9 >>> 7) & i11;
                        int i13 = r18 == true ? 1 : 0;
                        while (true) {
                            long[] jArr2 = m88Var.a;
                            int i14 = i12 >> 3;
                            j = j3;
                            int i15 = (i12 & 7) << 3;
                            long j4 = (jArr2[i14] >>> i15) | ((jArr2[i14 + 1] << (64 - i15)) & ((-i15) >> 63));
                            i2 = i6;
                            long j5 = j4 ^ (i10 * 72340172838076673L);
                            long j6 = (~j5) & (j5 - 72340172838076673L) & j;
                            while (true) {
                                if (j6 == 0) {
                                    break;
                                }
                                i3 = (i12 + (Long.numberOfTrailingZeros(j6) >> 3)) & i11;
                                if (m88Var.b[i3] == f) {
                                    break;
                                }
                                j6 &= j6 - 1;
                            }
                            i13 += 8;
                            i12 = (i12 + i13) & i11;
                            i6 = i2;
                            j3 = j;
                        }
                        if (i3 < 0) {
                            return r18;
                        }
                    } else {
                        z2 = z3;
                        r18 = i4;
                        i2 = i6;
                        j = j3;
                    }
                    j2 >>= i2;
                    i8++;
                    i6 = i2;
                    z3 = z2;
                    i4 = r18;
                    j3 = j;
                }
                z = z3;
                i = i4;
                if (i7 != i6) {
                    return z;
                }
            } else {
                z = z3;
                i = i4;
            }
            if (i5 != length) {
                i5++;
                z3 = z;
                i4 = i;
            } else {
                return z;
            }
        }
    }

    public final int hashCode() {
        float[] fArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        i2 = Float.hashCode(fArr[(i << 3) + i4]) + i2;
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i != length) {
                i++;
            } else {
                return i2;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        float[] fArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            float f = fArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(f);
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }
}
