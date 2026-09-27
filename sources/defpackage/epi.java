package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class epi {
    public final fzn a = new fzn();

    public epi(p23 p23Var) {
        p23Var.b(new evf(this, 27));
    }

    public final void a(Exception exc) {
        this.a.s(exc);
    }

    public final void b(Object obj) {
        this.a.q(obj);
    }

    public final boolean c(Exception exc) {
        fzn fznVar = this.a;
        fznVar.getClass();
        arn.i(exc, "Exception must not be null");
        synchronized (fznVar.a) {
            try {
                if (fznVar.c) {
                    return false;
                }
                fznVar.c = true;
                fznVar.f = exc;
                fznVar.b.w(fznVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        this.a.r(obj);
    }

    public epi() {
    }
}
