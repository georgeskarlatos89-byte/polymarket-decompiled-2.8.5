package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.Reader;
import java.io.StringWriter;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class p8m {
    public static final fi9 a = new fi9(26);
    public static final float b = 30.0f;

    public static final Drawable a(km9 km9Var, Resources resources) {
        if (km9Var instanceof f17) {
            return ((f17) km9Var).a;
        }
        if (km9Var instanceof ef1) {
            return new BitmapDrawable(resources, ((ef1) km9Var).a);
        }
        return new j8(km9Var, 1);
    }

    public static final km9 b(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return new ef1(((BitmapDrawable) drawable).getBitmap());
        }
        return new f17(drawable);
    }

    public static final String c(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }

    public static Bitmap d(km9 km9Var) {
        Bitmap.Config config;
        int width = km9Var.getWidth();
        int height = km9Var.getHeight();
        boolean z = km9Var instanceof ef1;
        if (z) {
            config = ((ef1) km9Var).a.getConfig();
        } else {
            config = null;
        }
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (z) {
            Bitmap bitmap = ((ef1) km9Var).a;
            if (bitmap.getWidth() == width && bitmap.getHeight() == height && bitmap.getConfig() == config) {
                return bitmap;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        km9Var.b(new Canvas(createBitmap));
        return createBitmap;
    }
}
