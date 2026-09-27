package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uya implements lya, p1b {
    public final int a;
    public final Object b;
    public final int c;
    public final owa d;
    public final int e;
    public final int f;
    public final List g;
    public final long h;
    public final Object i;
    public final i1b j;
    public final long k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public int p = Integer.MIN_VALUE;
    public int q;
    public int r;
    public final long s;
    public long t;
    public int u;
    public int v;
    public boolean w;

    public uya(int i, Object obj, int i2, int i3, owa owaVar, int i4, int i5, List list, long j, Object obj2, i1b i1bVar, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = i2;
        this.d = owaVar;
        this.e = i4;
        this.f = i5;
        this.g = list;
        this.h = j;
        this.i = obj2;
        this.j = i1bVar;
        this.k = j2;
        this.l = i6;
        this.m = i7;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = Math.max(i8, ((cne) list.get(i9)).b);
        }
        this.n = i8;
        int i10 = i3 + i8;
        this.o = i10 >= 0 ? i10 : 0;
        this.s = (this.c << 32) | (i8 & 4294967295L);
        this.t = 0L;
        this.u = -1;
        this.v = -1;
    }

    public final void a(bne bneVar, boolean z) {
        i09 i09Var;
        long j;
        if (this.p == Integer.MIN_VALUE) {
            nw9.a("position() should be called first");
        }
        List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cne cneVar = (cne) list.get(i);
            int i2 = this.q - cneVar.b;
            int i3 = this.r;
            long j2 = this.t;
            c1b a = this.j.a(i, this.b);
            if (a != null) {
                if (z) {
                    a.r = j2;
                } else {
                    if (!e1a.b(a.r, 9223372034707292159L)) {
                        j = a.r;
                    } else {
                        j = j2;
                    }
                    long d = e1a.d(j, ((e1a) a.q.getValue()).a);
                    int i4 = (int) (j2 & 4294967295L);
                    if ((i4 <= i2 && ((int) (d & 4294967295L)) <= i2) || (i4 >= i3 && ((int) (d & 4294967295L)) >= i3)) {
                        a.b();
                    }
                    j2 = d;
                }
                i09Var = a.n;
            } else {
                i09Var = null;
            }
            long d2 = e1a.d(j2, this.h);
            if (!z && a != null) {
                a.m = d2;
            }
            if (i09Var != null) {
                bneVar.f(cneVar);
                cneVar.o0(e1a.d(d2, cneVar.e), 0.0f, i09Var);
            } else {
                bne.y(bneVar, cneVar, d2);
            }
        }
    }

    public final void b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.p = i4;
        if (this.d == owa.Rtl) {
            i2 = (i3 - i2) - this.c;
        }
        this.t = (i2 << 32) | (i & 4294967295L);
        this.u = i5;
        this.v = i6;
        this.q = -this.e;
        this.r = i4 + this.f;
    }

    @Override // defpackage.p1b
    public final int c() {
        return this.m;
    }

    @Override // defpackage.p1b
    public final void d(int i, int i2, int i3, int i4) {
        b(i, i2, i3, i4, -1, -1);
    }

    @Override // defpackage.p1b
    public final int e() {
        return this.g.size();
    }

    @Override // defpackage.p1b
    public final boolean f() {
        return this.w;
    }

    @Override // defpackage.p1b
    public final long g() {
        return this.k;
    }

    @Override // defpackage.p1b
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.p1b
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.p1b
    public final boolean h() {
        return true;
    }

    @Override // defpackage.p1b
    public final int i() {
        return this.o;
    }

    @Override // defpackage.p1b
    public final Object j(int i) {
        return ((cne) this.g.get(i)).o();
    }

    @Override // defpackage.p1b
    public final void k() {
        this.w = true;
    }

    @Override // defpackage.p1b
    public final long l(int i) {
        return this.t;
    }

    @Override // defpackage.p1b
    public final int m() {
        return this.l;
    }
}
