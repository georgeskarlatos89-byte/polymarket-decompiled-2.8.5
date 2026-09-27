package com.appsflyer.internal;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFk1ySDK {
    public String getMonetizationNetwork;
    public final WeakReference<Context> getRevenue;

    public AFk1ySDK(Context context) {
        this.getRevenue = new WeakReference<>(context);
    }
}
