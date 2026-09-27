package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a99 extends f99 {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final z17 q;
    public final jr9 r;
    public final jr9 s;
    public final mr9 t;
    public final long u;
    public final z89 v;
    public final jr9 w;

    public a99(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, z17 z17Var, List list2, List list3, z89 z89Var, Map map, List list4) {
        super(str, list, z3);
        long j6;
        boolean z6;
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = z17Var;
        this.r = jr9.m(list2);
        this.s = jr9.m(list3);
        this.t = mr9.b(map);
        this.w = jr9.m(list4);
        if (!list3.isEmpty()) {
            v89 v89Var = (v89) dwm.g(list3);
            j6 = v89Var.e + v89Var.c;
            this.u = j6;
        } else if (!list2.isEmpty()) {
            x89 x89Var = (x89) dwm.g(list2);
            j6 = x89Var.e + x89Var.c;
            this.u = j6;
        } else {
            this.u = 0L;
            j6 = 0;
        }
        long j7 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            if (j >= 0) {
                j7 = Math.min(j6, j);
            } else {
                j7 = Math.max(0L, j6 + j);
            }
        }
        this.e = j7;
        if (j >= 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f = z6;
        this.v = z89Var;
    }

    @Override // defpackage.f99
    public final Object a(List list) {
        return this;
    }
}
