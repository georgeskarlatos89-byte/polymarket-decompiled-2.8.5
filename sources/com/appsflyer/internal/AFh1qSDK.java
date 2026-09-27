package com.appsflyer.internal;

import com.appsflyer.AFAdRevenueData;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFh1qSDK extends AFh1sSDK {
    public final AFAdRevenueData hashCode;
    public final Map<String, Object> toString;

    public AFh1qSDK(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        super("adrevenue_generic", null, Boolean.TRUE);
        this.hashCode = aFAdRevenueData;
        this.toString = map;
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    public final AFe1lSDK getRevenue() {
        return AFe1lSDK.ADREVENUE;
    }
}
