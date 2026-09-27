package defpackage;

import kotlin.Result;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class l3b extends q55 {
    public /* synthetic */ Object k;
    public final /* synthetic */ n3b l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3b(n3b n3bVar, q55 q55Var) {
        super(q55Var);
        this.l = n3bVar;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        Object c = this.l.c(null, null, this);
        if (c == u85.COROUTINE_SUSPENDED) {
            return c;
        }
        return new Result(c);
    }
}
