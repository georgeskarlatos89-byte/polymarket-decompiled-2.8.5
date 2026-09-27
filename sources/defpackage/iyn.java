package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class iyn {
    public static final boolean a(Bundle bundle, String str) {
        str.getClass();
        return bundle.containsKey(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r2 == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap b(Drawable drawable, Bitmap.Config config, c9h c9hVar, qhg qhgVar, c9h c9hVar2, boolean z) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        qhg qhgVar2 = qhgVar;
        c9h c9hVar3 = c9hVar2;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config config4 = bitmap.getConfig();
            if (config != null && !hhn.b(config)) {
                config3 = config;
            } else {
                config3 = Bitmap.Config.ARGB_8888;
            }
            if (config4 == config3) {
                if (!z) {
                    long a = kun.a(bitmap.getWidth(), bitmap.getHeight(), c9hVar, qhgVar2, c9hVar3);
                    double b = kun.b(bitmap.getWidth(), bitmap.getHeight(), (int) (a >> 32), (int) (a & 4294967295L), qhgVar2, c9hVar2);
                    qhgVar2 = qhgVar2;
                    c9hVar3 = c9hVar2;
                }
                return bitmap;
            }
        }
        Drawable mutate = drawable.mutate();
        int b2 = i2k.b(mutate);
        int i = Barcode.FORMAT_UPC_A;
        if (b2 <= 0) {
            b2 = 512;
        }
        int a2 = i2k.a(mutate);
        if (a2 > 0) {
            i = a2;
        }
        long a3 = kun.a(b2, i, c9hVar, qhgVar2, c9hVar3);
        int i2 = i;
        double b3 = kun.b(b2, i2, (int) (a3 >> 32), (int) (a3 & 4294967295L), qhgVar2, c9hVar3);
        int d = i5c.d(b2 * b3);
        int d2 = i5c.d(b3 * i2);
        if (config != null && !hhn.b(config)) {
            config2 = config;
        } else {
            config2 = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(d, d2, config2);
        Rect bounds = mutate.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        mutate.setBounds(0, 0, d, d2);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }

    public static final boolean c(Bundle bundle, String str) {
        str.getClass();
        boolean z = bundle.getBoolean(str, false);
        if (!z && bundle.getBoolean(str, true)) {
            jyn.b(str);
            throw null;
        }
        return z;
    }

    public static final double d(Bundle bundle, String str) {
        str.getClass();
        double d = bundle.getDouble(str, Double.MIN_VALUE);
        if (d == Double.MIN_VALUE && bundle.getDouble(str, Double.MAX_VALUE) == Double.MAX_VALUE) {
            jyn.b(str);
            throw null;
        }
        return d;
    }

    public static final float e(Bundle bundle, String str) {
        str.getClass();
        float f = bundle.getFloat(str, Float.MIN_VALUE);
        if (f == Float.MIN_VALUE && bundle.getFloat(str, Float.MAX_VALUE) == Float.MAX_VALUE) {
            jyn.b(str);
            throw null;
        }
        return f;
    }

    public static final int f(Bundle bundle, String str) {
        str.getClass();
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i == Integer.MIN_VALUE && bundle.getInt(str, bd0.API_PRIORITY_OTHER) == Integer.MAX_VALUE) {
            jyn.b(str);
            throw null;
        }
        return i;
    }

    public static final int[] g(Bundle bundle, String str) {
        str.getClass();
        int[] intArray = bundle.getIntArray(str);
        if (intArray != null) {
            return intArray;
        }
        jyn.b(str);
        throw null;
    }

    public static final long h(Bundle bundle, String str) {
        str.getClass();
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j == Long.MIN_VALUE && bundle.getLong(str, Long.MAX_VALUE) == Long.MAX_VALUE) {
            jyn.b(str);
            throw null;
        }
        return j;
    }

    public static final Bundle i(Bundle bundle, String str) {
        str.getClass();
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        jyn.b(str);
        throw null;
    }

    public static final String j(Bundle bundle, String str) {
        str.getClass();
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        jyn.b(str);
        throw null;
    }

    public static final String[] k(Bundle bundle, String str) {
        str.getClass();
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        jyn.b(str);
        throw null;
    }

    public static final ArrayList l(Bundle bundle, String str) {
        str.getClass();
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        jyn.b(str);
        throw null;
    }

    public static final boolean m(Bundle bundle, String str) {
        str.getClass();
        if (a(bundle, str) && bundle.get(str) == null) {
            return true;
        }
        return false;
    }
}
