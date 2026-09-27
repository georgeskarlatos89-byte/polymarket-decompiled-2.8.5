package skip.foundation;

import kotlin.Metadata;
import skip.lib.Error;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0010¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lskip/foundation/_NSErrorRecoveryAttempter;", "", "<init>", "()V", "attemptRecovery", "", "fromError", "Lskip/lib/Error;", "optionIndex", "", "attemptRecovery$SkipFoundation", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class _NSErrorRecoveryAttempter {
    public boolean attemptRecovery$SkipFoundation(Error fromError, int optionIndex) {
        fromError.getClass();
        return ((RecoverableError) StructKt.sref$default((RecoverableError) fromError, null, 1, null)).attemptRecovery(optionIndex);
    }
}
