package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class el5 extends y4c {
    public final RectF q;

    public el5(el5 el5Var) {
        super(el5Var);
        this.q = el5Var.q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, a5c, fl5] */
    @Override // defpackage.y4c, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ?? a5cVar = new a5c(this);
        a5cVar.F = this;
        a5cVar.invalidateSelf();
        return a5cVar;
    }

    public el5(b1h b1hVar, RectF rectF) {
        super(b1hVar);
        this.q = rectF;
    }
}
