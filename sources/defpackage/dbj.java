package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class dbj {
    public static final float a(long j) {
        if (Float.intBitsToFloat((int) (j >> 32)) == 0.0f && Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    public static final long b(gse gseVar, boolean z) {
        long j;
        List list = gseVar.a;
        int size = list.size();
        long j2 = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            nse nseVar = (nse) list.get(i2);
            if (nseVar.d && nseVar.h) {
                if (z) {
                    j = nseVar.c;
                } else {
                    j = nseVar.g;
                }
                j2 = ogd.f(j2, j);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return ogd.b(i, j2);
    }

    public static final float c(gse gseVar, boolean z) {
        long j;
        long b = b(gseVar, z);
        float f = 0.0f;
        if (ogd.c(b, 9205357640488583168L)) {
            return 0.0f;
        }
        List list = gseVar.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            nse nseVar = (nse) list.get(i2);
            if (nseVar.d && nseVar.h) {
                if (z) {
                    j = nseVar.c;
                } else {
                    j = nseVar.g;
                }
                i++;
                f = ogd.d(ogd.e(j, b)) + f;
            }
        }
        return f / i;
    }
}
