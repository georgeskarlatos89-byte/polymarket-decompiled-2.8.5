package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class k2 implements Runnable {
    public final u2 a;
    public final ujb b;

    public k2(u2 u2Var, ujb ujbVar) {
        this.a = u2Var;
        this.b = ujbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u2 u2Var = this.a;
        if (u2.access$300(u2Var) == this) {
            if (u2.access$200().b(u2Var, this, u2.access$400(this.b))) {
                u2.access$500(u2Var, false);
            }
        }
    }
}
