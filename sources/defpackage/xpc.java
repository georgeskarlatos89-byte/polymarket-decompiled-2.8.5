package defpackage;

import java.util.Arrays;
import java.util.Collection;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xpc extends pmd {
    public int h;

    public xpc(int i) {
        this.a = eig.a;
        this.b = apl.c;
        this.c = uzm.a;
        this.d = bd0.API_PRIORITY_OTHER;
        this.e = bd0.API_PRIORITY_OTHER;
        if (i >= 0) {
            f(eig.e(i));
        } else {
            dmk.v("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean b(Object obj) {
        int i = this.g;
        int d = d(obj);
        this.b[d] = obj;
        long[] jArr = this.c;
        int i2 = this.d;
        jArr[d] = (i2 & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((d & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.d = d;
        if (this.e == Integer.MAX_VALUE) {
            this.e = d;
        }
        if (this.g != i) {
            return true;
        }
        return false;
    }

    public final void c() {
        this.g = 0;
        long[] jArr = this.a;
        if (jArr != eig.a) {
            ArraysKt.u(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.f;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ArraysKt.r(0, this.f, null, this.b);
        ArraysKt.u(this.c, 4611686018427387903L);
        this.d = bd0.API_PRIORITY_OTHER;
        this.e = bd0.API_PRIORITY_OTHER;
        this.h = eig.a(this.f) - this.g;
    }

    public final int d(Object obj) {
        int i;
        int i2;
        long j;
        long j2;
        long j3;
        char c;
        int i3;
        int i4;
        long[] jArr;
        long[] jArr2;
        int i5;
        int i6;
        int i7;
        int i8;
        long j4;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i9 = -862048943;
        int i10 = i * (-862048943);
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j5 = ((jArr3[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr3[i17] >>> i18);
            long j6 = i13;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
            while (j8 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i15) & i14;
                int i19 = i9;
                if (Intrinsics.areEqual(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i9 = i19;
            }
            int i20 = i9;
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                int e = e(i12);
                long j9 = 255;
                if (this.h != 0 || ((this.a[e >> 3] >> ((e & 7) << 3)) & 255) == 254) {
                    i2 = 0;
                    j = j6;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i21 = this.f;
                    if (i21 > 8) {
                        c = 31;
                        long j10 = this.g;
                        gkj gkjVar = hkj.b;
                        j3 = 128;
                        if (Long.compareUnsigned(j10 * 32, i21 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            if (jArr4 == null) {
                                i2 = 0;
                                j = j6;
                                j2 = 255;
                            } else {
                                int i22 = this.f;
                                Object[] objArr = this.b;
                                long[] jArr5 = this.c;
                                long[] jArr6 = new long[i22];
                                Arrays.fill(jArr6, 0, i22, 9223372034707292159L);
                                i2 = 0;
                                int i23 = (i22 + 7) >> 3;
                                int i24 = 0;
                                while (i24 < i23) {
                                    long j11 = j9;
                                    long j12 = jArr4[i24] & (-9187201950435737472L);
                                    int i25 = i24;
                                    jArr4[i25] = ((~j12) + (j12 >>> 7)) & (-72340172838076674L);
                                    i24 = i25 + 1;
                                    j9 = j11;
                                }
                                j2 = j9;
                                int length = jArr4.length;
                                int i26 = length - 1;
                                int i27 = length - 2;
                                jArr4[i27] = (jArr4[i27] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i26] = jArr4[0];
                                int i28 = 0;
                                while (i28 != i22) {
                                    int i29 = i28 >> 3;
                                    int i30 = (i28 & 7) << 3;
                                    long j13 = (jArr4[i29] >> i30) & j2;
                                    if (j13 == 128 || j13 != 254) {
                                        i28++;
                                    } else {
                                        Object obj2 = objArr[i28];
                                        if (obj2 != null) {
                                            i8 = obj2.hashCode();
                                        } else {
                                            i8 = 0;
                                        }
                                        int i31 = i8 * i20;
                                        int i32 = (i31 ^ (i31 << 16)) >>> 7;
                                        int e2 = e(i32);
                                        int i33 = i32 & i22;
                                        if (((e2 - i33) & i22) / 8 == ((i28 - i33) & i22) / 8) {
                                            int i34 = i22;
                                            Object[] objArr2 = objArr;
                                            jArr4[i29] = (jArr4[i29] & (~(j2 << i30))) | ((r17 & 127) << i30);
                                            if (jArr6[i28] == 9223372034707292159L) {
                                                long j14 = i28;
                                                jArr6[i28] = j14 | (j14 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i28++;
                                            i22 = i34;
                                            objArr = objArr2;
                                        } else {
                                            int i35 = i22;
                                            Object[] objArr3 = objArr;
                                            int i36 = e2 >> 3;
                                            long j15 = jArr4[i36];
                                            int i37 = (e2 & 7) << 3;
                                            if (((j15 >> i37) & j2) == 128) {
                                                jArr4[i36] = (j15 & (~(j2 << i37))) | ((r17 & 127) << i37);
                                                jArr4[i29] = (jArr4[i29] & (~(j2 << i30))) | (128 << i30);
                                                objArr3[e2] = objArr3[i28];
                                                objArr3[i28] = null;
                                                jArr5[e2] = jArr5[i28];
                                                jArr5[i28] = 4611686018427387903L;
                                                int i38 = (int) ((jArr6[i28] >> 32) & 4294967295L);
                                                if (i38 != Integer.MAX_VALUE) {
                                                    j4 = j6;
                                                    jArr6[i38] = e2 | (jArr6[i38] & (-4294967296L));
                                                    jArr6[i28] = (jArr6[i28] & 4294967295L) | (-4294967296L);
                                                } else {
                                                    j4 = j6;
                                                    jArr6[i28] = 9223372032559808512L | e2;
                                                }
                                                jArr6[e2] = (i28 << 32) | 2147483647L;
                                            } else {
                                                j4 = j6;
                                                jArr4[i36] = ((r17 & 127) << i37) | (j15 & (~(j2 << i37)));
                                                Object obj3 = objArr3[e2];
                                                objArr3[e2] = objArr3[i28];
                                                objArr3[i28] = obj3;
                                                long j16 = jArr5[e2];
                                                jArr5[e2] = jArr5[i28];
                                                jArr5[i28] = j16;
                                                int i39 = (int) ((jArr6[i28] >> 32) & 4294967295L);
                                                if (i39 != Integer.MAX_VALUE) {
                                                    long j17 = e2;
                                                    jArr6[i39] = (jArr6[i39] & (-4294967296L)) | j17;
                                                    jArr6[i28] = (jArr6[i28] & 4294967295L) | (j17 << 32);
                                                } else {
                                                    long j18 = e2;
                                                    jArr6[i28] = j18 | (j18 << 32);
                                                    i39 = i28;
                                                }
                                                jArr6[e2] = (i39 << 32) | i28;
                                                i28--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i28++;
                                            i22 = i35;
                                            objArr = objArr3;
                                            j6 = j4;
                                        }
                                    }
                                }
                                j = j6;
                                this.h = eig.a(this.f) - this.g;
                                long[] jArr7 = this.c;
                                int length2 = jArr7.length;
                                for (int i40 = 0; i40 < length2; i40++) {
                                    long j19 = jArr7[i40];
                                    int i41 = (int) ((j19 >> 31) & 2147483647L);
                                    int i42 = (int) (j19 & 2147483647L);
                                    long j20 = j19 & (-4611686018427387904L);
                                    if (i41 == Integer.MAX_VALUE) {
                                        i6 = Integer.MAX_VALUE;
                                    } else {
                                        i6 = (int) (jArr6[i41] & 4294967295L);
                                    }
                                    long j21 = (j20 | i6) << 31;
                                    if (i42 == Integer.MAX_VALUE) {
                                        i7 = bd0.API_PRIORITY_OTHER;
                                    } else {
                                        i7 = (int) (jArr6[i42] & 4294967295L);
                                    }
                                    jArr7[i40] = j21 | i7;
                                }
                                int i43 = this.d;
                                if (i43 != Integer.MAX_VALUE) {
                                    this.d = (int) (jArr6[i43] & 4294967295L);
                                }
                                int i44 = this.e;
                                if (i44 != Integer.MAX_VALUE) {
                                    this.e = (int) (jArr6[i44] & 4294967295L);
                                }
                            }
                            e = e(i12);
                        }
                    } else {
                        c = 31;
                        j3 = 128;
                    }
                    i2 = 0;
                    j = j6;
                    j2 = 255;
                    int c2 = eig.c(this.f);
                    long[] jArr8 = this.a;
                    Object[] objArr4 = this.b;
                    long[] jArr9 = this.c;
                    int i45 = this.f;
                    int[] iArr = new int[i45];
                    f(c2);
                    long[] jArr10 = this.a;
                    Object[] objArr5 = this.b;
                    long[] jArr11 = this.c;
                    int i46 = this.f;
                    int i47 = 0;
                    while (i47 < i45) {
                        if (((jArr8[i47 >> 3] >> ((i47 & 7) << 3)) & 255) < j3) {
                            Object obj4 = objArr4[i47];
                            if (obj4 != null) {
                                i5 = obj4.hashCode();
                            } else {
                                i5 = 0;
                            }
                            int i48 = i5 * i20;
                            int i49 = i48 ^ (i48 << 16);
                            int e3 = e(i49 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j22 = i49 & 127;
                            int i50 = e3 >> 3;
                            int i51 = (e3 & 7) << 3;
                            long j23 = (jArr[i50] & (~(255 << i51))) | (j22 << i51);
                            jArr[i50] = j23;
                            jArr[(((e3 - 7) & i46) + (i46 & 7)) >> 3] = j23;
                            objArr5[e3] = obj4;
                            jArr11[e3] = jArr9[i47];
                            iArr[i47] = e3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i47++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.c;
                    int length3 = jArr12.length;
                    for (int i52 = 0; i52 < length3; i52++) {
                        long j24 = jArr12[i52];
                        int i53 = (int) ((j24 >> c) & 2147483647L);
                        int i54 = (int) (j24 & 2147483647L);
                        long j25 = j24 & (-4611686018427387904L);
                        if (i53 == Integer.MAX_VALUE) {
                            i3 = Integer.MAX_VALUE;
                        } else {
                            i3 = iArr[i53];
                        }
                        long j26 = (j25 | i3) << c;
                        if (i54 == Integer.MAX_VALUE) {
                            i4 = Integer.MAX_VALUE;
                        } else {
                            i4 = iArr[i54];
                        }
                        jArr12[i52] = j26 | i4;
                    }
                    int i55 = this.d;
                    if (i55 != Integer.MAX_VALUE) {
                        this.d = iArr[i55];
                    }
                    int i56 = this.e;
                    if (i56 != Integer.MAX_VALUE) {
                        this.e = iArr[i56];
                    }
                    e = e(i12);
                }
                this.g++;
                int i57 = this.h;
                long[] jArr13 = this.a;
                int i58 = e >> 3;
                long j27 = jArr13[i58];
                int i59 = (e & 7) << 3;
                if (((j27 >> i59) & j2) == j3) {
                    i2 = 1;
                }
                this.h = i57 - i2;
                int i60 = this.f;
                long j28 = (j27 & (~(j2 << i59))) | (j << i59);
                jArr13[i58] = j28;
                jArr13[(((e - 7) & i60) + (i60 & 7)) >> 3] = j28;
                return e;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i9 = i20;
        }
    }

    public final int e(int i) {
        int i2 = this.f;
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

    public final void f(int i) {
        int i2;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        if (i > 0) {
            i2 = Math.max(7, eig.d(i));
        } else {
            i2 = 0;
        }
        this.f = i2;
        if (i2 == 0) {
            jArr = eig.a;
        } else {
            int i3 = ((i2 + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i3];
            Arrays.fill(jArr3, 0, i3, -9187201950435737472L);
            jArr = jArr3;
        }
        this.a = jArr;
        int i4 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j)) | j;
        this.h = eig.a(this.f) - this.g;
        if (i2 == 0) {
            objArr = apl.c;
        } else {
            objArr = new Object[i2];
        }
        this.b = objArr;
        if (i2 == 0) {
            jArr2 = uzm.a;
        } else {
            long[] jArr4 = new long[i2];
            Arrays.fill(jArr4, 0, i2, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.c = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(Object obj) {
        int i;
        int i2;
        boolean z = false;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 & 127;
        int i6 = this.f;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j2 = (i5 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i6;
                if (Intrinsics.areEqual(this.b[i2], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        if (i2 >= 0) {
            z = true;
        }
        if (z) {
            h(i2);
        }
        return z;
    }

    public final void h(int i) {
        this.g--;
        long[] jArr = this.a;
        int i2 = this.f;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        long[] jArr2 = this.c;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (i6 & 2147483647L);
        } else {
            this.d = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((i5 & 2147483647L) << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.e = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final boolean i(Collection collection) {
        collection.getClass();
        Object[] objArr = this.b;
        int i = this.g;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!CollectionsKt.x(collection, objArr[i5])) {
                                h(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        if (i == this.g) {
            return false;
        }
        return true;
    }
}
