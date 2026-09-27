package defpackage;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class h0d {
    public final ca6 a;
    public final o0d b = new o0d();
    public final LinkedHashSet c;
    public final LinkedHashSet d;

    public h0d(ca6 ca6Var) {
        this.a = ca6Var;
        new LinkedHashSet();
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
    }

    public static void a(h0d h0dVar, j0d j0dVar) {
        h0dVar.getClass();
        j0dVar.getClass();
        if (h0dVar.c.add(j0dVar)) {
            o0d o0dVar = h0dVar.b;
            if (j0dVar.g == null) {
                o0dVar.e.addFirst(j0dVar);
                j0dVar.g = h0dVar;
                o0dVar.b();
                return;
            }
            omf.r(j0dVar, "' is already registered with a dispatcher", "Handler '");
        }
    }

    public final void b(n0d n0dVar) {
        if (this.d.add(n0dVar)) {
            this.b.a(this, n0dVar, -1);
        }
    }

    public final void c(rhd rhdVar, int i) {
        if (i != 1 && i != 0) {
            f27.q(ace.f(i, "Unsupported priority value: "));
        } else if (this.d.add(rhdVar)) {
            this.b.a(this, rhdVar, i);
        }
    }

    public final void d(n0d n0dVar, g0d g0dVar) {
        o0d o0dVar = this.b;
        if (o0dVar.g == 0) {
            j0d c = o0dVar.c(-1);
            o0dVar.f = c;
            o0dVar.g = -1;
            o0dVar.h = n0dVar;
            if (g0dVar != null) {
                if (c != null) {
                    c.d = new r0d(g0dVar, -1);
                    c.d(g0dVar);
                }
                o0dVar.a.m(null, new r0d(g0dVar, -1));
            }
        }
    }
}
