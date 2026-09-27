package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class dbi implements ro7 {
    public final Function1 a;
    public volatile po3 b;
    public volatile boolean c;

    public dbi(Function1 function1, po3 po3Var) {
        this.a = function1;
        this.b = po3Var;
    }

    @Override // defpackage.dw6
    public final boolean a() {
        return this.c;
    }

    @Override // defpackage.ro7
    public final void b(mo3 mo3Var) {
        po3 po3Var;
        mo3Var.getClass();
        if (!this.c && ((Boolean) this.a.invoke(mo3Var)).booleanValue() && (po3Var = this.b) != null) {
            po3Var.a(mo3Var);
        }
    }

    @Override // defpackage.dw6
    public final void dispose() {
        this.c = true;
        this.b = null;
    }
}
