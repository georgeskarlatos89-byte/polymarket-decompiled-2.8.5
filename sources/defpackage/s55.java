package defpackage;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class s55 extends AtomicBoolean implements OutcomeReceiver {
    private final Continuation<Object> a;

    public s55(m23 m23Var) {
        super(false);
        this.a = m23Var;
    }

    @Override // android.os.OutcomeReceiver
    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            Continuation<Object> continuation = this.a;
            Result.Companion companion = Result.INSTANCE;
            k84.r(th, continuation);
        }
    }

    @Override // android.os.OutcomeReceiver
    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.a.resumeWith(Result.m882constructorimpl(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
