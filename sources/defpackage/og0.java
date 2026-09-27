package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.polymarket.android.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class og0 extends r66 {
    public final ng0 i;
    public Drawable j;
    public ColorStateList k;
    public PorterDuff.Mode l;
    public boolean m;
    public boolean n;

    public og0(ng0 ng0Var) {
        super(ng0Var);
        this.k = null;
        this.l = null;
        this.m = false;
        this.n = false;
        this.i = ng0Var;
    }

    public final void F() {
        Drawable drawable = this.j;
        if (drawable != null) {
            if (this.m || this.n) {
                Drawable mutate = drawable.mutate();
                this.j = mutate;
                if (this.m) {
                    mutate.setTintList(this.k);
                }
                if (this.n) {
                    this.j.setTintMode(this.l);
                }
                if (this.j.isStateful()) {
                    this.j.setState(this.i.getDrawableState());
                }
            }
        }
    }

    public final void G(Canvas canvas) {
        int i;
        if (this.j != null) {
            int max = this.i.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.j.getIntrinsicWidth();
                int intrinsicHeight = this.j.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.j.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.j.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // defpackage.r66
    public final void w(AttributeSet attributeSet, int i) {
        super.w(attributeSet, R.attr.seekBarStyle);
        ng0 ng0Var = this.i;
        Context context = ng0Var.getContext();
        int[] iArr = ulf.g;
        bm9 C = bm9.C(R.attr.seekBarStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) C.c;
        Context context2 = ng0Var.getContext();
        TypedArray typedArray2 = (TypedArray) C.c;
        WeakHashMap weakHashMap = k9k.a;
        i9k.b(ng0Var, context2, iArr, attributeSet, typedArray2, R.attr.seekBarStyle, 0);
        Drawable q = C.q(0);
        if (q != null) {
            ng0Var.setThumb(q);
        }
        Drawable p = C.p(1);
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.j = p;
        if (p != null) {
            p.setCallback(ng0Var);
            p.setLayoutDirection(ng0Var.getLayoutDirection());
            if (p.isStateful()) {
                p.setState(ng0Var.getDrawableState());
            }
            F();
        }
        ng0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.l = n17.a(typedArray.getInt(3, -1), this.l);
            this.n = true;
        }
        if (typedArray.hasValue(2)) {
            this.k = C.o(2);
            this.m = true;
        }
        C.F();
        F();
    }
}
