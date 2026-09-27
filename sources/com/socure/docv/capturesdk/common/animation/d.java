package com.socure.docv.capturesdk.common.animation;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class d {
    public final Resources a;
    public ValueAnimator b;
    public ColorStateList c;
    public MaterialButton d;

    public d(Resources resources) {
        resources.getClass();
        this.a = resources;
    }

    public static void a(MaterialButton materialButton, float f, int i, int i2, float f2) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{i, i2});
        gradientDrawable.setGradientType(0);
        gradientDrawable.setColors(new int[]{i, i, i2, i2}, new float[]{0.0f, f, f, 1.0f});
        gradientDrawable.setCornerRadius(f2);
        materialButton.setBackground(gradientDrawable);
    }

    public final void b() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.b = null;
        MaterialButton materialButton = this.d;
        if (materialButton != null) {
            materialButton.setBackgroundTintList(this.c);
        }
        this.c = null;
        this.d = null;
    }
}
