package io.ably.lib.platform;

import android.content.Context;
import defpackage.m51;
import io.ably.lib.transport.NetworkConnectivity;
import io.ably.lib.util.Log;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class Platform {
    private static final String TAG = "io.ably.lib.platform.Platform";
    public static final String name = "android";
    private Context applicationContext;
    private final NetworkConnectivity.DelegatedNetworkConnectivity networkConnectivity = new NetworkConnectivity.DelegatedNetworkConnectivity();

    public Context getApplicationContext() {
        return this.applicationContext;
    }

    public NetworkConnectivity getNetworkConnectivity() {
        return this.networkConnectivity;
    }

    public boolean hasApplicationContext() {
        if (this.applicationContext != null) {
            return true;
        }
        return false;
    }

    public void setAndroidContext(Context context) {
        String str = TAG;
        Log.v(str, "setAndroidContext: context=" + context);
        Context applicationContext = context.getApplicationContext();
        if (this.applicationContext != null) {
            Log.v(str, "setAndroidContext(): applicationContext has already been set");
            if (applicationContext == this.applicationContext) {
                Log.v(str, "setAndroidContext(): existing applicationContext is compatible with that being set");
                return;
            }
            throw m51.f(40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "Incompatible application context set");
        }
        Log.v(str, "setAndroidContext(): there was no existing applicationContext");
        this.applicationContext = applicationContext;
        AndroidNetworkConnectivity.getNetworkConnectivity(applicationContext).addListener(this.networkConnectivity);
    }
}
