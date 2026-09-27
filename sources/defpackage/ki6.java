package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ki6 extends g85 {
    public static final /* synthetic */ long d = oo4.a.objectFieldOffset(ki6.class.getDeclaredField("c"));
    public final g85 b;
    public volatile /* synthetic */ int c = 1;

    public ki6(g85 g85Var) {
        this.b = g85Var;
    }

    public final g85 A0() {
        if (oo4.a.getIntVolatile(this, d) == 1) {
            return mv6.c;
        }
        return this.b;
    }

    @Override // defpackage.g85
    public final void m0(CoroutineContext coroutineContext, Runnable runnable) {
        A0().m0(coroutineContext, runnable);
    }

    @Override // defpackage.g85
    public final void p0(CoroutineContext coroutineContext, Runnable runnable) {
        A0().p0(coroutineContext, runnable);
    }

    @Override // defpackage.g85
    public final boolean q0(CoroutineContext coroutineContext) {
        return A0().q0(coroutineContext);
    }

    @Override // defpackage.g85
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.b + ")";
    }

    @Override // defpackage.g85
    public final g85 y0(int i) {
        return A0().y0(i);
    }
}
