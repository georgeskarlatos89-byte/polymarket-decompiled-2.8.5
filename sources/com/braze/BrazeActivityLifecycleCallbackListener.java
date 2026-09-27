package com.braze;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.braze.push.NotificationTrampolineActivity;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import defpackage.b69;
import defpackage.coc;
import defpackage.fd7;
import defpackage.fl1;
import defpackage.jl1;
import defpackage.m67;
import defpackage.nl1;
import defpackage.ol1;
import defpackage.pm1;
import defpackage.tl1;
import defpackage.uc0;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/braze/BrazeActivityLifecycleCallbackListener;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class BrazeActivityLifecycleCallbackListener implements Application.ActivityLifecycleCallbacks {
    public final Set a;
    public final Set b;
    public volatile Boolean c;
    public final AtomicBoolean d;
    public WeakReference e;

    public BrazeActivityLifecycleCallbackListener() {
        fd7 fd7Var = fd7.a;
        this.d = new AtomicBoolean(false);
        this.a = fd7Var;
        this.b = fd7Var;
        pm1 pm1Var = pm1.V;
        b69.h(this, pm1Var, null, false, new ol1(this, 1), 6);
        b69.h(this, pm1Var, null, false, new ol1(this, 2), 6);
    }

    public final boolean a(Activity activity, boolean z) {
        activity.getClass();
        Class<?> cls = activity.getClass();
        if (Intrinsics.areEqual(cls, NotificationTrampolineActivity.class)) {
            b69.h(this, pm1.V, null, false, new fl1(27), 6);
            return false;
        }
        if (z) {
            if (!this.b.contains(cls)) {
                return true;
            }
        } else if (!this.a.contains(cls)) {
            return true;
        }
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        b69.h(this, pm1.V, null, false, new nl1(3, activity), 6);
        BrazeInAppMessageManager companion = BrazeInAppMessageManager.INSTANCE.getInstance();
        Context applicationContext = activity.getApplicationContext();
        applicationContext.getClass();
        companion.ensureSubscribedToInAppMessageEvents(applicationContext);
        if (this.c == null && this.d.compareAndSet(false, true)) {
            coc.c(tl1.a, null, null, new uc0(activity.getApplicationContext(), this, null, 1), 3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        if (a(activity, false)) {
            if (Intrinsics.areEqual(this.c, Boolean.FALSE)) {
                b69.h(this, pm1.V, null, false, new nl1(1, activity), 6);
                BrazeInAppMessageManager.INSTANCE.getInstance().unregisterInAppMessageManager(activity);
            } else {
                BrazeInAppMessageManager.INSTANCE.getInstance().pauseWebviewIfNecessary$android_sdk_ui();
                b69.h(this, pm1.V, null, false, new ol1(this, 0), 6);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Activity activity2;
        activity.getClass();
        if (a(activity, false)) {
            WeakReference weakReference = this.e;
            if (weakReference != null) {
                activity2 = (Activity) weakReference.get();
            } else {
                activity2 = null;
            }
            Activity activity3 = activity2;
            Boolean bool = this.c;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool, bool2) && activity3 != null && !Intrinsics.areEqual(activity3, activity)) {
                b69.h(this, pm1.V, null, false, new fl1(28), 6);
                BrazeInAppMessageManager.INSTANCE.getInstance().unregisterInAppMessageManager(activity);
            }
            if (Intrinsics.areEqual(this.c, bool2) && activity3 != null && Intrinsics.areEqual(activity3, activity)) {
                BrazeInAppMessageManager.INSTANCE.getInstance().resumeWebviewIfNecessary$android_sdk_ui();
            } else {
                b69.h(this, pm1.V, null, false, new nl1(4, activity), 6);
                BrazeInAppMessageManager.INSTANCE.getInstance().registerInAppMessageManager(activity);
            }
        } else {
            BrazeInAppMessageManager.INSTANCE.getInstance().unregisterInAppMessageManager(activity);
        }
        this.e = new WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        if (a(activity, true)) {
            b69.h(this, pm1.V, null, false, new nl1(2, activity), 6);
            m67 m67Var = jl1.m;
            Context applicationContext = activity.getApplicationContext();
            applicationContext.getClass();
            m67Var.t(applicationContext).j(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        if (a(activity, true)) {
            b69.h(this, pm1.V, null, false, new nl1(0, activity), 6);
            m67 m67Var = jl1.m;
            Context applicationContext = activity.getApplicationContext();
            applicationContext.getClass();
            m67Var.t(applicationContext).b(activity);
        }
    }
}
