package kotlin.reflect.jvm.internal;

import defpackage.r5g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"useClassValue", "", "createCache", "Lkotlin/reflect/jvm/internal/CacheByClass;", "V", "", "compute", "Lkotlin/Function1;", "Ljava/lang/Class;", "kotlin-reflection"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CacheByClassKt {
    private static final boolean useClassValue = false;

    static {
        Object m882constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m882constructorimpl instanceof r5g)) {
            m882constructorimpl = Boolean.TRUE;
        }
        Object m882constructorimpl2 = Result.m882constructorimpl(m882constructorimpl);
        Boolean bool = Boolean.FALSE;
        if (m882constructorimpl2 instanceof r5g) {
            m882constructorimpl2 = bool;
        }
        ((Boolean) m882constructorimpl2).getClass();
    }

    public static final <V> CacheByClass<V> createCache(Function1<? super Class<?>, ? extends V> function1) {
        function1.getClass();
        return new ConcurrentHashMapCache(function1);
    }
}
