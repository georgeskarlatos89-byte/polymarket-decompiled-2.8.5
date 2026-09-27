package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class vd8 extends q55 {
    public /* synthetic */ Object k;
    public int l;
    public final /* synthetic */ wd8 m;
    public Object n;
    public eb8 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd8(wd8 wd8Var, Continuation continuation) {
        super(continuation);
        this.m = wd8Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
