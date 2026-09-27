package defpackage;

import java.util.List;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class gd9 extends jjc implements pdj, qse, vr4 {
    public ly6 o;
    public p40 p;
    public boolean q;

    public gd9(p40 p40Var, ly6 ly6Var) {
        this.o = ly6Var;
        this.p = p40Var;
    }

    @Override // defpackage.jjc
    public final void V0() {
        g1();
    }

    @Override // defpackage.qse
    public final long b0() {
        if (this.o != null) {
            il6 il6Var = nj6.h(this).z;
            int i = k6j.b;
            return mmm.b(il6Var.O(10.0f), il6Var.O(40.0f), il6Var.O(10.0f), il6Var.O(40.0f));
        }
        return k6j.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public final void c1() {
        p40 p40Var;
        ?? obj = new Object();
        vom.g(this, new Lambda(1));
        gd9 gd9Var = (gd9) obj.a;
        if (gd9Var == null || (p40Var = gd9Var.p) == null) {
            p40Var = this.p;
        }
        d1(p40Var);
    }

    public abstract void d1(lse lseVar);

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.Ref$a, java.lang.Object] */
    public final void e1() {
        ?? obj = new Object();
        obj.a = true;
        vom.i(this, new ed9(obj));
        if (obj.a) {
            c1();
        }
    }

    @Override // defpackage.qse
    public final void f0() {
        g1();
    }

    public abstract boolean f1(int i);

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    public final void g1() {
        if (this.q) {
            this.q = false;
            if (this.n) {
                ?? obj = new Object();
                vom.g(this, new dd9(obj));
                gd9 gd9Var = (gd9) obj.a;
                if (gd9Var != null) {
                    gd9Var.c1();
                } else {
                    d1(null);
                }
            }
        }
    }

    @Override // defpackage.qse
    public final void o(gse gseVar, hse hseVar, long j) {
        if (hseVar == hse.Main) {
            List list = gseVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (f1(((nse) list.get(i)).i)) {
                    int i2 = gseVar.f;
                    if (i2 == 4) {
                        this.q = true;
                        e1();
                        return;
                    } else {
                        if (i2 == 5) {
                            g1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }
}
