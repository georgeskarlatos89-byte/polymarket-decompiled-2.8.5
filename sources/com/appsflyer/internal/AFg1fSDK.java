package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import io.ably.lib.rest.Auth;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFg1fSDK {
    public static void AFAdRevenueData(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("appsflyerKey")) {
                    jSONObject.put("appsflyerKey", getCurrencyIso4217Code(jSONObject.getString("appsflyerKey")));
                }
                if (jSONObject.has("tcstring")) {
                    jSONObject.put("tcstring", getMediationNetwork("tcstring"));
                }
                if (jSONObject.has("referrer")) {
                    jSONObject.put("referrer", getMediationNetwork("referrer"));
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(jSONObject);
                aFLogger.i(aFg1cSDK, sb.toString());
            } catch (JSONException e) {
                AFLogger.INSTANCE.e(AFg1cSDK.OTHER, "Not able to log the payload", e);
            }
        }
    }

    private static String getCurrencyIso4217Code(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i != 0 && i != str.length() - 1) {
                sb.append(Auth.WILDCARD_CLIENTID);
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String getMediationNetwork(String str) {
        if (str.length() > 20) {
            return str.substring(0, 10).concat("...");
        }
        return str;
    }
}
