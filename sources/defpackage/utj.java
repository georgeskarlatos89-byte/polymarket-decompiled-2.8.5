package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class utj extends g85 {
    public static final utj b = new g85();

    @Override // defpackage.g85
    public final void m0(CoroutineContext coroutineContext, Runnable runnable) {
        irk irkVar = (irk) coroutineContext.get(irk.b);
        if (irkVar != null) {
            irkVar.a = true;
        } else {
            py2.f("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.g85
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // defpackage.g85
    public final g85 y0(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }
}
