package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zfn {
    public static Boolean a;

    public static RippleDrawable a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.payButtonGenericBackground});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        GradientDrawable gradientDrawable = (GradientDrawable) drawable.mutate();
        gradientDrawable.setCornerRadius(i);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.payButtonGenericRippleColor});
        int color = obtainStyledAttributes2.getColor(0, 0);
        obtainStyledAttributes2.recycle();
        return new RippleDrawable(ColorStateList.valueOf(color), gradientDrawable, null);
    }
}
