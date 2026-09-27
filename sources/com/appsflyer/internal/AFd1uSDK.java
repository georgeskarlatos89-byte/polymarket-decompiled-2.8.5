package com.appsflyer.internal;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFd1uSDK implements AFd1vSDK {
    private final AFc1aSDK getMonetizationNetwork;

    public AFd1uSDK(AFc1aSDK aFc1aSDK) {
        aFc1aSDK.getClass();
        this.getMonetizationNetwork = aFc1aSDK;
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void getMediationNetwork(byte[] bArr, Map<String, String> map, int i) {
        bArr.getClass();
        if (new AFd1qSDK(bArr, map, 2000).getMediationNetwork()) {
            this.getMonetizationNetwork.getMediationNetwork();
        }
    }
}
