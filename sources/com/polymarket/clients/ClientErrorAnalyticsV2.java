package com.polymarket.clients;

import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H&JN\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000fH&J,\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000fH&J4\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000fH&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0014H&¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lcom/polymarket/clients/ClientErrorAnalyticsV2;", "", "loginUser", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "logoutUser", "captureErrorMessage", "error", "captureErrorEvent", "issueTitle", "level", "fingerprint", "", "tags", "", "extras", "incrementCounter", "key", "value", "", "attributes", "recordDistribution", "unit", "recordSocketPing", "socketPath", "rttMs", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ClientErrorAnalyticsV2 {
    void captureErrorEvent(String issueTitle, String level, List<String> fingerprint, Map<String, String> tags, Map<String, String> extras);

    void captureErrorMessage(String error);

    void incrementCounter(String key, double value, Map<String, String> attributes);

    void loginUser(String id);

    void logoutUser();

    void recordDistribution(String key, double value, String unit, Map<String, String> attributes);

    void recordSocketPing(String socketPath, double rttMs);
}
