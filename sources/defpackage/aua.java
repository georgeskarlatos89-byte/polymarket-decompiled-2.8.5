package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class aua extends q55 {
    public /* synthetic */ Object k;
    public int l;
    public final /* synthetic */ t46 m;
    public Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aua(t46 t46Var, Continuation continuation) {
        super(continuation);
        this.m = t46Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
