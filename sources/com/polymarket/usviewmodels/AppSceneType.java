package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/polymarket/usviewmodels/AppSceneType;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "getId", "()Ljava/lang/String;", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "uid", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AppSceneType {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static ClientAnalyticsInput getAnalytics(AppSceneType appSceneType) {
            return AppSceneType.access$getAnalytics$jd(appSceneType);
        }

        @Deprecated
        public static String uid(AppSceneType appSceneType) {
            return AppSceneType.access$uid$jd(appSceneType);
        }
    }

    static /* synthetic */ ClientAnalyticsInput access$getAnalytics$jd(AppSceneType appSceneType) {
        return super.getAnalytics();
    }

    static /* synthetic */ String access$uid$jd(AppSceneType appSceneType) {
        return super.uid();
    }

    default ClientAnalyticsInput getAnalytics() {
        return AppSceneTypeKt.access$Swift_AppSceneType_analytics(this);
    }

    String getId();

    default String uid() {
        return AppSceneTypeKt.access$Swift_AppSceneType_uid_0(this);
    }
}
