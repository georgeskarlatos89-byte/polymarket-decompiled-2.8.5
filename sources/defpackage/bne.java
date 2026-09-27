package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class bne implements il6 {
    public boolean a;

    public static /* synthetic */ void j(int i, int i2, bne bneVar, cne cneVar) {
        bneVar.h(cneVar, i, i2, 0.0f);
    }

    public static void m(bne bneVar, cne cneVar, long j) {
        bneVar.f(cneVar);
        cneVar.v0(e1a.d(j, cneVar.e), 0.0f, null);
    }

    public static void o(int i, int i2, bne bneVar, cne cneVar) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (bneVar.c() != owa.Ltr && bneVar.e() != 0) {
            int e = (bneVar.e() - cneVar.a) - ((int) (j >> 32));
            bneVar.f(cneVar);
            cneVar.v0(e1a.d((e << 32) | (((int) (j & 4294967295L)) & 4294967295L), cneVar.e), 0.0f, null);
        } else {
            bneVar.f(cneVar);
            cneVar.v0(e1a.d(j, cneVar.e), 0.0f, null);
        }
    }

    public static void q(bne bneVar, cne cneVar, int i, int i2, Function1 function1, int i3) {
        if ((i3 & 8) != 0) {
            function1 = dne.a;
        }
        long j = (i << 32) | (i2 & 4294967295L);
        if (bneVar.c() != owa.Ltr && bneVar.e() != 0) {
            bneVar.f(cneVar);
            cneVar.v0(e1a.d((((bneVar.e() - cneVar.a) - ((int) (j >> 32))) << 32) | (((int) (j & 4294967295L)) & 4294967295L), cneVar.e), 0.0f, function1);
            return;
        }
        bneVar.f(cneVar);
        cneVar.v0(e1a.d(j, cneVar.e), 0.0f, function1);
    }

    public static void r(bne bneVar, cne cneVar, long j) {
        iub iubVar = dne.a;
        if (bneVar.c() != owa.Ltr && bneVar.e() != 0) {
            int e = (bneVar.e() - cneVar.a) - ((int) (j >> 32));
            bneVar.f(cneVar);
            cneVar.v0(e1a.d((((int) (j & 4294967295L)) & 4294967295L) | (e << 32), cneVar.e), 0.0f, iubVar);
            return;
        }
        bneVar.f(cneVar);
        cneVar.v0(e1a.d(j, cneVar.e), 0.0f, iubVar);
    }

    public static void s(bne bneVar, cne cneVar, long j, i09 i09Var) {
        if (bneVar.c() != owa.Ltr && bneVar.e() != 0) {
            int e = (bneVar.e() - cneVar.a) - ((int) (j >> 32));
            bneVar.f(cneVar);
            cneVar.o0(e1a.d((((int) (j & 4294967295L)) & 4294967295L) | (e << 32), cneVar.e), 0.0f, i09Var);
            return;
        }
        bneVar.f(cneVar);
        cneVar.o0(e1a.d(j, cneVar.e), 0.0f, i09Var);
    }

    public static void u(bne bneVar, cne cneVar, int i, int i2, Function1 function1, int i3) {
        if ((i3 & 8) != 0) {
            function1 = dne.a;
        }
        bneVar.f(cneVar);
        cneVar.v0(e1a.d((i2 & 4294967295L) | (i << 32), cneVar.e), 0.0f, function1);
    }

    public static void y(bne bneVar, cne cneVar, long j) {
        iub iubVar = dne.a;
        bneVar.f(cneVar);
        cneVar.v0(e1a.d(j, cneVar.e), 0.0f, iubVar);
    }

    public abstract nwa b();

    public abstract owa c();

    public abstract int e();

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(cne cneVar) {
        if (cneVar instanceof tlc) {
            ((tlc) cneVar).q(this.a);
        }
    }

    public final void h(cne cneVar, int i, int i2, float f) {
        f(cneVar);
        cneVar.v0(e1a.d((i2 & 4294967295L) | (i << 32), cneVar.e), f, null);
    }

    public final void z(Function1 function1) {
        this.a = true;
        function1.invoke(this);
        this.a = false;
    }

    public float a(vc9 vc9Var, float f) {
        return f;
    }
}
