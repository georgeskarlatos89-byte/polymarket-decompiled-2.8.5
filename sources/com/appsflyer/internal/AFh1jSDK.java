package com.appsflyer.internal;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFh1jSDK extends AFh1sSDK {
    public final AFe1lSDK hashCode;

    public AFh1jSDK(String str, byte[] bArr, String str2, AFe1lSDK aFe1lSDK, Map<String, String> map) {
        super(null, str, Boolean.FALSE);
        this.component4 = str2;
        getMediationNetwork(bArr);
        this.hashCode = aFe1lSDK;
        if (map != null) {
            this.getRevenue.putAll(map);
        }
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    public final AFe1lSDK getRevenue() {
        AFe1lSDK aFe1lSDK = this.hashCode;
        if (aFe1lSDK != null) {
            return aFe1lSDK;
        }
        return AFe1lSDK.CACHED_EVENT;
    }

    @Deprecated
    public AFh1jSDK() {
        this.hashCode = null;
    }
}
