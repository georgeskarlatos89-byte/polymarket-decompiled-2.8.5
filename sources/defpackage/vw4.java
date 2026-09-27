package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vw4 implements uw4 {
    public final ConnectivityManager b;

    public vw4(ConnectivityManager connectivityManager) {
        this.b = connectivityManager;
    }

    @Override // defpackage.uw4
    public final boolean c() {
        ConnectivityManager connectivityManager = this.b;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
            return true;
        }
        return false;
    }
}
