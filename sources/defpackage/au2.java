package defpackage;

import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class au2 extends q55 {
    public IndexedValue k;
    public /* synthetic */ Object l;
    public final /* synthetic */ bu2 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au2(bu2 bu2Var, Continuation continuation) {
        super(continuation);
        this.m = bu2Var;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, this);
    }
}
