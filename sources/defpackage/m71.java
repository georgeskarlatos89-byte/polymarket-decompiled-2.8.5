package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class m71 extends q55 {
    public /* synthetic */ Object k;
    public int l;
    public final /* synthetic */ n71 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m71(n71 n71Var, Continuation continuation) {
        super(continuation);
        this.m = n71Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
