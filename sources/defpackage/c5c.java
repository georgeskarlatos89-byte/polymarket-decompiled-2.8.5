package defpackage;

import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class c5c extends w3c {
    public final float g;
    public final float h;
    public final float i;

    public c5c(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a(int i, float f, boolean z) {
        boolean z2;
        float f2;
        float f3;
        float f4;
        float interpolation = this.a.getInterpolation(f);
        View view = this.b;
        boolean z3 = true;
        if ((Gravity.getAbsoluteGravity(i, view.getLayoutDirection()) & 3) == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            z3 = false;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        float f5 = width;
        if (f5 > 0.0f) {
            float f6 = height;
            if (f6 > 0.0f) {
                float f7 = this.g / f5;
                float f8 = this.h / f5;
                float f9 = this.i / f6;
                if (z2) {
                    f5 = 0.0f;
                }
                view.setPivotX(f5);
                if (!z3) {
                    f8 = -f7;
                }
                float a = na0.a(0.0f, f8, interpolation);
                float f10 = a + 1.0f;
                float a2 = 1.0f - na0.a(0.0f, f9, interpolation);
                if (!Float.isNaN(f10) && !Float.isNaN(a2)) {
                    view.setScaleX(f10);
                    view.setScaleY(a2);
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                            View childAt = viewGroup.getChildAt(i2);
                            if (z2) {
                                f2 = childAt.getWidth() + (width - childAt.getRight());
                            } else {
                                f2 = -childAt.getLeft();
                            }
                            childAt.setPivotX(f2);
                            childAt.setPivotY(-childAt.getTop());
                            if (z3) {
                                f3 = 1.0f - a;
                            } else {
                                f3 = 1.0f;
                            }
                            if (a2 != 0.0f) {
                                f4 = (f10 / a2) * f3;
                            } else {
                                f4 = 1.0f;
                            }
                            if (!Float.isNaN(f3) && !Float.isNaN(f4)) {
                                childAt.setScaleX(f3);
                                childAt.setScaleY(f4);
                            }
                        }
                    }
                }
            }
        }
    }
}
