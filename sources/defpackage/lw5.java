package defpackage;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class lw5 extends q55 {
    public /* synthetic */ Object k;
    public final /* synthetic */ mw5 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw5(mw5 mw5Var, Continuation continuation) {
        super(continuation);
        this.l = mw5Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(this);
    }
}
