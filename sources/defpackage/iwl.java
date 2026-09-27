package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.android.core.m0;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class iwl {
    public static volatile iwl g;
    public final ExecutorService a;
    public final AppMeasurementSdk b;
    public int c;
    public boolean d;
    public volatile ell e;
    public volatile long f;

    public iwl(Context context, Bundle bundle) {
        vo7 vo7Var = new vo7(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), vo7Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.b = new AppMeasurementSdk(this);
        new ArrayList();
        try {
            if (qgn.d(context, ign.c(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, iwl.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.d = true;
                    m0.p("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        a(new cql(this, context, bundle, 0));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            m0.p("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new o9(this, 3));
        }
    }

    public static iwl c(Context context, Bundle bundle) {
        Bundle bundle2;
        arn.h(context);
        if (g == null) {
            synchronized (iwl.class) {
                try {
                    if (g == null) {
                        if (bundle == null) {
                            bundle2 = new Bundle();
                        } else {
                            bundle2 = new Bundle(bundle);
                        }
                        g = new iwl(context, bundle2);
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public final void a(pul pulVar) {
        this.a.execute(pulVar);
    }

    public final void b(Exception exc, boolean z, boolean z2) {
        this.d |= z;
        if (z) {
            m0.q("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            a(new mol(this, exc));
        }
        m0.q("FA", "Error with data collection. Data lost.", exc);
    }

    public final long d() {
        skl sklVar = new skl();
        a(new tql(this, sklVar, 2));
        Long l = (Long) skl.p(sklVar.c(500L), Long.class);
        if (l == null) {
            long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
            int i = this.c + 1;
            this.c = i;
            return nextLong + i;
        }
        return l.longValue();
    }
}
