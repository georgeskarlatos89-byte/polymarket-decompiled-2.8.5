package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import defpackage.a5c;
import defpackage.axh;
import defpackage.b1h;
import defpackage.d55;
import defpackage.g2h;
import defpackage.jlf;
import defpackage.o2n;
import defpackage.ojh;
import defpackage.q4c;
import defpackage.qen;
import defpackage.rhn;
import defpackage.s4c;
import defpackage.u8m;
import defpackage.uen;
import defpackage.ven;
import defpackage.wen;
import defpackage.y4c;
import defpackage.zen;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class MaterialCardView extends CardView implements Checkable, g2h {
    public static final int[] k = {R.attr.state_checkable};
    public static final int[] l = {R.attr.state_checked};
    public static final int[] m = {com.polymarket.android.R.attr.state_dragged};
    public static final int[] n = {R.attr.state_hovered};
    public final s4c g;
    public final boolean h;
    public boolean i;
    public boolean j;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(u8m.e(context, attributeSet, com.polymarket.android.R.attr.materialCardViewStyle, com.polymarket.android.R.style.Widget_MaterialComponents_CardView), attributeSet, com.polymarket.android.R.attr.materialCardViewStyle);
        Drawable drawable;
        axh g;
        this.i = false;
        this.j = false;
        this.h = true;
        TypedArray d = o2n.d(getContext(), attributeSet, jlf.x, com.polymarket.android.R.attr.materialCardViewStyle, com.polymarket.android.R.style.Widget_MaterialComponents_CardView, new int[0]);
        s4c s4cVar = new s4c(this, attributeSet);
        this.g = s4cVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        a5c a5cVar = s4cVar.c;
        a5cVar.s(cardBackgroundColor);
        s4cVar.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        s4cVar.l();
        MaterialCardView materialCardView = s4cVar.a;
        ColorStateList b = wen.b(materialCardView.getContext(), d, 11);
        s4cVar.o = b;
        if (b == null) {
            s4cVar.o = ColorStateList.valueOf(-1);
        }
        s4cVar.i = d.getDimensionPixelSize(12, 0);
        boolean z = d.getBoolean(0, false);
        s4cVar.t = z;
        materialCardView.setLongClickable(z);
        s4cVar.m = wen.b(materialCardView.getContext(), d, 6);
        s4cVar.g(wen.d(materialCardView.getContext(), d, 2));
        s4cVar.g = d.getDimensionPixelSize(5, 0);
        s4cVar.f = d.getDimensionPixelSize(4, 0);
        s4cVar.h = d.getInteger(3, 8388661);
        ColorStateList b2 = wen.b(materialCardView.getContext(), d, 7);
        s4cVar.l = b2;
        if (b2 == null) {
            s4cVar.l = ColorStateList.valueOf(ven.q(materialCardView.getContext(), uen.d(materialCardView, com.polymarket.android.R.attr.colorControlHighlight)));
        }
        ColorStateList b3 = wen.b(materialCardView.getContext(), d, 1);
        b3 = b3 == null ? ColorStateList.valueOf(0) : b3;
        a5c a5cVar2 = s4cVar.d;
        a5cVar2.s(b3);
        RippleDrawable rippleDrawable = s4cVar.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(s4cVar.l);
        }
        a5cVar.r(materialCardView.getCardElevation());
        float f = s4cVar.i;
        ColorStateList colorStateList = s4cVar.o;
        a5cVar2.b.j = f;
        a5cVar2.invalidateSelf();
        y4c y4cVar = a5cVar2.b;
        if (y4cVar.d != colorStateList) {
            y4cVar.d = colorStateList;
            a5cVar2.onStateChange(a5cVar2.getState());
        }
        materialCardView.setBackgroundInternal(s4cVar.d(a5cVar));
        if (s4cVar.j()) {
            drawable = s4cVar.c();
        } else {
            drawable = a5cVar2;
        }
        s4cVar.j = drawable;
        materialCardView.setForeground(s4cVar.d(drawable));
        if (s4cVar.e == -1.0f && (g = axh.g(materialCardView.getContext(), d, 8)) != null) {
            ojh d2 = rhn.d(materialCardView.getContext());
            a5cVar.q(d2);
            a5cVar2.q(d2);
            a5c a5cVar3 = s4cVar.r;
            if (a5cVar3 != null) {
                a5cVar3.q(d2);
            }
            s4cVar.h(g);
        }
        d.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.g.c.getBounds());
        return rectF;
    }

    public final void b() {
        s4c s4cVar = this.g;
        RippleDrawable rippleDrawable = s4cVar.p;
        if (rippleDrawable != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i = bounds.bottom;
            s4cVar.p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            s4cVar.p.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.g.c.b.c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.g.d.b.c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.g.k;
    }

    public int getCheckedIconGravity() {
        return this.g.h;
    }

    public int getCheckedIconMargin() {
        return this.g.f;
    }

    public int getCheckedIconSize() {
        return this.g.g;
    }

    public ColorStateList getCheckedIconTint() {
        return this.g.m;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.g.b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.g.b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.g.b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.g.b.top;
    }

    public float getProgress() {
        return this.g.c.b.i;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.g.c.k();
    }

    public ColorStateList getRippleColor() {
        return this.g.l;
    }

    public b1h getShapeAppearanceModel() {
        return this.g.n.d();
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.g.o;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.g.o;
    }

    public int getStrokeWidth() {
        return this.g.i;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s4c s4cVar = this.g;
        s4cVar.k();
        zen.c(this, s4cVar.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 8);
        s4c s4cVar = this.g;
        if (s4cVar != null && s4cVar.t) {
            View.mergeDrawableStates(onCreateDrawableState, k);
        }
        if (this.i) {
            View.mergeDrawableStates(onCreateDrawableState, l);
        }
        if (this.j) {
            View.mergeDrawableStates(onCreateDrawableState, m);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.PRESSED_STATE_SET);
            }
            if (isHovered()) {
                View.mergeDrawableStates(onCreateDrawableState, n);
            }
            if (isEnabled()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.ENABLED_STATE_SET);
            }
            if (isFocused()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.FOCUSED_STATE_SET);
            }
            if (isSelected()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.SELECTED_STATE_SET);
            }
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.i);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        s4c s4cVar = this.g;
        if (s4cVar != null && s4cVar.t) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.i);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.g.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.h) {
            s4c s4cVar = this.g;
            if (!s4cVar.s) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                s4cVar.s = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.g.c.s(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        s4c s4cVar = this.g;
        s4cVar.c.r(s4cVar.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        a5c a5cVar = this.g.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        a5cVar.s(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.g.t = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.i != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.g.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        s4c s4cVar = this.g;
        if (s4cVar.h != i) {
            s4cVar.h = i;
            MaterialCardView materialCardView = s4cVar.a;
            s4cVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.g.f = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.g.f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.g.g(qen.b(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.g.g = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.g.g = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        s4c s4cVar = this.g;
        s4cVar.m = colorStateList;
        Drawable drawable = s4cVar.k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        s4c s4cVar = this.g;
        if (s4cVar != null) {
            s4cVar.k();
        }
    }

    public void setDragged(boolean z) {
        if (this.j != z) {
            this.j = z;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.g.m();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        s4c s4cVar = this.g;
        s4cVar.m();
        s4cVar.l();
    }

    public void setProgress(float f) {
        s4c s4cVar = this.g;
        s4cVar.c.t(f);
        a5c a5cVar = s4cVar.d;
        if (a5cVar != null) {
            a5cVar.t(f);
        }
        a5c a5cVar2 = s4cVar.r;
        if (a5cVar2 != null) {
            a5cVar2.t(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        s4c s4cVar = this.g;
        s4cVar.e = f;
        s4cVar.h(s4cVar.n.d().a(f));
        s4cVar.j.invalidateSelf();
        if (s4cVar.i() || (s4cVar.a.getPreventCornerOverlap() && !s4cVar.c.p())) {
            s4cVar.l();
        }
        if (s4cVar.i()) {
            s4cVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        s4c s4cVar = this.g;
        s4cVar.l = colorStateList;
        RippleDrawable rippleDrawable = s4cVar.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList e = d55.e(getContext(), i);
        s4c s4cVar = this.g;
        s4cVar.l = e;
        RippleDrawable rippleDrawable = s4cVar.p;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(e);
        }
    }

    @Override // defpackage.g2h
    public void setShapeAppearanceModel(b1h b1hVar) {
        setClipToOutline(b1hVar.k(getBoundsAsRectF()));
        this.g.h(b1hVar);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        s4c s4cVar = this.g;
        if (s4cVar.o != colorStateList) {
            s4cVar.o = colorStateList;
            a5c a5cVar = s4cVar.d;
            a5cVar.b.j = s4cVar.i;
            a5cVar.invalidateSelf();
            y4c y4cVar = a5cVar.b;
            if (y4cVar.d != colorStateList) {
                y4cVar.d = colorStateList;
                a5cVar.onStateChange(a5cVar.getState());
            }
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        s4c s4cVar = this.g;
        if (i != s4cVar.i) {
            s4cVar.i = i;
            a5c a5cVar = s4cVar.d;
            ColorStateList colorStateList = s4cVar.o;
            a5cVar.b.j = i;
            a5cVar.invalidateSelf();
            y4c y4cVar = a5cVar.b;
            if (y4cVar.d != colorStateList) {
                y4cVar.d = colorStateList;
                a5cVar.onStateChange(a5cVar.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        s4c s4cVar = this.g;
        s4cVar.m();
        s4cVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        s4c s4cVar = this.g;
        if (s4cVar != null && s4cVar.t && isEnabled()) {
            this.i = !this.i;
            refreshDrawableState();
            b();
            s4cVar.f(this.i, true);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.g.c.s(colorStateList);
    }

    public void setOnCheckedChangeListener(q4c q4cVar) {
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }
}
