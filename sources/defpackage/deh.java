package defpackage;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class deh {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final short[] i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public double w;

    public deh(int i, int i2, float f, float f2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / CarouselScreenFragment.CAROUSEL_ANIMATION_MS;
        int i4 = i / 65;
        this.g = i4;
        int i5 = i4 * 2;
        this.h = i5;
        this.i = new short[i5];
        this.j = new short[i5 * i2];
        this.l = new short[i5 * i2];
        this.n = new short[i5 * i2];
    }

    public static void e(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    public final void a(short[] sArr, int i, int i2) {
        short[] c = c(this.l, this.m, i2);
        this.l = c;
        int i3 = this.b;
        System.arraycopy(sArr, i * i3, c, this.m * i3, i3 * i2);
        this.m += i2;
    }

    public final void b(short[] sArr, int i, int i2) {
        int i3 = this.h / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[k84.a(i7, i5, i6, i9)];
            }
            this.i[i7] = (short) (i8 / i5);
        }
    }

    public final short[] c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int d(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.u = i6 / i7;
        this.v = i8 / i5;
        return i7;
    }

    public final void f() {
        int i;
        float f;
        double d;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j;
        long j2;
        boolean z;
        int i10 = this.m;
        float f2 = this.c;
        float f3 = this.d;
        double d2 = f2 / f3;
        float f4 = this.e * f3;
        int i11 = this.a;
        int i12 = 1;
        int i13 = this.b;
        int i14 = 0;
        if (d2 <= 1.0000100135803223d && d2 >= 0.9999899864196777d) {
            a(this.j, 0, this.k);
            this.k = 0;
        } else {
            int i15 = this.k;
            int i16 = this.h;
            if (i15 >= i16) {
                int i17 = 0;
                while (true) {
                    int i18 = this.r;
                    if (i18 > 0) {
                        int min = Math.min(i16, i18);
                        a(this.j, i17, min);
                        this.r -= min;
                        i17 += min;
                        f = f4;
                        d = d2;
                        i4 = i16;
                    } else {
                        short[] sArr = this.j;
                        if (i11 > 4000) {
                            i = i11 / 4000;
                        } else {
                            i = i12;
                        }
                        int i19 = this.g;
                        int i20 = this.f;
                        if (i13 == i12 && i == i12) {
                            i2 = d(sArr, i17, i20, i19);
                            f = f4;
                            d = d2;
                        } else {
                            b(sArr, i17, i);
                            f = f4;
                            d = d2;
                            short[] sArr2 = this.i;
                            int d3 = d(sArr2, i14, i20 / i, i19 / i);
                            if (i != 1) {
                                int i21 = d3 * i;
                                int i22 = i * 4;
                                int i23 = i21 - i22;
                                int i24 = i21 + i22;
                                if (i23 >= i20) {
                                    i20 = i23;
                                }
                                if (i24 <= i19) {
                                    i19 = i24;
                                }
                                if (i13 == 1) {
                                    i2 = d(sArr, i17, i20, i19);
                                } else {
                                    b(sArr, i17, 1);
                                    i2 = d(sArr2, i14, i20, i19);
                                }
                            } else {
                                i2 = d3;
                            }
                        }
                        int i25 = this.u;
                        int i26 = this.v;
                        if (i25 == 0 || (i3 = this.s) == 0 || i26 > i25 * 3 || i25 * 2 <= this.t * 3) {
                            i3 = i2;
                        }
                        this.t = i25;
                        this.s = i2;
                        short[] sArr3 = this.j;
                        double d4 = this.w;
                        if (d > 1.0d) {
                            if (d >= 2.0d) {
                                i4 = i16;
                                double d5 = (i3 / (d - 1.0d)) + d4;
                                i6 = (int) Math.round(d5);
                                this.w = d5 - i6;
                            } else {
                                i4 = i16;
                                double d6 = (((2.0d - d) * i3) / (d - 1.0d)) + d4;
                                int round = (int) Math.round(d6);
                                this.r = round;
                                this.w = d6 - round;
                                i6 = i3;
                            }
                            short[] c = c(this.l, this.m, i6);
                            this.l = c;
                            int i27 = i17 + i3;
                            int i28 = i17;
                            int i29 = i6;
                            e(i29, this.b, c, this.m, sArr3, i28, sArr3, i27);
                            this.m += i29;
                            i17 = i3 + i29 + i28;
                        } else {
                            i4 = i16;
                            int i30 = i17;
                            if (d < 0.5d) {
                                double d7 = ((i3 * d) / (1.0d - d)) + d4;
                                int round2 = (int) Math.round(d7);
                                this.w = d7 - round2;
                                i5 = round2;
                            } else {
                                double d8 = ((((2.0d * d) - 1.0d) * i3) / (1.0d - d)) + d4;
                                int round3 = (int) Math.round(d8);
                                this.r = round3;
                                this.w = d8 - round3;
                                i5 = i3;
                            }
                            int i31 = i3 + i5;
                            short[] c2 = c(this.l, this.m, i31);
                            this.l = c2;
                            System.arraycopy(sArr3, i30 * i13, c2, this.m * i13, i3 * i13);
                            e(i5, this.b, this.l, this.m + i3, sArr3, i30 + i3, sArr3, i30);
                            this.m += i31;
                            i17 = i30 + i5;
                        }
                    }
                    if (i17 + i4 > i15) {
                        break;
                    }
                    i14 = 0;
                    i16 = i4;
                    i12 = 1;
                    f4 = f;
                    d2 = d;
                }
                int i32 = this.k - i17;
                short[] sArr4 = this.j;
                System.arraycopy(sArr4, i17 * i13, sArr4, 0, i32 * i13);
                this.k = i32;
                if (f == 1.0f && this.m != i10) {
                    long j3 = i11 / f;
                    long j4 = i11;
                    while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                        j3 /= 2;
                        j4 /= 2;
                    }
                    int i33 = this.m - i10;
                    short[] c3 = c(this.n, this.o, i33);
                    this.n = c3;
                    System.arraycopy(this.l, i10 * i13, c3, this.o * i13, i33 * i13);
                    this.m = i10;
                    this.o += i33;
                    int i34 = 0;
                    while (true) {
                        i7 = this.o;
                        i8 = i7 - 1;
                        if (i34 >= i8) {
                            break;
                        }
                        while (true) {
                            i9 = this.p + 1;
                            j = i9;
                            long j5 = j * j3;
                            j2 = this.q;
                            if (j5 <= j2 * j4) {
                                break;
                            }
                            this.l = c(this.l, this.m, 1);
                            int i35 = 0;
                            while (i35 < i13) {
                                short[] sArr5 = this.l;
                                int i36 = (this.m * i13) + i35;
                                short[] sArr6 = this.n;
                                int i37 = (i34 * i13) + i35;
                                short s = sArr6[i37];
                                short s2 = sArr6[i37 + i13];
                                long j6 = j3;
                                int i38 = i34;
                                long j7 = (r12 + 1) * j6;
                                long j8 = j7 - (this.q * j4);
                                long j9 = j7 - (this.p * j6);
                                sArr5[i36] = (short) ((((j9 - j8) * s2) + (s * j8)) / j9);
                                i35++;
                                i34 = i38;
                                j3 = j6;
                            }
                            this.q++;
                            this.m++;
                            i34 = i34;
                            j3 = j3;
                        }
                        long j10 = j3;
                        int i39 = i34;
                        this.p = i9;
                        if (j == j4) {
                            this.p = 0;
                            if (j2 == j10) {
                                z = true;
                            } else {
                                z = false;
                            }
                            pfn.f(z);
                            this.q = 0;
                        }
                        i34 = i39 + 1;
                        j3 = j10;
                    }
                    if (i8 != 0) {
                        short[] sArr7 = this.n;
                        System.arraycopy(sArr7, i8 * i13, sArr7, 0, (i7 - i8) * i13);
                        this.o -= i8;
                        return;
                    }
                    return;
                }
            }
        }
        f = f4;
        if (f == 1.0f) {
        }
    }
}
