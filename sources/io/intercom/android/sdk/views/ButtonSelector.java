package io.intercom.android.sdk.views;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.StateListDrawable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class ButtonSelector extends StateListDrawable {
    private final int color;

    public ButtonSelector(Context context, int i, int i2) {
        this.color = i2;
        addState(new int[]{R.attr.state_enabled}, context.getResources().getDrawable(i));
        addState(new int[]{R.attr.state_focused}, context.getResources().getDrawable(i));
        addState(new int[]{R.attr.state_pressed}, context.getResources().getDrawable(i));
    }

    private static int darken(int i, double d) {
        return Color.argb(255, (int) (Color.red(i) * d), (int) (Color.green(i) * d), (int) (Color.blue(i) * d));
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = false;
        for (int i : iArr) {
            if (i == 16842919 || i == 16842908) {
                z = true;
            }
        }
        int i2 = this.color;
        if (z) {
            setColorFilter(darken(i2, 0.9d), PorterDuff.Mode.SRC);
        } else {
            setColorFilter(i2, PorterDuff.Mode.SRC);
        }
        return super.onStateChange(iArr);
    }
}
