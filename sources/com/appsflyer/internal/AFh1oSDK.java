package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFh1oSDK {
    public final String AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final Intent getMonetizationNetwork;

    public AFh1oSDK(Activity activity, AFi1rSDK aFi1rSDK) {
        activity.getClass();
        aFi1rSDK.getClass();
        this.getMonetizationNetwork = activity.getIntent();
        this.getCurrencyIso4217Code = aFi1rSDK.getMediationNetwork(activity);
        this.AFAdRevenueData = aFi1rSDK.getMonetizationNetwork(activity);
    }
}
