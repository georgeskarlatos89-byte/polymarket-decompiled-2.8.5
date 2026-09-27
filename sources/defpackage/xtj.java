package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class xtj implements CoroutineContext.Element, f {
    public static final xtj a = new Object();

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext.Element get(f fVar) {
        return e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext minusKey(f fVar) {
        return e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final f getKey() {
        return this;
    }
}
