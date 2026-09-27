package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class aqk implements t85 {
    public final kw1 a;
    public final CoroutineContext b;

    public aqk(kw1 kw1Var, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.a = kw1Var;
        this.b = coroutineContext;
    }

    @Override // defpackage.t85
    public final CoroutineContext getCoroutineContext() {
        return this.b;
    }
}
