package defpackage;

import java.io.IOException;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class vnf implements fv1 {
    public final az9 b;
    public final CoroutineContext c;
    public u74 d;
    public final sp1 e = new Object();
    public final lca f;
    public final CoroutineContext g;

    /* JADX WARN: Type inference failed for: r2v1, types: [sp1, java.lang.Object] */
    public vnf(az9 az9Var, CoroutineContext coroutineContext) {
        this.b = az9Var;
        this.c = coroutineContext;
        lca lcaVar = new lca((jca) coroutineContext.get(jca.C0));
        this.f = lcaVar;
        this.g = coroutineContext.plus(lcaVar).plus(new n85("RawSourceChannel"));
    }

    @Override // defpackage.fv1
    public final void a(Throwable th) {
        if (this.d != null) {
            return;
        }
        String message = th.getMessage();
        String str = "Channel was cancelled";
        if (message == null) {
            message = "Channel was cancelled";
        }
        this.f.e(mok.c(message, th));
        this.b.close();
        String message2 = th.getMessage();
        if (message2 != null) {
            str = message2;
        }
        this.d = new u74(new IOException(str, th));
    }

    @Override // defpackage.fv1
    public final Throwable b() {
        u74 u74Var = this.d;
        if (u74Var != null) {
            return u74Var.a(t74.f);
        }
        return null;
    }

    @Override // defpackage.fv1
    public final sp1 c() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.fv1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, q55 q55Var) {
        unf unfVar;
        int i2;
        if (q55Var instanceof unf) {
            unfVar = (unf) q55Var;
            int i3 = unfVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                unfVar.n = i3 - Integer.MIN_VALUE;
                Object obj = unfVar.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i2 = unfVar.n;
                boolean z = true;
                if (i2 == 0) {
                    if (i2 == 1) {
                        i = unfVar.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    if (this.d != null) {
                        return Boolean.TRUE;
                    }
                    x2a x2aVar = new x2a(this, i, null, 18);
                    unfVar.k = i;
                    unfVar.n = 1;
                    if (coc.d(this.g, x2aVar, unfVar) == u85Var) {
                        return u85Var;
                    }
                }
                if (this.e.c < i) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        unfVar = new unf(this, q55Var);
        Object obj2 = unfVar.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i2 = unfVar.n;
        boolean z2 = true;
        if (i2 == 0) {
        }
        if (this.e.c < i) {
        }
        return Boolean.valueOf(z2);
    }

    @Override // defpackage.fv1
    public final boolean e() {
        if (this.d != null && this.e.j()) {
            return true;
        }
        return false;
    }
}
