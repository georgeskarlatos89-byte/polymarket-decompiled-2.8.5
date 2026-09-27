package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class rta extends q55 {
    public /* synthetic */ Object k;
    public int l;
    public eb8 m;
    public final /* synthetic */ m35 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rta(m35 m35Var, Continuation continuation) {
        super(continuation);
        this.n = m35Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.n.emit(null, this);
    }
}
