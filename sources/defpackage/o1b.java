package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class o1b implements x5c {
    public final k1b a;
    public final qai b;
    public final l1b c;
    public final bpc d;

    public o1b(k1b k1bVar, qai qaiVar) {
        this.a = k1bVar;
        this.b = qaiVar;
        this.c = (l1b) k1bVar.b.invoke();
        d1a.a();
        this.d = d1a.a();
    }

    @Override // defpackage.il6
    public final int A0(long j) {
        return this.b.A0(j);
    }

    @Override // defpackage.x5c
    public final w5c C0(int i, int i2, Map map, Function1 function1, Function1 function12) {
        return this.b.C0(i, i2, map, function1, function12);
    }

    @Override // defpackage.y6a
    public final boolean I() {
        return this.b.I();
    }

    @Override // defpackage.il6
    public final long J0(long j) {
        return this.b.J0(j);
    }

    @Override // defpackage.il6
    public final int O(float f) {
        return this.b.O(f);
    }

    @Override // defpackage.il6
    public final float S(long j) {
        return this.b.S(j);
    }

    public final List a(int i) {
        bpc bpcVar = this.d;
        List list = (List) bpcVar.b(i);
        if (list != null) {
            return list;
        }
        l1b l1bVar = this.c;
        Object e = l1bVar.e(i);
        List i2 = this.b.i(e, this.a.a(i, e, l1bVar.c(i)));
        bpcVar.i(i, i2);
        return i2;
    }

    @Override // defpackage.x5c
    public final w5c d0(int i, int i2, Map map, Function1 function1) {
        return this.b.d0(i, i2, map, function1);
    }

    @Override // defpackage.il6
    public final float getDensity() {
        return this.b.getDensity();
    }

    @Override // defpackage.y6a
    public final owa getLayoutDirection() {
        return this.b.getLayoutDirection();
    }

    @Override // defpackage.il6
    public final float j0(int i) {
        return this.b.j0(i);
    }

    @Override // defpackage.il6
    public final long k(float f) {
        return this.b.k(f);
    }

    @Override // defpackage.il6
    public final float k0(float f) {
        return this.b.k0(f);
    }

    @Override // defpackage.il6
    public final long l(long j) {
        return this.b.l(j);
    }

    @Override // defpackage.il6
    public final float p(long j) {
        return this.b.p(j);
    }

    @Override // defpackage.il6
    public final float q0() {
        return this.b.q0();
    }

    @Override // defpackage.il6
    public final float t0(float f) {
        return this.b.t0(f);
    }

    @Override // defpackage.il6
    public final long v(int i) {
        return this.b.v(i);
    }

    @Override // defpackage.il6
    public final long x(float f) {
        return this.b.x(f);
    }
}
