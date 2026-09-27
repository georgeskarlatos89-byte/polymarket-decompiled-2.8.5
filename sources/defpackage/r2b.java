package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class r2b implements w5c {
    public final s2b a;
    public final int b;
    public final boolean c;
    public final float d;
    public final w5c e;
    public final float f;
    public final boolean g;
    public final t85 h;
    public final il6 i;
    public final long j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;
    public final xmd p;
    public final int q;
    public final int r;

    public r2b(s2b s2bVar, int i, boolean z, float f, w5c w5cVar, float f2, boolean z2, t85 t85Var, il6 il6Var, long j, List list, int i2, int i3, int i4, boolean z3, xmd xmdVar, int i5, int i6) {
        this.a = s2bVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = w5cVar;
        this.f = f2;
        this.g = z2;
        this.h = t85Var;
        this.i = il6Var;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = z3;
        this.p = xmdVar;
        this.q = i5;
        this.r = i6;
    }

    @Override // defpackage.w5c
    public final Map a() {
        return this.e.a();
    }

    @Override // defpackage.w5c
    public final void b() {
        this.e.b();
    }

    @Override // defpackage.w5c
    public final Function1 c() {
        return this.e.c();
    }

    public final r2b d(int i, boolean z) {
        s2b s2bVar;
        boolean z2;
        int i2;
        int i3;
        int i4;
        if (!this.g) {
            List list = this.k;
            if (!list.isEmpty() && (s2bVar = this.a) != null) {
                int i5 = s2bVar.r;
                int i6 = this.b - i;
                if (i6 >= 0 && i6 < i5) {
                    s2b s2bVar2 = (s2b) CollectionsKt.E(list);
                    s2b s2bVar3 = (s2b) CollectionsKt.P(list);
                    if (!s2bVar2.t && !s2bVar3.t) {
                        int i7 = s2bVar2.p;
                        int i8 = this.m;
                        int i9 = this.l;
                        if (i < 0) {
                            if (Math.min((i7 + s2bVar2.r) - i9, (s2bVar3.p + s2bVar3.r) - i8) <= (-i)) {
                                return null;
                            }
                        } else if (Math.min(i9 - i7, i8 - s2bVar3.p) <= i) {
                            return null;
                        }
                        int size = list.size();
                        int i10 = 0;
                        while (i10 < size) {
                            s2b s2bVar4 = (s2b) list.get(i10);
                            boolean z3 = s2bVar4.c;
                            int[] iArr = s2bVar4.x;
                            if (!s2bVar4.t) {
                                s2bVar4.p += i;
                                int length = iArr.length;
                                for (int i11 = 0; i11 < length; i11++) {
                                    int i12 = i11 & 1;
                                    if ((z3 && i12 != 0) || (!z3 && i12 == 0)) {
                                        iArr[i11] = iArr[i11] + i;
                                    }
                                }
                                if (z) {
                                    int size2 = s2bVar4.b.size();
                                    int i13 = 0;
                                    while (i13 < size2) {
                                        c1b a = s2bVar4.n.a(i13, s2bVar4.l);
                                        if (a != null) {
                                            long j = a.l;
                                            if (z3) {
                                                i2 = i10;
                                                i3 = (int) (j >> 32);
                                                i4 = ((int) (j & 4294967295L)) + i;
                                            } else {
                                                i2 = i10;
                                                i3 = ((int) (j >> 32)) + i;
                                                i4 = (int) (j & 4294967295L);
                                            }
                                            a.l = (i4 & 4294967295L) | (i3 << 32);
                                        } else {
                                            i2 = i10;
                                        }
                                        i13++;
                                        i10 = i2;
                                    }
                                }
                            }
                            i10++;
                        }
                        if (!this.c && i <= 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        return new r2b(this.a, i6, z2, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long e() {
        w5c w5cVar = this.e;
        return (w5cVar.getWidth() << 32) | (w5cVar.getHeight() & 4294967295L);
    }

    @Override // defpackage.w5c
    public final int getHeight() {
        return this.e.getHeight();
    }

    @Override // defpackage.w5c
    public final int getWidth() {
        return this.e.getWidth();
    }
}
