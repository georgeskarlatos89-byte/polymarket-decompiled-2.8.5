package com.socure.idplus.device.internal.sigmaSilentNetworkAuth.manager;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.util.Log;
import com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model.SNAStatus;
import com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model.StartSNAResponse;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class c extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ f a;
    public final /* synthetic */ StartSNAResponse b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function1 d;

    public c(f fVar, StartSNAResponse startSNAResponse, String str, Function1 function1) {
        this.a = fVar;
        this.b = startSNAResponse;
        this.c = str;
        this.d = function1;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        super.onAvailable(network);
        this.a.c.bindProcessToNetwork(network);
        this.a.a(this.b, network, this.c, this.d, this);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        super.onCapabilitiesChanged(network, networkCapabilities);
        boolean hasCapability = networkCapabilities.hasCapability(16);
        f fVar = this.a;
        if (hasCapability) {
            fVar.a(this.b, network, this.c, this.d, this);
            return;
        }
        fVar.getClass();
        network.getClass();
        try {
            String inetAddress = network.getByName("socure.com").toString();
            inetAddress.getClass();
            inetAddress.getClass();
        } catch (Exception unused) {
            fVar.c.unregisterNetworkCallback(this);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        super.onLost(network);
        int ordinal = com.socure.idplus.device.internal.logger.a.D.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                Log.i("SigmaSNAManager", "onLost: Network lost");
            }
        } else {
            Log.e("SigmaSNAManager", "onLost: Network lost");
        }
        this.a.a(SNAStatus.CELLULAR_NETWORK_NOT_AVAILABLE, this.c, this.b.getSnaRequestId(), this.d);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        super.onUnavailable();
        int ordinal = com.socure.idplus.device.internal.logger.a.D.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                Log.i("SigmaSNAManager", "onUnavailable: Network unavailable");
            }
        } else {
            Log.e("SigmaSNAManager", "onUnavailable: Network unavailable");
        }
        this.a.a(SNAStatus.CELLULAR_NETWORK_NOT_AVAILABLE, this.c, this.b.getSnaRequestId(), this.d);
    }
}
