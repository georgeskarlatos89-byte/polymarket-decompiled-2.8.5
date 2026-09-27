package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface il6 {
    default int A0(long j) {
        return Math.round(S(j));
    }

    default long J0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float t0 = t0(ky6.b(j));
        float t02 = t0(ky6.a(j));
        return (Float.floatToRawIntBits(t0) << 32) | (Float.floatToRawIntBits(t02) & 4294967295L);
    }

    default int O(float f) {
        float t0 = t0(f);
        if (Float.isInfinite(t0)) {
            return bd0.API_PRIORITY_OTHER;
        }
        return Math.round(t0);
    }

    default float S(long j) {
        if (!dyi.a(cyi.b(j), 4294967296L)) {
            mw9.b("Only Sp can convert to Px");
        }
        return t0(p(j));
    }

    float getDensity();

    default float j0(int i) {
        return i / getDensity();
    }

    default long k(float f) {
        float q0;
        float[] fArr = ii8.a;
        if (q0() >= 1.03f) {
            hi8 a = ii8.a(q0());
            if (a != null) {
                q0 = a.a(f);
            } else {
                q0 = f / q0();
            }
            return f9m.k(q0, 4294967296L);
        }
        return f9m.k(f / q0(), 4294967296L);
    }

    default float k0(float f) {
        return f / getDensity();
    }

    default long l(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        return zxn.a(k0(Float.intBitsToFloat((int) (j >> 32))), k0(Float.intBitsToFloat((int) (j & 4294967295L))));
    }

    default float p(long j) {
        if (!dyi.a(cyi.b(j), 4294967296L)) {
            mw9.b("Only Sp can convert to Px");
        }
        float[] fArr = ii8.a;
        if (q0() >= 1.03f) {
            hi8 a = ii8.a(q0());
            if (a == null) {
                return q0() * cyi.c(j);
            }
            return a.b(cyi.c(j));
        }
        return q0() * cyi.c(j);
    }

    float q0();

    default float t0(float f) {
        return getDensity() * f;
    }

    default long v(int i) {
        return k(j0(i));
    }

    default long x(float f) {
        return k(k0(f));
    }
}
