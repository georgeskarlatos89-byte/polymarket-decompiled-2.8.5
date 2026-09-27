package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import defpackage.bji;
import defpackage.cji;
import defpackage.d7f;
import defpackage.dji;
import defpackage.dm0;
import defpackage.fi9;
import defpackage.hok;
import defpackage.kok;
import defpackage.mp7;
import defpackage.qje;
import defpackage.qvh;
import defpackage.ubk;
import defpackage.zcg;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements mp7 {
    public static final String e = dm0.j("SystemJobService");
    public kok a;
    public final HashMap b = new HashMap();
    public final qje c = new qje(17);
    public zcg d;

    public static hok b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new hok(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.mp7
    public final void a(hok hokVar, boolean z) {
        JobParameters jobParameters;
        dm0.g().getClass();
        synchronized (this.b) {
            jobParameters = (JobParameters) this.b.remove(hokVar);
        }
        this.c.e0(hokVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            kok b = kok.b(getApplicationContext());
            this.a = b;
            d7f d7fVar = b.f;
            this.d = new zcg(d7fVar, b.d);
            d7fVar.a(this);
        } catch (IllegalStateException e2) {
            if (Application.class.equals(getApplication().getClass())) {
                dm0.g().m(e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
            } else {
                fi9.n("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        kok kokVar = this.a;
        if (kokVar != null) {
            kokVar.f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.a == null) {
            dm0.g().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        hok b = b(jobParameters);
        if (b == null) {
            dm0.g().e(e, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.b) {
            try {
                if (this.b.containsKey(b)) {
                    dm0 g = dm0.g();
                    b.toString();
                    g.getClass();
                    return false;
                }
                dm0 g2 = dm0.g();
                b.toString();
                g2.getClass();
                this.b.put(b, jobParameters);
                ubk ubkVar = new ubk(4);
                if (bji.b(jobParameters) != null) {
                    ubkVar.c = Arrays.asList(bji.b(jobParameters));
                }
                if (bji.a(jobParameters) != null) {
                    ubkVar.b = Arrays.asList(bji.a(jobParameters));
                }
                cji.a(jobParameters);
                this.d.L(this.c.i0(b), ubkVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.a == null) {
            dm0.g().getClass();
            return true;
        }
        hok b = b(jobParameters);
        if (b == null) {
            dm0.g().e(e, "WorkSpec id not found!");
            return false;
        }
        dm0 g = dm0.g();
        b.toString();
        g.getClass();
        synchronized (this.b) {
            this.b.remove(b);
        }
        qvh e0 = this.c.e0(b);
        if (e0 != null) {
            int a = dji.a(jobParameters);
            zcg zcgVar = this.d;
            zcgVar.getClass();
            zcgVar.M(e0, a);
        }
        d7f d7fVar = this.a.f;
        String str = b.a;
        synchronized (d7fVar.k) {
            contains = d7fVar.i.contains(str);
        }
        return !contains;
    }
}
