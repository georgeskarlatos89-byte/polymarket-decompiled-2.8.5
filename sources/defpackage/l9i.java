package defpackage;

import android.content.Context;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class l9i {
    public final a36 a;
    public final bw4 b;

    /* JADX WARN: Type inference failed for: r2v1, types: [sec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, x47] */
    public l9i(Context context, boolean z, CoroutineContext coroutineContext) {
        vrb vrbVar;
        dn9 dn9Var = dn9.a;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        if (z) {
            vrbVar = vrb.c;
        } else {
            vrbVar = vrb.b;
        }
        a36 a36Var = new a36(applicationContext, null, null, vrbVar, 246);
        p6i p6iVar = new p6i(a36Var);
        vc6 vc6Var = new vc6();
        ?? obj = new Object();
        v0h v0hVar = new v0h(context, coroutineContext);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        eq6 eq6Var = new eq6(applicationContext2, v0hVar, obj);
        dm0 dm0Var = new dm0();
        o66 o66Var = new o66(p6iVar, a36Var);
        ?? obj2 = new Object();
        obj2.a = eq6Var;
        obj2.b = dm0Var;
        obj2.c = vc6Var;
        obj2.d = v0hVar;
        obj2.e = o66Var;
        obj2.f = a36Var;
        obj2.g = coroutineContext;
        bw4 bw4Var = new bw4(13, (Object) obj2, p6iVar);
        vc6Var.a();
        context.getApplicationContext().getClass();
        this.a = a36Var;
        this.b = bw4Var;
    }
}
