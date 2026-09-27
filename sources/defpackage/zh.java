package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class zh {
    public static void a(long j, svd svdVar, q8j[] q8jVarArr) {
        int i;
        int i2;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (svdVar.a() > 1) {
                int i3 = 0;
                while (true) {
                    if (svdVar.a() == 0) {
                        i = -1;
                        break;
                    }
                    int t = svdVar.t();
                    i3 += t;
                    if (t != 255) {
                        i = i3;
                        break;
                    }
                }
                int i4 = 0;
                while (true) {
                    if (svdVar.a() == 0) {
                        i4 = -1;
                        break;
                    }
                    int t2 = svdVar.t();
                    i4 += t2;
                    if (t2 != 255) {
                        break;
                    }
                }
                int i5 = svdVar.b + i4;
                if (i4 != -1 && i4 <= svdVar.a()) {
                    if (i == 4 && i4 >= 8) {
                        int t3 = svdVar.t();
                        int z3 = svdVar.z();
                        if (z3 == 49) {
                            i2 = svdVar.g();
                        } else {
                            i2 = 0;
                        }
                        int t4 = svdVar.t();
                        if (z3 == 47) {
                            svdVar.G(1);
                        }
                        if (t3 == 181 && ((z3 == 49 || z3 == 47) && t4 == 3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z3 == 49) {
                            if (i2 != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            b(j, svdVar, q8jVarArr);
                        }
                    }
                } else {
                    q7m.g("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i5 = svdVar.c;
                }
                svdVar.F(i5);
            } else {
                return;
            }
        }
    }

    public static void b(long j, svd svdVar, q8j[] q8jVarArr) {
        boolean z;
        int t = svdVar.t();
        if ((t & 64) != 0) {
            svdVar.G(1);
            int i = (t & 31) * 3;
            int i2 = svdVar.b;
            for (q8j q8jVar : q8jVarArr) {
                svdVar.F(i2);
                q8jVar.b(svdVar, i, 0);
                if (j != -9223372036854775807L) {
                    z = true;
                } else {
                    z = false;
                }
                pfn.f(z);
                q8jVar.a(j, 1, i, 0, null);
            }
        }
    }
}
