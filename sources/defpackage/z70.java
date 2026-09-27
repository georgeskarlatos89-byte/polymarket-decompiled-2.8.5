package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class z70 {
    public final tfj a;
    public final Object b;
    public final ma0 c;
    public final kvd d;
    public final kvd e;
    public final lrc f;
    public final qjh g;
    public final sa0 h;
    public final sa0 i;
    public final sa0 j;
    public final sa0 k;

    public z70(Object obj, tfj tfjVar, Object obj2) {
        sa0 sa0Var;
        sa0 sa0Var2;
        this.a = tfjVar;
        this.b = obj2;
        ma0 ma0Var = new ma0(tfjVar, obj, null, 60);
        this.c = ma0Var;
        this.d = ikl.c(Boolean.FALSE);
        this.e = ikl.c(obj);
        this.f = new lrc();
        this.g = new qjh(obj2, 3);
        sa0 sa0Var3 = ma0Var.c;
        boolean z = sa0Var3 instanceof oa0;
        if (z) {
            sa0Var = go5.e;
        } else if (sa0Var3 instanceof pa0) {
            sa0Var = go5.f;
        } else if (sa0Var3 instanceof qa0) {
            sa0Var = go5.g;
        } else {
            sa0Var = go5.h;
        }
        this.h = sa0Var;
        if (z) {
            sa0Var2 = go5.a;
        } else if (sa0Var3 instanceof pa0) {
            sa0Var2 = go5.b;
        } else if (sa0Var3 instanceof qa0) {
            sa0Var2 = go5.c;
        } else {
            sa0Var2 = go5.d;
        }
        this.i = sa0Var2;
        this.j = sa0Var;
        this.k = sa0Var2;
    }

    public static Object a(z70 z70Var, Object obj, la0 la0Var, Object obj2, Function1 function1, Continuation continuation, int i) {
        if ((i & 2) != 0) {
            la0Var = z70Var.g;
        }
        la0 la0Var2 = la0Var;
        if ((i & 4) != 0) {
            obj2 = z70Var.a.b.invoke(z70Var.c.c);
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        Object d = z70Var.d();
        tfj tfjVar = z70Var.a;
        return lrc.a(z70Var.f, new v70(z70Var, obj2, new xoi(la0Var2, tfjVar, d, obj, (sa0) tfjVar.a.invoke(obj2)), z70Var.c.d, function1, null), continuation);
    }

    public final Object b(Object obj) {
        sa0 sa0Var = this.h;
        sa0 sa0Var2 = this.j;
        boolean areEqual = Intrinsics.areEqual(sa0Var2, sa0Var);
        sa0 sa0Var3 = this.k;
        if (!areEqual || !Intrinsics.areEqual(sa0Var3, this.i)) {
            tfj tfjVar = this.a;
            sa0 sa0Var4 = (sa0) tfjVar.a.invoke(obj);
            int b = sa0Var4.b();
            boolean z = false;
            for (int i = 0; i < b; i++) {
                if (sa0Var4.a(i) < sa0Var2.a(i) || sa0Var4.a(i) > sa0Var3.a(i)) {
                    sa0Var4.e(lnf.d(sa0Var4.a(i), sa0Var2.a(i), sa0Var3.a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return tfjVar.b.invoke(sa0Var4);
            }
        }
        return obj;
    }

    public final void c() {
        ma0 ma0Var = this.c;
        ma0Var.c.d();
        ma0Var.d = Long.MIN_VALUE;
        this.d.setValue(Boolean.FALSE);
    }

    public final Object d() {
        return this.c.b.getValue();
    }

    public final boolean e() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final Object f(Object obj, Continuation continuation) {
        Object a = lrc.a(this.f, new w70(this, obj, null), continuation);
        if (a == u85.COROUTINE_SUSPENDED) {
            return a;
        }
        return Unit.INSTANCE;
    }

    public final Object g(zei zeiVar) {
        Object a = lrc.a(this.f, new x70(this, null, 0), zeiVar);
        if (a == u85.COROUTINE_SUSPENDED) {
            return a;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ z70(Object obj, tfj tfjVar, Object obj2, int i) {
        this(obj, tfjVar, (i & 4) != 0 ? null : obj2);
    }
}
