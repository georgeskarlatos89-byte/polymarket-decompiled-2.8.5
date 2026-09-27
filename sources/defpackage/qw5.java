package defpackage;

import io.sentry.android.core.internal.util.p;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qw5 implements ca0 {
    public long a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public qw5(rw5 rw5Var, tfj tfjVar, Object obj, sa0 sa0Var) {
        g5k g5kVar = new g5k(rw5Var.a);
        this.b = g5kVar;
        this.c = tfjVar;
        this.d = obj;
        sa0 sa0Var2 = (sa0) tfjVar.a.invoke(obj);
        this.f = sa0Var2;
        this.g = udn.a(sa0Var);
        Function1 function1 = tfjVar.b;
        sa0 sa0Var3 = g5kVar.d;
        if (sa0Var3 == null) {
            sa0Var3 = sa0Var2.c();
            g5kVar.d = sa0Var3;
        }
        int b = sa0Var3.b();
        int i = 0;
        while (true) {
            sa0 sa0Var4 = g5kVar.d;
            i88 i88Var = g5kVar.a;
            if (i < b) {
                if (sa0Var4 != null) {
                    sa0Var4.e(i88Var.n(sa0Var2.a(i), sa0Var.a(i)), i);
                    i++;
                } else {
                    Intrinsics.i("targetVector");
                    throw null;
                }
            } else {
                if (sa0Var4 != null) {
                    this.e = function1.invoke(sa0Var4);
                    sa0 sa0Var5 = g5kVar.c;
                    if (sa0Var5 == null) {
                        sa0Var5 = sa0Var2.c();
                        g5kVar.c = sa0Var5;
                    }
                    int b2 = sa0Var5.b();
                    long j = 0;
                    for (int i2 = 0; i2 < b2; i2++) {
                        sa0Var2.getClass();
                        j = Math.max(j, i88Var.m(sa0Var.a(i2)));
                    }
                    this.a = j;
                    sa0 a = udn.a(((g5k) this.b).a(j, (sa0) this.f, sa0Var));
                    this.h = a;
                    int b3 = a.b();
                    for (int i3 = 0; i3 < b3; i3++) {
                        sa0 sa0Var6 = (sa0) this.h;
                        float a2 = sa0Var6.a(i3);
                        float f = ((g5k) this.b).e;
                        sa0Var6.e(lnf.d(a2, -f, f), i3);
                    }
                    return;
                }
                Intrinsics.i("targetVector");
                throw null;
            }
        }
    }

    @Override // defpackage.ca0
    public boolean a() {
        return false;
    }

    @Override // defpackage.ca0
    public sa0 b(long j) {
        if (!c(j)) {
            return ((g5k) this.b).a(j, (sa0) this.f, (sa0) this.g);
        }
        return (sa0) this.h;
    }

    @Override // defpackage.ca0
    public long d() {
        return this.a;
    }

    @Override // defpackage.ca0
    public tfj e() {
        return (tfj) this.c;
    }

    @Override // defpackage.ca0
    public Object f(long j) {
        if (!c(j)) {
            Function1 function1 = ((tfj) this.c).b;
            g5k g5kVar = (g5k) this.b;
            sa0 sa0Var = (sa0) this.f;
            sa0 sa0Var2 = (sa0) this.g;
            sa0 sa0Var3 = g5kVar.b;
            if (sa0Var3 == null) {
                sa0Var3 = sa0Var.c();
                g5kVar.b = sa0Var3;
            }
            int b = sa0Var3.b();
            int i = 0;
            while (true) {
                sa0 sa0Var4 = g5kVar.b;
                if (i < b) {
                    if (sa0Var4 != null) {
                        sa0Var4.e(g5kVar.a.g(sa0Var.a(i), sa0Var2.a(i), j), i);
                        i++;
                    } else {
                        Intrinsics.i("valueVector");
                        throw null;
                    }
                } else {
                    if (sa0Var4 != null) {
                        return function1.invoke(sa0Var4);
                    }
                    Intrinsics.i("valueVector");
                    throw null;
                }
            }
        } else {
            return this.e;
        }
    }

    @Override // defpackage.ca0
    public Object g() {
        return this.e;
    }

    public qw5(p pVar) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = new ConcurrentLinkedDeque();
        this.g = new ConcurrentLinkedDeque();
        this.h = new ConcurrentLinkedDeque();
        this.a = 0L;
        this.b = pVar;
    }
}
