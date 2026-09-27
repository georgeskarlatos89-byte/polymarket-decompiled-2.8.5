package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class a implements CoroutineContext.Element {
    private final f key;

    public a(f fVar) {
        fVar.getClass();
        this.key = fVar;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        function2.getClass();
        return function2.invoke(r, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public /* bridge */ <E extends CoroutineContext.Element> E get(f fVar) {
        return (E) e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public f getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public /* bridge */ CoroutineContext minusKey(f fVar) {
        return e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public /* bridge */ CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }
}
