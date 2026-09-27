package defpackage;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class prc extends q55 {
    public /* synthetic */ Object k;
    public int l;
    public final /* synthetic */ gua m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prc(gua guaVar, Continuation continuation) {
        super(continuation);
        this.m = guaVar;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
