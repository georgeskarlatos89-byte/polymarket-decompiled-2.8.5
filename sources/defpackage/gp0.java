package defpackage;

import kotlin.Result;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class gp0 extends q55 {
    public /* synthetic */ Object k;
    public final /* synthetic */ ip0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp0(ip0 ip0Var, q55 q55Var) {
        super(q55Var);
        this.l = ip0Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        Object a = this.l.a(null, null, null, null, this);
        if (a == u85.COROUTINE_SUSPENDED) {
            return a;
        }
        return new Result(a);
    }
}
