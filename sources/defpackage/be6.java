package defpackage;

import kotlin.Result;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class be6 extends q55 {
    public /* synthetic */ Object k;
    public final /* synthetic */ ce6 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be6(ce6 ce6Var, q55 q55Var) {
        super(q55Var);
        this.l = ce6Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        Object b = this.l.b(null, null, null, null, this);
        if (b == u85.COROUTINE_SUSPENDED) {
            return b;
        }
        return new Result(b);
    }
}
