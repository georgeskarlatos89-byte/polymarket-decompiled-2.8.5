package defpackage;

import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class h95 implements fv1 {
    public final fv1 b;
    public final sp1 c = new Object();
    public long d;
    public long e;

    /* JADX WARN: Type inference failed for: r1v1, types: [sp1, java.lang.Object] */
    public h95(fv1 fv1Var) {
        this.b = fv1Var;
    }

    @Override // defpackage.fv1
    public final void a(Throwable th) {
        this.b.a(th);
    }

    @Override // defpackage.fv1
    public final Throwable b() {
        return this.b.b();
    }

    @Override // defpackage.fv1
    public final sp1 c() {
        f();
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.fv1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, q55 q55Var) {
        g95 g95Var;
        Object obj;
        int i2;
        if (q55Var instanceof g95) {
            g95Var = (g95) q55Var;
            int i3 = g95Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g95Var.m = i3 - Integer.MIN_VALUE;
                obj = g95Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i2 = g95Var.m;
                if (i2 == 0) {
                    if (i2 == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    f();
                    if (this.c.c >= i) {
                        return Boolean.TRUE;
                    }
                    g95Var.m = 1;
                    obj = this.b.d(i, g95Var);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    f();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        }
        g95Var = new g95(this, q55Var);
        obj = g95Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i2 = g95Var.m;
        if (i2 == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    @Override // defpackage.fv1
    public final boolean e() {
        if (this.c.j() && this.b.e()) {
            return true;
        }
        return false;
    }

    public final void f() {
        g();
        this.d += this.c.y(this.b.c());
    }

    public final void g() {
        long j = this.e;
        long j2 = this.d;
        long j3 = this.c.c;
        this.e = (j2 - j3) + j;
        this.d = j3;
    }
}
