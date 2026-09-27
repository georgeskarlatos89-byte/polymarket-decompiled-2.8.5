package defpackage;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.i;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yr6 extends jm8 {
    public final /* synthetic */ jm8 a;
    public final /* synthetic */ i b;

    public yr6(i iVar, jm8 jm8Var) {
        this.b = iVar;
        this.a = jm8Var;
    }

    @Override // defpackage.jm8
    public final View b(int i) {
        jm8 jm8Var = this.a;
        if (jm8Var.c()) {
            return jm8Var.b(i);
        }
        Dialog dialog = this.b.l;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.jm8
    public final boolean c() {
        if (!this.a.c() && !this.b.p) {
            return false;
        }
        return true;
    }
}
