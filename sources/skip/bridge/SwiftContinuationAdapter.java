package skip.bridge;

import com.socure.docv.capturesdk.api.Keys;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0012B1\b\u0016\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0002\u0010\u0011R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lskip/bridge/SwiftContinuationAdapter;", "R", "Lkotlin/coroutines/Continuation;", "onSuccess", "Lkotlin/Function1;", "", "onError", "", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "resumeWith", Keys.KEY_SOCURE_RESULT, "Lkotlin/Result;", "(Ljava/lang/Object;)V", "Companion", "SkipBridge"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwiftContinuationAdapter<R> implements Continuation<R> {
    private final Function1<Throwable, Unit> onError;
    private final Function1<R, Unit> onSuccess;

    /* JADX WARN: Multi-variable type inference failed */
    public SwiftContinuationAdapter(Function1<? super R, Unit> function1, Function1<? super Throwable, Unit> function12) {
        function1.getClass();
        function12.getClass();
        this.onSuccess = function1;
        this.onError = function12;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return g.a;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        Function1<R, Unit> function1 = this.onSuccess;
        Function1<Throwable, Unit> function12 = this.onError;
        Throwable m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(result);
        if (m883exceptionOrNullimpl == null) {
            function1.invoke(result);
        } else {
            function12.invoke(m883exceptionOrNullimpl);
        }
    }
}
