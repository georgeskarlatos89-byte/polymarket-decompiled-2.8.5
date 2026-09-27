package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFc1oSDK {
    private static final Lazy getRevenue = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFc1oSDK.5
        public final ExecutorService AFAdRevenueData() {
            return Executors.newSingleThreadExecutor();
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ ExecutorService invoke() {
            return AFAdRevenueData();
        }
    });

    public static final ExecutorService AFAdRevenueData() {
        Object value = getRevenue.getValue();
        value.getClass();
        return (ExecutorService) value;
    }

    public static final ScheduledExecutorService getCurrencyIso4217Code() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        newScheduledThreadPool.getClass();
        return newScheduledThreadPool;
    }

    public static final ExecutorService getMonetizationNetwork() {
        AFc1qSDK aFc1qSDK = new AFc1qSDK(1, 4, 30L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
        aFc1qSDK.allowCoreThreadTimeOut(true);
        return aFc1qSDK;
    }

    public static final ScheduledExecutorService getRevenue() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        newSingleThreadScheduledExecutor.getClass();
        return newSingleThreadScheduledExecutor;
    }
}
