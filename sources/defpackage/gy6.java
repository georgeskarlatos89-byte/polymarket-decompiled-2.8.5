package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class gy6 implements CoroutineContext {
    public final /* synthetic */ CoroutineContext a;
    public final Throwable b;

    public gy6(CoroutineContext coroutineContext, Throwable th) {
        this.a = coroutineContext;
        this.b = th;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return this.a.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        return this.a.get(fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        return this.a.minusKey(fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.a.plus(coroutineContext);
    }
}
