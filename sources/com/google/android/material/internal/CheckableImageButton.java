package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import defpackage.fy3;
import defpackage.gy3;
import defpackage.k9k;
import defpackage.ka1;
import defpackage.l0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] h = {R.attr.state_checked};
    public boolean d;
    public boolean e;
    public boolean f;
    public fy3 g;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.polymarket.android.R.attr.imageButtonStyle);
        this.e = true;
        this.f = true;
        k9k.j(this, new ka1(this, 2));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.d) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i + 1), h);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.g = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof gy3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        gy3 gy3Var = (gy3) parcelable;
        super.onRestoreInstanceState(gy3Var.a);
        setChecked(gy3Var.c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gy3, android.os.Parcelable, l0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? l0Var = new l0(super.onSaveInstanceState());
        l0Var.c = this.d;
        return l0Var;
    }

    public void setCheckable(boolean z) {
        if (this.e != z) {
            this.e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.e && this.d != z) {
            this.d = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        fy3 fy3Var;
        boolean isFocusable = isFocusable();
        super.setFocusable(z);
        if (isFocusable != z && (fy3Var = this.g) != null) {
            fy3Var.b();
        }
    }

    public void setOnFocusableChangedListener(fy3 fy3Var) {
        this.g = fy3Var;
    }

    public void setPressable(boolean z) {
        this.f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.d);
    }
}
