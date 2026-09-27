package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class oag extends Drawable {
    public static final double a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f, float f2, boolean z) {
        if (z) {
            return (float) (((1.0d - a) * f2) + f);
        }
        return f;
    }

    public static float b(float f, float f2, boolean z) {
        if (z) {
            return (float) (((1.0d - a) * f2) + (f * 1.5f));
        }
        return f * 1.5f;
    }
}
