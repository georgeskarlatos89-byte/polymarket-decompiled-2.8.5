package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFh1cSDK {
    public final String AFAdRevenueData;
    public final AFh1gSDK getCurrencyIso4217Code;
    public final AFh1aSDK getMediationNetwork;
    private final boolean getMonetizationNetwork;
    public final String getRevenue;

    public AFh1cSDK(String str) {
        AFh1gSDK aFh1gSDK;
        AFh1aSDK aFh1aSDK;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("ver");
                this.AFAdRevenueData = string;
                this.getMonetizationNetwork = jSONObject.optBoolean("test_mode");
                this.getRevenue = str;
                if (string.startsWith("default")) {
                    aFh1gSDK = AFh1gSDK.DEFAULT;
                } else {
                    aFh1gSDK = AFh1gSDK.CUSTOM;
                }
                this.getCurrencyIso4217Code = aFh1gSDK;
                JSONObject optJSONObject = jSONObject.optJSONObject("features");
                if (optJSONObject != null) {
                    aFh1aSDK = new AFh1aSDK(optJSONObject);
                } else {
                    aFh1aSDK = null;
                }
                this.getMediationNetwork = aFh1aSDK;
                return;
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e);
                throw new JSONException("Failed to parse remote configuration JSON");
            }
        }
        throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFh1cSDK.class != obj.getClass()) {
            return false;
        }
        AFh1cSDK aFh1cSDK = (AFh1cSDK) obj;
        if (this.getMonetizationNetwork != aFh1cSDK.getMonetizationNetwork || !this.AFAdRevenueData.equals(aFh1cSDK.AFAdRevenueData)) {
            return false;
        }
        return this.getRevenue.equals(aFh1cSDK.getRevenue);
    }

    public final int hashCode() {
        int hashCode = this.getRevenue.hashCode() + ((this.AFAdRevenueData.hashCode() + ((this.getMonetizationNetwork ? 1 : 0) * 31)) * 31);
        AFh1aSDK aFh1aSDK = this.getMediationNetwork;
        if (aFh1aSDK != null) {
            return aFh1aSDK.hashCode() + (hashCode * 31);
        }
        return hashCode;
    }
}
