package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class c2d {
    public static final Network a(ConnectivityManager connectivityManager) {
        connectivityManager.getClass();
        return connectivityManager.getActiveNetwork();
    }
}
