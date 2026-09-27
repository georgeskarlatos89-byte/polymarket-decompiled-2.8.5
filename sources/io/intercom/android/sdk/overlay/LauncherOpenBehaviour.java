package io.intercom.android.sdk.overlay;

import android.content.Context;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Deprecated
/* loaded from: classes6.dex */
public class LauncherOpenBehaviour {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public enum LauncherType {
        DEFAULT,
        CUSTOM
    }

    public void openMessenger(Context context) {
        Injector.get().getMetricTracker().clickedLauncher();
        IntercomRootActivityLauncher.INSTANCE.startHome(context);
    }
}
