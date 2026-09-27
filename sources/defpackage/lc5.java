package defpackage;

import kotlin.Result;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lc5 extends q55 {
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ mc5 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc5(mc5 mc5Var, q55 q55Var) {
        super(q55Var);
        this.m = mc5Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        Object a = this.m.a(null, this);
        if (a == u85.COROUTINE_SUSPENDED) {
            return a;
        }
        return new Result(a);
    }
}
