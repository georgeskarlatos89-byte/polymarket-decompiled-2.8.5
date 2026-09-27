package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class jyn {
    public static ColorStateList a(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (drawable instanceof ColorStateListDrawable) {
            return ((ColorStateListDrawable) drawable).getColorStateList();
        }
        return null;
    }

    public static final void b(String str) {
        str.getClass();
        throw new IllegalArgumentException(sv6.n("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }
}
