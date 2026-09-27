package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class b4c extends w3c {
    public final float g;
    public final float h;

    public b4c(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new xv7());
        return animatorSet;
    }

    public final void b(float f) {
        float f2;
        float interpolation = this.a.getInterpolation(f);
        View view = this.b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f3 = this.g / width;
            float f4 = this.h / height;
            float a = 1.0f - na0.a(0.0f, f3, interpolation);
            float a2 = 1.0f - na0.a(0.0f, f4, interpolation);
            if (!Float.isNaN(a) && !Float.isNaN(a2)) {
                view.setScaleX(a);
                view.setPivotY(height);
                view.setScaleY(a2);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        View childAt = viewGroup.getChildAt(i);
                        childAt.setPivotY(-childAt.getTop());
                        if (a2 != 0.0f) {
                            f2 = a / a2;
                        } else {
                            f2 = 1.0f;
                        }
                        childAt.setScaleY(f2);
                    }
                }
            }
        }
    }
}
