package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.WorkManager;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kok extends WorkManager {
    public static kok k;
    public static kok l;
    public static final Object m;
    public final Context a;
    public final ft4 b;
    public final WorkDatabase c;
    public final nok d;
    public final List e;
    public final d7f f;
    public final cl9 g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final a9j j;

    static {
        dm0.j("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public kok(Context context, final ft4 ft4Var, nok nokVar, final WorkDatabase workDatabase, final List list, d7f d7fVar, a9j a9jVar) {
        Context applicationContext = context.getApplicationContext();
        if (!jok.a(applicationContext)) {
            dm0 dm0Var = new dm0(4, 1);
            synchronized (dm0.e) {
                dm0.f = dm0Var;
            }
            this.a = applicationContext;
            this.d = nokVar;
            this.c = workDatabase;
            this.f = d7fVar;
            this.j = a9jVar;
            this.b = ft4Var;
            this.e = list;
            this.g = new cl9(workDatabase, 1);
            final axg axgVar = nokVar.a;
            int i = vig.a;
            d7fVar.a(new mp7() { // from class: uig
                @Override // defpackage.mp7
                public final void a(hok hokVar, boolean z) {
                    axgVar.execute(new dz5(list, hokVar, ft4Var, workDatabase, 3));
                }
            });
            nokVar.a(new vj8(applicationContext, this));
            return;
        }
        dmk.n("Cannot initialize WorkManager in direct boot mode");
        throw null;
    }

    public static kok b(Context context) {
        kok kokVar;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    kokVar = k;
                    if (kokVar == null) {
                        kokVar = l;
                    }
                }
                return kokVar;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (kokVar != null) {
            return kokVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public final void c() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        ArrayList d;
        String str = aji.e;
        Context context = this.a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (d = aji.d(context, jobScheduler)) != null && !d.isEmpty()) {
            Iterator it = d.iterator();
            while (it.hasNext()) {
                aji.a(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        WorkDatabase workDatabase = this.c;
        workDatabase.workSpecDao().resetScheduledState();
        vig.b(this.b, workDatabase, this.e);
    }
}
