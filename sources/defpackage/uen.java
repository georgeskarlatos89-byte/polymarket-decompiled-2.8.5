package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class uen {
    public static TypedValue a(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Resources.Theme theme, int i, boolean z) {
        TypedValue a = a(theme, i);
        if (a != null && a.type == 18) {
            if (a.data != 0) {
                return true;
            }
            return false;
        }
        return z;
    }

    public static int c(Context context, int i, int i2) {
        TypedValue a = a(context.getTheme(), i);
        if (a != null && a.type == 16) {
            return a.data;
        }
        return i2;
    }

    public static TypedValue d(View view, int i) {
        return e(view.getClass().getCanonicalName(), i, view.getContext());
    }

    public static TypedValue e(String str, int i, Context context) {
        TypedValue a = a(context.getTheme(), i);
        if (a != null) {
            return a;
        }
        ahh.m("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)});
        return null;
    }

    public static int f(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
    }
}
