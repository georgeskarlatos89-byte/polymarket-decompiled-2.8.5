package okhttp3.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00010\bH\u0000¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"computeIfAbsent", "T", "", "Ljava/util/concurrent/atomic/AtomicReference;", "Lokhttp3/internal/Tags;", "type", "Lkotlin/reflect/KClass;", "compute", "Lkotlin/Function0;", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TagsKt {
    public static final <T> T computeIfAbsent(AtomicReference<Tags> atomicReference, KClass<T> kClass, Function0<? extends T> function0) {
        atomicReference.getClass();
        kClass.getClass();
        function0.getClass();
        T t = null;
        while (true) {
            Tags tags = atomicReference.get();
            T t2 = (T) tags.get(kClass);
            if (t2 != null) {
                return t2;
            }
            if (t == null) {
                t = function0.invoke();
            }
            Tags plus = tags.plus(kClass, t);
            while (!atomicReference.compareAndSet(tags, plus)) {
                if (atomicReference.get() != tags) {
                    break;
                }
            }
            return t;
        }
    }
}
