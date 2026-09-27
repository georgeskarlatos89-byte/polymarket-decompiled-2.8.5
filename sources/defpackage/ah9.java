package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ah9 {
    public final qkj a = new qkj();
    public jg9 b = jg9.b;
    public final r59 c = new r59(0);
    public Object d = sc7.a;
    public fci e = btl.b();
    public final os4 f = new os4();

    public final void a(zgj zgjVar) {
        os4 os4Var = this.f;
        if (zgjVar != null) {
            os4Var.f(n1g.a, zgjVar);
            return;
        }
        fr0 fr0Var = n1g.a;
        fr0Var.getClass();
        os4Var.d().remove(fr0Var);
    }

    public final void b(ah9 ah9Var) {
        ah9Var.getClass();
        this.e = ah9Var.e;
        this.b = ah9Var.b;
        this.d = ah9Var.d;
        os4 os4Var = ah9Var.f;
        a((zgj) os4Var.e(n1g.a));
        qkj qkjVar = ah9Var.a;
        qkj qkjVar2 = this.a;
        iym.d(qkjVar2, qkjVar);
        List list = qkjVar2.h;
        list.getClass();
        qkjVar2.h = list;
        vql.a(this.c, ah9Var.c);
        for (fr0 fr0Var : CollectionsKt.M0(os4Var.d().keySet())) {
            fr0Var.getClass();
            this.f.f(fr0Var, os4Var.c(fr0Var));
        }
    }
}
