package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.am0;
import defpackage.bm0;
import defpackage.rlf;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public final bm0 a;
    public float b;
    public int c;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, rlf.a, 0, 0);
            try {
                this.c = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.a = new bm0(this);
    }

    public int getResizeMode() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r4 > 0.0f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        r2 = r2 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        r1 = r1 / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if (r4 > 0.0f) goto L23;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        float f;
        super.onMeasure(i, i2);
        if (this.b > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f2 = measuredWidth;
            float f3 = measuredHeight;
            float f4 = (this.b / (f2 / f3)) - 1.0f;
            float abs = Math.abs(f4);
            bm0 bm0Var = this.a;
            if (abs <= 0.01f) {
                if (!bm0Var.b) {
                    bm0Var.b = true;
                    ((AspectRatioFrameLayout) bm0Var.c).post(bm0Var);
                    return;
                }
                return;
            }
            int i3 = this.c;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 4) {
                            f = this.b;
                        }
                    } else {
                        float f5 = f3 * this.b;
                        measuredWidth = (int) f5;
                    }
                } else {
                    float f6 = f2 / this.b;
                    measuredHeight = (int) f6;
                }
            } else {
                f = this.b;
            }
            if (!bm0Var.b) {
                bm0Var.b = true;
                ((AspectRatioFrameLayout) bm0Var.c).post(bm0Var);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    public void setAspectRatio(float f) {
        if (this.b != f) {
            this.b = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public void setAspectRatioListener(am0 am0Var) {
    }
}
