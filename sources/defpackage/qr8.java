package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qr8 extends mr4 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final jqc e = hig.a();
    public final kvd f = new kvd(sje.g, nim.p);
    public final /* synthetic */ sr8 g;

    public qr8(sr8 sr8Var, long j, boolean z, boolean z2, m4l m4lVar) {
        this.g = sr8Var;
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.mr4
    public final void a(w55 w55Var, Function2 function2) {
        this.g.b.a(w55Var, function2);
    }

    @Override // defpackage.mr4
    public final gig b(w55 w55Var, x5h x5hVar, Function2 function2) {
        return this.g.b.b(w55Var, x5hVar, function2);
    }

    @Override // defpackage.mr4
    public final void c(jmc jmcVar) {
        this.g.b.c(jmcVar);
    }

    @Override // defpackage.mr4
    public final void d() {
        sr8 sr8Var = this.g;
        sr8Var.A--;
    }

    @Override // defpackage.mr4
    public final boolean e() {
        return this.g.b.e();
    }

    @Override // defpackage.mr4
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.mr4
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.mr4
    public final long h() {
        return this.a;
    }

    @Override // defpackage.mr4
    public final lr4 i() {
        return this.g.h;
    }

    @Override // defpackage.mr4
    public final sje j() {
        return (sje) this.f.getValue();
    }

    @Override // defpackage.mr4
    public final CoroutineContext k() {
        return this.g.b.k();
    }

    @Override // defpackage.mr4
    public final boolean l() {
        return this.g.b.l();
    }

    @Override // defpackage.mr4
    public final void m(jmc jmcVar) {
        this.g.b.m(jmcVar);
    }

    @Override // defpackage.mr4
    public final void n(w55 w55Var) {
        sr8 sr8Var = this.g;
        mr4 mr4Var = sr8Var.b;
        mr4Var.n(sr8Var.h);
        mr4Var.n(w55Var);
    }

    @Override // defpackage.mr4
    public final void o(jmc jmcVar, imc imcVar, qj0 qj0Var) {
        this.g.b.o(jmcVar, imcVar, qj0Var);
    }

    @Override // defpackage.mr4
    public final imc p(jmc jmcVar) {
        return this.g.b.p(jmcVar);
    }

    @Override // defpackage.mr4
    public final gig q(w55 w55Var, x5h x5hVar, gig gigVar) {
        return this.g.b.q(w55Var, x5hVar, gigVar);
    }

    @Override // defpackage.mr4
    public final void r(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.mr4
    public final void s(sr8 sr8Var) {
        this.e.d(sr8Var);
    }

    @Override // defpackage.mr4
    public final void t(nrf nrfVar) {
        this.g.b.t(nrfVar);
    }

    @Override // defpackage.mr4
    public final void u(sr4 sr4Var) {
        this.g.b.u(sr4Var);
    }

    @Override // defpackage.mr4
    public final o23 v(n10 n10Var) {
        return this.g.b.v(n10Var);
    }

    @Override // defpackage.mr4
    public final void w() {
        this.g.A++;
    }

    @Override // defpackage.mr4
    public final void x(sr8 sr8Var) {
        HashSet hashSet = this.d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                sr8Var.getClass();
                set.remove(sr8Var.A());
            }
        }
        if (sr8Var != null) {
            this.e.l(sr8Var);
        }
    }

    @Override // defpackage.mr4
    public final void y(sr4 sr4Var) {
        this.g.b.y(sr4Var);
    }

    public final void z() {
        jqc jqcVar = this.e;
        if (jqcVar.c()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                Object[] objArr = jqcVar.b;
                long[] jArr = jqcVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    sr8 sr8Var = (sr8) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(sr8Var.A());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            jqcVar.e();
        }
    }
}
