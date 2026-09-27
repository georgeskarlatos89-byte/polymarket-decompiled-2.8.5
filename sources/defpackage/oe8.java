package defpackage;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class oe8 extends q55 {
    public /* synthetic */ Object k;
    public int l;
    public eb8 m;
    public final /* synthetic */ pe8 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe8(pe8 pe8Var, Continuation continuation) {
        super(continuation);
        this.n = pe8Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.n.emit(null, this);
    }
}
