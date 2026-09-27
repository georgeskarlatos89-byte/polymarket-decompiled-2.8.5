package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class v4k extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public v4k(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        w4k w4kVar = new w4k();
        w4kVar.a = (VectorDrawable) this.a.newDrawable();
        return w4kVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        w4k w4kVar = new w4k();
        w4kVar.a = (VectorDrawable) this.a.newDrawable(resources);
        return w4kVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        w4k w4kVar = new w4k();
        w4kVar.a = (VectorDrawable) this.a.newDrawable(resources, theme);
        return w4kVar;
    }
}
