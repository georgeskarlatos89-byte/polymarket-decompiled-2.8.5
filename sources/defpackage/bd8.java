package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class bd8 extends q55 {
    public /* synthetic */ Object k;
    public int l;
    public final /* synthetic */ cd8 m;
    public Object n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd8(cd8 cd8Var, Continuation continuation) {
        super(continuation);
        this.m = cd8Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
