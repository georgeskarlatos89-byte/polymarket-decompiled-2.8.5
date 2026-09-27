package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class rc8 extends q55 {
    public /* synthetic */ Object k;
    public int l;
    public final /* synthetic */ nc8 m;
    public eb8 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc8(nc8 nc8Var, Continuation continuation) {
        super(continuation);
        this.m = nc8Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.m.collect(null, this);
    }
}
