package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class p3c extends spk {
    public final boolean l;
    public final o2j m;
    public final n2j n;
    public n3c o;
    public m3c p;
    public boolean q;
    public boolean r;
    public boolean s;

    public p3c(j91 j91Var, boolean z) {
        super(j91Var);
        boolean z2;
        if (z && j91Var.h()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new o2j();
        this.n = new n2j();
        v2j f = j91Var.f();
        if (f != null) {
            this.o = new n3c(f, null, null);
            this.s = true;
        } else {
            this.o = new n3c(new o3c(j91Var.g()), o2j.q, n3c.e);
        }
    }

    @Override // defpackage.spk
    public final void A() {
        if (!this.l) {
            this.q = true;
            z();
        }
    }

    public final m3c B(x7c x7cVar, gg1 gg1Var, long j) {
        boolean z;
        m3c m3cVar = new m3c(x7cVar, gg1Var, j);
        if (m3cVar.d == null) {
            z = true;
        } else {
            z = false;
        }
        pfn.f(z);
        m3cVar.d = this.k;
        if (this.r) {
            Object obj = x7cVar.a;
            if (this.o.d != null && obj.equals(n3c.e)) {
                obj = this.o.d;
            }
            m3cVar.e(x7cVar.a(obj));
            return m3cVar;
        }
        this.p = m3cVar;
        if (!this.q) {
            this.q = true;
            z();
        }
        return m3cVar;
    }

    public final boolean C(long j) {
        m3c m3cVar = this.p;
        int b = this.o.b(m3cVar.a.a);
        if (b == -1) {
            return false;
        }
        n3c n3cVar = this.o;
        n2j n2jVar = this.n;
        n3cVar.f(b, n2jVar, false);
        long j2 = n2jVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        m3cVar.g = j;
        return true;
    }

    @Override // defpackage.j91
    public final /* bridge */ /* synthetic */ q7c a(x7c x7cVar, gg1 gg1Var, long j) {
        return B(x7cVar, gg1Var, j);
    }

    @Override // defpackage.j91
    public final void m(q7c q7cVar) {
        m3c m3cVar = (m3c) q7cVar;
        if (m3cVar.e != null) {
            j91 j91Var = m3cVar.d;
            j91Var.getClass();
            j91Var.m(m3cVar.e);
        }
        if (q7cVar == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.dr4, defpackage.j91
    public final void o() {
        this.r = false;
        this.q = false;
        super.o();
    }

    @Override // defpackage.spk, defpackage.j91
    public final void r(j7c j7cVar) {
        if (this.s) {
            n3c n3cVar = this.o;
            this.o = new n3c(new ure(this.o.b, j7cVar), n3cVar.c, n3cVar.d);
        } else {
            this.o = new n3c(new o3c(j7cVar), o2j.q, n3c.e);
        }
        this.k.r(j7cVar);
    }

    @Override // defpackage.spk
    public final x7c x(x7c x7cVar) {
        Object obj = x7cVar.a;
        Object obj2 = this.o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = n3c.e;
        }
        return x7cVar.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c9  */
    @Override // defpackage.spk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(v2j v2jVar) {
        long j;
        n3c n3cVar;
        m3c m3cVar;
        Object obj;
        x7c a;
        n3c n3cVar2;
        if (this.r) {
            n3c n3cVar3 = this.o;
            this.o = new n3c(v2jVar, n3cVar3.c, n3cVar3.d);
            m3c m3cVar2 = this.p;
            if (m3cVar2 != null) {
                C(m3cVar2.g);
            }
        } else if (v2jVar.p()) {
            if (this.s) {
                n3c n3cVar4 = this.o;
                n3cVar2 = new n3c(v2jVar, n3cVar4.c, n3cVar4.d);
            } else {
                n3cVar2 = new n3c(v2jVar, o2j.q, n3c.e);
            }
            this.o = n3cVar2;
        } else {
            o2j o2jVar = this.m;
            v2jVar.n(0, o2jVar);
            long j2 = o2jVar.l;
            Object obj2 = o2jVar.a;
            m3c m3cVar3 = this.p;
            n2j n2jVar = this.n;
            if (m3cVar3 != null) {
                long j3 = m3cVar3.b;
                this.o.g(m3cVar3.a.a, n2jVar);
                long j4 = n2jVar.e + j3;
                this.o.m(0, o2jVar, 0L);
                if (j4 != o2jVar.l) {
                    j = j4;
                    Pair i = v2jVar.i(o2jVar, n2jVar, 0, j);
                    Object obj3 = i.first;
                    long longValue = ((Long) i.second).longValue();
                    if (!this.s) {
                        n3c n3cVar5 = this.o;
                        n3cVar = new n3c(v2jVar, n3cVar5.c, n3cVar5.d);
                    } else {
                        n3cVar = new n3c(v2jVar, obj2, obj3);
                    }
                    this.o = n3cVar;
                    m3cVar = this.p;
                    if (m3cVar != null && C(longValue)) {
                        x7c x7cVar = m3cVar.a;
                        obj = x7cVar.a;
                        if (this.o.d != null && obj.equals(n3c.e)) {
                            obj = this.o.d;
                        }
                        a = x7cVar.a(obj);
                        this.s = true;
                        this.r = true;
                        l(this.o);
                        if (a != null) {
                            m3c m3cVar4 = this.p;
                            m3cVar4.getClass();
                            m3cVar4.e(a);
                            return;
                        }
                        return;
                    }
                }
            }
            j = j2;
            Pair i2 = v2jVar.i(o2jVar, n2jVar, 0, j);
            Object obj32 = i2.first;
            long longValue2 = ((Long) i2.second).longValue();
            if (!this.s) {
            }
            this.o = n3cVar;
            m3cVar = this.p;
            if (m3cVar != null) {
                x7c x7cVar2 = m3cVar.a;
                obj = x7cVar2.a;
                if (this.o.d != null) {
                    obj = this.o.d;
                }
                a = x7cVar2.a(obj);
                this.s = true;
                this.r = true;
                l(this.o);
                if (a != null) {
                }
            }
        }
        a = null;
        this.s = true;
        this.r = true;
        l(this.o);
        if (a != null) {
        }
    }

    @Override // defpackage.dr4, defpackage.j91
    public final void i() {
    }
}
