package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class dlk extends jlk {
    public final WindowInsets.Builder c;

    public dlk(vlk vlkVar) {
        super(vlkVar);
        WindowInsets.Builder builder;
        WindowInsets g = vlkVar.g();
        if (g != null) {
            builder = new WindowInsets.Builder(g);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.c = builder;
    }

    @Override // defpackage.jlk
    public vlk b() {
        a();
        vlk h = vlk.h(null, this.c.build());
        slk slkVar = h.a;
        slkVar.w(null);
        slkVar.v(null);
        slkVar.A(this.a);
        slkVar.B(this.b);
        return h;
    }

    @Override // defpackage.jlk
    public void d(fz9 fz9Var) {
        this.c.setStableInsets(fz9Var.e());
    }

    @Override // defpackage.jlk
    public void e(fz9 fz9Var) {
        this.c.setSystemWindowInsets(fz9Var.e());
    }

    public dlk() {
        this.c = new WindowInsets.Builder();
    }
}
