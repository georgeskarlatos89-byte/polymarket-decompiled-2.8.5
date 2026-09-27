package skip.lib;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lskip/lib/InOut;", "T", "", "get", "Lkotlin/Function0;", "set", "Lkotlin/Function1;", "", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getGet", "()Lkotlin/jvm/functions/Function0;", "getSet", "()Lkotlin/jvm/functions/Function1;", "newValue", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InOut<T> {
    private final Function0<T> get;
    private final Function1<T, Unit> set;

    /* JADX WARN: Multi-variable type inference failed */
    public InOut(Function0<? extends T> function0, Function1<? super T, Unit> function1) {
        function0.getClass();
        function1.getClass();
        this.get = function0;
        this.set = function1;
    }

    public final Function0<T> getGet() {
        return this.get;
    }

    public final Function1<T, Unit> getSet() {
        return this.set;
    }

    public final T getValue() {
        return this.get.invoke();
    }

    public final void setValue(T t) {
        this.set.invoke(t);
    }
}
