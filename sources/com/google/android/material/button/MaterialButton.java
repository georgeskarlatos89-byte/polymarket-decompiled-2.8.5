package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import defpackage.a1h;
import defpackage.a5c;
import defpackage.axh;
import defpackage.b1h;
import defpackage.b66;
import defpackage.bxh;
import defpackage.c4c;
import defpackage.ca6;
import defpackage.cxh;
import defpackage.d4c;
import defpackage.d55;
import defpackage.dmk;
import defpackage.e4c;
import defpackage.f4c;
import defpackage.f91;
import defpackage.g2h;
import defpackage.h4c;
import defpackage.i4c;
import defpackage.jlf;
import defpackage.kd0;
import defpackage.l0;
import defpackage.m51;
import defpackage.m5n;
import defpackage.njh;
import defpackage.o2n;
import defpackage.ojh;
import defpackage.qen;
import defpackage.rhn;
import defpackage.u8m;
import defpackage.up6;
import defpackage.vq8;
import defpackage.wen;
import defpackage.wvb;
import defpackage.x3g;
import defpackage.zen;
import io.sentry.android.core.m0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, g2h {
    public static final int[] N = {R.attr.state_checkable};
    public static final int[] O = {R.attr.state_checked};
    public static final up6 P = new up6(1);
    public int A;
    public int B;
    public LinearLayout.LayoutParams C;
    public boolean D;
    public int E;
    public boolean F;
    public int G;
    public cxh H;
    public int I;
    public f4c J;
    public float K;
    public float L;
    public njh M;
    public final i4c d;
    public final LinkedHashSet e;
    public d4c f;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public Drawable i;
    public PorterDuff.Mode j;
    public ColorStateList k;
    public Drawable l;
    public boolean m;
    public String n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public float z;

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(u8m.d(i, com.polymarket.android.R.style.Widget_MaterialComponents_Button, context, attributeSet, new int[]{com.polymarket.android.R.attr.materialSizeOverlay}), attributeSet, i);
        ColorStateList colorStateList;
        boolean z;
        boolean z2;
        this.e = new LinkedHashSet();
        this.u = false;
        this.v = false;
        this.y = Integer.MIN_VALUE;
        this.z = -2.14748365E9f;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.G = Integer.MIN_VALUE;
        this.J = f4c.BOTH;
        Context context2 = getContext();
        TypedArray d = o2n.d(context2, attributeSet, jlf.r, i, com.polymarket.android.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.r = d.getDimensionPixelSize(13, 0);
        int i2 = d.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.g = m5n.c(i2, mode);
        this.h = wen.b(getContext(), d, 15);
        this.i = wen.d(getContext(), d, 11);
        this.w = d.getInteger(12, 1);
        this.o = d.getDimensionPixelSize(14, 0);
        this.j = m5n.c(d.getInt(22, -1), mode);
        if (d.hasValue(21)) {
            colorStateList = wen.b(getContext(), d, 21);
        } else {
            colorStateList = this.h;
        }
        this.k = colorStateList;
        this.x = d.getInteger(20, 3);
        Drawable d2 = wen.d(getContext(), d, 19);
        this.l = d2;
        if (d2 == null) {
            z = true;
        } else {
            z = false;
        }
        this.m = z;
        a1h g = axh.g(context2, d, 23);
        g = g == null ? b1h.h(context2, attributeSet, i, com.polymarket.android.R.style.Widget_MaterialComponents_Button).a() : g;
        boolean z3 = d.getBoolean(17, false);
        i4c i4cVar = new i4c(this, g);
        this.d = i4cVar;
        i4cVar.e = d.getDimensionPixelOffset(2, 0);
        i4cVar.f = d.getDimensionPixelOffset(3, 0);
        i4cVar.g = d.getDimensionPixelOffset(4, 0);
        i4cVar.h = d.getDimensionPixelOffset(5, 0);
        if (d.hasValue(9)) {
            int dimensionPixelSize = d.getDimensionPixelSize(9, -1);
            i4cVar.i = dimensionPixelSize;
            i4cVar.b = i4cVar.b.a(dimensionPixelSize);
            i4cVar.d();
            i4cVar.r = true;
        }
        i4cVar.j = d.getDimensionPixelSize(26, 0);
        i4cVar.k = m5n.c(d.getInt(8, -1), mode);
        i4cVar.l = wen.b(getContext(), d, 7);
        i4cVar.m = wen.b(getContext(), d, 25);
        i4cVar.n = wen.b(getContext(), d, 18);
        i4cVar.s = d.getBoolean(6, false);
        i4cVar.v = d.getDimensionPixelSize(10, 0);
        i4cVar.t = d.getBoolean(27, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (d.hasValue(0)) {
            i4cVar.q = true;
            setSupportBackgroundTintList(i4cVar.l);
            setSupportBackgroundTintMode(i4cVar.k);
        } else {
            i4cVar.c();
        }
        setPaddingRelative(paddingStart + i4cVar.e, paddingTop + i4cVar.g, paddingEnd + i4cVar.f, paddingBottom + i4cVar.h);
        setCheckedInternal(d.getBoolean(1, false));
        if (g instanceof axh) {
            i4cVar.c = rhn.d(getContext());
            if (i4cVar.b instanceof axh) {
                i4cVar.d();
            }
        }
        setOpticalCenterEnabled(z3);
        d.recycle();
        setCompoundDrawablePadding(this.r);
        if (this.i != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        t(z2);
        w(this.l != null);
    }

    public static /* synthetic */ float a(MaterialButton materialButton) {
        return materialButton.getDisplayedWidthIncrease();
    }

    public static /* synthetic */ void b(MaterialButton materialButton, float f) {
        materialButton.setDisplayedWidthIncrease(f);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    private float getDisplayedWidthIncrease() {
        return this.K;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        a5c a;
        if (!this.D || !this.F || (a = this.d.a(false)) == null) {
            return 0;
        }
        return (int) (a.h() * 0.11f);
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    private void setCheckedInternal(boolean z) {
        if (i() && this.u != z) {
            this.u = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.u;
                if (!materialButtonToggleGroup.n) {
                    materialButtonToggleGroup.l(getId(), z2);
                }
            }
            if (!this.v) {
                this.v = true;
                Iterator it = this.e.iterator();
                if (!it.hasNext()) {
                    this.v = false;
                    return;
                }
                throw m51.g(it);
            }
        }
    }

    private void setDisplayedWidthIncrease(float f) {
        if (this.K != f) {
            this.K = f;
            v();
            invalidate();
            if (getParent() instanceof h4c) {
                h4c h4cVar = (h4c) getParent();
                int i = (int) this.K;
                int indexOfChild = h4cVar.indexOfChild(this);
                if (indexOfChild >= 0) {
                    MaterialButton h = h4cVar.h(indexOfChild);
                    MaterialButton g = h4cVar.g(indexOfChild);
                    if (h != null || g != null) {
                        if (h == null) {
                            g.setDisplayedWidthDecrease(i);
                        }
                        if (g == null) {
                            h.setDisplayedWidthDecrease(i);
                        }
                        if (h != null && g != null) {
                            h.setDisplayedWidthDecrease(i / 2);
                            g.setDisplayedWidthDecrease((i + 1) / 2);
                        }
                    }
                }
            }
        }
    }

    public final boolean c() {
        if (!k() || !n()) {
            if (!j() || !m()) {
                if (l() && o()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean d(int i) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        if (i == 1 || i == 3 || ((i == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            return true;
        }
        return false;
    }

    public final int e(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        Drawable drawable = this.i;
        boolean z2 = false;
        if (drawable != null) {
            i3 = this.o;
            if (i3 == 0) {
                i3 = drawable.getIntrinsicWidth();
            }
        } else {
            i3 = 0;
        }
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            i4 = this.o;
            if (i4 == 0) {
                i4 = drawable2.getIntrinsicWidth();
            }
        } else {
            i4 = 0;
        }
        int textLayoutWidth = (((((i - getTextLayoutWidth()) - getPaddingEnd()) - i3) - i4) - this.r) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == 4) {
            z2 = true;
        }
        if (z != z2) {
            return -textLayoutWidth;
        }
        return textLayoutWidth;
    }

    public final int f(int i, int i2) {
        return Math.max(0, (((((i - getTextHeight()) - getPaddingTop()) - i2) - this.r) - getPaddingBottom()) / 2);
    }

    public final Drawable g(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2 && this.l != null && m()) {
                    return this.l;
                }
                return null;
            }
            if (this.l != null && o()) {
                return this.l;
            }
            return null;
        }
        if (this.l != null && n()) {
            return this.l;
        }
        return null;
    }

    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.n)) {
            return this.n;
        }
        if (i()) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    public int getAllowedWidthDecrease() {
        return this.G;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (p()) {
            return this.d.i;
        }
        return 0;
    }

    public ojh getCornerSpringForce() {
        return this.d.c;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.w;
    }

    public int getIconPadding() {
        return this.r;
    }

    public int getIconSize() {
        return this.o;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    public int getInsetBottom() {
        return this.d.h;
    }

    public int getInsetLeft() {
        return this.d.e;
    }

    public int getInsetRight() {
        return this.d.f;
    }

    public int getInsetTop() {
        return this.d.g;
    }

    public ColorStateList getRippleColor() {
        if (p()) {
            return this.d.n;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.l;
    }

    public int getSecondaryIconGravity() {
        return this.x;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.k;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.j;
    }

    public a1h getShapeAppearance() {
        if (p()) {
            return this.d.b;
        }
        dmk.n("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        return null;
    }

    public b1h getShapeAppearanceModel() {
        if (p()) {
            return this.d.b.d();
        }
        dmk.n("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (p()) {
            return this.d.m;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (p()) {
            return this.d.j;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        if (p()) {
            return this.d.l;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (p()) {
            return this.d.k;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final Drawable h(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2 && this.i != null && j()) {
                    return this.i;
                }
                return null;
            }
            if (this.i != null && j()) {
                return this.i;
            }
            return null;
        }
        if (this.i != null && k()) {
            return this.i;
        }
        return null;
    }

    public final boolean i() {
        i4c i4cVar = this.d;
        if (i4cVar != null && i4cVar.s) {
            return true;
        }
        return false;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.u;
    }

    public final boolean j() {
        int i = this.w;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    public final boolean k() {
        int i = this.w;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        int i = this.w;
        if (i != 16 && i != 32) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        int i = this.x;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    public final boolean n() {
        int i = this.x;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        int i = this.x;
        if (i != 16 && i != 32) {
            return false;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (p()) {
            zen.c(this, this.d.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (i()) {
            View.mergeDrawableStates(onCreateDrawableState, N);
        }
        if (this.u) {
            View.mergeDrawableStates(onCreateDrawableState, O);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.u);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(i());
        accessibilityNodeInfo.setChecked(this.u);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        u(getMeasuredWidth(), getMeasuredHeight());
        x(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.y != i6) {
            this.y = i6;
            this.z = -2.14748365E9f;
        }
        if (this.z == -2.14748365E9f) {
            this.z = getMeasuredWidth();
            if (this.C == null && (getParent() instanceof h4c) && ((h4c) getParent()).getButtonSizeChange() != null) {
                this.C = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.C);
                layoutParams.width = (int) this.z;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.G == Integer.MIN_VALUE) {
            if (this.i == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i7 = this.o;
                if (i7 == 0) {
                    i7 = this.i.getIntrinsicWidth();
                }
                i5 = iconPadding + i7;
            }
            this.G = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.A == Integer.MIN_VALUE) {
            this.A = getPaddingStart();
        }
        if (this.B == Integer.MIN_VALUE) {
            this.B = getPaddingEnd();
        }
        if ((getParent() instanceof h4c) && ((h4c) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.F = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e4c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e4c e4cVar = (e4c) parcelable;
        super.onRestoreInstanceState(e4cVar.a);
        setChecked(e4cVar.c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, l0, e4c] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? l0Var = new l0(super.onSaveInstanceState());
        l0Var.c = this.u;
        return l0Var;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        u(getMeasuredWidth(), getMeasuredHeight());
        x(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean p() {
        i4c i4cVar = this.d;
        if (i4cVar != null && !i4cVar.q) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.d.t) {
            toggle();
            z = true;
        } else {
            z = false;
        }
        boolean performClick = super.performClick();
        if (z && !performClick) {
            playSoundEffect(0);
        }
        return performClick;
    }

    public final /* synthetic */ void q() {
        this.E = getOpticalCenterShift();
        v();
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
    
        if (r1 == defpackage.bxh.PIXELS) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(boolean z) {
        int i;
        int i2;
        x3g x3gVar;
        if (this.H != null) {
            if (this.M == null) {
                njh njhVar = new njh(this, P);
                this.M = njhVar;
                njhVar.m = rhn.d(getContext());
            }
            if (this.F) {
                int ordinal = this.J.ordinal();
                int i3 = 0;
                if (ordinal != 1 && ordinal != 2) {
                    if (ordinal != 3) {
                        i = 0;
                    } else {
                        i = this.I;
                    }
                } else {
                    i = this.I / 2;
                }
                cxh cxhVar = this.H;
                int[] drawableState = getDrawableState();
                int[][] iArr = cxhVar.c;
                int i4 = 0;
                while (true) {
                    i2 = -1;
                    if (i4 < cxhVar.a) {
                        if (StateSet.stateSetMatches(iArr[i4], drawableState)) {
                            break;
                        } else {
                            i4++;
                        }
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 < 0) {
                    int[] iArr2 = StateSet.WILD_CARD;
                    int[][] iArr3 = cxhVar.c;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= cxhVar.a) {
                            break;
                        }
                        if (StateSet.stateSetMatches(iArr3[i5], iArr2)) {
                            i2 = i5;
                            break;
                        }
                        i5++;
                    }
                    i4 = i2;
                }
                if (i4 < 0) {
                    x3gVar = cxhVar.b;
                } else {
                    x3gVar = cxhVar.d[i4];
                }
                f91 f91Var = (f91) x3gVar.b;
                int width = getWidth();
                float f = f91Var.a;
                bxh bxhVar = (bxh) f91Var.b;
                if (bxhVar == bxh.PERCENT) {
                    f *= width;
                }
                i3 = (int) f;
                this.M.a(Math.min(i, i3));
                if (z) {
                    this.M.e();
                }
            }
        }
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (this.i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public final boolean s(Runnable runnable) {
        njh njhVar = this.M;
        if (njhVar != null && njhVar.f) {
            post(new vq8(14, this, runnable));
            return true;
        }
        return false;
    }

    public void setA11yClassName(String str) {
        this.n = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (p()) {
            i4c i4cVar = this.d;
            if (i4cVar.a(false) != null) {
                i4cVar.a(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (p()) {
            if (drawable != getBackground()) {
                m0.p("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                i4c i4cVar = this.d;
                i4cVar.q = true;
                MaterialButton materialButton = i4cVar.a;
                materialButton.setSupportBackgroundTintList(i4cVar.l);
                materialButton.setSupportBackgroundTintMode(i4cVar.k);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = qen.b(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (p()) {
            this.d.s = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.z = -2.14748365E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    public void setCornerRadius(int i) {
        if (p()) {
            i4c i4cVar = this.d;
            if (!i4cVar.r || i4cVar.i != i) {
                i4cVar.i = i;
                i4cVar.r = true;
                i4cVar.b = i4cVar.b.a(i);
                i4cVar.d();
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (p()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(ojh ojhVar) {
        i4c i4cVar = this.d;
        i4cVar.c = ojhVar;
        if (i4cVar.b instanceof axh) {
            i4cVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.L = Math.min(i, this.G);
        v();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (p()) {
            this.d.a(false).r(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable && !s(new c4c(this, drawable, 1))) {
            this.z = -2.14748365E9f;
            this.i = drawable;
            t(true);
            u(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.w != i) {
            if (this.i != null && this.l != null && c()) {
                dmk.v("iconGravity cannot have the same alignment as secondaryIconGravity");
            } else {
                this.w = i;
                u(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setIconPadding(int i) {
        if (this.r != i) {
            this.r = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = qen.b(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i >= 0) {
            if (this.o != i && !s(new kd0(this, i, 6))) {
                this.z = -2.14748365E9f;
                this.o = i;
                t(true);
                w(true);
                return;
            }
            return;
        }
        dmk.v("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            t(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            t(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(d55.e(getContext(), i));
    }

    public void setInsetBottom(int i) {
        i4c i4cVar = this.d;
        i4cVar.b(i4cVar.e, i4cVar.g, i4cVar.f, i);
    }

    public void setInsetLeft(int i) {
        i4c i4cVar = this.d;
        i4cVar.b(i, i4cVar.g, i4cVar.f, i4cVar.h);
    }

    public void setInsetRight(int i) {
        i4c i4cVar = this.d;
        i4cVar.b(i4cVar.e, i4cVar.g, i, i4cVar.h);
    }

    public void setInsetTop(int i) {
        i4c i4cVar = this.d;
        i4cVar.b(i4cVar.e, i, i4cVar.f, i4cVar.h);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(d4c d4cVar) {
        this.f = d4cVar;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.D != z) {
            this.D = z;
            i4c i4cVar = this.d;
            if (z) {
                ca6 ca6Var = new ca6(this, 18);
                i4cVar.d = ca6Var;
                a5c a = i4cVar.a(false);
                if (a != null) {
                    a.D = ca6Var;
                }
            } else {
                i4cVar.d = null;
                a5c a2 = i4cVar.a(false);
                if (a2 != null) {
                    a2.D = null;
                }
            }
            post(new wvb(this, 2));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        d4c d4cVar = this.f;
        if (d4cVar != null) {
            ((MaterialButtonToggleGroup) ((b66) d4cVar).b).invalidate();
        }
        super.setPressed(z);
        r(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (p()) {
            i4c i4cVar = this.d;
            MaterialButton materialButton = i4cVar.a;
            if (i4cVar.n != colorStateList) {
                i4cVar.n = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) materialButton.getBackground();
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(0);
                    }
                    rippleDrawable.setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (p()) {
            setRippleColor(d55.e(getContext(), i));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.l != drawable && !s(new c4c(this, drawable, 0))) {
            this.z = -2.14748365E9f;
            this.l = drawable;
            this.m = false;
            w(true);
            x(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setSecondaryIconGravity(int i) {
        if (this.x != i) {
            if (this.l != null && this.i != null && c()) {
                dmk.v("secondaryIconGravity cannot have the same alignment as iconGravity");
            } else {
                this.x = i;
                x(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setSecondaryIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = qen.b(getContext(), i);
        } else {
            drawable = null;
        }
        setSecondaryIcon(drawable);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            w(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.j != mode) {
            this.j = mode;
            w(false);
        }
    }

    public void setSecondaryIconTintResource(int i) {
        setSecondaryIconTint(d55.e(getContext(), i));
    }

    public void setShapeAppearance(a1h a1hVar) {
        if (p()) {
            i4c i4cVar = this.d;
            if (i4cVar.c == null && a1hVar.f()) {
                i4cVar.c = rhn.d(getContext());
                if (i4cVar.b instanceof axh) {
                    i4cVar.d();
                }
            }
            i4cVar.b = a1hVar;
            i4cVar.d();
            return;
        }
        dmk.n("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
    }

    @Override // defpackage.g2h
    public void setShapeAppearanceModel(b1h b1hVar) {
        if (p()) {
            i4c i4cVar = this.d;
            i4cVar.b = b1hVar;
            i4cVar.d();
            return;
        }
        dmk.n("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (p()) {
            i4c i4cVar = this.d;
            i4cVar.p = z;
            i4cVar.e();
        }
    }

    public void setSizeChange(cxh cxhVar) {
        if (this.H != cxhVar) {
            this.H = cxhVar;
            r(true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (p()) {
            i4c i4cVar = this.d;
            if (i4cVar.m != colorStateList) {
                i4cVar.m = colorStateList;
                i4cVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (p()) {
            setStrokeColor(d55.e(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (p()) {
            i4c i4cVar = this.d;
            if (i4cVar.j != i) {
                i4cVar.j = i;
                i4cVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (p()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (p()) {
            i4c i4cVar = this.d;
            if (i4cVar.l != colorStateList) {
                i4cVar.l = colorStateList;
                if (i4cVar.a(false) != null) {
                    i4cVar.a(false).setTintList(i4cVar.l);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (p()) {
            i4c i4cVar = this.d;
            if (i4cVar.k != mode) {
                i4cVar.k = mode;
                if (i4cVar.a(false) != null && i4cVar.k != null) {
                    i4cVar.a(false).setTintMode(i4cVar.k);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.z = -2.14748365E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        u(getMeasuredWidth(), getMeasuredHeight());
        x(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.z = -2.14748365E9f;
        super.setTextAppearance(context, i);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        this.z = -2.14748365E9f;
        super.setTextSize(i, f);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.d.t = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.z = -2.14748365E9f;
        super.setWidth(i);
    }

    public void setWidthChangeDirection(f4c f4cVar) {
        if (this.J != f4cVar) {
            this.J = f4cVar;
            r(true);
        }
    }

    public void setWidthChangeMax(int i) {
        if (this.I != i) {
            this.I = i;
            r(true);
        }
    }

    public final void t(boolean z) {
        boolean z2;
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.i = mutate;
            mutate.setTintList(this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                this.i.setTintMode(mode);
            }
            int i = this.o;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.o;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.p;
            int i4 = this.q;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.i.setVisible(true, z);
        }
        if (this.i != null && this.l != null && c()) {
            dmk.v("iconGravity cannot have the same alignment as secondaryIconGravity");
            return;
        }
        if (this.i != null || this.l == null || !c()) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            Drawable drawable3 = compoundDrawablesRelative[0];
            Drawable drawable4 = compoundDrawablesRelative[1];
            Drawable drawable5 = compoundDrawablesRelative[2];
            if ((k() && drawable3 != this.i) || ((j() && drawable5 != this.i) || (l() && drawable4 != this.i))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                if (k()) {
                    setCompoundDrawablesRelative(this.i, g(1), g(2), null);
                } else if (j()) {
                    setCompoundDrawablesRelative(g(0), g(1), this.i, null);
                } else if (l()) {
                    setCompoundDrawablesRelative(g(0), this.i, g(2), null);
                }
            }
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.u);
    }

    public final void u(int i, int i2) {
        if (this.i != null && getLayout() != null) {
            if (!k() && !j()) {
                if (l()) {
                    this.p = 0;
                    if (this.w == 16) {
                        this.q = 0;
                        t(false);
                        return;
                    }
                    int i3 = this.o;
                    if (i3 == 0) {
                        i3 = this.i.getIntrinsicHeight();
                    }
                    int f = f(i2, i3);
                    if (this.q != f) {
                        this.q = f;
                        t(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.q = 0;
            if (d(this.w)) {
                this.p = 0;
                t(false);
                return;
            }
            int e = e(i, this.w);
            if (this.p != e) {
                this.p = e;
                t(false);
            }
        }
    }

    public final void v() {
        int i = (int) (this.K - this.L);
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        int i2 = this.E;
        if (z) {
            i2 = -i2;
        }
        int i3 = (i / 2) + i2;
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.z + i);
        }
        setPaddingRelative(this.A + i3, getPaddingTop(), (this.B + i) - i3, getPaddingBottom());
    }

    public final void w(boolean z) {
        boolean z2;
        Drawable drawable = this.l;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.l = mutate;
            mutate.setTintList(this.k);
            PorterDuff.Mode mode = this.j;
            if (mode != null) {
                this.l.setTintMode(mode);
            }
            int i = this.o;
            if (i == 0) {
                i = this.l.getIntrinsicWidth();
            }
            int i2 = this.o;
            if (i2 == 0) {
                i2 = this.l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.l;
            int i3 = this.s;
            int i4 = this.t;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.l.setVisible(true, z);
        }
        if (this.l != null && this.i != null && c()) {
            dmk.v("secondaryIconGravity cannot have the same alignment as iconGravity");
            return;
        }
        if (this.l == null) {
            if (!this.m) {
                if (this.i != null && c()) {
                    return;
                }
            } else {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((n() && drawable3 != this.l) || ((m() && drawable5 != this.l) || (o() && drawable4 != this.l))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            if (n()) {
                setCompoundDrawablesRelative(this.l, h(1), h(2), null);
            } else if (m()) {
                setCompoundDrawablesRelative(h(0), h(1), this.l, null);
            } else if (o()) {
                setCompoundDrawablesRelative(h(0), this.l, h(2), null);
            }
        }
    }

    public final void x(int i, int i2) {
        if (this.l != null && getLayout() != null) {
            if (!n() && !m()) {
                if (o()) {
                    this.s = 0;
                    if (this.x == 16) {
                        this.t = 0;
                        w(false);
                        return;
                    }
                    int i3 = this.o;
                    if (i3 == 0) {
                        i3 = this.l.getIntrinsicHeight();
                    }
                    int f = f(i2, i3);
                    if (this.t != f) {
                        this.t = f;
                        w(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.t = 0;
            if (d(this.x)) {
                this.s = 0;
                w(false);
                return;
            }
            int e = e(i, this.x);
            if (this.s != e) {
                this.s = e;
                w(false);
            }
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.polymarket.android.R.attr.materialButtonStyle);
    }
}
