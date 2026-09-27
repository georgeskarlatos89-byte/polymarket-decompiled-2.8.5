package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class u3d {
    public static final String a = dm0.j("NetworkStateTracker");

    public static final q3d a(ConnectivityManager connectivityManager) {
        boolean z;
        boolean z2;
        NetworkCapabilities a2;
        connectivityManager.getClass();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z3 = true;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z = true;
        } else {
            z = false;
        }
        try {
            a2 = b2d.a(connectivityManager, c2d.a(connectivityManager));
        } catch (SecurityException e) {
            dm0.g().f(a, "Unable to validate active network", e);
        }
        if (a2 != null) {
            z2 = b2d.b(a2, 16);
            boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
            if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                z3 = false;
            }
            return new q3d(z, z2, isActiveNetworkMetered, z3);
        }
        z2 = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
        }
        z3 = false;
        return new q3d(z, z2, isActiveNetworkMetered2, z3);
    }
}
