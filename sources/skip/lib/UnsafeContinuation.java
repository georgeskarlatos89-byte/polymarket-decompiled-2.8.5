package skip.lib;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import skip.lib.Error;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004B1\b\u0010\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0002\u0010\rJ\u001f\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0002\u0010\u0011R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lskip/lib/UnsafeContinuation;", "T", "E", "Lskip/lib/Error;", "", "success", "Lkotlin/Function1;", "", "failure", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "resume", "returning", "(Ljava/lang/Object;)V", "unusedp", "", "throwing", "(Ljava/lang/Void;Lskip/lib/Error;)V", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UnsafeContinuation<T, E extends Error> {
    private final Function1<E, Unit> failure;
    private final Function1<T, Unit> success;

    /* JADX WARN: Multi-variable type inference failed */
    public UnsafeContinuation(Function1<? super T, Unit> function1, Function1<? super E, Unit> function12) {
        function1.getClass();
        function12.getClass();
        this.success = function1;
        this.failure = function12;
    }

    public static /* synthetic */ void resume$default(UnsafeContinuation unsafeContinuation, Void r1, Error error, int i, Object obj) {
        if ((i & 1) != 0) {
            r1 = null;
        }
        unsafeContinuation.resume(r1, error);
    }

    public final void resume(Void unusedp, E throwing) {
        throwing.getClass();
        this.failure.invoke(throwing);
    }

    public final void resume(T returning) {
        this.success.invoke(returning);
    }
}
