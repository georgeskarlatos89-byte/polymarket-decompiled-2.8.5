package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFb1qSDK {
    public final Map<String, Object> getMonetizationNetwork = new HashMap();
    public Map<String, Object> getMediationNetwork = new HashMap();

    public final void AFAdRevenueData(Map<String, Object> map) {
        if (!this.getMonetizationNetwork.isEmpty()) {
            map.put("partner_data", this.getMonetizationNetwork);
        }
        if (!this.getMediationNetwork.isEmpty()) {
            AFa1tSDK.getMonetizationNetwork(map).put("partner_data", this.getMediationNetwork);
            this.getMediationNetwork = new HashMap();
        }
    }
}
