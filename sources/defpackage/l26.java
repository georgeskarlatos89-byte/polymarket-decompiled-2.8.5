package defpackage;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class l26 extends q55 {
    public i47 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ m26 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l26(m26 m26Var, Continuation continuation) {
        super(continuation);
        this.m = m26Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, null, this);
    }
}
