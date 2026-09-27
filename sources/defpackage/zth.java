package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zth implements Continuation, v85 {
    public final dg3 a;
    public final CoroutineContext b;

    public zth(dg3 dg3Var, CoroutineContext coroutineContext) {
        this.a = dg3Var;
        this.b = coroutineContext;
    }

    @Override // defpackage.v85
    public final v85 getCallerFrame() {
        return this.a;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.b;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
