package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class na0 {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final xv7 b = new xv7();
    public static final xv7 c = new xv7(xv7.c);
    public static final xv7 d = new xv7(xv7.e);
    public static final DecelerateInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return ix2.a(f2, f, f3, f);
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        if (f5 >= f4) {
            return f2;
        }
        return a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(int i, float f, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }
}
