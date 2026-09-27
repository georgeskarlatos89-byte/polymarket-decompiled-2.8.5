package com.appsflyer;

import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.share.LinkGenerator;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener, DeepLinkListener, LinkGenerator.ResponseListener {
    private void getMonetizationNetwork(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "failure");
            jSONObject.put(ApiConstant.KEY_DATA, str2);
            int hashCode = str.hashCode();
            if (hashCode != -1390007222) {
                if (hashCode == 1050716216 && str.equals("onInstallConversionFailure")) {
                    onInstallConversionFailureNative(jSONObject);
                    return;
                }
                return;
            }
            if (str.equals("onAttributionFailure")) {
                onAttributionFailureNative(jSONObject);
            }
        } catch (JSONException e) {
            AFLogger.INSTANCE.e(AFg1cSDK.OTHER, "2dx error", e, false, false);
        }
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    public native void onAppOpenAttributionNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        getMonetizationNetwork("onInstallConversionFailure", str);
    }

    public native void onAttributionFailureNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        getMonetizationNetwork("onAttributionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map<String, Object> map) {
        onInstallConversionDataLoadedNative(map);
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(DeepLinkResult deepLinkResult) {
        onDeepLinkingNative(deepLinkResult);
    }

    public native void onDeepLinkingNative(DeepLinkResult deepLinkResult);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponse(String str) {
        onResponseNative(str);
    }

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponseError(String str) {
        onResponseErrorNative(str);
    }

    public native void onResponseErrorNative(String str);

    public native void onResponseNative(String str);
}
