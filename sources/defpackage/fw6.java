package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fw6 implements ayf {
    public final Function1 a;
    public gw6 b;

    public fw6(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.ayf
    public final void a() {
        this.b = (gw6) this.a.invoke(hrl.a);
    }

    @Override // defpackage.ayf
    public final void c() {
        gw6 gw6Var = this.b;
        if (gw6Var != null) {
            gw6Var.dispose();
        }
        this.b = null;
    }

    @Override // defpackage.ayf
    public final void b() {
    }
}
