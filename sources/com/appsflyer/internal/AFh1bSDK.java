package com.appsflyer.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFh1bSDK {
    public final int AFAdRevenueData;
    public final int getCurrencyIso4217Code;
    public final long getMediationNetwork;
    public final String getMonetizationNetwork;

    public AFh1bSDK(String str, int i, int i2, long j) {
        this.getMonetizationNetwork = str;
        this.getCurrencyIso4217Code = i;
        this.AFAdRevenueData = i2;
        this.getMediationNetwork = j;
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && AFh1bSDK.class == obj.getClass()) {
            AFh1bSDK aFh1bSDK = (AFh1bSDK) obj;
            if (this.getCurrencyIso4217Code == aFh1bSDK.getCurrencyIso4217Code && this.AFAdRevenueData == aFh1bSDK.AFAdRevenueData && this.getMediationNetwork == aFh1bSDK.getMediationNetwork && (str = this.getMonetizationNetwork) != null && str.equals(aFh1bSDK.getMonetizationNetwork)) {
                return true;
            }
        }
        return false;
    }

    public final String getMonetizationNetwork() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.getMonetizationNetwork);
            jSONObject.put("min", this.getCurrencyIso4217Code);
            jSONObject.put("expire", this.AFAdRevenueData);
            jSONObject.put("ttl", this.getMediationNetwork);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final int hashCode() {
        int i;
        String str = this.getMonetizationNetwork;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (((((i * 31) + this.getCurrencyIso4217Code) * 31) + this.AFAdRevenueData) * 31) + ((int) this.getMediationNetwork);
    }
}
