package defpackage;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class sm6 extends q55 {
    public /* synthetic */ Object k;
    public final /* synthetic */ tm6 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm6(tm6 tm6Var, Continuation continuation) {
        super(continuation);
        this.l = tm6Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.collect(null, this);
    }
}
