package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class rhn {
    public static float a(int i, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        fi9.h("Motion easing control point value must be between 0 and 1; instead got: ", parseFloat);
        return 0.0f;
    }

    public static boolean b(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    public static TimeInterpolator c(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!b(valueOf, "cubic-bezier") && !b(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (b(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return new PathInterpolator(a(0, split), a(1, split), a(2, split), a(3, split));
                }
                dmk.g(split.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                return null;
            }
            if (b(valueOf, "path")) {
                String k = woa.k(1, 5, valueOf);
                Path path = new Path();
                try {
                    amn.d(amn.c(k), path);
                    return new PathInterpolator(path);
                } catch (RuntimeException e) {
                    omf.m("Error in parsing ".concat(k), e);
                    return null;
                }
            }
            dmk.v("Invalid motion easing type: ".concat(valueOf));
            return null;
        }
        dmk.v("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        return null;
    }

    public static ojh d(Context context) {
        TypedArray obtainStyledAttributes;
        TypedValue a = uen.a(context.getTheme(), R.attr.motionSpringFastSpatial);
        int[] iArr = jlf.C;
        if (a == null) {
            obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, 0, R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(a.resourceId, iArr);
        }
        ojh ojhVar = new ojh();
        try {
            float f = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f != Float.MIN_VALUE) {
                float f2 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
                if (f2 != Float.MIN_VALUE) {
                    ojhVar.b(f);
                    ojhVar.a(f2);
                    return ojhVar;
                }
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
