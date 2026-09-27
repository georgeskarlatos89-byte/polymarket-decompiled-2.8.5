package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class o88 implements c88 {
    public final float a;
    public final pjh b;

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, pjh] */
    public o88(float f, float f2, float f3) {
        this.a = f3;
        ?? obj = new Object();
        obj.a = 1.0f;
        obj.b = Math.sqrt(50.0d);
        obj.c = 1.0f;
        if (f < 0.0f) {
            h1f.a("Damping ratio must be non-negative");
        }
        obj.c = f;
        double d = obj.b;
        if (((float) (d * d)) <= 0.0f) {
            h1f.a("Spring stiffness constant must be positive.");
        }
        obj.b = Math.sqrt(f2);
        this.b = obj;
    }

    @Override // defpackage.c88
    public final float b(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.c88
    public final float c(float f, float f2, long j, float f3) {
        pjh pjhVar = this.b;
        pjhVar.a = f2;
        return Float.intBitsToFloat((int) (pjhVar.a(f, f3, j / 1000000) & 4294967295L));
    }

    @Override // defpackage.c88
    public final float d(float f, float f2, long j, float f3) {
        pjh pjhVar = this.b;
        pjhVar.a = f2;
        return Float.intBitsToFloat((int) (pjhVar.a(f, f3, j / 1000000) >> 32));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    @Override // defpackage.c88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e(float f, float f2, float f3) {
        double sqrt;
        double d;
        double d2;
        double d3;
        long j;
        double d4;
        double d5;
        pjh pjhVar = this.b;
        double d6 = pjhVar.b;
        float f4 = (float) (d6 * d6);
        float f5 = pjhVar.c;
        float f6 = this.a;
        float f7 = (f - f2) / f6;
        float f8 = f3 / f6;
        if (f5 == 0.0f) {
            j = 9223372036854L;
        } else {
            double d7 = f4;
            double d8 = f5;
            double d9 = f8;
            double d10 = f7;
            double sqrt2 = Math.sqrt(d7) * d8 * 2.0d;
            double d11 = (sqrt2 * sqrt2) - (d7 * 4.0d);
            if (d11 < ConstantsKt.UNSET) {
                sqrt = 0.0d;
            } else {
                sqrt = Math.sqrt(d11);
            }
            if (d11 < ConstantsKt.UNSET) {
                d = Math.sqrt(Math.abs(d11));
            } else {
                d = 0.0d;
            }
            double d12 = -sqrt2;
            double d13 = (d12 + sqrt) * 0.5d;
            double d14 = d * 0.5d;
            double d15 = (d12 - sqrt) * 0.5d;
            if (d10 == ConstantsKt.UNSET && d9 == ConstantsKt.UNSET) {
                j = 0;
            } else {
                if (d10 < ConstantsKt.UNSET) {
                    d9 = -d9;
                }
                double abs = Math.abs(d10);
                double d16 = 1.0d;
                double d17 = -1.0d;
                double d18 = Double.MAX_VALUE;
                if (d8 > 1.0d) {
                    double d19 = (d13 * abs) - d9;
                    double d20 = d13 - d15;
                    double d21 = d19 / d20;
                    double d22 = abs - d21;
                    d2 = Math.log(Math.abs(1.0d / d22)) / d13;
                    double log = Math.log(Math.abs(1.0d / d21)) / d15;
                    if ((Double.doubleToRawLongBits(d2) & Long.MAX_VALUE) < 9218868437227405312L) {
                        if ((Double.doubleToRawLongBits(log) & Long.MAX_VALUE) < 9218868437227405312L) {
                            d2 = Math.max(d2, log);
                        }
                    } else {
                        d2 = log;
                    }
                    double d23 = d22 * d13;
                    double log2 = Math.log(d23 / ((-d21) * d15)) / (d15 - d13);
                    if (!Double.isNaN(log2) && log2 > ConstantsKt.UNSET) {
                        if (log2 > ConstantsKt.UNSET) {
                            if ((-((Math.exp(log2 * d15) * d21) + (Math.exp(d13 * log2) * d22))) < 1.0d) {
                                if (d21 > ConstantsKt.UNSET && d22 < ConstantsKt.UNSET) {
                                    d5 = 0.0d;
                                } else {
                                    d5 = d2;
                                }
                                d2 = d5;
                            }
                        }
                        d2 = Math.log((-((d21 * d15) * d15)) / (d23 * d13)) / d20;
                        d4 = d21 * d15;
                        if (Math.abs((Math.exp(d15 * d2) * d4) + (Math.exp(d13 * d2) * d23)) >= 1.0E-4d) {
                            int i = 0;
                            while (d18 > 0.001d && i < 100) {
                                i++;
                                double d24 = d13 * d2;
                                double d25 = d15 * d2;
                                double exp = d2 - ((((Math.exp(d25) * d21) + (Math.exp(d24) * d22)) + d16) / ((Math.exp(d25) * d4) + (Math.exp(d24) * d23)));
                                d18 = Math.abs(d2 - exp);
                                d2 = exp;
                            }
                        }
                    }
                    d16 = -1.0d;
                    d4 = d21 * d15;
                    if (Math.abs((Math.exp(d15 * d2) * d4) + (Math.exp(d13 * d2) * d23)) >= 1.0E-4d) {
                    }
                } else if (d8 < 1.0d) {
                    double d26 = (d9 - (d13 * abs)) / d14;
                    d2 = Math.log(1.0d / Math.sqrt((d26 * d26) + (abs * abs))) / d13;
                } else {
                    double d27 = d13 * abs;
                    double d28 = d9 - d27;
                    double log3 = Math.log(Math.abs(1.0d / abs)) / d13;
                    double log4 = Math.log(Math.abs(1.0d / d28));
                    double d29 = log4;
                    for (int i2 = 0; i2 < 6; i2++) {
                        d29 = log4 - Math.log(Math.abs(d29 / d13));
                    }
                    double d30 = d29 / d13;
                    if ((Double.doubleToRawLongBits(log3) & Long.MAX_VALUE) < 9218868437227405312L) {
                        if ((Double.doubleToRawLongBits(d30) & Long.MAX_VALUE) < 9218868437227405312L) {
                            log3 = Math.max(log3, d30);
                        }
                    } else {
                        log3 = d30;
                    }
                    double d31 = (-(d27 + d28)) / (d13 * d28);
                    double d32 = d13 * d31;
                    double exp2 = (Math.exp(d32) * d28 * d31) + (Math.exp(d32) * abs);
                    if (!Double.isNaN(d31) && d31 > ConstantsKt.UNSET) {
                        if (d31 > ConstantsKt.UNSET && (-exp2) < 1.0d) {
                            if (d28 < ConstantsKt.UNSET && abs > ConstantsKt.UNSET) {
                                d3 = 0.0d;
                            } else {
                                d3 = log3;
                            }
                            log3 = d3;
                        } else {
                            log3 = (-(2.0d / d13)) - (abs / d28);
                            d17 = 1.0d;
                        }
                    }
                    d2 = log3;
                    int i3 = 0;
                    while (d18 > 0.001d && i3 < 100) {
                        i3++;
                        double d33 = d13 * d2;
                        double exp3 = d2 - (((Math.exp(d33) * ((d28 * d2) + abs)) + d17) / (Math.exp(d33) * (((d33 + 1.0d) * d28) + d27)));
                        d18 = Math.abs(d2 - exp3);
                        d2 = exp3;
                    }
                }
                j = (long) (d2 * 1000.0d);
            }
        }
        return j * 1000000;
    }
}
