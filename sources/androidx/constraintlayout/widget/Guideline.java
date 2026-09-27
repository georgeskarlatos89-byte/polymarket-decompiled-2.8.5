package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.xy4;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class Guideline extends View {
    public boolean a;

    public Guideline(Context context) {
        super(context);
        this.a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.a = z;
    }

    public void setGuidelineBegin(int i) {
        xy4 xy4Var = (xy4) getLayoutParams();
        if (this.a && xy4Var.a == i) {
            return;
        }
        xy4Var.a = i;
        setLayoutParams(xy4Var);
    }

    public void setGuidelineEnd(int i) {
        xy4 xy4Var = (xy4) getLayoutParams();
        if (this.a && xy4Var.b == i) {
            return;
        }
        xy4Var.b = i;
        setLayoutParams(xy4Var);
    }

    public void setGuidelinePercent(float f) {
        xy4 xy4Var = (xy4) getLayoutParams();
        if (this.a && xy4Var.c == f) {
            return;
        }
        xy4Var.c = f;
        setLayoutParams(xy4Var);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
