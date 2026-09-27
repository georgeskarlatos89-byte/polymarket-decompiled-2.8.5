package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class i2k {
    public static final Bitmap.Config[] a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};
    public static final Bitmap.Config b = Bitmap.Config.HARDWARE;

    public static final int a(Drawable drawable) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            bitmapDrawable = null;
        }
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            return bitmap.getHeight();
        }
        return drawable.getIntrinsicHeight();
    }

    public static final int b(Drawable drawable) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            bitmapDrawable = null;
        }
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            return bitmap.getWidth();
        }
        return drawable.getIntrinsicWidth();
    }
}
