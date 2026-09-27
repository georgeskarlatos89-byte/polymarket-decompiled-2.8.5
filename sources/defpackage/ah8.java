package defpackage;

import android.view.View;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ah8 extends jjc implements fg8 {
    @Override // defpackage.fg8
    public final void r(bg8 bg8Var) {
        boolean z;
        View b = znl.b(this);
        if (this.a.n && znl.b(this).hasFocusable()) {
            z = true;
        } else {
            z = false;
        }
        bg8Var.b(z);
        View findFocus = b.findFocus();
        if (findFocus != null) {
            bg8Var.c(nf8.a(findFocus, b));
        }
    }
}
