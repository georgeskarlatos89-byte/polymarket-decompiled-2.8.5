package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public interface ell extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(rll rllVar);

    void getAppInstanceId(rll rllVar);

    void getCachedAppInstanceId(rll rllVar);

    void getConditionalUserProperties(String str, String str2, rll rllVar);

    void getCurrentScreenClass(rll rllVar);

    void getCurrentScreenName(rll rllVar);

    void getGmpAppId(rll rllVar);

    void getMaxUserProperties(String str, rll rllVar);

    void getSessionId(rll rllVar);

    void getTestFlag(rll rllVar, int i);

    void getUserProperties(String str, String str2, boolean z, rll rllVar);

    void initForTests(Map map);

    void initialize(xj9 xj9Var, unl unlVar, long j);

    void initializeWithElapsedTime(xj9 xj9Var, unl unlVar, long j, long j2);

    void isDataCollectionEnabled(rll rllVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, rll rllVar, long j);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2);

    void logHealthData(int i, String str, xj9 xj9Var, xj9 xj9Var2, xj9 xj9Var3);

    void onActivityCreated(xj9 xj9Var, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(bol bolVar, Bundle bundle, long j);

    void onActivityDestroyed(xj9 xj9Var, long j);

    void onActivityDestroyedByScionActivityInfo(bol bolVar, long j);

    void onActivityPaused(xj9 xj9Var, long j);

    void onActivityPausedByScionActivityInfo(bol bolVar, long j);

    void onActivityResumed(xj9 xj9Var, long j);

    void onActivityResumedByScionActivityInfo(bol bolVar, long j);

    void onActivitySaveInstanceState(xj9 xj9Var, rll rllVar, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(bol bolVar, rll rllVar, long j);

    void onActivityStarted(xj9 xj9Var, long j);

    void onActivityStartedByScionActivityInfo(bol bolVar, long j);

    void onActivityStopped(xj9 xj9Var, long j);

    void onActivityStoppedByScionActivityInfo(bol bolVar, long j);

    void performAction(Bundle bundle, rll rllVar, long j);

    void registerOnMeasurementEventListener(vml vmlVar);

    void resetAnalyticsData(long j);

    void resetAnalyticsDataWithElapsedTime(long j, long j2);

    void retrieveAndUploadBatches(gml gmlVar);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(xj9 xj9Var, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(bol bolVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(vml vmlVar);

    void setInstanceIdProvider(tnl tnlVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, xj9 xj9Var, boolean z, long j);

    void unregisterOnMeasurementEventListener(vml vmlVar);
}
