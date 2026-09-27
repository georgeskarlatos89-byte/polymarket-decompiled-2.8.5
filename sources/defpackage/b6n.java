package defpackage;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class b6n {
    public static eq9 a;

    public static final boolean a(float f, float f2, zrf zrfVar) {
        float f3 = zrfVar.a;
        if (f <= zrfVar.c && f3 <= f) {
            float f4 = zrfVar.b;
            if (f2 <= zrfVar.d && f4 <= f2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final int b(Bitmap bitmap) {
        int i;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                if (config == Bitmap.Config.ALPHA_8) {
                    i = 1;
                } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                    i = 2;
                } else if (config == Bitmap.Config.RGBA_F16) {
                    i = 8;
                } else {
                    i = 4;
                }
                return height * i;
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap.Config config2 = bitmap.getConfig();
        sb.append(" [");
        sb.append(width);
        sb.append(" x ");
        sb.append(height2);
        sb.append("] + ");
        sb.append(config2);
        throw new IllegalStateException(sb.toString().toString());
    }
}
