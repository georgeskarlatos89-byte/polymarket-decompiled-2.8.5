package defpackage;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lxa implements y07, t35 {
    public final v23 a = new v23();
    public w07 b;

    @Override // defpackage.y07
    public final void A(zo1 zo1Var, long j, long j2, long j3, float f, z07 z07Var, int i) {
        this.a.A(zo1Var, j, j2, j3, f, z07Var, i);
    }

    @Override // defpackage.il6
    public final int A0(long j) {
        return this.a.A0(j);
    }

    @Override // defpackage.y07
    public final void E(zo1 zo1Var, long j, long j2, float f, z07 z07Var, int i) {
        this.a.E(zo1Var, j, j2, f, z07Var, i);
    }

    @Override // defpackage.y07
    public final void F0(mxd mxdVar, long j, float f, z07 z07Var, kb4 kb4Var) {
        this.a.F0(mxdVar, j, f, z07Var, kb4Var);
    }

    @Override // defpackage.y07
    public final void G0(long j, long j2, long j3, float f, z07 z07Var, kb4 kb4Var, int i) {
        this.a.G0(j, j2, j3, f, z07Var, kb4Var, i);
    }

    @Override // defpackage.y07
    public final long H0() {
        return this.a.H0();
    }

    @Override // defpackage.il6
    public final long J0(long j) {
        return this.a.J0(j);
    }

    @Override // defpackage.y07
    public final void K0(r0h r0hVar, float f, long j, float f2, z07 z07Var, int i) {
        this.a.K0(r0hVar, f, j, f2, z07Var, i);
    }

    @Override // defpackage.il6
    public final int O(float f) {
        return this.a.O(f);
    }

    @Override // defpackage.il6
    public final float S(long j) {
        return this.a.S(j);
    }

    @Override // defpackage.y07
    public final void U(v20 v20Var, kb4 kb4Var) {
        this.a.U(v20Var, kb4Var);
    }

    public final void a() {
        v23 v23Var = this.a;
        ysk yskVar = v23Var.b;
        t23 t = v23Var.b.t();
        mj6 mj6Var = this.b;
        if (mj6Var != null) {
            jjc jjcVar = (jjc) mj6Var;
            jjc jjcVar2 = jjcVar.a.f;
            if (jjcVar2 != null && (jjcVar2.d & 4) != 0) {
                while (jjcVar2 != null) {
                    int i = jjcVar2.c;
                    if ((i & 2) != 0) {
                        break;
                    } else if ((i & 4) != 0) {
                        break;
                    } else {
                        jjcVar2 = jjcVar2.f;
                    }
                }
            }
            jjcVar2 = null;
            if (jjcVar2 != null) {
                zqc zqcVar = null;
                while (jjcVar2 != null) {
                    if (jjcVar2 instanceof w07) {
                        w07 w07Var = (w07) jjcVar2;
                        i09 i09Var = (i09) yskVar.b;
                        x8d e = nj6.e(w07Var, 4);
                        long h = bsm.h(e.c);
                        LayoutNode layoutNode = e.p;
                        layoutNode.getClass();
                        mxa.a(layoutNode).getSharedDrawScope().b(t, h, e, w07Var, i09Var);
                    } else if ((jjcVar2.c & 4) != 0 && (jjcVar2 instanceof vj6)) {
                        int i2 = 0;
                        for (jjc jjcVar3 = ((vj6) jjcVar2).p; jjcVar3 != null; jjcVar3 = jjcVar3.f) {
                            if ((jjcVar3.c & 4) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    jjcVar2 = jjcVar3;
                                } else {
                                    if (zqcVar == null) {
                                        zqcVar = new zqc(new jjc[16]);
                                    }
                                    if (jjcVar2 != null) {
                                        zqcVar.b(jjcVar2);
                                        jjcVar2 = null;
                                    }
                                    zqcVar.b(jjcVar3);
                                }
                            }
                        }
                        if (i2 == 1) {
                        }
                    }
                    jjcVar2 = nj6.c(zqcVar);
                }
                return;
            }
            x8d e2 = nj6.e(mj6Var, 4);
            if (e2.k1() == jjcVar.a) {
                e2 = e2.s;
                e2.getClass();
            }
            e2.z1(t, (i09) yskVar.b);
            return;
        }
        throw ix2.g("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
    }

    public final void b(t23 t23Var, long j, x8d x8dVar, w07 w07Var, i09 i09Var) {
        w07 w07Var2 = this.b;
        this.b = w07Var;
        owa owaVar = x8dVar.p.A;
        ysk yskVar = this.a.b;
        il6 x = yskVar.x();
        owa y = yskVar.y();
        t23 t = yskVar.t();
        long B = yskVar.B();
        i09 i09Var2 = (i09) yskVar.b;
        yskVar.N(x8dVar);
        yskVar.P(owaVar);
        yskVar.L(t23Var);
        yskVar.Q(j);
        yskVar.b = i09Var;
        t23Var.p();
        try {
            w07Var.D0(this);
            t23Var.k();
            yskVar.N(x);
            yskVar.P(y);
            yskVar.L(t);
            yskVar.Q(B);
            yskVar.b = i09Var2;
            this.b = w07Var2;
        } catch (Throwable th) {
            t23Var.k();
            yskVar.N(x);
            yskVar.P(y);
            yskVar.L(t);
            yskVar.Q(B);
            yskVar.b = i09Var2;
            throw th;
        }
    }

    public final void c(long j, i09 i09Var, Function1 function1) {
        i09Var.f(this, getLayoutDirection(), j, new f70(this, this.b, function1, 6));
    }

    @Override // defpackage.y07
    public final long d() {
        return this.a.d();
    }

    @Override // defpackage.y07
    public final void g(long j, long j2, long j3, float f, int i, e40 e40Var, int i2) {
        this.a.g(j, j2, j3, f, i, e40Var, i2);
    }

    @Override // defpackage.il6
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.y07
    public final owa getLayoutDirection() {
        return this.a.a.b;
    }

    @Override // defpackage.il6
    public final float j0(int i) {
        return this.a.j0(i);
    }

    @Override // defpackage.il6
    public final long k(float f) {
        return this.a.k(f);
    }

    @Override // defpackage.il6
    public final float k0(float f) {
        return f / this.a.getDensity();
    }

    @Override // defpackage.il6
    public final long l(long j) {
        return this.a.l(j);
    }

    @Override // defpackage.y07
    public final void l0(mxd mxdVar, zo1 zo1Var, float f, z07 z07Var, int i) {
        this.a.l0(mxdVar, zo1Var, f, z07Var, i);
    }

    @Override // defpackage.y07
    public final void n(long j, float f, float f2, long j2, long j3, float f3, z07 z07Var) {
        this.a.n(j, f, f2, j2, j3, f3, z07Var);
    }

    @Override // defpackage.y07
    public final void n0(long j, float f, long j2, float f2, z07 z07Var, int i) {
        this.a.n0(j, f, j2, f2, z07Var, i);
    }

    @Override // defpackage.il6
    public final float p(long j) {
        return this.a.p(j);
    }

    @Override // defpackage.y07
    public final void p0(v20 v20Var, long j, long j2, long j3, long j4, float f, kb4 kb4Var, int i) {
        this.a.p0(v20Var, j, j2, j3, j4, f, kb4Var, i);
    }

    @Override // defpackage.il6
    public final float q0() {
        return this.a.q0();
    }

    @Override // defpackage.y07
    public final void s0(zo1 zo1Var, long j, long j2, float f, float f2) {
        this.a.s0(zo1Var, j, j2, f, f2);
    }

    @Override // defpackage.il6
    public final float t0(float f) {
        return this.a.getDensity() * f;
    }

    @Override // defpackage.y07
    public final void u0(long j, long j2, long j3, long j4, z07 z07Var, int i) {
        this.a.u0(j, j2, j3, j4, z07Var, i);
    }

    @Override // defpackage.il6
    public final long v(int i) {
        return this.a.v(i);
    }

    @Override // defpackage.il6
    public final long x(float f) {
        return this.a.x(f);
    }

    @Override // defpackage.y07
    public final ysk y0() {
        return this.a.b;
    }
}
