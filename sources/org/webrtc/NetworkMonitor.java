package org.webrtc;

import android.content.Context;
import android.os.Build;
import defpackage.dmk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.NetworkChangeDetector;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class NetworkMonitor {
    private static final String TAG = "NetworkMonitor";
    private volatile NetworkChangeDetector.ConnectionType currentConnectionType;
    private final ArrayList<Long> nativeNetworkObservers;
    private NetworkChangeDetector networkChangeDetector;
    private NetworkChangeDetectorFactory networkChangeDetectorFactory;
    private final Object networkChangeDetectorLock;
    private final ArrayList<NetworkObserver> networkObservers;
    private int numObservers;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class InstanceHolder {
        static final NetworkMonitor instance = new NetworkMonitor(0);

        private InstanceHolder() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface NetworkObserver {
        void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType);
    }

    private NetworkMonitor() {
        this.networkChangeDetectorFactory = new NetworkChangeDetectorFactory() { // from class: org.webrtc.NetworkMonitor.1
            @Override // org.webrtc.NetworkChangeDetectorFactory
            public NetworkChangeDetector create(NetworkChangeDetector.Observer observer, Context context) {
                return new NetworkMonitorAutoDetect(observer, context);
            }
        };
        this.networkChangeDetectorLock = new Object();
        this.nativeNetworkObservers = new ArrayList<>();
        this.networkObservers = new ArrayList<>();
        this.numObservers = 0;
        this.currentConnectionType = NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN;
    }

    public static /* bridge */ /* synthetic */ void a(NetworkMonitor networkMonitor, NetworkChangeDetector.NetworkInformation networkInformation) {
        networkMonitor.notifyObserversOfNetworkConnect(networkInformation);
    }

    @Deprecated
    public static void addNetworkObserver(NetworkObserver networkObserver) {
        getInstance().addObserver(networkObserver);
    }

    private static int androidSdkInt() {
        return Build.VERSION.SDK_INT;
    }

    private static void assertIsTrue(boolean z) {
        if (z) {
            return;
        }
        dmk.i("Expected to be true");
    }

    public static /* bridge */ /* synthetic */ void b(NetworkMonitor networkMonitor, long j) {
        networkMonitor.notifyObserversOfNetworkDisconnect(j);
    }

    public static /* bridge */ /* synthetic */ void c(NetworkMonitor networkMonitor, List list, int i) {
        networkMonitor.notifyObserversOfNetworkPreference(list, i);
    }

    public static NetworkMonitorAutoDetect createAndSetAutoDetectForTest(Context context, String str) {
        NetworkMonitor networkMonitor = getInstance();
        NetworkChangeDetector createNetworkChangeDetector = networkMonitor.createNetworkChangeDetector(context, str);
        networkMonitor.networkChangeDetector = createNetworkChangeDetector;
        return (NetworkMonitorAutoDetect) createNetworkChangeDetector;
    }

    private NetworkChangeDetector createNetworkChangeDetector(Context context, final String str) {
        return this.networkChangeDetectorFactory.create(new NetworkChangeDetector.Observer() { // from class: org.webrtc.NetworkMonitor.2
            @Override // org.webrtc.NetworkChangeDetector.Observer
            public String getFieldTrialsString() {
                return str;
            }

            @Override // org.webrtc.NetworkChangeDetector.Observer
            public void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
                NetworkMonitor.d(NetworkMonitor.this, connectionType);
            }

            @Override // org.webrtc.NetworkChangeDetector.Observer
            public void onNetworkConnect(NetworkChangeDetector.NetworkInformation networkInformation) {
                NetworkMonitor.a(NetworkMonitor.this, networkInformation);
            }

            @Override // org.webrtc.NetworkChangeDetector.Observer
            public void onNetworkDisconnect(long j) {
                NetworkMonitor.b(NetworkMonitor.this, j);
            }

            @Override // org.webrtc.NetworkChangeDetector.Observer
            public void onNetworkPreference(List<NetworkChangeDetector.ConnectionType> list, int i) {
                NetworkMonitor.c(NetworkMonitor.this, list, i);
            }
        }, context);
    }

    public static /* bridge */ /* synthetic */ void d(NetworkMonitor networkMonitor, NetworkChangeDetector.ConnectionType connectionType) {
        networkMonitor.updateCurrentConnectionType(connectionType);
    }

    private NetworkChangeDetector.ConnectionType getCurrentConnectionType() {
        return this.currentConnectionType;
    }

    public static NetworkMonitor getInstance() {
        return InstanceHolder.instance;
    }

    public static boolean isOnline() {
        if (getInstance().getCurrentConnectionType() != NetworkChangeDetector.ConnectionType.CONNECTION_NONE) {
            return true;
        }
        return false;
    }

    private native void nativeNotifyConnectionTypeChanged(long j);

    private native void nativeNotifyOfActiveNetworkList(long j, NetworkChangeDetector.NetworkInformation[] networkInformationArr);

    private native void nativeNotifyOfNetworkConnect(long j, NetworkChangeDetector.NetworkInformation networkInformation);

    private native void nativeNotifyOfNetworkDisconnect(long j, long j2);

    private native void nativeNotifyOfNetworkPreference(long j, NetworkChangeDetector.ConnectionType connectionType, int i);

    private boolean networkBindingSupported() {
        boolean z;
        synchronized (this.networkChangeDetectorLock) {
            try {
                NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
                if (networkChangeDetector != null && networkChangeDetector.supportNetworkCallback()) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    private void notifyObserversOfConnectionTypeChange(NetworkChangeDetector.ConnectionType connectionType) {
        ArrayList arrayList;
        synchronized (this.nativeNetworkObservers) {
            try {
                Iterator<Long> it = this.nativeNetworkObservers.iterator();
                while (it.hasNext()) {
                    nativeNotifyConnectionTypeChanged(it.next().longValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.networkObservers) {
            arrayList = new ArrayList(this.networkObservers);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((NetworkObserver) it2.next()).onConnectionTypeChanged(connectionType);
        }
    }

    private void notifyObserversOfNetworkConnect(NetworkChangeDetector.NetworkInformation networkInformation) {
        synchronized (this.nativeNetworkObservers) {
            try {
                Iterator<Long> it = this.nativeNetworkObservers.iterator();
                while (it.hasNext()) {
                    nativeNotifyOfNetworkConnect(it.next().longValue(), networkInformation);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void notifyObserversOfNetworkDisconnect(long j) {
        synchronized (this.nativeNetworkObservers) {
            try {
                Iterator<Long> it = this.nativeNetworkObservers.iterator();
                while (it.hasNext()) {
                    nativeNotifyOfNetworkDisconnect(it.next().longValue(), j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void notifyObserversOfNetworkPreference(List<NetworkChangeDetector.ConnectionType> list, int i) {
        synchronized (this.nativeNetworkObservers) {
            try {
                for (NetworkChangeDetector.ConnectionType connectionType : list) {
                    Iterator<Long> it = this.nativeNetworkObservers.iterator();
                    while (it.hasNext()) {
                        nativeNotifyOfNetworkPreference(it.next().longValue(), connectionType, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    public static void removeNetworkObserver(NetworkObserver networkObserver) {
        getInstance().removeObserver(networkObserver);
    }

    private void startMonitoring(Context context, long j, String str) {
        Logging.d(TAG, "Start monitoring with native observer " + j + " fieldTrialsString: " + str);
        if (context == null) {
            context = ContextUtils.getApplicationContext();
        }
        startMonitoring(context, str);
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.add(Long.valueOf(j));
        }
        updateObserverActiveNetworkList(j);
        notifyObserversOfConnectionTypeChange(this.currentConnectionType);
    }

    private void stopMonitoring(long j) {
        Logging.d(TAG, "Stop monitoring with native observer " + j);
        stopMonitoring();
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.remove(Long.valueOf(j));
        }
    }

    private void updateCurrentConnectionType(NetworkChangeDetector.ConnectionType connectionType) {
        this.currentConnectionType = connectionType;
        notifyObserversOfConnectionTypeChange(connectionType);
    }

    private void updateObserverActiveNetworkList(long j) {
        List<NetworkChangeDetector.NetworkInformation> activeNetworkList;
        synchronized (this.networkChangeDetectorLock) {
            NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
            if (networkChangeDetector == null) {
                activeNetworkList = null;
            } else {
                activeNetworkList = networkChangeDetector.getActiveNetworkList();
            }
        }
        if (activeNetworkList == null) {
            return;
        }
        nativeNotifyOfActiveNetworkList(j, (NetworkChangeDetector.NetworkInformation[]) activeNetworkList.toArray(new NetworkChangeDetector.NetworkInformation[activeNetworkList.size()]));
    }

    public void addObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.add(networkObserver);
        }
    }

    public NetworkChangeDetector getNetworkChangeDetector() {
        NetworkChangeDetector networkChangeDetector;
        synchronized (this.networkChangeDetectorLock) {
            networkChangeDetector = this.networkChangeDetector;
        }
        return networkChangeDetector;
    }

    public int getNumObservers() {
        int i;
        synchronized (this.networkChangeDetectorLock) {
            i = this.numObservers;
        }
        return i;
    }

    public void removeObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.remove(networkObserver);
        }
    }

    public void setNetworkChangeDetectorFactory(NetworkChangeDetectorFactory networkChangeDetectorFactory) {
        boolean z;
        if (this.numObservers == 0) {
            z = true;
        } else {
            z = false;
        }
        assertIsTrue(z);
        this.networkChangeDetectorFactory = networkChangeDetectorFactory;
    }

    @Deprecated
    public static void init(Context context) {
    }

    public /* synthetic */ NetworkMonitor(int i) {
        this();
    }

    public void stopMonitoring() {
        synchronized (this.networkChangeDetectorLock) {
            try {
                int i = this.numObservers - 1;
                this.numObservers = i;
                if (i == 0) {
                    this.networkChangeDetector.destroy();
                    this.networkChangeDetector = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    public void startMonitoring(Context context) {
        startMonitoring(context, "");
    }

    @Deprecated
    public void startMonitoring() {
        startMonitoring(ContextUtils.getApplicationContext(), "");
    }

    public void startMonitoring(Context context, String str) {
        synchronized (this.networkChangeDetectorLock) {
            try {
                this.numObservers++;
                NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
                if (networkChangeDetector == null) {
                    networkChangeDetector = createNetworkChangeDetector(context, str);
                    this.networkChangeDetector = networkChangeDetector;
                }
                this.currentConnectionType = networkChangeDetector.getCurrentConnectionType();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
