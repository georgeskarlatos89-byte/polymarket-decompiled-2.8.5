package defpackage;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class v20 {
    public final Bitmap a;

    public v20(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final int a() {
        Bitmap.Config config = this.a.getConfig();
        config.getClass();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config != Bitmap.Config.ARGB_4444) {
            if (config == Bitmap.Config.RGBA_F16) {
                return 3;
            }
            if (config == Bitmap.Config.HARDWARE) {
                return 4;
            }
            return 0;
        }
        return 0;
    }
}
