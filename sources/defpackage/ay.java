package defpackage;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ay extends q55 {
    public /* synthetic */ Object k;
    public final /* synthetic */ cy l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(cy cyVar, Continuation continuation) {
        super(continuation);
        this.l = cyVar;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.requestAuthorization(this);
    }
}
