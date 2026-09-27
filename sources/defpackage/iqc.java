package defpackage;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class iqc extends dig {
    public int f;

    public iqc(int i) {
        super(null);
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j(eig.e(i));
        } else {
            dmk.v("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void g() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != eig.a) {
            ArraysKt.u(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ArraysKt.r(0, this.d, null, this.c);
        ArraysKt.r(0, this.d, null, this.b);
        this.f = eig.a(this.d) - this.e;
    }

    public final int h(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final int i(Object obj) {
        int i;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i2;
        int i3;
        int i4;
        Object[] objArr;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i5 = -862048943;
        int i6 = i * (-862048943);
        int i7 = i6 ^ (i6 << 16);
        int i8 = i7 >>> 7;
        int i9 = i7 & 127;
        int i10 = this.d;
        int i11 = i8 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j4 = ((jArr3[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr3[i13] >>> i14);
            long j5 = i9;
            int i15 = i9;
            int i16 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i11 + (Long.numberOfTrailingZeros(j7) >> 3)) & i10;
                int i17 = i5;
                if (Intrinsics.areEqual(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i5 = i17;
            }
            int i18 = i5;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int h = h(i8);
                long j8 = 255;
                if (this.f != 0 || ((this.a[h >> 3] >> ((h & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i19 = this.d;
                    if (i19 > 8) {
                        int i20 = 8;
                        long j9 = this.e;
                        gkj gkjVar = hkj.b;
                        if (Long.compareUnsigned(j9 * 32, i19 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i21 = this.d;
                            Object[] objArr2 = this.b;
                            Object[] objArr3 = this.c;
                            j3 = 128;
                            int i22 = (i21 + 7) >> 3;
                            int i23 = 0;
                            while (i23 < i22) {
                                long j10 = j8;
                                long j11 = jArr4[i23] & (-9187201950435737472L);
                                jArr4[i23] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
                                i23++;
                                i20 = i20;
                                j5 = j5;
                                j8 = j10;
                            }
                            j = j8;
                            j2 = j5;
                            int i24 = i20;
                            int y = ArraysKt.y(jArr4);
                            int i25 = y - 1;
                            jArr4[i25] = (jArr4[i25] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[y] = jArr4[0];
                            int i26 = 0;
                            while (i26 != i21) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j12 = (jArr4[i27] >> i28) & j;
                                if (j12 == 128 || j12 != 254) {
                                    i26++;
                                } else {
                                    Object obj2 = objArr2[i26];
                                    if (obj2 != null) {
                                        i3 = obj2.hashCode();
                                    } else {
                                        i3 = 0;
                                    }
                                    int i29 = i3 * i18;
                                    int i30 = (i29 ^ (i29 << 16)) >>> 7;
                                    int h2 = h(i30);
                                    int i31 = i30 & i21;
                                    if (((h2 - i31) & i21) / i24 == ((i26 - i31) & i21) / i24) {
                                        jArr4[i27] = ((r8 & 127) << i28) | (jArr4[i27] & (~(j << i28)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i26++;
                                        i24 = i24;
                                    } else {
                                        int i32 = i24;
                                        int i33 = h2 >> 3;
                                        long j13 = jArr4[i33];
                                        int i34 = (h2 & 7) << 3;
                                        if (((j13 >> i34) & j) == 128) {
                                            i4 = i21;
                                            objArr = objArr2;
                                            jArr4[i33] = ((~(j << i34)) & j13) | ((r8 & 127) << i34);
                                            jArr4[i27] = (jArr4[i27] & (~(j << i28))) | (128 << i28);
                                            objArr[h2] = objArr[i26];
                                            objArr[i26] = null;
                                            objArr3[h2] = objArr3[i26];
                                            objArr3[i26] = null;
                                        } else {
                                            i4 = i21;
                                            objArr = objArr2;
                                            jArr4[i33] = ((r8 & 127) << i34) | ((~(j << i34)) & j13);
                                            Object obj3 = objArr[h2];
                                            objArr[h2] = objArr[i26];
                                            objArr[i26] = obj3;
                                            Object obj4 = objArr3[h2];
                                            objArr3[h2] = objArr3[i26];
                                            objArr3[i26] = obj4;
                                            i26--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i26++;
                                        i24 = i32;
                                        i21 = i4;
                                        objArr2 = objArr;
                                    }
                                }
                            }
                            this.f = eig.a(this.d) - this.e;
                            h = h(i8);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int c = eig.c(this.d);
                    long[] jArr5 = this.a;
                    Object[] objArr4 = this.b;
                    Object[] objArr5 = this.c;
                    int i35 = this.d;
                    j(c);
                    long[] jArr6 = this.a;
                    Object[] objArr6 = this.b;
                    Object[] objArr7 = this.c;
                    int i36 = this.d;
                    int i37 = 0;
                    while (i37 < i35) {
                        if (((jArr5[i37 >> 3] >> ((i37 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i37];
                            if (obj5 != null) {
                                i2 = obj5.hashCode();
                            } else {
                                i2 = 0;
                            }
                            int i38 = i2 * i18;
                            int i39 = i38 ^ (i38 << 16);
                            int h3 = h(i39 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j14 = i39 & 127;
                            int i40 = h3 >> 3;
                            int i41 = (h3 & 7) << 3;
                            long j15 = (jArr[i40] & (~(255 << i41))) | (j14 << i41);
                            jArr[i40] = j15;
                            jArr[(((h3 - 7) & i36) + (i36 & 7)) >> 3] = j15;
                            objArr6[h3] = obj5;
                            objArr7[h3] = objArr5[i37];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i37++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    h = h(i8);
                }
                this.e++;
                int i42 = this.f;
                long[] jArr7 = this.a;
                int i43 = h >> 3;
                long j16 = jArr7[i43];
                int i44 = (h & 7) << 3;
                if (((j16 >> i44) & j) == j3) {
                    i16 = 1;
                }
                this.f = i42 - i16;
                int i45 = this.d;
                long j17 = (j16 & (~(j << i44))) | (j2 << i44);
                jArr7[i43] = j17;
                jArr7[(((h - 7) & i45) + (i45 & 7)) >> 3] = j17;
                return ~h;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
            i9 = i15;
            i5 = i18;
        }
    }

    public final void j(int i) {
        int i2;
        long[] jArr;
        Object[] objArr;
        if (i > 0) {
            i2 = Math.max(7, eig.d(i));
        } else {
            i2 = 0;
        }
        this.d = i2;
        if (i2 == 0) {
            jArr = eig.a;
        } else {
            int i3 = ((i2 + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i3];
            Arrays.fill(jArr2, 0, i3, -9187201950435737472L);
            int i4 = i2 >> 3;
            long j = 255 << ((i2 & 7) << 3);
            jArr2[i4] = (jArr2[i4] & (~j)) | j;
            jArr = jArr2;
        }
        this.a = jArr;
        this.f = eig.a(this.d) - this.e;
        Object[] objArr2 = apl.c;
        if (i2 == 0) {
            objArr = objArr2;
        } else {
            objArr = new Object[i2];
        }
        this.b = objArr;
        if (i2 != 0) {
            objArr2 = new Object[i2];
        }
        this.c = objArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * (-862048943);
        int i5 = i4 ^ (i4 << 16);
        int i6 = i5 & 127;
        int i7 = this.d;
        int i8 = i5 >>> 7;
        loop0: while (true) {
            int i9 = i8 & i7;
            long[] jArr = this.a;
            int i10 = i9 >> 3;
            int i11 = (i9 & 7) << 3;
            long j = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j2 = (i6 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i9) & i7;
                if (Intrinsics.areEqual(this.b[i2], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i3 += 8;
            i8 = i9 + i3;
        }
        if (i2 >= 0) {
            return l(i2);
        }
        return null;
    }

    public final Object l(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void m(Object obj, Object obj2) {
        int i = i(obj);
        if (i < 0) {
            i = ~i;
        }
        this.b[i] = obj;
        this.c[i] = obj2;
    }

    public /* synthetic */ iqc(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public iqc() {
        this(0, 1, null);
    }
}
