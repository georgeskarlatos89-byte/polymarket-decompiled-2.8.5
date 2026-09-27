package skip.lib;

import defpackage.dmk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.Error;
import skip.lib.Result;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004B'\b\u0016\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0002\u0010\u0012J2\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lskip/lib/CheckedContinuation;", "T", "E", "Lskip/lib/Error;", "", "continuation", "Lskip/lib/UnsafeContinuation;", "function", "", "<init>", "(Lskip/lib/UnsafeContinuation;Ljava/lang/String;)V", "resume", "", "returning", "(Ljava/lang/Object;)V", "unusedp", "", "throwing", "(Ljava/lang/Void;Lskip/lib/Error;)V", "unusedp0", "unusedp1", "with", "Lskip/lib/Result;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckedContinuation<T, E extends Error> {
    private final UnsafeContinuation<T, E> continuation;

    public CheckedContinuation(UnsafeContinuation<T, E> unsafeContinuation, String str) {
        unsafeContinuation.getClass();
        str.getClass();
        this.continuation = unsafeContinuation;
    }

    public static /* synthetic */ void resume$default(CheckedContinuation checkedContinuation, Void r2, Void r3, Result result, int i, Object obj) {
        if ((i & 1) != 0) {
            r2 = null;
        }
        if ((i & 2) != 0) {
            r3 = null;
        }
        checkedContinuation.resume(r2, r3, result);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void resume(Void unusedp0, Void unusedp1, Result<? extends T, ? extends E> with) {
        with.getClass();
        if (with instanceof Result.SuccessCase) {
            this.continuation.resume(((Result.SuccessCase) with).getAssociated0());
        } else if (with instanceof Result.FailureCase) {
            UnsafeContinuation.resume$default(this.continuation, null, ((Result.FailureCase) with).getAssociated0(), 1, null);
        } else {
            dmk.a();
        }
    }

    public /* synthetic */ CheckedContinuation(UnsafeContinuation unsafeContinuation, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(unsafeContinuation, (i & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ void resume$default(CheckedContinuation checkedContinuation, Void r1, Error error, int i, Object obj) {
        if ((i & 1) != 0) {
            r1 = null;
        }
        checkedContinuation.resume(r1, error);
    }

    public final void resume(Void unusedp, E throwing) {
        throwing.getClass();
        UnsafeContinuation.resume$default(this.continuation, null, throwing, 1, null);
    }

    public final void resume(T returning) {
        this.continuation.resume(returning);
    }
}
