package skip.lib;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u0004\u0018\u0001H\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0004¢\u0006\u0002\u0010\u0005\u001a5\u0010\u0006\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u0004\u0018\u0001H\u00022\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"optionalmap", "U", "T", "transform", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "optionalflatMap", "SkipLib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OptionalKt {
    public static final <T, U> U optionalflatMap(T t, Function1<? super T, ? extends U> function1) {
        function1.getClass();
        if (t == null) {
            return null;
        }
        return function1.invoke(t);
    }

    public static final <T, U> U optionalmap(T t, Function1<? super T, ? extends U> function1) {
        function1.getClass();
        if (t == null) {
            return null;
        }
        return function1.invoke(t);
    }
}
