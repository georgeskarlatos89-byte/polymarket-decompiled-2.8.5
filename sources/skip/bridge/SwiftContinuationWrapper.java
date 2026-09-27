package skip.bridge;

import defpackage.k84;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u0000 \u000e*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000eB\u0017\b\u0010\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lskip/bridge/SwiftContinuationWrapper;", "R", "", "continuation", "Lkotlin/coroutines/Continuation;", "<init>", "(Lkotlin/coroutines/Continuation;)V", "success", "", "value", "(Ljava/lang/Object;)V", "failure", "error", "", "Companion", "SkipBridge"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwiftContinuationWrapper<R> {
    private final Continuation<R> continuation;

    public SwiftContinuationWrapper(Continuation<? super R> continuation) {
        continuation.getClass();
        this.continuation = (Continuation) StructKt.sref$default(continuation, null, 1, null);
    }

    public final void failure(Throwable error) {
        error.getClass();
        Continuation<R> continuation = this.continuation;
        Result.Companion companion = Result.INSTANCE;
        k84.r(error, continuation);
    }

    public final void success(R value) {
        this.continuation.resumeWith(Result.m882constructorimpl(value));
    }
}
