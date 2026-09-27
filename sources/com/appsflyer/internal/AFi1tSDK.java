package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFi1tSDK extends AFi1pSDK {
    private String getCurrencyIso4217Code;
    private Network getRevenue;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes.dex */
    public static final class AFa1uSDK extends ConnectivityManager.NetworkCallback {
        public AFa1uSDK() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            network.getClass();
            AFi1tSDK.z_(AFi1tSDK.this, network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            network.getClass();
            AFi1tSDK.z_(AFi1tSDK.this, network);
            AFi1tSDK.getMonetizationNetwork(AFi1tSDK.this, "NetworkLost");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1tSDK(Context context) {
        super(context);
        context.getClass();
        this.getCurrencyIso4217Code = "unknown";
        AFa1uSDK aFa1uSDK = new AFa1uSDK();
        try {
            ConnectivityManager connectivityManager = this.getMonetizationNetwork;
            if (connectivityManager != null) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), aFa1uSDK);
            }
        } catch (Throwable th) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DEVICE_DATA, "Error at attempt to register network callback with ConnectivityManager", th, true, false, false, false, 96, null);
        }
    }

    public static final /* synthetic */ void getMonetizationNetwork(AFi1tSDK aFi1tSDK, String str) {
        aFi1tSDK.getCurrencyIso4217Code = str;
    }

    private static boolean y_(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) {
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void z_(AFi1tSDK aFi1tSDK, Network network) {
        aFi1tSDK.getRevenue = network;
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final boolean getCurrencyIso4217Code() {
        Network network = this.getRevenue;
        if (network != null) {
            NetworkCapabilities networkCapabilities = null;
            if (Intrinsics.areEqual(this.getCurrencyIso4217Code, "NetworkLost")) {
                network = null;
            }
            if (network != null) {
                ConnectivityManager connectivityManager = this.getMonetizationNetwork;
                if (connectivityManager != null) {
                    networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                }
                if (networkCapabilities != null) {
                    return y_(networkCapabilities);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final String getRevenue() {
        NetworkCapabilities networkCapabilities;
        Network network = this.getRevenue;
        if (network != null) {
            ConnectivityManager connectivityManager = this.getMonetizationNetwork;
            if (connectivityManager != null) {
                networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            } else {
                networkCapabilities = null;
            }
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(1)) {
                    return "WIFI";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "MOBILE";
                }
            }
        }
        return "unknown";
    }
}
