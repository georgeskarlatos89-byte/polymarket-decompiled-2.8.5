package defpackage;

import kotlin.Result;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class q1l extends q55 {
    public /* synthetic */ Object k;
    public int l;

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        Object a = zan.a(null, this);
        if (a == u85.COROUTINE_SUSPENDED) {
            return a;
        }
        return new Result(a);
    }
}
