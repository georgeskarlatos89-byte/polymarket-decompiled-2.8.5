package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.util.logging.Level;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class wen {
    public static ColorStateList a(Context context, bm9 bm9Var, int i) {
        int resourceId;
        ColorStateList e;
        TypedArray typedArray = (TypedArray) bm9Var.c;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (e = d55.e(context, resourceId)) != null) {
            return e;
        }
        return bm9Var.o(i);
    }

    public static ColorStateList b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList e;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (e = d55.e(context, resourceId)) != null) {
            return e;
        }
        return typedArray.getColorStateList(i);
    }

    public static int c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i, i2);
    }

    public static Drawable d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable b;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (b = qen.b(context, resourceId)) != null) {
            return b;
        }
        return typedArray.getDrawable(i);
    }

    public static boolean e(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static final i3 f(Object[] objArr) {
        objArr.getClass();
        return new i3(objArr);
    }

    public static String g(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String concat = "".concat(str);
        return concat.substring(0, Math.min(concat.length(), 23));
    }

    public static int h(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= Level.INFO.intValue()) {
            return 4;
        }
        if (intValue >= Level.FINE.intValue()) {
            return 3;
        }
        return 2;
    }
}
