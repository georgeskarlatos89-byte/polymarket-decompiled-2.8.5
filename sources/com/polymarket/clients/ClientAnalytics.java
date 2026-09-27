package com.polymarket.clients;

import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H&¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/polymarket/clients/ClientAnalytics;", "", "loginUser", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "properties", "Lcom/polymarket/clients/ClientAnalyticsUserProperties;", "logoutUser", "recordInput", MetricTracker.Object.INPUT, "Lcom/polymarket/clients/ClientAnalyticsInput;", "setUserProperty", "key", "value", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ClientAnalytics {
    void loginUser(String id, ClientAnalyticsUserProperties properties);

    void logoutUser();

    void recordInput(ClientAnalyticsInput input);

    void setUserProperty(String key, String value);
}
