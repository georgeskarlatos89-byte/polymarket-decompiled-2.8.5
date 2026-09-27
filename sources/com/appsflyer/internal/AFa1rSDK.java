package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFa1rSDK implements AFe1wSDK<AFa1mSDK> {
    @Override // com.appsflyer.internal.AFe1wSDK
    public final /* synthetic */ AFa1mSDK getCurrencyIso4217Code(String str) {
        JSONObject optJSONObject;
        DeepLink deepLink = null;
        if (str != null && str.length() != 0) {
            JSONObject jSONObject = new JSONObject(str);
            boolean optBoolean = jSONObject.optBoolean("found", false);
            boolean optBoolean2 = jSONObject.optBoolean("is_second_ping", true);
            if (optBoolean && (optJSONObject = jSONObject.optJSONObject("click_event")) != null) {
                deepLink = DeepLink.getMediationNetwork(optJSONObject);
                deepLink.getMediationNetwork.put("is_deferred", true);
            }
            return new AFa1mSDK(optBoolean2, deepLink);
        }
        return new AFa1mSDK(false, null, 3, null);
    }
}
