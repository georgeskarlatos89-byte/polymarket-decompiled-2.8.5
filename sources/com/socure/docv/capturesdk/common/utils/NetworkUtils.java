package com.socure.docv.capturesdk.common.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/NetworkUtils;", "", "<init>", "()V", "isNetworkAvailable", "", "context", "Landroid/content/Context;", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkUtils {
    public static final int $stable = 0;
    public static final NetworkUtils INSTANCE = new NetworkUtils();

    private NetworkUtils() {
    }

    public final boolean isNetworkAvailable(Context context) {
        NetworkCapabilities networkCapabilities;
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(3)) {
            return false;
        }
        return true;
    }
}
