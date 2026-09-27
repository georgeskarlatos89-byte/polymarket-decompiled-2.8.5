package defpackage;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class yc8 extends q55 {
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ zc8 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc8(zc8 zc8Var, Continuation continuation) {
        super(continuation);
        this.m = zc8Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
