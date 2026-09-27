package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cw2 {
    public Object a;
    public gw2 b;
    public c3g c;
    public boolean d;

    public final boolean a(Object obj) {
        boolean z = true;
        this.d = true;
        gw2 gw2Var = this.b;
        if (gw2Var == null || !gw2Var.b.i(obj)) {
            z = false;
        }
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final boolean b(Throwable th) {
        boolean z = true;
        this.d = true;
        gw2 gw2Var = this.b;
        if (gw2Var == null || !gw2Var.b.j(th)) {
            z = false;
        }
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void finalize() {
        c3g c3gVar;
        gw2 gw2Var = this.b;
        if (gw2Var != null && !gw2Var.b.isDone()) {
            gw2Var.a(new Throwable("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
        }
        if (!this.d && (c3gVar = this.c) != null) {
            c3gVar.i(null);
        }
    }
}
