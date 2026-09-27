package com.appsflyer.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFh1mSDK extends AFh1sSDK {
    @Override // com.appsflyer.internal.AFh1sSDK
    public final boolean component3() {
        return true;
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    public final AFe1lSDK getRevenue() {
        if (this.component1 == 1) {
            return AFe1lSDK.CONVERSION;
        }
        return AFe1lSDK.LAUNCH;
    }
}
