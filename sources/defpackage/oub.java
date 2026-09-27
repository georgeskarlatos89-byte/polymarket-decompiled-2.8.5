package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class oub implements nwa {
    public final nub a;

    public oub(nub nubVar) {
        this.a = nubVar;
    }

    @Override // defpackage.nwa
    public final long C(long j) {
        return this.a.p.C(ogd.f(j, a()));
    }

    @Override // defpackage.nwa
    public final void J(float[] fArr) {
        this.a.p.J(fArr);
    }

    @Override // defpackage.nwa
    public final long P(long j) {
        return this.a.p.P(ogd.f(0L, a()));
    }

    @Override // defpackage.nwa
    public final nwa X() {
        nub i1;
        if (!j()) {
            kw9.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        x8d x8dVar = this.a.p.p.getOuterCoordinator$ui().t;
        if (x8dVar != null && (i1 = x8dVar.i1()) != null) {
            return i1.s;
        }
        return null;
    }

    @Override // defpackage.nwa
    public final long Z(long j) {
        return this.a.p.Z(ogd.f(j, a()));
    }

    public final long a() {
        nub nubVar = this.a;
        nub b = zan.b(nubVar);
        return ogd.e(z(b.s, 0L, true), nubVar.p.z(b.p, 0L, true));
    }

    @Override // defpackage.nwa
    public final nwa c() {
        nub i1;
        if (!j()) {
            kw9.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        x8d x8dVar = this.a.p.t;
        if (x8dVar != null && (i1 = x8dVar.i1()) != null) {
            return i1.s;
        }
        return null;
    }

    @Override // defpackage.nwa
    public final void f(nwa nwaVar, float[] fArr) {
        this.a.p.f(nwaVar, fArr);
    }

    @Override // defpackage.nwa
    public final long h() {
        nub nubVar = this.a;
        return (nubVar.a << 32) | (nubVar.b & 4294967295L);
    }

    @Override // defpackage.nwa
    public final boolean j() {
        return this.a.p.k1().n;
    }

    @Override // defpackage.nwa
    public final long m(long j) {
        return ogd.f(this.a.p.m(j), a());
    }

    @Override // defpackage.nwa
    public final long s(nwa nwaVar, long j) {
        return z(nwaVar, j, true);
    }

    @Override // defpackage.nwa
    public final long u(long j) {
        return ogd.f(this.a.p.u(j), a());
    }

    @Override // defpackage.nwa
    public final zrf y(nwa nwaVar, boolean z) {
        return this.a.p.y(nwaVar, z);
    }

    @Override // defpackage.nwa
    public final long z(nwa nwaVar, long j, boolean z) {
        boolean z2 = nwaVar instanceof oub;
        nub nubVar = this.a;
        if (z2) {
            nub nubVar2 = ((oub) nwaVar).a;
            x8d x8dVar = nubVar2.p;
            x8dVar.t1();
            nub i1 = nubVar.p.g1(x8dVar).i1();
            if (i1 != null) {
                boolean z3 = !z;
                long c = e1a.c(e1a.d(nubVar2.c1(i1, z3), frm.m(j)), nubVar.c1(i1, z3));
                return (Float.floatToRawIntBits((int) (c >> 32)) << 32) | (Float.floatToRawIntBits((int) (c & 4294967295L)) & 4294967295L);
            }
            nub b = zan.b(nubVar2);
            boolean z4 = !z;
            long d = e1a.d(e1a.d(nubVar2.c1(b, z4), b.q), frm.m(j));
            nub b2 = zan.b(nubVar);
            long c2 = e1a.c(d, e1a.d(nubVar.c1(b2, z4), b2.q));
            long floatToRawIntBits = Float.floatToRawIntBits((int) (c2 >> 32));
            long floatToRawIntBits2 = Float.floatToRawIntBits((int) (c2 & 4294967295L)) & 4294967295L;
            x8d x8dVar2 = b2.p.t;
            x8dVar2.getClass();
            x8d x8dVar3 = b.p.t;
            x8dVar3.getClass();
            return x8dVar2.z(x8dVar3, floatToRawIntBits2 | (floatToRawIntBits << 32), z);
        }
        nub b3 = zan.b(nubVar);
        oub oubVar = b3.s;
        nwa nwaVar2 = b3.p;
        long z5 = z(oubVar, j, z);
        long j2 = b3.q;
        long e = ogd.e(z5, (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
        nwa c3 = nwaVar2.c();
        if (c3 != null) {
            nwaVar2 = c3;
        }
        return ogd.f(e, ((x8d) nwaVar2).z(nwaVar, 0L, z));
    }
}
