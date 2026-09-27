package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class td8 extends q55 {
    public /* synthetic */ Object k;
    public int l;
    public final /* synthetic */ ud8 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td8(ud8 ud8Var, Continuation continuation) {
        super(continuation);
        this.m = ud8Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
