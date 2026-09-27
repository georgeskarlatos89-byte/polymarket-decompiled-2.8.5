package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class ld8 extends q55 {
    public /* synthetic */ Object k;
    public int l;
    public final /* synthetic */ id8 m;
    public Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld8(id8 id8Var, Continuation continuation) {
        super(continuation);
        this.m = id8Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
