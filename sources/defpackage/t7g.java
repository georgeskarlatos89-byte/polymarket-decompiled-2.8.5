package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class t7g extends zb4 {
    public static final omf r = new omf(14);
    public final fkk d;
    public final float e;
    public final float f;
    public final zaj g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final sx6 k;
    public final s7g l;
    public final q7g m;
    public final sx6 n;
    public final s7g o;
    public final q7g p;
    public final boolean q;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01df, code lost:
    
        if ((((r25 - r12) * r3) - ((r1 - r15) * r10)) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t7g(String str, float[] fArr, fkk fkkVar, float[] fArr2, sx6 sx6Var, sx6 sx6Var2, float f, float f2, zaj zajVar, int i) {
        super(i, 12884901888L, str);
        ?? r44;
        float f3;
        float[] fArr3;
        float f4;
        boolean z;
        this.d = fkkVar;
        this.e = f;
        this.f = f2;
        this.g = zajVar;
        this.k = sx6Var;
        this.l = new s7g(this, 1);
        this.m = new q7g(this, 0);
        this.n = sx6Var2;
        this.o = new s7g(this, 0);
        this.p = new q7g(this, 1);
        if (fArr.length != 6 && fArr.length != 9) {
            dmk.v("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f < f2) {
            float[] fArr4 = new float[6];
            if (fArr.length == 9) {
                float f5 = fArr[0];
                float f6 = fArr[1];
                float f7 = f5 + f6 + fArr[2];
                fArr4[0] = f5 / f7;
                fArr4[1] = f6 / f7;
                float f8 = fArr[3];
                float f9 = fArr[4];
                float f10 = f8 + f9 + fArr[5];
                fArr4[2] = f8 / f10;
                fArr4[3] = f9 / f10;
                float f11 = fArr[6];
                float f12 = fArr[7];
                float f13 = f11 + f12 + fArr[8];
                fArr4[4] = f11 / f13;
                fArr4[5] = f12 / f13;
            } else {
                System.arraycopy(fArr, 0, fArr4, 0, 6);
            }
            this.h = fArr4;
            if (fArr2 == null) {
                float f14 = fArr4[0];
                float f15 = fArr4[1];
                float f16 = fArr4[2];
                float f17 = fArr4[3];
                float f18 = fArr4[4];
                float f19 = fArr4[5];
                f3 = 1.0f;
                float f20 = fkkVar.a;
                r44 = 1;
                float f21 = fkkVar.b;
                float f22 = 1.0f - f14;
                float f23 = f22 / f15;
                float f24 = 1.0f - f16;
                float f25 = 1.0f - f18;
                float f26 = (1.0f - f20) / f21;
                float f27 = f14 / f15;
                float f28 = (f16 / f17) - f27;
                float f29 = (f20 / f21) - f27;
                float f30 = (f24 / f17) - f23;
                float f31 = (f18 / f19) - f27;
                float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
                float f33 = (f29 - (f31 * f32)) / f28;
                float f34 = (1.0f - f33) - f32;
                float f35 = f34 / f15;
                float f36 = f33 / f17;
                float f37 = f32 / f19;
                fArr3 = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
                this.i = fArr3;
            } else {
                r44 = 1;
                f3 = 1.0f;
                if (fArr2.length == 9) {
                    this.i = fArr2;
                    fArr3 = fArr2;
                } else {
                    dmk.g(fArr2.length, "Transform must have 9 entries! Has ");
                    throw null;
                }
            }
            this.j = mpn.e(fArr3);
            float a = mvn.a(fArr4);
            float[] fArr5 = bc4.a;
            if (a / mvn.a(bc4.b) > 0.9f) {
                float[] fArr6 = bc4.a;
                float f38 = fArr4[0];
                float f39 = fArr6[0];
                float f40 = fArr4[r44];
                float f41 = fArr6[r44];
                float f42 = fArr4[2];
                float f43 = fArr6[2];
                float f44 = fArr4[3];
                float f45 = fArr6[3];
                float f46 = fArr4[4];
                float f47 = fArr6[4];
                float f48 = fArr4[5];
                float f49 = fArr6[5];
                f4 = 0.0f;
                float[] fArr7 = new float[6];
                fArr7[0] = f38 - f39;
                fArr7[r44] = f40 - f41;
                fArr7[2] = f42 - f43;
                fArr7[3] = f44 - f45;
                fArr7[4] = f46 - f47;
                fArr7[5] = f48 - f49;
                float f50 = fArr7[0];
                float f51 = fArr7[r44];
                if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                    float f52 = fArr7[2];
                    float f53 = fArr7[3];
                    if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                        float f54 = fArr7[4];
                        float f55 = fArr7[5];
                        if (((f49 - f45) * f54) - ((f47 - f43) * f55) >= 0.0f) {
                        }
                    }
                }
            } else {
                f4 = 0.0f;
            }
            int i2 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
            if (i != 0) {
                float[] fArr8 = bc4.a;
                if (fArr4 != fArr8) {
                    for (int i3 = 0; i3 < 6; i3++) {
                        if (Float.compare(fArr4[i3], fArr8[i3]) != 0 && Math.abs(fArr4[i3] - fArr8[i3]) > 0.001f) {
                            break;
                        }
                    }
                }
                if (mpn.c(fkkVar, c1m.d) && f == f4 && f2 == f3) {
                    float[] fArr9 = bc4.a;
                    t7g t7gVar = bc4.e;
                    for (double d = ConstantsKt.UNSET; d <= 1.0d; d += 0.00392156862745098d) {
                        if (Math.abs(sx6Var.c(d) - t7gVar.k.c(d)) <= 0.001d && Math.abs(sx6Var2.c(d) - t7gVar.n.c(d)) <= 0.001d) {
                        }
                    }
                }
                z = false;
                this.q = z;
                return;
            }
            z = r44;
            this.q = z;
            return;
        }
        omf.j("Invalid range: min=", f, ", max=", f2, "; min must be strictly < max");
        throw null;
    }

    @Override // defpackage.zb4
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.zb4
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.zb4
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.zb4
    public final long d(float f, float f2, float f3) {
        double d = f;
        q7g q7gVar = this.p;
        float c = (float) q7gVar.c(d);
        float c2 = (float) q7gVar.c(f2);
        float c3 = (float) q7gVar.c(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * c3) + (fArr[3] * c2) + (fArr[0] * c);
        float f5 = (fArr[7] * c3) + (fArr[4] * c2) + (fArr[1] * c);
        return (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
    }

    @Override // defpackage.zb4
    public final float e(float f, float f2, float f3) {
        double d = f;
        q7g q7gVar = this.p;
        float c = (float) q7gVar.c(d);
        float c2 = (float) q7gVar.c(f2);
        float c3 = (float) q7gVar.c(f3);
        float[] fArr = this.i;
        return (fArr[8] * c3) + (fArr[5] * c2) + (fArr[2] * c);
    }

    @Override // defpackage.zb4
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t7g.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        t7g t7gVar = (t7g) obj;
        if (Float.compare(t7gVar.e, this.e) != 0 || Float.compare(t7gVar.f, this.f) != 0 || !Intrinsics.areEqual(this.d, t7gVar.d) || !Arrays.equals(this.h, t7gVar.h)) {
            return false;
        }
        zaj zajVar = t7gVar.g;
        zaj zajVar2 = this.g;
        if (zajVar2 != null) {
            return Intrinsics.areEqual(zajVar2, zajVar);
        }
        if (zajVar == null) {
            return true;
        }
        if (!Intrinsics.areEqual(this.k, t7gVar.k)) {
            return false;
        }
        return Intrinsics.areEqual(this.n, t7gVar.n);
    }

    @Override // defpackage.zb4
    public final long f(float f, float f2, float f3, float f4, zb4 zb4Var) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        q7g q7gVar = this.m;
        return hpn.a((float) q7gVar.c(f5), (float) q7gVar.c(f6), (float) q7gVar.c(f7), f4, zb4Var);
    }

    @Override // defpackage.zb4
    public final int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int hashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int i = 0;
        if (f == 0.0f) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f);
        }
        int i2 = (hashCode + floatToIntBits) * 31;
        float f2 = this.f;
        if (f2 == 0.0f) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f2);
        }
        int i3 = (i2 + floatToIntBits2) * 31;
        zaj zajVar = this.g;
        if (zajVar != null) {
            i = zajVar.hashCode();
        }
        int i4 = i3 + i;
        if (zajVar == null) {
            return this.n.hashCode() + ((this.k.hashCode() + (i4 * 31)) * 31);
        }
        return i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t7g(String str, float[] fArr, fkk fkkVar, final zaj zajVar, int i) {
        this(str, fArr, fkkVar, null, r4, r0, 0.0f, 1.0f, zajVar, i);
        double d;
        sx6 sx6Var;
        sx6 sx6Var2;
        double d2 = zajVar.a;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = zajVar.g;
        double d4 = zajVar.f;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            sx6Var = new sx6() { // from class: r7g
                @Override // defpackage.sx6
                public final double c(double d5) {
                    int i5 = i4;
                    zaj zajVar2 = zajVar;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = bc4.a;
                            return bc4.a(zajVar2, d5);
                        case 1:
                            float[] fArr3 = bc4.a;
                            return bc4.c(zajVar2, d5);
                        case 2:
                            double d6 = zajVar2.b;
                            double d7 = zajVar2.c;
                            double d8 = zajVar2.d;
                            double d9 = zajVar2.e;
                            double d10 = zajVar2.a;
                            if (d5 >= d9) {
                                return Math.pow((d6 * d5) + d7, d10);
                            }
                            return d8 * d5;
                        case 3:
                            double d11 = zajVar2.b;
                            double d12 = zajVar2.c;
                            double d13 = zajVar2.d;
                            double d14 = zajVar2.e;
                            double d15 = zajVar2.f;
                            double d16 = zajVar2.g;
                            double d17 = zajVar2.a;
                            if (d5 >= d14) {
                                return Math.pow((d11 * d5) + d12, d17) + d15;
                            }
                            return (d13 * d5) + d16;
                        case 4:
                            float[] fArr4 = bc4.a;
                            return bc4.b(zajVar2, d5);
                        case 5:
                            float[] fArr5 = bc4.a;
                            return bc4.d(zajVar2, d5);
                        case 6:
                            double d18 = zajVar2.b;
                            double d19 = zajVar2.c;
                            double d20 = zajVar2.d;
                            double d21 = zajVar2.e;
                            double d22 = zajVar2.a;
                            if (d5 >= d21 * d20) {
                                return (Math.pow(d5, 1.0d / d22) - d19) / d18;
                            }
                            return d5 / d20;
                        default:
                            double d23 = zajVar2.b;
                            double d24 = zajVar2.c;
                            double d25 = zajVar2.d;
                            double d26 = zajVar2.e;
                            double d27 = zajVar2.f;
                            double d28 = zajVar2.g;
                            double d29 = zajVar2.a;
                            if (d5 >= d26 * d25) {
                                return (Math.pow(d5 - d27, 1.0d / d29) - d24) / d23;
                            }
                            return (d5 - d28) / d25;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                sx6Var = new sx6() { // from class: r7g
                    @Override // defpackage.sx6
                    public final double c(double d5) {
                        int i52 = i5;
                        zaj zajVar2 = zajVar;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = bc4.a;
                                return bc4.a(zajVar2, d5);
                            case 1:
                                float[] fArr3 = bc4.a;
                                return bc4.c(zajVar2, d5);
                            case 2:
                                double d6 = zajVar2.b;
                                double d7 = zajVar2.c;
                                double d8 = zajVar2.d;
                                double d9 = zajVar2.e;
                                double d10 = zajVar2.a;
                                if (d5 >= d9) {
                                    return Math.pow((d6 * d5) + d7, d10);
                                }
                                return d8 * d5;
                            case 3:
                                double d11 = zajVar2.b;
                                double d12 = zajVar2.c;
                                double d13 = zajVar2.d;
                                double d14 = zajVar2.e;
                                double d15 = zajVar2.f;
                                double d16 = zajVar2.g;
                                double d17 = zajVar2.a;
                                if (d5 >= d14) {
                                    return Math.pow((d11 * d5) + d12, d17) + d15;
                                }
                                return (d13 * d5) + d16;
                            case 4:
                                float[] fArr4 = bc4.a;
                                return bc4.b(zajVar2, d5);
                            case 5:
                                float[] fArr5 = bc4.a;
                                return bc4.d(zajVar2, d5);
                            case 6:
                                double d18 = zajVar2.b;
                                double d19 = zajVar2.c;
                                double d20 = zajVar2.d;
                                double d21 = zajVar2.e;
                                double d22 = zajVar2.a;
                                if (d5 >= d21 * d20) {
                                    return (Math.pow(d5, 1.0d / d22) - d19) / d18;
                                }
                                return d5 / d20;
                            default:
                                double d23 = zajVar2.b;
                                double d24 = zajVar2.c;
                                double d25 = zajVar2.d;
                                double d26 = zajVar2.e;
                                double d27 = zajVar2.f;
                                double d28 = zajVar2.g;
                                double d29 = zajVar2.a;
                                if (d5 >= d26 * d25) {
                                    return (Math.pow(d5 - d27, 1.0d / d29) - d24) / d23;
                                }
                                return (d5 - d28) / d25;
                        }
                    }
                };
            } else if (d4 == ConstantsKt.UNSET && d3 == ConstantsKt.UNSET) {
                final int i6 = 6;
                sx6Var = new sx6() { // from class: r7g
                    @Override // defpackage.sx6
                    public final double c(double d5) {
                        int i52 = i6;
                        zaj zajVar2 = zajVar;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = bc4.a;
                                return bc4.a(zajVar2, d5);
                            case 1:
                                float[] fArr3 = bc4.a;
                                return bc4.c(zajVar2, d5);
                            case 2:
                                double d6 = zajVar2.b;
                                double d7 = zajVar2.c;
                                double d8 = zajVar2.d;
                                double d9 = zajVar2.e;
                                double d10 = zajVar2.a;
                                if (d5 >= d9) {
                                    return Math.pow((d6 * d5) + d7, d10);
                                }
                                return d8 * d5;
                            case 3:
                                double d11 = zajVar2.b;
                                double d12 = zajVar2.c;
                                double d13 = zajVar2.d;
                                double d14 = zajVar2.e;
                                double d15 = zajVar2.f;
                                double d16 = zajVar2.g;
                                double d17 = zajVar2.a;
                                if (d5 >= d14) {
                                    return Math.pow((d11 * d5) + d12, d17) + d15;
                                }
                                return (d13 * d5) + d16;
                            case 4:
                                float[] fArr4 = bc4.a;
                                return bc4.b(zajVar2, d5);
                            case 5:
                                float[] fArr5 = bc4.a;
                                return bc4.d(zajVar2, d5);
                            case 6:
                                double d18 = zajVar2.b;
                                double d19 = zajVar2.c;
                                double d20 = zajVar2.d;
                                double d21 = zajVar2.e;
                                double d22 = zajVar2.a;
                                if (d5 >= d21 * d20) {
                                    return (Math.pow(d5, 1.0d / d22) - d19) / d18;
                                }
                                return d5 / d20;
                            default:
                                double d23 = zajVar2.b;
                                double d24 = zajVar2.c;
                                double d25 = zajVar2.d;
                                double d26 = zajVar2.e;
                                double d27 = zajVar2.f;
                                double d28 = zajVar2.g;
                                double d29 = zajVar2.a;
                                if (d5 >= d26 * d25) {
                                    return (Math.pow(d5 - d27, 1.0d / d29) - d24) / d23;
                                }
                                return (d5 - d28) / d25;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                sx6Var = new sx6() { // from class: r7g
                    @Override // defpackage.sx6
                    public final double c(double d5) {
                        int i52 = i7;
                        zaj zajVar2 = zajVar;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = bc4.a;
                                return bc4.a(zajVar2, d5);
                            case 1:
                                float[] fArr3 = bc4.a;
                                return bc4.c(zajVar2, d5);
                            case 2:
                                double d6 = zajVar2.b;
                                double d7 = zajVar2.c;
                                double d8 = zajVar2.d;
                                double d9 = zajVar2.e;
                                double d10 = zajVar2.a;
                                if (d5 >= d9) {
                                    return Math.pow((d6 * d5) + d7, d10);
                                }
                                return d8 * d5;
                            case 3:
                                double d11 = zajVar2.b;
                                double d12 = zajVar2.c;
                                double d13 = zajVar2.d;
                                double d14 = zajVar2.e;
                                double d15 = zajVar2.f;
                                double d16 = zajVar2.g;
                                double d17 = zajVar2.a;
                                if (d5 >= d14) {
                                    return Math.pow((d11 * d5) + d12, d17) + d15;
                                }
                                return (d13 * d5) + d16;
                            case 4:
                                float[] fArr4 = bc4.a;
                                return bc4.b(zajVar2, d5);
                            case 5:
                                float[] fArr5 = bc4.a;
                                return bc4.d(zajVar2, d5);
                            case 6:
                                double d18 = zajVar2.b;
                                double d19 = zajVar2.c;
                                double d20 = zajVar2.d;
                                double d21 = zajVar2.e;
                                double d22 = zajVar2.a;
                                if (d5 >= d21 * d20) {
                                    return (Math.pow(d5, 1.0d / d22) - d19) / d18;
                                }
                                return d5 / d20;
                            default:
                                double d23 = zajVar2.b;
                                double d24 = zajVar2.c;
                                double d25 = zajVar2.d;
                                double d26 = zajVar2.e;
                                double d27 = zajVar2.f;
                                double d28 = zajVar2.g;
                                double d29 = zajVar2.a;
                                if (d5 >= d26 * d25) {
                                    return (Math.pow(d5 - d27, 1.0d / d29) - d24) / d23;
                                }
                                return (d5 - d28) / d25;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            sx6Var2 = new sx6() { // from class: r7g
                @Override // defpackage.sx6
                public final double c(double d5) {
                    int i52 = i2;
                    zaj zajVar2 = zajVar;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = bc4.a;
                            return bc4.a(zajVar2, d5);
                        case 1:
                            float[] fArr3 = bc4.a;
                            return bc4.c(zajVar2, d5);
                        case 2:
                            double d6 = zajVar2.b;
                            double d7 = zajVar2.c;
                            double d8 = zajVar2.d;
                            double d9 = zajVar2.e;
                            double d10 = zajVar2.a;
                            if (d5 >= d9) {
                                return Math.pow((d6 * d5) + d7, d10);
                            }
                            return d8 * d5;
                        case 3:
                            double d11 = zajVar2.b;
                            double d12 = zajVar2.c;
                            double d13 = zajVar2.d;
                            double d14 = zajVar2.e;
                            double d15 = zajVar2.f;
                            double d16 = zajVar2.g;
                            double d17 = zajVar2.a;
                            if (d5 >= d14) {
                                return Math.pow((d11 * d5) + d12, d17) + d15;
                            }
                            return (d13 * d5) + d16;
                        case 4:
                            float[] fArr4 = bc4.a;
                            return bc4.b(zajVar2, d5);
                        case 5:
                            float[] fArr5 = bc4.a;
                            return bc4.d(zajVar2, d5);
                        case 6:
                            double d18 = zajVar2.b;
                            double d19 = zajVar2.c;
                            double d20 = zajVar2.d;
                            double d21 = zajVar2.e;
                            double d22 = zajVar2.a;
                            if (d5 >= d21 * d20) {
                                return (Math.pow(d5, 1.0d / d22) - d19) / d18;
                            }
                            return d5 / d20;
                        default:
                            double d23 = zajVar2.b;
                            double d24 = zajVar2.c;
                            double d25 = zajVar2.d;
                            double d26 = zajVar2.e;
                            double d27 = zajVar2.f;
                            double d28 = zajVar2.g;
                            double d29 = zajVar2.a;
                            if (d5 >= d26 * d25) {
                                return (Math.pow(d5 - d27, 1.0d / d29) - d24) / d23;
                            }
                            return (d5 - d28) / d25;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            sx6Var2 = new sx6() { // from class: r7g
                @Override // defpackage.sx6
                public final double c(double d5) {
                    int i52 = i3;
                    zaj zajVar2 = zajVar;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = bc4.a;
                            return bc4.a(zajVar2, d5);
                        case 1:
                            float[] fArr3 = bc4.a;
                            return bc4.c(zajVar2, d5);
                        case 2:
                            double d6 = zajVar2.b;
                            double d7 = zajVar2.c;
                            double d8 = zajVar2.d;
                            double d9 = zajVar2.e;
                            double d10 = zajVar2.a;
                            if (d5 >= d9) {
                                return Math.pow((d6 * d5) + d7, d10);
                            }
                            return d8 * d5;
                        case 3:
                            double d11 = zajVar2.b;
                            double d12 = zajVar2.c;
                            double d13 = zajVar2.d;
                            double d14 = zajVar2.e;
                            double d15 = zajVar2.f;
                            double d16 = zajVar2.g;
                            double d17 = zajVar2.a;
                            if (d5 >= d14) {
                                return Math.pow((d11 * d5) + d12, d17) + d15;
                            }
                            return (d13 * d5) + d16;
                        case 4:
                            float[] fArr4 = bc4.a;
                            return bc4.b(zajVar2, d5);
                        case 5:
                            float[] fArr5 = bc4.a;
                            return bc4.d(zajVar2, d5);
                        case 6:
                            double d18 = zajVar2.b;
                            double d19 = zajVar2.c;
                            double d20 = zajVar2.d;
                            double d21 = zajVar2.e;
                            double d22 = zajVar2.a;
                            if (d5 >= d21 * d20) {
                                return (Math.pow(d5, 1.0d / d22) - d19) / d18;
                            }
                            return d5 / d20;
                        default:
                            double d23 = zajVar2.b;
                            double d24 = zajVar2.c;
                            double d25 = zajVar2.d;
                            double d26 = zajVar2.e;
                            double d27 = zajVar2.f;
                            double d28 = zajVar2.g;
                            double d29 = zajVar2.a;
                            if (d5 >= d26 * d25) {
                                return (Math.pow(d5 - d27, 1.0d / d29) - d24) / d23;
                            }
                            return (d5 - d28) / d25;
                    }
                }
            };
        } else if (d4 == ConstantsKt.UNSET && d3 == ConstantsKt.UNSET) {
            final int i8 = 2;
            sx6Var2 = new sx6() { // from class: r7g
                @Override // defpackage.sx6
                public final double c(double d5) {
                    int i52 = i8;
                    zaj zajVar2 = zajVar;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = bc4.a;
                            return bc4.a(zajVar2, d5);
                        case 1:
                            float[] fArr3 = bc4.a;
                            return bc4.c(zajVar2, d5);
                        case 2:
                            double d6 = zajVar2.b;
                            double d7 = zajVar2.c;
                            double d8 = zajVar2.d;
                            double d9 = zajVar2.e;
                            double d10 = zajVar2.a;
                            if (d5 >= d9) {
                                return Math.pow((d6 * d5) + d7, d10);
                            }
                            return d8 * d5;
                        case 3:
                            double d11 = zajVar2.b;
                            double d12 = zajVar2.c;
                            double d13 = zajVar2.d;
                            double d14 = zajVar2.e;
                            double d15 = zajVar2.f;
                            double d16 = zajVar2.g;
                            double d17 = zajVar2.a;
                            if (d5 >= d14) {
                                return Math.pow((d11 * d5) + d12, d17) + d15;
                            }
                            return (d13 * d5) + d16;
                        case 4:
                            float[] fArr4 = bc4.a;
                            return bc4.b(zajVar2, d5);
                        case 5:
                            float[] fArr5 = bc4.a;
                            return bc4.d(zajVar2, d5);
                        case 6:
                            double d18 = zajVar2.b;
                            double d19 = zajVar2.c;
                            double d20 = zajVar2.d;
                            double d21 = zajVar2.e;
                            double d22 = zajVar2.a;
                            if (d5 >= d21 * d20) {
                                return (Math.pow(d5, 1.0d / d22) - d19) / d18;
                            }
                            return d5 / d20;
                        default:
                            double d23 = zajVar2.b;
                            double d24 = zajVar2.c;
                            double d25 = zajVar2.d;
                            double d26 = zajVar2.e;
                            double d27 = zajVar2.f;
                            double d28 = zajVar2.g;
                            double d29 = zajVar2.a;
                            if (d5 >= d26 * d25) {
                                return (Math.pow(d5 - d27, 1.0d / d29) - d24) / d23;
                            }
                            return (d5 - d28) / d25;
                    }
                }
            };
        } else {
            final int i9 = 3;
            sx6Var2 = new sx6() { // from class: r7g
                @Override // defpackage.sx6
                public final double c(double d5) {
                    int i52 = i9;
                    zaj zajVar2 = zajVar;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = bc4.a;
                            return bc4.a(zajVar2, d5);
                        case 1:
                            float[] fArr3 = bc4.a;
                            return bc4.c(zajVar2, d5);
                        case 2:
                            double d6 = zajVar2.b;
                            double d7 = zajVar2.c;
                            double d8 = zajVar2.d;
                            double d9 = zajVar2.e;
                            double d10 = zajVar2.a;
                            if (d5 >= d9) {
                                return Math.pow((d6 * d5) + d7, d10);
                            }
                            return d8 * d5;
                        case 3:
                            double d11 = zajVar2.b;
                            double d12 = zajVar2.c;
                            double d13 = zajVar2.d;
                            double d14 = zajVar2.e;
                            double d15 = zajVar2.f;
                            double d16 = zajVar2.g;
                            double d17 = zajVar2.a;
                            if (d5 >= d14) {
                                return Math.pow((d11 * d5) + d12, d17) + d15;
                            }
                            return (d13 * d5) + d16;
                        case 4:
                            float[] fArr4 = bc4.a;
                            return bc4.b(zajVar2, d5);
                        case 5:
                            float[] fArr5 = bc4.a;
                            return bc4.d(zajVar2, d5);
                        case 6:
                            double d18 = zajVar2.b;
                            double d19 = zajVar2.c;
                            double d20 = zajVar2.d;
                            double d21 = zajVar2.e;
                            double d22 = zajVar2.a;
                            if (d5 >= d21 * d20) {
                                return (Math.pow(d5, 1.0d / d22) - d19) / d18;
                            }
                            return d5 / d20;
                        default:
                            double d23 = zajVar2.b;
                            double d24 = zajVar2.c;
                            double d25 = zajVar2.d;
                            double d26 = zajVar2.e;
                            double d27 = zajVar2.f;
                            double d28 = zajVar2.g;
                            double d29 = zajVar2.a;
                            if (d5 >= d26 * d25) {
                                return (Math.pow(d5 - d27, 1.0d / d29) - d24) / d23;
                            }
                            return (d5 - d28) / d25;
                    }
                }
            };
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t7g(String str, float[] fArr, fkk fkkVar, double d, float f, float f2, int i) {
        this(str, fArr, fkkVar, null, d == 1.0d ? r3 : new hwe(d, 1), d != 1.0d ? new hwe(d, 2) : r3, f, f2, new zaj(d, 1.0d, ConstantsKt.UNSET, ConstantsKt.UNSET, ConstantsKt.UNSET), i);
        sx6 sx6Var = r;
    }
}
