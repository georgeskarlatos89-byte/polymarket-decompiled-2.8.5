package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ThreadContextElement;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ezi implements ThreadContextElement {
    public final Object a;
    public final ThreadLocal b;
    public final gzi c;

    public ezi(Object obj, ThreadLocal threadLocal) {
        this.a = obj;
        this.b = threadLocal;
        this.c = new gzi(threadLocal);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public final void X(Object obj) {
        this.b.set(obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        if (Intrinsics.areEqual(this.c, fVar)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final f getKey() {
        return this.c;
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public final Object i0() {
        ThreadLocal threadLocal = this.b;
        Object obj = threadLocal.get();
        threadLocal.set(this.a);
        return obj;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        if (Intrinsics.areEqual(this.c, fVar)) {
            return g.a;
        }
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ')';
    }
}
