package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1bSDK;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
final class AFb1lSDK implements Application.ActivityLifecycleCallbacks {
    private volatile boolean AFAdRevenueData;
    private final Runnable areAllFieldsValid;
    private ScheduledFuture<?> component1;
    final AFb1bSDK.AFa1zSDK getCurrencyIso4217Code;
    private final ScheduledExecutorService getMediationNetwork;
    private final AFi1rSDK getMonetizationNetwork;
    private final AFa1oSDK getRevenue;

    public AFb1lSDK(ScheduledExecutorService scheduledExecutorService, AFa1oSDK aFa1oSDK, AFi1rSDK aFi1rSDK, AFb1bSDK.AFa1zSDK aFa1zSDK) {
        scheduledExecutorService.getClass();
        aFa1oSDK.getClass();
        aFi1rSDK.getClass();
        aFa1zSDK.getClass();
        this.getMediationNetwork = scheduledExecutorService;
        this.getRevenue = aFa1oSDK;
        this.getMonetizationNetwork = aFi1rSDK;
        this.getCurrencyIso4217Code = aFa1zSDK;
        this.areAllFieldsValid = new f(this, 0);
    }

    public static /* synthetic */ void a(AFb1lSDK aFb1lSDK, AFh1oSDK aFh1oSDK) {
        getCurrencyIso4217Code(aFb1lSDK, aFh1oSDK);
    }

    public static /* synthetic */ void b(AFb1lSDK aFb1lSDK) {
        getCurrencyIso4217Code(aFb1lSDK);
    }

    private static final void getCurrencyIso4217Code(AFb1lSDK aFb1lSDK, AFh1oSDK aFh1oSDK) {
        Object m882constructorimpl;
        aFb1lSDK.getClass();
        aFh1oSDK.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            aFb1lSDK.getCurrencyIso4217Code.getMediationNetwork(aFh1oSDK);
            m882constructorimpl = Result.m882constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(m882constructorimpl);
        if (m883exceptionOrNullimpl != null) {
            AFLogger.afErrorLog("Listener thrown an exception: ", m883exceptionOrNullimpl, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri uri;
        activity.getClass();
        AFa1oSDK aFa1oSDK = this.getRevenue;
        Intent intent = activity.getIntent();
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction())) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        if (uri != null && intent != aFa1oSDK.AFAdRevenueData) {
            aFa1oSDK.AFAdRevenueData = intent;
        }
        this.getMonetizationNetwork.getCurrencyIso4217Code(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        if (this.AFAdRevenueData) {
            ScheduledExecutorService scheduledExecutorService = this.getMediationNetwork;
            Runnable runnable = this.areAllFieldsValid;
            AFb1bSDK.Companion companion = AFb1bSDK.INSTANCE;
            this.component1 = scheduledExecutorService.schedule(runnable, AFb1bSDK.Companion.getRevenue(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        if (!this.AFAdRevenueData) {
            this.AFAdRevenueData = true;
            this.getMediationNetwork.execute(new g(0, this, new AFh1oSDK(activity, this.getMonetizationNetwork)));
        } else {
            ScheduledFuture<?> scheduledFuture = this.component1;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }

    private static final void getCurrencyIso4217Code(AFb1lSDK aFb1lSDK) {
        Object m882constructorimpl;
        aFb1lSDK.getClass();
        aFb1lSDK.AFAdRevenueData = false;
        try {
            Result.Companion companion = Result.INSTANCE;
            aFb1lSDK.getCurrencyIso4217Code.getCurrencyIso4217Code();
            m882constructorimpl = Result.m882constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(m882constructorimpl);
        if (m883exceptionOrNullimpl != null) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", m883exceptionOrNullimpl);
        }
    }
}
