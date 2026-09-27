package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class fl5 extends a5c {
    public static final /* synthetic */ int G = 0;
    public el5 F;

    public final void A(float f, float f2, float f3, float f4) {
        RectF rectF = this.F.q;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // defpackage.a5c
    public final void f(Canvas canvas) {
        if (this.F.q.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.F.q);
        super.f(canvas);
        canvas.restore();
    }

    @Override // defpackage.a5c, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.F = new el5(this.F);
        return this;
    }
}
