package defpackage;

import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lcj {
    public final x4 a;
    public final lcj b;
    public final String c;
    public final kvd d;
    public final kvd e;
    public final ivd f = new ivd(0);
    public final ivd g = new ivd(Long.MIN_VALUE);
    public final kvd h;
    public final ddh i;
    public final ddh j;
    public final kvd k;
    public final rm6 l;

    public lcj(x4 x4Var, lcj lcjVar, String str) {
        this.a = x4Var;
        this.b = lcjVar;
        this.c = str;
        this.d = ikl.c(x4Var.K0());
        this.e = ikl.c(new dcj(x4Var.K0(), x4Var.K0()));
        Boolean bool = Boolean.FALSE;
        this.h = ikl.c(bool);
        this.i = new ddh();
        this.j = new ddh();
        this.k = ikl.c(bool);
        this.l = adh.b(new euc(this, 2));
        x4Var.a1(this);
    }

    public final void a(Object obj, pq4 pq4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        boolean j;
        int i4;
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(-1493585151);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                j = sr8Var.h(obj);
            } else {
                j = sr8Var.j(obj);
            }
            if (j) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sr8Var.h(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        boolean z3 = true;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var.V(i2 & 1, z)) {
            if (!h()) {
                sr8Var.e0(466062241);
                q(obj);
                int i5 = i2 & 112;
                if (i5 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object Q = sr8Var.Q();
                uwn uwnVar = oq4.a;
                if (z2 || Q == uwnVar) {
                    Q = adh.b(new euc(this, 1));
                    sr8Var.o0(Q);
                }
                if (((Boolean) ((nwh) Q).getValue()).booleanValue()) {
                    sr8Var.e0(466470356);
                    Object Q2 = sr8Var.Q();
                    if (Q2 == uwnVar) {
                        Q2 = hrl.i(g.a, sr8Var);
                        sr8Var.o0(Q2);
                    }
                    t85 t85Var = (t85) Q2;
                    boolean j2 = sr8Var.j(t85Var);
                    if (i5 != 32) {
                        z3 = false;
                    }
                    boolean z4 = j2 | z3;
                    Object Q3 = sr8Var.Q();
                    if (z4 || Q3 == uwnVar) {
                        Q3 = new ivi(12, t85Var, this);
                        sr8Var.o0(Q3);
                    }
                    hrl.a(t85Var, this, (Function1) Q3, sr8Var);
                    sr8Var.s(false);
                } else {
                    sr8Var.e0(467712929);
                    sr8Var.s(false);
                }
                sr8Var.s(false);
            } else {
                sr8Var.e0(467722849);
                sr8Var.s(false);
            }
        } else {
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new d9f(this, obj, i, 21);
        }
    }

    public final long b() {
        ddh ddhVar = this.i;
        int size = ddhVar.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((ecj) ddhVar.get(i)).l.y());
        }
        ddh ddhVar2 = this.j;
        int size2 = ddhVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, ((lcj) ddhVar2.get(i2)).b());
        }
        return j;
    }

    public final void c() {
        ddh ddhVar = this.i;
        int size = ddhVar.size();
        for (int i = 0; i < size; i++) {
            ecj ecjVar = (ecj) ddhVar.get(i);
            ecjVar.f = null;
            ecjVar.e = null;
            ecjVar.i = false;
        }
        ddh ddhVar2 = this.j;
        int size2 = ddhVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((lcj) ddhVar2.get(i2)).c();
        }
    }

    public final boolean d() {
        ddh ddhVar = this.i;
        int size = ddhVar.size();
        for (int i = 0; i < size; i++) {
            if (((ecj) ddhVar.get(i)).e != null) {
                return true;
            }
        }
        ddh ddhVar2 = this.j;
        int size2 = ddhVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((lcj) ddhVar2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        lcj lcjVar = this.b;
        if (lcjVar != null) {
            return lcjVar.e();
        }
        return this.f.y();
    }

    public final ccj f() {
        return (ccj) this.e.getValue();
    }

    public final long g() {
        return ((Number) this.l.getValue()).longValue();
    }

    public final boolean h() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final void i(long j, boolean z) {
        long j2;
        ivd ivdVar = this.g;
        long y = ivdVar.y();
        x4 x4Var = this.a;
        if (y == Long.MIN_VALUE) {
            ivdVar.z(j);
            ((kvd) x4Var.a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((kvd) x4Var.a).getValue()).booleanValue()) {
            ((kvd) x4Var.a).setValue(Boolean.TRUE);
        }
        this.h.setValue(Boolean.FALSE);
        ddh ddhVar = this.i;
        int size = ddhVar.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            ecj ecjVar = (ecj) ddhVar.get(i);
            kvd kvdVar = ecjVar.g;
            kvd kvdVar2 = ecjVar.g;
            if (!((Boolean) kvdVar.getValue()).booleanValue()) {
                if (z) {
                    j2 = ecjVar.a().d();
                } else {
                    j2 = j;
                }
                ecjVar.d(ecjVar.a().f(j2));
                ecjVar.k = ecjVar.a().b(j2);
                if (ecjVar.a().c(j2)) {
                    kvdVar2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) kvdVar2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        ddh ddhVar2 = this.j;
        int size2 = ddhVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            lcj lcjVar = (lcj) ddhVar2.get(i2);
            kvd kvdVar3 = lcjVar.d;
            x4 x4Var2 = lcjVar.a;
            if (!Intrinsics.areEqual(kvdVar3.getValue(), x4Var2.K0())) {
                lcjVar.i(j, z);
            }
            if (!Intrinsics.areEqual(lcjVar.d.getValue(), x4Var2.K0())) {
                z2 = false;
            }
        }
        if (z2) {
            j();
        }
    }

    public final void j() {
        this.g.z(Long.MIN_VALUE);
        x4 x4Var = this.a;
        if (x4Var instanceof vqc) {
            ((vqc) x4Var).V0(this.d.getValue());
        }
        o(0L);
        ((kvd) x4Var.a).setValue(Boolean.FALSE);
        ddh ddhVar = this.j;
        int size = ddhVar.size();
        for (int i = 0; i < size; i++) {
            ((lcj) ddhVar.get(i)).j();
        }
    }

    public final void k(float f) {
        Object obj;
        ddh ddhVar = this.i;
        int size = ddhVar.size();
        for (int i = 0; i < size; i++) {
            ecj ecjVar = (ecj) ddhVar.get(i);
            ecjVar.getClass();
            if (f == -4.0f || f == -5.0f) {
                xoi xoiVar = ecjVar.f;
                if (xoiVar != null) {
                    ecjVar.a().h(xoiVar.c);
                    ecjVar.e = null;
                    ecjVar.f = null;
                }
                if (f == -4.0f) {
                    obj = ecjVar.a().d;
                } else {
                    obj = ecjVar.a().c;
                }
                ecjVar.a().h(obj);
                ecjVar.a().i(obj);
                ecjVar.d(obj);
                ecjVar.l.z(ecjVar.a().d());
            } else {
                ecjVar.h.z(f);
            }
        }
        ddh ddhVar2 = this.j;
        int size2 = ddhVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((lcj) ddhVar2.get(i2)).k(f);
        }
    }

    public final void l(Object obj, Object obj2) {
        this.g.z(Long.MIN_VALUE);
        x4 x4Var = this.a;
        ((kvd) x4Var.a).setValue(Boolean.FALSE);
        boolean h = h();
        kvd kvdVar = this.d;
        if (!h || !Intrinsics.areEqual(x4Var.K0(), obj) || !Intrinsics.areEqual(kvdVar.getValue(), obj2)) {
            if (!Intrinsics.areEqual(x4Var.K0(), obj) && (x4Var instanceof vqc)) {
                ((vqc) x4Var).V0(obj);
            }
            kvdVar.setValue(obj2);
            this.k.setValue(Boolean.TRUE);
            this.e.setValue(new dcj(obj, obj2));
        }
        ddh ddhVar = this.j;
        int size = ddhVar.size();
        for (int i = 0; i < size; i++) {
            lcj lcjVar = (lcj) ddhVar.get(i);
            lcjVar.getClass();
            if (lcjVar.h()) {
                lcjVar.l(lcjVar.a.K0(), lcjVar.d.getValue());
            }
        }
        ddh ddhVar2 = this.i;
        int size2 = ddhVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ecj) ddhVar2.get(i2)).c(0L);
        }
    }

    public final void m(long j) {
        ivd ivdVar = this.g;
        if (ivdVar.y() == Long.MIN_VALUE) {
            ivdVar.z(j);
        }
        o(j);
        this.h.setValue(Boolean.FALSE);
        ddh ddhVar = this.i;
        int size = ddhVar.size();
        for (int i = 0; i < size; i++) {
            ((ecj) ddhVar.get(i)).c(j);
        }
        ddh ddhVar2 = this.j;
        int size2 = ddhVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            lcj lcjVar = (lcj) ddhVar2.get(i2);
            if (!Intrinsics.areEqual(lcjVar.d.getValue(), lcjVar.a.K0())) {
                lcjVar.m(j);
            }
        }
    }

    public final void n(sng sngVar) {
        ddh ddhVar = this.i;
        int size = ddhVar.size();
        for (int i = 0; i < size; i++) {
            ecj ecjVar = (ecj) ddhVar.get(i);
            kvd kvdVar = ecjVar.j;
            if (!Intrinsics.areEqual(ecjVar.a().c, ecjVar.a().d)) {
                ecjVar.f = ecjVar.a();
                ecjVar.e = sngVar;
            }
            ecjVar.d.setValue(new xoi(ecjVar.n, ecjVar.a, kvdVar.getValue(), kvdVar.getValue(), ecjVar.k.c()));
            ecjVar.l.z(ecjVar.a().d());
            ecjVar.i = true;
        }
        ddh ddhVar2 = this.j;
        int size2 = ddhVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((lcj) ddhVar2.get(i2)).n(sngVar);
        }
    }

    public final void o(long j) {
        if (this.b == null) {
            this.f.z(j);
        }
    }

    public final void p() {
        xoi xoiVar;
        ddh ddhVar = this.i;
        int size = ddhVar.size();
        for (int i = 0; i < size; i++) {
            ecj ecjVar = (ecj) ddhVar.get(i);
            sng sngVar = ecjVar.e;
            if (sngVar != null && (xoiVar = ecjVar.f) != null) {
                long f = i5c.f(sngVar.g * sngVar.d);
                Object f2 = xoiVar.f(f);
                if (ecjVar.i) {
                    ecjVar.a().i(f2);
                }
                ecjVar.a().h(f2);
                ecjVar.l.z(ecjVar.a().d());
                if (ecjVar.h.y() == -2.0f || ecjVar.i) {
                    ecjVar.d(f2);
                } else {
                    ecjVar.c(ecjVar.o.e());
                }
                if (f >= sngVar.g) {
                    ecjVar.e = null;
                    ecjVar.f = null;
                } else {
                    sngVar.c = false;
                }
            }
        }
        ddh ddhVar2 = this.j;
        int size2 = ddhVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((lcj) ddhVar2.get(i2)).p();
        }
    }

    public final void q(Object obj) {
        kvd kvdVar = this.d;
        if (!Intrinsics.areEqual(kvdVar.getValue(), obj)) {
            this.e.setValue(new dcj(kvdVar.getValue(), obj));
            x4 x4Var = this.a;
            if (!Intrinsics.areEqual(x4Var.K0(), kvdVar.getValue())) {
                x4Var.V0(kvdVar.getValue());
            }
            kvdVar.setValue(obj);
            if (this.g.y() == Long.MIN_VALUE) {
                this.h.setValue(Boolean.TRUE);
            }
            ddh ddhVar = this.i;
            int size = ddhVar.size();
            for (int i = 0; i < size; i++) {
                ((ecj) ddhVar.get(i)).h.z(-2.0f);
            }
        }
    }

    public final String toString() {
        ddh ddhVar = this.i;
        int size = ddhVar.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((ecj) ddhVar.get(i)) + ", ";
        }
        return str;
    }
}
