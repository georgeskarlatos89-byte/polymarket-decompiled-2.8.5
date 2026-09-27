package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xoi implements ca0 {
    public final c5k a;
    public final tfj b;
    public Object c;
    public Object d;
    public sa0 e;
    public sa0 f;
    public final sa0 g;
    public long h;
    public sa0 i;

    public xoi(la0 la0Var, tfj tfjVar, Object obj, Object obj2, sa0 sa0Var) {
        sa0 c;
        this.a = la0Var.a(tfjVar);
        this.b = tfjVar;
        this.c = obj2;
        this.d = obj;
        this.e = (sa0) tfjVar.a.invoke(obj);
        Function1 function1 = tfjVar.a;
        this.f = (sa0) function1.invoke(obj2);
        if (sa0Var != null) {
            c = udn.a(sa0Var);
        } else {
            c = ((sa0) function1.invoke(obj)).c();
        }
        this.g = c;
        this.h = -1L;
    }

    @Override // defpackage.ca0
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.ca0
    public final sa0 b(long j) {
        if (!c(j)) {
            return this.a.r(j, this.e, this.f, this.g);
        }
        sa0 sa0Var = this.i;
        if (sa0Var == null) {
            sa0 l = this.a.l(this.e, this.f, this.g);
            this.i = l;
            return l;
        }
        return sa0Var;
    }

    @Override // defpackage.ca0
    public final long d() {
        long j = this.h;
        if (j < 0) {
            long d = this.a.d(this.e, this.f, this.g);
            this.h = d;
            return d;
        }
        return j;
    }

    @Override // defpackage.ca0
    public final tfj e() {
        return this.b;
    }

    @Override // defpackage.ca0
    public final Object f(long j) {
        if (!c(j)) {
            sa0 u = this.a.u(j, this.e, this.f, this.g);
            int b = u.b();
            for (int i = 0; i < b; i++) {
                if (Float.isNaN(u.a(i))) {
                    h1f.b("AnimationVector cannot contain a NaN. " + u + ". Animation: " + this + ", playTimeNanos: " + j);
                }
            }
            return this.b.b.invoke(u);
        }
        return this.c;
    }

    @Override // defpackage.ca0
    public final Object g() {
        return this.c;
    }

    public final void h(Object obj) {
        if (!Intrinsics.areEqual(obj, this.d)) {
            this.d = obj;
            this.e = (sa0) this.b.a.invoke(obj);
            this.i = null;
            this.h = -1L;
        }
    }

    public final void i(Object obj) {
        if (!Intrinsics.areEqual(this.c, obj)) {
            this.c = obj;
            this.f = (sa0) this.b.a.invoke(obj);
            this.i = null;
            this.h = -1L;
        }
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (d() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
