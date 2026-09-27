package defpackage;

import android.widget.EdgeEffect;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class ryn {
    public static float a(EdgeEffect edgeEffect, float f, float f2, il6 il6Var) {
        float f3;
        float f4 = c67.a;
        double density = il6Var.getDensity() * 386.0878f * 160.0f * 0.84f;
        double d = c67.a * density;
        float exp = (float) (Math.exp((c67.b / c67.c) * Math.log((Math.abs(f) * 0.35f) / d)) * d);
        try {
            f3 = edgeEffect.getDistance();
        } catch (Throwable unused) {
            f3 = 0.0f;
        }
        if (exp > f3 * f2) {
            return 0.0f;
        }
        edgeEffect.onAbsorb(i5c.e(f));
        return f;
    }

    public static final long b(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
