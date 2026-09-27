package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class tta extends q55 {
    public /* synthetic */ Object k;
    public int l;
    public eb8 m;
    public final /* synthetic */ uta n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tta(uta utaVar, Continuation continuation) {
        super(continuation);
        this.n = utaVar;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.n.emit(null, this);
    }
}
