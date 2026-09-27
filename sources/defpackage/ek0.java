package defpackage;

import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ek0 implements TypeEvaluator {
    public static Integer a(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float f3 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float a = ix2.a(f3, f2, f, f2);
        float a2 = ix2.a(pow4, pow, f, pow);
        float a3 = ix2.a(pow5, pow2, f, pow2);
        float a4 = ix2.a(pow6, pow3, f, pow3);
        float pow7 = ((float) Math.pow(a2, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(a3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(a4, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(a * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
