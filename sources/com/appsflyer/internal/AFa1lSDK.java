package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import defpackage.zc7;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFa1lSDK implements AFa1gSDK {
    private final AFc1jSDK getMediationNetwork;

    public AFa1lSDK(AFc1jSDK aFc1jSDK) {
        aFc1jSDK.getClass();
        this.getMediationNetwork = aFc1jSDK;
    }

    @Override // com.appsflyer.internal.AFa1gSDK
    public final Map<String, Object> getMediationNetwork() {
        if (this.getMediationNetwork.getMonetizationNetwork("deeplink_data")) {
            try {
                String revenue = this.getMediationNetwork.getRevenue("deeplink_data", (String) null);
                if (revenue == null) {
                    zc7 zc7Var = zc7.a;
                    zc7Var.getClass();
                    return zc7Var;
                }
                return AFj1eSDK.getMonetizationNetwork(new JSONObject(revenue));
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        zc7 zc7Var2 = zc7.a;
        zc7Var2.getClass();
        return zc7Var2;
    }

    @Override // com.appsflyer.internal.AFa1gSDK
    public final void getMonetizationNetwork(Map<String, ? extends Object> map) {
        map.getClass();
        this.getMediationNetwork.getMediationNetwork("deeplink_data", new JSONObject(map).toString());
    }

    @Override // com.appsflyer.internal.AFa1gSDK
    public final void getRevenue() {
        this.getMediationNetwork.getCurrencyIso4217Code("deeplink_data");
    }
}
