package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class b2d {
    public static final NetworkCapabilities a(ConnectivityManager connectivityManager, Network network) {
        connectivityManager.getClass();
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final boolean b(NetworkCapabilities networkCapabilities, int i) {
        networkCapabilities.getClass();
        return networkCapabilities.hasCapability(i);
    }

    public static final void c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.getClass();
        networkCallback.getClass();
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
