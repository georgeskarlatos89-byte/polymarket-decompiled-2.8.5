package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFi1oSDK implements AFi1rSDK {
    private String getMonetizationNetwork;

    private static String getRevenue(Activity activity) {
        Intent intent;
        String str;
        if (activity != null) {
            intent = activity.getIntent();
        } else {
            intent = null;
        }
        Uri k_ = AFb1rSDK.k_(intent);
        if (k_ != null) {
            str = k_.toString();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (getRevenue(str)) {
            return null;
        }
        return str;
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    public final void getCurrencyIso4217Code(Activity activity) {
        activity.getClass();
        String str = this.getMonetizationNetwork;
        if (str != null && str.length() != 0) {
            return;
        }
        this.getMonetizationNetwork = getRevenue(activity);
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    public final String getMediationNetwork(Activity activity) {
        Uri uri;
        String str = null;
        if (activity != null && activity.getIntent() != null) {
            uri = activity.getReferrer();
        } else {
            uri = null;
        }
        if (uri != null) {
            str = uri.toString();
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    public final String getMonetizationNetwork(Activity activity) {
        String str = this.getMonetizationNetwork;
        this.getMonetizationNetwork = null;
        if (str != null && str.length() != 0) {
            return str;
        }
        return getRevenue(activity);
    }

    private static boolean getRevenue(String str) {
        return kotlin.text.e.u(str, "android-app://", false);
    }
}
