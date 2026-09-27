package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zg0 extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};
    public final if0 a;
    public final Context b;
    public final pg0 c;
    public SpinnerAdapter d;
    public final boolean e;
    public final yg0 f;
    public int g;
    public final Rect h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zg0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.polymarket.android.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.h = new Rect();
        wyi.a(this, getContext());
        int[] iArr = ulf.v;
        bm9 C = bm9.C(com.polymarket.android.R.attr.spinnerStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray2 = (TypedArray) C.c;
        this.a = new if0(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.b = new k55(context, resourceId);
        } else {
            this.b = context;
        }
        int i2 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, i, com.polymarket.android.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i2 = typedArray.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                }
            } catch (Throwable th) {
                th = th;
                typedArray3 = typedArray;
                if (typedArray3 != null) {
                    typedArray3.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i2 != 0) {
            if (i2 == 1) {
                wg0 wg0Var = new wg0(this, this.b, attributeSet);
                bm9 C2 = bm9.C(com.polymarket.android.R.attr.spinnerStyle, 0, this.b, attributeSet, iArr);
                this.g = ((TypedArray) C2.c).getLayoutDimension(3, -2);
                wg0Var.p(C2.p(1));
                wg0Var.A = typedArray2.getString(2);
                C2.F();
                this.f = wg0Var;
                this.c = new pg0(this, this, wg0Var);
            }
        } else {
            sg0 sg0Var = new sg0(this);
            this.f = sg0Var;
            sg0Var.c = typedArray2.getString(2);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.polymarket.android.R.layout.support_simple_spinner_dropdown_item);
            setAdapter2((SpinnerAdapter) arrayAdapter);
        }
        C.F();
        this.e = true;
        SpinnerAdapter spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter2(spinnerAdapter);
            this.d = null;
        }
        this.a.d(attributeSet, com.polymarket.android.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.h;
            drawable.getPadding(rect);
            return rect.left + rect.right + i3;
        }
        return i3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if0 if0Var = this.a;
        if (if0Var != null) {
            if0Var.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        yg0 yg0Var = this.f;
        if (yg0Var != null) {
            return yg0Var.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        yg0 yg0Var = this.f;
        if (yg0Var != null) {
            return yg0Var.l();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f != null) {
            return this.g;
        }
        return super.getDropDownWidth();
    }

    public final yg0 getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        yg0 yg0Var = this.f;
        if (yg0Var != null) {
            return yg0Var.f();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        yg0 yg0Var = this.f;
        if (yg0Var != null) {
            return yg0Var.e();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        if0 if0Var = this.a;
        if (if0Var != null) {
            return if0Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if0 if0Var = this.a;
        if (if0Var != null) {
            return if0Var.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yg0 yg0Var = this.f;
        if (yg0Var != null && yg0Var.a()) {
            yg0Var.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        xg0 xg0Var = (xg0) parcelable;
        super.onRestoreInstanceState(xg0Var.getSuperState());
        if (xg0Var.a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new qg0(this, 0));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, xg0, android.os.Parcelable] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        yg0 yg0Var = this.f;
        if (yg0Var != null && yg0Var.a()) {
            z = true;
        } else {
            z = false;
        }
        baseSavedState.a = z;
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pg0 pg0Var = this.c;
        if (pg0Var != null && pg0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        yg0 yg0Var = this.f;
        if (yg0Var != null) {
            if (!yg0Var.a()) {
                yg0Var.k(getTextDirection(), getTextAlignment());
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.widget.ListAdapter, java.lang.Object, tg0] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner
    /* renamed from: setAdapter, reason: avoid collision after fix types in other method */
    public void setAdapter2(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        yg0 yg0Var = this.f;
        if (yg0Var != 0) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                rg0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            yg0Var.m(obj);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if0 if0Var = this.a;
        if (if0Var != null) {
            if0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        if0 if0Var = this.a;
        if (if0Var != null) {
            if0Var.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        yg0 yg0Var = this.f;
        if (yg0Var != null) {
            yg0Var.j(i2);
            yg0Var.d(i2);
        } else {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        yg0 yg0Var = this.f;
        if (yg0Var != null) {
            yg0Var.i(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f != null) {
            this.g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        yg0 yg0Var = this.f;
        if (yg0Var != null) {
            yg0Var.p(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(qen.b(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        yg0 yg0Var = this.f;
        if (yg0Var != null) {
            yg0Var.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if0 if0Var = this.a;
        if (if0Var != null) {
            if0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if0 if0Var = this.a;
        if (if0Var != null) {
            if0Var.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(SpinnerAdapter spinnerAdapter) {
        setAdapter2(spinnerAdapter);
    }
}
