package io.intercom.android.sdk.utilities;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class BackgroundUtils {
    public static void setBackground(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void setButtonColor(TextView textView, int i) {
        int buttonTextColorVariant = ColorUtils.buttonTextColorVariant(i);
        int buttonBackgroundColorVariant = ColorUtils.buttonBackgroundColorVariant(i);
        textView.setTextColor(buttonTextColorVariant);
        textView.getBackground().setColorFilter(buttonBackgroundColorVariant, PorterDuff.Mode.SRC_ATOP);
    }
}
