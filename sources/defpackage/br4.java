package defpackage;

import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class br4 implements d8c, d27 {
    public final Object a;
    public c27 b;
    public c27 c;
    public final /* synthetic */ dr4 d;

    public br4(dr4 dr4Var, Object obj) {
        this.d = dr4Var;
        this.b = new c27(dr4Var.c.c, 0, null);
        this.c = new c27(dr4Var.d.c, 0, null);
        this.a = obj;
    }

    public final boolean a(int i, x7c x7cVar) {
        x7c x7cVar2;
        Object obj = this.a;
        dr4 dr4Var = this.d;
        if (x7cVar != null) {
            x7cVar2 = dr4Var.s(obj, x7cVar);
            if (x7cVar2 == null) {
                return false;
            }
        } else {
            x7cVar2 = null;
        }
        int u = dr4Var.u(i, obj);
        c27 c27Var = this.b;
        if (c27Var.a != u || !Objects.equals(c27Var.b, x7cVar2)) {
            this.b = new c27(dr4Var.c.c, u, x7cVar2);
        }
        c27 c27Var2 = this.c;
        if (c27Var2.a != u || !Objects.equals(c27Var2.b, x7cVar2)) {
            this.c = new c27(dr4Var.d.c, u, x7cVar2);
            return true;
        }
        return true;
    }

    public final l7c b(l7c l7cVar, x7c x7cVar) {
        long j = l7cVar.f;
        dr4 dr4Var = this.d;
        Object obj = this.a;
        long t = dr4Var.t(j, obj);
        long j2 = l7cVar.g;
        long t2 = dr4Var.t(j2, obj);
        if (t == j && t2 == j2) {
            return l7cVar;
        }
        return new l7c(l7cVar.a, l7cVar.b, l7cVar.c, l7cVar.d, l7cVar.e, t, t2);
    }

    @Override // defpackage.d8c
    public final void c(int i, x7c x7cVar, l7c l7cVar) {
        if (a(i, x7cVar)) {
            c27 c27Var = this.b;
            l7c b = b(l7cVar, x7cVar);
            x7c x7cVar2 = c27Var.b;
            x7cVar2.getClass();
            c27Var.a(new gy(c27Var, x7cVar2, b, 8));
        }
    }

    @Override // defpackage.d8c
    public final void g(int i, x7c x7cVar, gnb gnbVar, l7c l7cVar, IOException iOException, boolean z) {
        if (a(i, x7cVar)) {
            c27 c27Var = this.b;
            c27Var.a(new b8c(c27Var, gnbVar, b(l7cVar, x7cVar), iOException, z));
        }
    }

    @Override // defpackage.d8c
    public final void p(int i, x7c x7cVar, gnb gnbVar, l7c l7cVar, int i2) {
        if (a(i, x7cVar)) {
            c27 c27Var = this.b;
            c27Var.a(new z7c(c27Var, gnbVar, b(l7cVar, x7cVar), i2));
        }
    }

    @Override // defpackage.d8c
    public final void q(int i, x7c x7cVar, l7c l7cVar) {
        if (a(i, x7cVar)) {
            c27 c27Var = this.b;
            c27Var.a(new vt0(20, c27Var, b(l7cVar, x7cVar)));
        }
    }

    @Override // defpackage.d8c
    public final void w(int i, x7c x7cVar, gnb gnbVar, l7c l7cVar) {
        if (a(i, x7cVar)) {
            c27 c27Var = this.b;
            c27Var.a(new a8c(c27Var, gnbVar, b(l7cVar, x7cVar), 1));
        }
    }

    @Override // defpackage.d8c
    public final void x(int i, x7c x7cVar, gnb gnbVar, l7c l7cVar) {
        if (a(i, x7cVar)) {
            c27 c27Var = this.b;
            c27Var.a(new a8c(c27Var, gnbVar, b(l7cVar, x7cVar), 0));
        }
    }
}
