package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.mlf;
import defpackage.nag;
import defpackage.r66;
import defpackage.uln;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class CardView extends FrameLayout {
    public static final int[] f = {R.attr.colorBackground};
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final r66 e;

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        r66 r66Var = new r66(this);
        this.e = r66Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mlf.a, i, com.polymarket.android.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.polymarket.android.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.polymarket.android.R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.a = obtainStyledAttributes.getBoolean(7, false);
        this.b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        nag nagVar = new nag(valueOf, dimension);
        r66Var.b = nagVar;
        setBackgroundDrawable(nagVar);
        setClipToOutline(true);
        setElevation(dimension2);
        uln.a(r66Var, dimension3);
    }

    public static /* synthetic */ void a(CardView cardView, int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((nag) this.e.b).h;
    }

    public float getCardElevation() {
        return ((CardView) this.e.c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.c.left;
    }

    public int getContentPaddingRight() {
        return this.c.right;
    }

    public int getContentPaddingTop() {
        return this.c.top;
    }

    public float getMaxCardElevation() {
        return ((nag) this.e.b).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return ((nag) this.e.b).a;
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        nag nagVar = (nag) this.e.b;
        if (valueOf == null) {
            nagVar.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        nagVar.h = valueOf;
        nagVar.b.setColor(valueOf.getColorForState(nagVar.getState(), nagVar.h.getDefaultColor()));
        nagVar.invalidateSelf();
    }

    public void setCardElevation(float f2) {
        ((CardView) this.e.c).setElevation(f2);
    }

    public void setMaxCardElevation(float f2) {
        uln.a(this.e, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.b) {
            this.b = z;
            r66 r66Var = this.e;
            uln.a(r66Var, ((nag) r66Var.b).e);
        }
    }

    public void setRadius(float f2) {
        nag nagVar = (nag) this.e.b;
        if (f2 == nagVar.a) {
            return;
        }
        nagVar.a = f2;
        nagVar.b(null);
        nagVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            r66 r66Var = this.e;
            uln.a(r66Var, ((nag) r66Var.b).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        nag nagVar = (nag) this.e.b;
        if (colorStateList == null) {
            nagVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        nagVar.h = colorStateList;
        nagVar.b.setColor(colorStateList.getColorForState(nagVar.getState(), nagVar.h.getDefaultColor()));
        nagVar.invalidateSelf();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.polymarket.android.R.attr.cardViewStyle);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
