package skip.foundation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import skip.lib.Array;
import skip.lib.Error;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\fH\u0016J\u0010\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lskip/foundation/RecoverableError;", "Lskip/lib/Error;", "recoveryOptions", "Lskip/lib/Array;", "", "getRecoveryOptions", "()Lskip/lib/Array;", "attemptRecovery", "", "optionIndex", "", "resultHandler", "Lkotlin/Function1;", "", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RecoverableError extends Error {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void attemptRecovery(RecoverableError recoverableError, int i, Function1<? super Boolean, Unit> function1) {
            function1.getClass();
            RecoverableError.access$attemptRecovery$jd(recoverableError, i, function1);
        }

        @Deprecated
        public static String getLocalizedDescription(RecoverableError recoverableError) {
            return RecoverableError.access$getLocalizedDescription$jd(recoverableError);
        }
    }

    static /* synthetic */ void access$attemptRecovery$jd(RecoverableError recoverableError, int i, Function1 function1) {
        super.attemptRecovery(i, function1);
    }

    static /* synthetic */ String access$getLocalizedDescription$jd(RecoverableError recoverableError) {
        return super.getLocalizedDescription();
    }

    default void attemptRecovery(int optionIndex, Function1<? super Boolean, Unit> resultHandler) {
        resultHandler.getClass();
        resultHandler.invoke(Boolean.valueOf(attemptRecovery(optionIndex)));
    }

    boolean attemptRecovery(int optionIndex);

    Array<String> getRecoveryOptions();
}
