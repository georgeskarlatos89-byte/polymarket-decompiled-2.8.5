package io.intercom.android.sdk.utilities.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
class ConnectivityBroadcastReceiver extends BroadcastReceiver {
    private final ConnectivityUpdateListener connectivityUpdateListener;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface ConnectivityUpdateListener {
        void onUpdate(NetworkState networkState);
    }

    public ConnectivityBroadcastReceiver(ConnectivityUpdateListener connectivityUpdateListener) {
        this.connectivityUpdateListener = connectivityUpdateListener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        NetworkState networkState;
        if (intent != null && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (intent.getBooleanExtra("noConnectivity", false)) {
                networkState = NetworkState.NOT_CONNECTED;
            } else {
                networkState = NetworkState.CONNECTED;
            }
            this.connectivityUpdateListener.onUpdate(networkState);
        }
    }
}
