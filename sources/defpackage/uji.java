package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class uji extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public ValueAnimator a;
    public final /* synthetic */ TabLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uji(TabLayout tabLayout, Context context) {
        super(context);
        this.b = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i) {
        TabLayout tabLayout = this.b;
        if (tabLayout.V != 0 && (tabLayout.getTabSelectedIndicator().getBounds().left != -1 || tabLayout.getTabSelectedIndicator().getBounds().right != -1)) {
            return;
        }
        View childAt = getChildAt(i);
        z65 z65Var = tabLayout.I;
        Drawable drawable = tabLayout.o;
        z65Var.getClass();
        RectF p = z65.p(tabLayout, childAt);
        drawable.setBounds((int) p.left, drawable.getBounds().top, (int) p.right, drawable.getBounds().bottom);
        tabLayout.a = i;
    }

    public final void b(int i) {
        TabLayout tabLayout = this.b;
        Rect bounds = tabLayout.o.getBounds();
        tabLayout.o.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(View view, View view2, float f) {
        TabLayout tabLayout = this.b;
        if (view != null && view.getWidth() > 0) {
            tabLayout.I.w(tabLayout, view, view2, f, tabLayout.o);
        } else {
            Drawable drawable = tabLayout.o;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.o.getBounds().bottom);
        }
        postInvalidateOnAnimation();
    }

    public final void d(int i, int i2, boolean z) {
        TabLayout tabLayout = this.b;
        if (tabLayout.a == i) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.a = i;
        tji tjiVar = new tji(this, childAt, childAt2);
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.a = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.J);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(tjiVar);
            valueAnimator.start();
            return;
        }
        this.a.removeAllUpdateListeners();
        this.a.addUpdateListener(tjiVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.b;
        int height2 = tabLayout.o.getBounds().height();
        if (height2 < 0) {
            height2 = tabLayout.o.getIntrinsicHeight();
        }
        int i = tabLayout.B;
        if (i != 0) {
            if (i != 1) {
                height = 0;
                if (i != 2) {
                    if (i != 3) {
                        height2 = 0;
                    } else {
                        height2 = getHeight();
                    }
                }
            } else {
                height = (getHeight() - height2) / 2;
                height2 = (getHeight() + height2) / 2;
            }
        } else {
            height = getHeight() - height2;
            height2 = getHeight();
        }
        if (tabLayout.o.getBounds().width() > 0) {
            Rect bounds = tabLayout.o.getBounds();
            tabLayout.o.setBounds(bounds.left, height, bounds.right, height2);
            tabLayout.o.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.a;
        TabLayout tabLayout = this.b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        int i5 = tabLayout.a;
        if (i5 == -1) {
            i5 = tabLayout.getSelectedTabPosition();
            tabLayout.a = i5;
        }
        a(i5);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            TabLayout tabLayout = this.b;
            boolean z = true;
            if (tabLayout.z == 1 || tabLayout.C == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 > 0) {
                    if (i3 * childCount <= getMeasuredWidth() - (((int) m5n.b(getContext(), 16)) * 2)) {
                        boolean z2 = false;
                        for (int i5 = 0; i5 < childCount; i5++) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                            if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                layoutParams.width = i3;
                                layoutParams.weight = 0.0f;
                                z2 = true;
                            }
                        }
                        z = z2;
                    } else {
                        tabLayout.z = 0;
                        tabLayout.n(false);
                    }
                    if (z) {
                        super.onMeasure(i, i2);
                    }
                }
            }
        }
    }
}
