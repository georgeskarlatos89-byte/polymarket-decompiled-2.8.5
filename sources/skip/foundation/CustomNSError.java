package skip.foundation;

import kotlin.Metadata;
import skip.lib.Dictionary;
import skip.lib.DictionaryKt;
import skip.lib.Error;
import skip.lib.Tuple2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lskip/foundation/CustomNSError;", "Lskip/lib/Error;", "errorCode", "", "getErrorCode", "()I", "errorUserInfo", "Lskip/lib/Dictionary;", "", "", "getErrorUserInfo", "()Lskip/lib/Dictionary;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CustomNSError extends Error {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static int getErrorCode(CustomNSError customNSError) {
            return CustomNSError.access$getErrorCode$jd(customNSError);
        }

        @Deprecated
        public static Dictionary<String, Object> getErrorUserInfo(CustomNSError customNSError) {
            return CustomNSError.access$getErrorUserInfo$jd(customNSError);
        }

        @Deprecated
        public static String getLocalizedDescription(CustomNSError customNSError) {
            return CustomNSError.access$getLocalizedDescription$jd(customNSError);
        }
    }

    static /* synthetic */ int access$getErrorCode$jd(CustomNSError customNSError) {
        return super.getErrorCode();
    }

    static /* synthetic */ Dictionary access$getErrorUserInfo$jd(CustomNSError customNSError) {
        return super.getErrorUserInfo();
    }

    static /* synthetic */ String access$getLocalizedDescription$jd(CustomNSError customNSError) {
        return super.getLocalizedDescription();
    }

    default int getErrorCode() {
        return 0;
    }

    default Dictionary<String, Object> getErrorUserInfo() {
        return DictionaryKt.dictionaryOf(new Tuple2[0]);
    }
}
