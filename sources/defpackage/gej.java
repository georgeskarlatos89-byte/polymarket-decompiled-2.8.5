package defpackage;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gej extends q55 {
    public hej k;
    public int[] l;
    public /* synthetic */ Object m;
    public final /* synthetic */ hej n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gej(hej hejVar, Continuation continuation) {
        super(continuation);
        this.n = hejVar;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
