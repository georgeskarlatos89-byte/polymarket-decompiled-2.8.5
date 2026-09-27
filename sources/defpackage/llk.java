package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class llk extends klk {
    public fz9 n;

    public llk(vlk vlkVar, llk llkVar) {
        super(vlkVar, llkVar);
        this.n = null;
        this.n = llkVar.n;
    }

    @Override // defpackage.slk
    public vlk b() {
        return vlk.h(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.slk
    public vlk c() {
        return vlk.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.slk
    public final fz9 l() {
        fz9 fz9Var = this.n;
        if (fz9Var == null) {
            WindowInsets windowInsets = this.c;
            fz9 c = fz9.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            this.n = c;
            return c;
        }
        return fz9Var;
    }

    @Override // defpackage.slk
    public boolean s() {
        return this.c.isConsumed();
    }

    public llk(vlk vlkVar, WindowInsets windowInsets) {
        super(vlkVar, windowInsets);
        this.n = null;
    }
}
