package bo.app;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class y4 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ c5 a;

    public y4(c5 c5Var) {
        this.a = c5Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        super.onCapabilitiesChanged(network, networkCapabilities);
        this.a.a(networkCapabilities);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        super.onLost(network);
        Network activeNetwork = this.a.i.getActiveNetwork();
        c5 c5Var = this.a;
        c5Var.a(c5Var.i.getNetworkCapabilities(activeNetwork));
    }
}
