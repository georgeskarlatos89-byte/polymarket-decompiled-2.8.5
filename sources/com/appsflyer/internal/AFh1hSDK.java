package com.appsflyer.internal;

import com.appsflyer.AFInAppEventType;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFh1hSDK extends AFh1iSDK {
    public AFh1hSDK() {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE);
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    public final AFe1lSDK getRevenue() {
        return AFe1lSDK.PURCHASE_VALIDATE;
    }
}
