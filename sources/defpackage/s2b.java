package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class s2b implements m2b, p1b {
    public final int a;
    public final List b;
    public final boolean c;
    public final in d;
    public final gd1 e;
    public final owa f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final Object l;
    public final Object m;
    public final i1b n;
    public final long o;
    public int p;
    public final int q;
    public final int r;
    public final int s;
    public boolean t;
    public int u = Integer.MIN_VALUE;
    public int v;
    public int w;
    public final int[] x;

    public s2b(int i, List list, boolean z, in inVar, gd1 gd1Var, owa owaVar, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, i1b i1bVar, long j2) {
        int i5;
        int i6;
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = inVar;
        this.e = gd1Var;
        this.f = owaVar;
        this.g = z2;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = j;
        this.l = obj;
        this.m = obj2;
        this.n = i1bVar;
        this.o = j2;
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            cne cneVar = (cne) list.get(i9);
            boolean z3 = this.c;
            if (z3) {
                i5 = cneVar.b;
            } else {
                i5 = cneVar.a;
            }
            i7 += i5;
            if (!z3) {
                i6 = cneVar.b;
            } else {
                i6 = cneVar.a;
            }
            i8 = Math.max(i8, i6);
        }
        this.q = i7;
        int i10 = i7 + this.j;
        this.r = i10 >= 0 ? i10 : 0;
        this.s = i8;
        this.x = new int[this.b.size() * 2];
    }

    public final int a(long j) {
        long j2;
        if (this.c) {
            j2 = j & 4294967295L;
        } else {
            j2 = j >> 32;
        }
        return (int) j2;
    }

    public final void b(bne bneVar, boolean z) {
        int i;
        i09 i09Var;
        int i2;
        long j;
        int i3;
        if (this.u == Integer.MIN_VALUE) {
            nw9.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            cne cneVar = (cne) list.get(i4);
            int i5 = this.v;
            boolean z2 = this.c;
            if (z2) {
                i = cneVar.b;
            } else {
                i = cneVar.a;
            }
            int i6 = i5 - i;
            int i7 = this.w;
            long l = l(i4);
            c1b a = this.n.a(i4, this.l);
            if (a != null) {
                if (z) {
                    a.r = l;
                } else {
                    if (!e1a.b(a.r, 9223372034707292159L)) {
                        l = a.r;
                    }
                    long d = e1a.d(l, ((e1a) a.q.getValue()).a);
                    if ((a(l) <= i6 && a(d) <= i6) || (a(l) >= i7 && a(d) >= i7)) {
                        a.b();
                    }
                    l = d;
                }
                i09Var = a.n;
            } else {
                i09Var = null;
            }
            if (this.g) {
                int i8 = this.u;
                if (z2) {
                    int i9 = (int) (l >> 32);
                    int i10 = i8 - ((int) (l & 4294967295L));
                    if (z2) {
                        i3 = cneVar.b;
                    } else {
                        i3 = cneVar.a;
                    }
                    j = (i9 << 32) | ((i10 - i3) & 4294967295L);
                } else {
                    int i11 = i8 - ((int) (l >> 32));
                    if (z2) {
                        i2 = cneVar.b;
                    } else {
                        i2 = cneVar.a;
                    }
                    j = (((int) (l & 4294967295L)) & 4294967295L) | ((i11 - i2) << 32);
                }
                l = j;
            }
            long d2 = e1a.d(l, this.k);
            if (!z && a != null) {
                a.m = d2;
            }
            if (z2) {
                if (i09Var != null) {
                    bneVar.f(cneVar);
                    cneVar.o0(e1a.d(d2, cneVar.e), 0.0f, i09Var);
                } else {
                    bne.y(bneVar, cneVar, d2);
                }
            } else if (i09Var != null) {
                bne.s(bneVar, cneVar, d2, i09Var);
            } else {
                bne.r(bneVar, cneVar, d2);
            }
        }
    }

    @Override // defpackage.p1b
    public final int c() {
        return 1;
    }

    @Override // defpackage.p1b
    public final void d(int i, int i2, int i3, int i4) {
        n(i, i3, i4);
    }

    @Override // defpackage.p1b
    public final int e() {
        return this.b.size();
    }

    @Override // defpackage.p1b
    public final boolean f() {
        return this.t;
    }

    @Override // defpackage.p1b
    public final long g() {
        return this.o;
    }

    @Override // defpackage.p1b
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.p1b
    public final Object getKey() {
        return this.l;
    }

    @Override // defpackage.p1b
    public final boolean h() {
        return this.c;
    }

    @Override // defpackage.p1b
    public final int i() {
        return this.r;
    }

    @Override // defpackage.p1b
    public final Object j(int i) {
        return ((cne) this.b.get(i)).o();
    }

    @Override // defpackage.p1b
    public final void k() {
        this.t = true;
    }

    @Override // defpackage.p1b
    public final long l(int i) {
        if (i == 0 && this.b.size() == 0) {
            int i2 = this.p;
            if (this.c) {
                return i2 & 4294967295L;
            }
            return i2 << 32;
        }
        int[] iArr = this.x;
        return (iArr[r6 + 1] & 4294967295L) | (iArr[i * 2] << 32);
    }

    @Override // defpackage.p1b
    public final int m() {
        return 0;
    }

    public final void n(int i, int i2, int i3) {
        int i4;
        int i5;
        this.p = i;
        boolean z = this.c;
        if (z) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        this.u = i4;
        List list = this.b;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            cne cneVar = (cne) list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.x;
            if (z) {
                in inVar = this.d;
                if (inVar != null) {
                    iArr[i7] = inVar.a(cneVar.a, i2, this.f);
                    iArr[i7 + 1] = i;
                    i5 = cneVar.b;
                } else {
                    nw9.b("null horizontalAlignment when isVertical == true");
                    f05.c();
                    return;
                }
            } else {
                iArr[i7] = i;
                int i8 = i7 + 1;
                gd1 gd1Var = this.e;
                if (gd1Var != null) {
                    iArr[i8] = gd1Var.a(cneVar.b, i3);
                    i5 = cneVar.a;
                } else {
                    nw9.b("null verticalAlignment when isVertical == false");
                    f05.c();
                    return;
                }
            }
            i += i5;
        }
        this.v = -this.h;
        this.w = this.u + this.i;
    }
}
