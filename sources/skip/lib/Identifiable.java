package skip.lib;

import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0014\u0010\u0003\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lskip/lib/Identifiable;", "ID", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/Object;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface Identifiable<ID> {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <ID> ID getId(Identifiable<ID> identifiable) {
            return (ID) Identifiable.access$getId$jd(identifiable);
        }
    }

    static /* synthetic */ Object access$getId$jd(Identifiable identifiable) {
        return super.getId();
    }

    default ID getId() {
        return (ID) new ObjectIdentifier(this);
    }
}
