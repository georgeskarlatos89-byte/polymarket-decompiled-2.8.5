package defpackage;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sq extends q55 {
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ vq m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq(vq vqVar, Continuation continuation) {
        super(continuation);
        this.m = vqVar;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
