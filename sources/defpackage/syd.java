package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class syd extends q55 {
    public Function1 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ tyd m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syd(tyd tydVar, Continuation continuation) {
        super(continuation);
        this.m = tydVar;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.D(null, this);
    }
}
