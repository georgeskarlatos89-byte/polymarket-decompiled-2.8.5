package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import io.radar.sdk.RadarTrackingOptions;
import io.sentry.android.core.m0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vj8 implements Runnable {
    public static final String e = dm0.j("ForceStopRunnable");
    public static final long f = 315360000000L;
    public final Context a;
    public final kok b;
    public final cl9 c;
    public int d = 0;

    public vj8(Context context, kok kokVar) {
        this.a = context.getApplicationContext();
        this.b = kokVar;
        this.c = kokVar.g;
    }

    /* JADX WARN: Finally extract failed */
    public final void a() {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        List<ApplicationExitInfo> historicalProcessExitReasons;
        cl9 cl9Var = this.c;
        kok kokVar = this.b;
        ft4 ft4Var = kokVar.b;
        cl9 cl9Var2 = kokVar.g;
        WorkDatabase workDatabase = kokVar.c;
        String str = aji.e;
        Context context = this.a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList d = aji.d(context, jobScheduler);
        List workSpecIds = workDatabase.systemIdInfoDao().getWorkSpecIds();
        if (d != null) {
            i = d.size();
        } else {
            i = 0;
        }
        HashSet hashSet = new HashSet(i);
        if (d != null && !d.isEmpty()) {
            Iterator it = d.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                hok f2 = aji.f(jobInfo);
                if (f2 != null) {
                    hashSet.add(f2.a);
                } else {
                    aji.a(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it2 = workSpecIds.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (!hashSet.contains((String) it2.next())) {
                    dm0.g().getClass();
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.beginTransaction();
            try {
                yok workSpecDao = workDatabase.workSpecDao();
                Iterator it3 = workSpecIds.iterator();
                while (it3.hasNext()) {
                    workSpecDao.markWorkSpecScheduled((String) it3.next(), -1L);
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th) {
                throw th;
            }
        }
        yok workSpecDao2 = workDatabase.workSpecDao();
        rok workProgressDao = workDatabase.workProgressDao();
        workDatabase.beginTransaction();
        try {
            List<xok> runningWork = workSpecDao2.getRunningWork();
            if (runningWork != null && !runningWork.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                for (xok xokVar : runningWork) {
                    iok iokVar = iok.ENQUEUED;
                    String str2 = xokVar.a;
                    workSpecDao2.setState(iokVar, str2);
                    workSpecDao2.setStopReason(str2, -512);
                    workSpecDao2.markWorkSpecScheduled(str2, -1L);
                }
            }
            workProgressDao.deleteAll();
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (!z2 && !z) {
                z3 = false;
            } else {
                z3 = true;
            }
            Long longValue = cl9Var2.a.preferenceDao().getLongValue("reschedule_needed");
            long j = 0;
            if (longValue != null && longValue.longValue() == 1) {
                dm0.g().getClass();
                kokVar.d();
                cl9Var2.getClass();
                cl9Var2.a.preferenceDao().insertPreference(new r1f("reschedule_needed", 0L));
                return;
            }
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, 570425344);
                if (broadcast != null) {
                    broadcast.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) context.getSystemService(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY)).getHistoricalProcessExitReasons(null, 0, 0);
            } catch (IllegalArgumentException | SecurityException e2) {
                if (dm0.g().b <= 5) {
                    m0.q(e, "Ignoring exception", e2);
                }
            }
            if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                Long longValue2 = cl9Var.a.preferenceDao().getLongValue("last_force_stop_ms");
                if (longValue2 != null) {
                    j = longValue2.longValue();
                }
                for (i2 = 0; i2 < historicalProcessExitReasons.size(); i2++) {
                    ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(i2);
                    if (applicationExitInfo.getReason() == 10 && applicationExitInfo.getTimestamp() >= j) {
                        dm0.g().getClass();
                        kokVar.d();
                        vh5 vh5Var = ft4Var.c;
                        long currentTimeMillis = System.currentTimeMillis();
                        cl9Var.getClass();
                        cl9Var.a.preferenceDao().insertPreference(new r1f("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                        return;
                    }
                }
            }
            if (z3) {
                dm0.g().getClass();
                vig.b(ft4Var, workDatabase, kokVar.e);
            }
        } finally {
            workDatabase.endTransaction();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean areEqual;
        String str;
        String str2 = e;
        kok kokVar = this.b;
        ft4 ft4Var = kokVar.b;
        try {
            ft4Var.getClass();
            boolean isEmpty = TextUtils.isEmpty(null);
            Context context = this.a;
            if (isEmpty) {
                dm0.g().getClass();
                areEqual = true;
            } else {
                int i = w6f.a;
                context.getClass();
                areEqual = Intrinsics.areEqual(fd0.a.a(), context.getApplicationInfo().processName);
                dm0.g().getClass();
            }
            if (!areEqual) {
                return;
            }
            while (true) {
                try {
                    i7n.l(context);
                    dm0.g().getClass();
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e2) {
                        int i2 = this.d + 1;
                        this.d = i2;
                        if (i2 >= 3) {
                            if (u0n.e(context)) {
                                str = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
                            } else {
                                str = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            }
                            dm0.g().f(str2, str, e2);
                            IllegalStateException illegalStateException = new IllegalStateException(str, e2);
                            ft4Var.getClass();
                            throw illegalStateException;
                        }
                        dm0.g().getClass();
                        try {
                            Thread.sleep(this.d * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e3) {
                    dm0.g().e(str2, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e3);
                    ft4Var.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            kokVar.c();
        }
    }
}
