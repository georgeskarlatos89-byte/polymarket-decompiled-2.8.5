package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class dbg {
    public static final w5c a(cbg cbgVar, int i, int i2, int i3, int i4, int i5, x5c x5cVar, List list, cne[] cneVarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        float f;
        boolean z;
        int i11;
        long j;
        int i12;
        int i13;
        int i14;
        List list2 = list;
        long j2 = i5;
        int i15 = i7 - i6;
        int[] iArr2 = new int[i15];
        int i16 = i6;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        float f2 = 0.0f;
        while (i16 < i7) {
            o5c o5cVar = (o5c) list2.get(i16);
            float b = bbg.b(bbg.a(o5cVar));
            if (b > 0.0f) {
                f2 += b;
                i18++;
                j = j2;
                i12 = i16;
            } else {
                int i21 = i3 - i19;
                cne cneVar = cneVarArr[i16];
                j = j2;
                if (cneVar == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i12 = i16;
                        i13 = i18;
                        i14 = bd0.API_PRIORITY_OTHER;
                    } else {
                        i12 = i16;
                        i13 = i18;
                        if (i21 < 0) {
                            i14 = 0;
                        } else {
                            i14 = i21;
                        }
                    }
                    cneVar = o5cVar.T(cbgVar.i(0, i14, i4, false));
                } else {
                    i12 = i16;
                    i13 = i18;
                }
                cne cneVar2 = cneVar;
                int h = cbgVar.h(cneVar2);
                int g = cbgVar.g(cneVar2);
                iArr2[i12 - i6] = h;
                int i22 = i21 - h;
                if (i22 < 0) {
                    i22 = 0;
                }
                i20 = Math.min(i5, i22);
                i19 += h + i20;
                i17 = Math.max(i17, g);
                cneVarArr[i12] = cneVar2;
                i18 = i13;
            }
            i16 = i12 + 1;
            j2 = j;
        }
        long j3 = j2;
        if (i18 == 0) {
            i19 -= i20;
            i10 = 0;
        } else {
            if (i3 != Integer.MAX_VALUE) {
                i9 = i3;
            } else {
                i9 = i;
            }
            long j4 = (r22 - 1) * j3;
            long j5 = (i9 - i19) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f3 = ((float) j5) / f2;
            for (int i23 = i6; i23 < i7; i23++) {
                j5 -= Math.round(bbg.b(bbg.a((o5c) list2.get(i23))) * f3);
            }
            int i24 = i6;
            int i25 = i17;
            int i26 = 0;
            while (i24 < i7) {
                if (cneVarArr[i24] == null) {
                    o5c o5cVar2 = (o5c) list2.get(i24);
                    f = f3;
                    ebg a = bbg.a(o5cVar2);
                    float b2 = bbg.b(a);
                    if (b2 <= 0.0f) {
                        iw9.b("All weights <= 0 should have placeables");
                    }
                    int signum = Long.signum(j5);
                    long j6 = j5 - signum;
                    int max = Math.max(0, Math.round(b2 * f) + signum);
                    if (a != null) {
                        z = a.b;
                    } else {
                        z = true;
                    }
                    if (z && max != Integer.MAX_VALUE) {
                        i11 = max;
                    } else {
                        i11 = 0;
                    }
                    cne T = o5cVar2.T(cbgVar.i(i11, max, i4, true));
                    int h2 = cbgVar.h(T);
                    int g2 = cbgVar.g(T);
                    iArr2[i24 - i6] = h2;
                    i26 += h2;
                    int max2 = Math.max(i25, g2);
                    cneVarArr[i24] = T;
                    i25 = max2;
                    j5 = j6;
                } else {
                    f = f3;
                }
                i24++;
                list2 = list;
                f3 = f;
            }
            i10 = (int) (i26 + j4);
            int i27 = i3 - i19;
            if (i10 < 0) {
                i10 = 0;
            }
            if (i10 > i27) {
                i10 = i27;
            }
            i17 = i25;
        }
        int i28 = i10 + i19;
        if (i28 < 0) {
            i28 = 0;
        }
        int max3 = Math.max(i28, i);
        int max4 = Math.max(i17, Math.max(i2, 0));
        int[] iArr3 = new int[i15];
        cbgVar.f(max3, iArr2, iArr3, x5cVar);
        return cbgVar.j(cneVarArr, x5cVar, iArr3, max3, max4, iArr, i8, i6, i7);
    }
}
