package defpackage;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class brf implements m1d {
    public final arf a;

    public brf(arf arfVar) {
        arfVar.getClass();
        this.a = arfVar;
    }

    @Override // defpackage.m1d
    public final long M(int i, long j, long j2) {
        if (i == 1) {
            int i2 = (int) (j2 & 4294967295L);
            float intBitsToFloat = Float.intBitsToFloat(i2);
            arf arfVar = this.a;
            if (intBitsToFloat > 0.0f || (arfVar.d && Float.intBitsToFloat(i2) != 0.0f)) {
                arfVar.d(Float.intBitsToFloat(i2));
                return (Float.floatToRawIntBits(r5) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.m1d
    public final long y(int i, long j) {
        if (i == 1) {
            arf arfVar = this.a;
            if (arfVar.d) {
                int i2 = (int) (j & 4294967295L);
                if (Float.intBitsToFloat(i2) < 0.0f) {
                    arfVar.d(Float.intBitsToFloat(i2));
                    return (Float.floatToRawIntBits(r4) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.m1d
    public final Object z0(long j, Continuation continuation) {
        arf arfVar = this.a;
        if (arfVar.d) {
            arfVar.e(j5k.c(j));
        } else {
            j = 0;
        }
        return new j5k(j);
    }
}
