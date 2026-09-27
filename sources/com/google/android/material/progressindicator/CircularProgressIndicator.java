package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.polymarket.android.R;
import defpackage.b34;
import defpackage.dmk;
import defpackage.i34;
import defpackage.jlf;
import defpackage.lt9;
import defpackage.m4g;
import defpackage.o2n;
import defpackage.p6;
import defpackage.p91;
import defpackage.q91;
import defpackage.vp6;
import defpackage.w4k;
import defpackage.wen;
import defpackage.x24;
import defpackage.z24;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class CircularProgressIndicator extends p91 {
    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        p6 z24Var;
        i34 i34Var = (i34) this.a;
        x24 x24Var = new x24(i34Var);
        Context context2 = getContext();
        if (i34Var.q == 1) {
            z24Var = new b34(context2, i34Var);
        } else {
            z24Var = new z24(i34Var);
        }
        lt9 lt9Var = new lt9(context2, i34Var, x24Var, z24Var);
        Resources resources = context2.getResources();
        w4k w4kVar = new w4k();
        ThreadLocal threadLocal = m4g.a;
        w4kVar.a = resources.getDrawable(R.drawable.ic_mtrl_arrow_circle, null);
        lt9Var.p = w4kVar;
        setIndeterminateDrawable(lt9Var);
        setProgressDrawable(new vp6(getContext(), i34Var, x24Var));
        this.i = true;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [q91, i34] */
    @Override // defpackage.p91
    public final q91 a(Context context, AttributeSet attributeSet) {
        ?? q91Var = new q91(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        o2n.a(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = jlf.h;
        o2n.b(context, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        q91Var.q = obtainStyledAttributes.getInt(0, 0);
        q91Var.r = Math.max(wen.c(context, obtainStyledAttributes, 4, dimensionPixelSize), q91Var.a * 2);
        q91Var.s = wen.c(context, obtainStyledAttributes, 3, dimensionPixelSize2);
        q91Var.t = obtainStyledAttributes.getInt(2, 0);
        q91Var.u = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
        q91Var.d();
        return q91Var;
    }

    public int getIndeterminateAnimationType() {
        return ((i34) this.a).q;
    }

    public int getIndicatorDirection() {
        return ((i34) this.a).t;
    }

    public int getIndicatorInset() {
        return ((i34) this.a).s;
    }

    public int getIndicatorSize() {
        return ((i34) this.a).r;
    }

    public void setIndeterminateAnimationType(int i) {
        p6 z24Var;
        q91 q91Var = this.a;
        if (((i34) q91Var).q == i) {
            return;
        }
        if (d() && isIndeterminate()) {
            dmk.n("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        ((i34) q91Var).q = i;
        ((i34) q91Var).d();
        if (i == 1) {
            z24Var = new b34(getContext(), (i34) q91Var);
        } else {
            z24Var = new z24((i34) q91Var);
        }
        lt9 indeterminateDrawable = getIndeterminateDrawable();
        indeterminateDrawable.o = z24Var;
        z24Var.a = indeterminateDrawable;
        b();
        invalidate();
    }

    public void setIndicatorDirection(int i) {
        ((i34) this.a).t = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        q91 q91Var = this.a;
        if (((i34) q91Var).s != i) {
            ((i34) q91Var).s = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        q91 q91Var = this.a;
        if (((i34) q91Var).r != max) {
            ((i34) q91Var).r = max;
            ((i34) q91Var).d();
            requestLayout();
            invalidate();
        }
    }

    @Override // defpackage.p91
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((i34) this.a).d();
    }
}
