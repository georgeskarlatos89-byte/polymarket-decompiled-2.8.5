package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class xwh extends q55 {
    public /* synthetic */ Object k;
    public int l;
    public final /* synthetic */ ym6 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwh(ym6 ym6Var, Continuation continuation) {
        super(continuation);
        this.m = ym6Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
