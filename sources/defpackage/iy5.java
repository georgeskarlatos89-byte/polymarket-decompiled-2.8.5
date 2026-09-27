package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class iy5 extends hy5 implements Continuation {
    public jga a;
    public Unit b;
    public Continuation c;
    public Object d;

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return g.a;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.c = null;
        this.d = obj;
    }
}
