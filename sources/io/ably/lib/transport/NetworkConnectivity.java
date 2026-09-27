package io.ably.lib.transport;

import io.ably.lib.types.ErrorInfo;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class NetworkConnectivity {
    protected Set<NetworkConnectivityListener> listeners = new HashSet();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class DefaultNetworkConnectivity extends NetworkConnectivity {
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class DelegatedNetworkConnectivity extends NetworkConnectivity implements NetworkConnectivityListener {
        @Override // io.ably.lib.transport.NetworkConnectivity.NetworkConnectivityListener
        public void onNetworkAvailable() {
            notifyNetworkAvailable();
        }

        @Override // io.ably.lib.transport.NetworkConnectivity.NetworkConnectivityListener
        public void onNetworkUnavailable(ErrorInfo errorInfo) {
            notifyNetworkUnavailable(errorInfo);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public interface NetworkConnectivityListener {
        void onNetworkAvailable();

        void onNetworkUnavailable(ErrorInfo errorInfo);
    }

    public void addListener(NetworkConnectivityListener networkConnectivityListener) {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.listeners.isEmpty();
            this.listeners.add(networkConnectivityListener);
        }
        if (isEmpty) {
            onNonempty();
        }
    }

    public synchronized boolean isEmpty() {
        return this.listeners.isEmpty();
    }

    public void notifyNetworkAvailable() {
        NetworkConnectivityListener[] networkConnectivityListenerArr;
        synchronized (this) {
            Set<NetworkConnectivityListener> set = this.listeners;
            networkConnectivityListenerArr = (NetworkConnectivityListener[]) set.toArray(new NetworkConnectivityListener[set.size()]);
        }
        for (NetworkConnectivityListener networkConnectivityListener : networkConnectivityListenerArr) {
            networkConnectivityListener.onNetworkAvailable();
        }
    }

    public void notifyNetworkUnavailable(ErrorInfo errorInfo) {
        NetworkConnectivityListener[] networkConnectivityListenerArr;
        synchronized (this) {
            Set<NetworkConnectivityListener> set = this.listeners;
            networkConnectivityListenerArr = (NetworkConnectivityListener[]) set.toArray(new NetworkConnectivityListener[set.size()]);
        }
        for (NetworkConnectivityListener networkConnectivityListener : networkConnectivityListenerArr) {
            networkConnectivityListener.onNetworkUnavailable(errorInfo);
        }
    }

    public void removeListener(NetworkConnectivityListener networkConnectivityListener) {
        boolean isEmpty;
        synchronized (this) {
            this.listeners.remove(networkConnectivityListener);
            isEmpty = this.listeners.isEmpty();
        }
        if (isEmpty) {
            onEmpty();
        }
    }

    public void onEmpty() {
    }

    public void onNonempty() {
    }
}
