package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFi1sSDK extends AFi1pSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1sSDK(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final boolean getCurrencyIso4217Code() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            networkInterfaces.getClass();
            ArrayList<NetworkInterface> list = Collections.list(networkInterfaces);
            list.getClass();
            if (list != null && list.isEmpty()) {
                return false;
            }
            for (NetworkInterface networkInterface : list) {
                if (networkInterface.isUp() && Intrinsics.areEqual(networkInterface.getName(), "tun0")) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            AFLogger.afErrorLog("Failed collecting ivc data", e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final String getRevenue() {
        ConnectivityManager connectivityManager = this.getMonetizationNetwork;
        if (connectivityManager != null) {
            if (AFi1pSDK.v_(connectivityManager.getNetworkInfo(1))) {
                return "WIFI";
            }
            if (AFi1pSDK.v_(connectivityManager.getNetworkInfo(0))) {
                return "MOBILE";
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    return "MOBILE";
                }
                if (type != 1) {
                    return "unknown";
                }
                return "WIFI";
            }
        }
        return "unknown";
    }
}
