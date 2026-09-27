package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFd1oSDK {
    final ExecutorService getMonetizationNetwork;
    final AFd1jSDK getRevenue;

    public AFd1oSDK(AFd1jSDK aFd1jSDK, ExecutorService executorService) {
        this.getRevenue = aFd1jSDK;
        this.getMonetizationNetwork = executorService;
    }
}
