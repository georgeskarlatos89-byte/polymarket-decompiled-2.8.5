package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class oa1 extends FrameLayout {
    public static final na1 l = new na1(0);
    public pa1 a;
    public final b1h b;
    public int c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public ColorStateList h;
    public PorterDuff.Mode i;
    public Rect j;
    public boolean k;

    /* JADX WARN: Multi-variable type inference failed */
    public oa1(Context context, AttributeSet attributeSet) {
        super(u8m.e(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, jlf.L);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.c = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.b = b1h.h(context2, attributeSet, 0, 0).a();
        }
        this.d = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(wen.b(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(m5n.c(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.e = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.g = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        getPaddingEnd();
        setOnTouchListener(l);
        setFocusable(true);
        if (getBackground() == null) {
            int o = ven.o(ven.q(getContext(), uen.d(this, R.attr.colorSurface)), getBackgroundOverlayColorAlpha(), ven.q(getContext(), uen.d(this, R.attr.colorOnSurface)));
            b1h b1hVar = this.b;
            if (b1hVar != null) {
                xv7 xv7Var = pa1.v;
                a5c a5cVar = new a5c(b1hVar);
                a5cVar.s(ColorStateList.valueOf(o));
                gradientDrawable = a5cVar;
            } else {
                Resources resources = getResources();
                xv7 xv7Var2 = pa1.v;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(o);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.h;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    public static /* synthetic */ void a(oa1 oa1Var, pa1 pa1Var) {
        oa1Var.setBaseTransientBottomBar(pa1Var);
    }

    private void setBaseTransientBottomBar(pa1 pa1Var) {
        this.a = pa1Var;
    }

    public float getActionTextColorAlpha() {
        return this.e;
    }

    public int getAnimationMode() {
        return this.c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.d;
    }

    public int getMaxInlineActionWidth() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        pa1 pa1Var = this.a;
        if (pa1Var != null && (rootWindowInsets = pa1Var.i.getRootWindowInsets()) != null) {
            pa1Var.q = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            pa1Var.f();
        }
        requestApplyInsets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r0 != false) goto L15;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDetachedFromWindow() {
        boolean z;
        boolean z2;
        super.onDetachedFromWindow();
        pa1 pa1Var = this.a;
        if (pa1Var != null) {
            a7h g = a7h.g();
            la1 la1Var = pa1Var.u;
            synchronized (g.a) {
                if (!g.m(la1Var)) {
                    rbh rbhVar = (rbh) g.d;
                    z = false;
                    if (rbhVar != null && rbhVar.a.get() == la1Var) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                z = true;
            }
            if (z) {
                pa1.y.post(new ja1(pa1Var, 1));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        pa1 pa1Var = this.a;
        if (pa1Var != null && pa1Var.s) {
            pa1Var.e();
            pa1Var.s = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f;
        if (i3 > 0 && getMeasuredWidth() > i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
    }

    public void setAnimationMode(int i) {
        this.c = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.h != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.h);
            drawable.setTintMode(this.i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.h = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.i);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.i = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!this.k && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            pa1 pa1Var = this.a;
            if (pa1Var != null) {
                xv7 xv7Var = pa1.v;
                pa1Var.f();
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        na1 na1Var;
        if (onClickListener != null) {
            na1Var = null;
        } else {
            na1Var = l;
        }
        setOnTouchListener(na1Var);
        super.setOnClickListener(onClickListener);
    }
}
