package skip.foundation;

import kotlin.Metadata;
import skip.lib.Error;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lskip/foundation/LocalizedError;", "Lskip/lib/Error;", "errorDescription", "", "getErrorDescription", "()Ljava/lang/String;", "failureReason", "getFailureReason", "recoverySuggestion", "getRecoverySuggestion", "helpAnchor", "getHelpAnchor", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LocalizedError extends Error {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static String getErrorDescription(LocalizedError localizedError) {
            return LocalizedError.access$getErrorDescription$jd(localizedError);
        }

        @Deprecated
        public static String getFailureReason(LocalizedError localizedError) {
            return LocalizedError.access$getFailureReason$jd(localizedError);
        }

        @Deprecated
        public static String getHelpAnchor(LocalizedError localizedError) {
            return LocalizedError.access$getHelpAnchor$jd(localizedError);
        }

        @Deprecated
        public static String getLocalizedDescription(LocalizedError localizedError) {
            return LocalizedError.access$getLocalizedDescription$jd(localizedError);
        }

        @Deprecated
        public static String getRecoverySuggestion(LocalizedError localizedError) {
            return LocalizedError.access$getRecoverySuggestion$jd(localizedError);
        }
    }

    static /* synthetic */ String access$getErrorDescription$jd(LocalizedError localizedError) {
        return super.getErrorDescription();
    }

    static /* synthetic */ String access$getFailureReason$jd(LocalizedError localizedError) {
        return super.getFailureReason();
    }

    static /* synthetic */ String access$getHelpAnchor$jd(LocalizedError localizedError) {
        return super.getHelpAnchor();
    }

    static /* synthetic */ String access$getLocalizedDescription$jd(LocalizedError localizedError) {
        return super.getLocalizedDescription();
    }

    static /* synthetic */ String access$getRecoverySuggestion$jd(LocalizedError localizedError) {
        return super.getRecoverySuggestion();
    }

    default String getErrorDescription() {
        return null;
    }

    default String getFailureReason() {
        return null;
    }

    default String getHelpAnchor() {
        return null;
    }

    default String getRecoverySuggestion() {
        return null;
    }
}
