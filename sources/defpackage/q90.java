package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class q90 extends Drawable.ConstantState {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ q90(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.a) {
            case 0:
                s90 s90Var = new s90(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable();
                s90Var.a = newDrawable;
                newDrawable.setCallback(s90Var.f);
                return s90Var;
            default:
                return new jv8(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.a) {
            case 0:
                s90 s90Var = new s90(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources);
                s90Var.a = newDrawable;
                newDrawable.setCallback(s90Var.f);
                return s90Var;
            default:
                return new jv8(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                s90 s90Var = new s90(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources, theme);
                s90Var.a = newDrawable;
                newDrawable.setCallback(s90Var.f);
                return s90Var;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
