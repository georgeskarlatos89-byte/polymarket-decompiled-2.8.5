package com.appsflyer.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFf1aSDK extends AFh1sSDK {
    public AFf1aSDK() {
        super("Register", null, Boolean.FALSE);
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    public final AFe1lSDK getRevenue() {
        return AFe1lSDK.REGISTER;
    }
}
