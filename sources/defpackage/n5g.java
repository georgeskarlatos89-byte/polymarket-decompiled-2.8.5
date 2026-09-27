package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class n5g extends l81 {
    public n5g(Continuation continuation) {
        super(continuation);
        if (continuation != null && continuation.getContext() != g.a) {
            dmk.v("Coroutines with restricted suspension must have EmptyCoroutineContext");
            throw null;
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return g.a;
    }
}
