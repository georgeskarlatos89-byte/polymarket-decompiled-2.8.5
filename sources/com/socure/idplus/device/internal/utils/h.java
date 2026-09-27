package com.socure.idplus.device.internal.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.MobileNetwork;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class h {
    public static ArrayList a(Context context) {
        context.getClass();
        ArrayList arrayList = new ArrayList();
        Object systemService = context.getApplicationContext().getSystemService(AttributeType.PHONE);
        systemService.getClass();
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        try {
            if (i.a() >= 30) {
                MobileNetwork a = a(context, 0, telephonyManager);
                if (a != null) {
                    arrayList.add(a);
                }
                MobileNetwork a2 = a(context, 1, telephonyManager);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            } else {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                networkOperatorName.getClass();
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                networkCountryIso.getClass();
                arrayList.add(new MobileNetwork(networkOperatorName, networkCountryIso));
            }
        } catch (Exception e) {
            com.socure.idplus.device.internal.logger.b.a("NetworkUtils", "Exception when reading mobile network state: " + e.getMessage());
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static MobileNetwork a(Context context, int i, TelephonyManager telephonyManager) {
        if (telephonyManager.getSimState(i) != 5 || i >= telephonyManager.getActiveModemCount()) {
            return null;
        }
        if (!(Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().hasSystemFeature("android.hardware.telephony.radio.access") : true)) {
            return null;
        }
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        networkOperatorName.getClass();
        String networkCountryIso = telephonyManager.getNetworkCountryIso(i);
        networkCountryIso.getClass();
        return new MobileNetwork(networkOperatorName, networkCountryIso);
    }

    public static boolean a(Context context, ConnectivityManager connectivityManager) {
        context.getClass();
        connectivityManager.getClass();
        Object systemService = context.getApplicationContext().getSystemService(AttributeType.PHONE);
        systemService.getClass();
        return ((TelephonyManager) systemService).isDataEnabled();
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        connectivityManager.getClass();
        Network[] allNetworks = connectivityManager.getAllNetworks();
        allNetworks.getClass();
        for (Network network : allNetworks) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                return true;
            }
        }
        return false;
    }
}
