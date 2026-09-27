package skip.lib;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lskip/lib/Error;", "", "localizedDescription", "", "getLocalizedDescription", "()Ljava/lang/String;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface Error {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static String getLocalizedDescription(Error error) {
            return Error.access$getLocalizedDescription$jd(error);
        }
    }

    static /* synthetic */ String access$getLocalizedDescription$jd(Error error) {
        return super.getLocalizedDescription();
    }

    default String getLocalizedDescription() {
        return CustomStringConvertibleKt.getDescription(this);
    }
}
