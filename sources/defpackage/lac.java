package defpackage;

import android.view.ActionProvider;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lac implements ActionProvider.VisibilityListener {
    public b66 a;
    public final ActionProvider b;

    public lac(oac oacVar, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        b66 b66Var = this.a;
        if (b66Var != null) {
            cac cacVar = ((kac) b66Var.b).n;
            cacVar.h = true;
            cacVar.p(true);
        }
    }
}
