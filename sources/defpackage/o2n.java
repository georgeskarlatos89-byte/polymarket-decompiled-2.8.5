package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class o2n {
    public static final int[] a = {R.attr.colorPrimary};
    public static final int[] b = {R.attr.colorPrimaryVariant};

    public static void a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jlf.Q, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, b, "Theme.MaterialComponents");
            }
        }
        c(context, a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jlf.Q, i, i2);
        boolean z = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i3, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z = true;
            obtainStyledAttributes.recycle();
            if (z) {
                return;
            }
            dmk.v("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                dmk.v(sv6.n("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static TypedArray d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        a(context, attributeSet, i, i2);
        b(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }
}
