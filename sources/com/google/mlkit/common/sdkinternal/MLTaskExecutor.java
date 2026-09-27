package com.google.mlkit.common.sdkinternal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.mlkit_common.zzaw;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import defpackage.epi;
import defpackage.p55;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class MLTaskExecutor {
    private static final Object zza = new Object();
    private static MLTaskExecutor zzb;
    private final Handler zzc;

    private MLTaskExecutor(Looper looper) {
        this.zzc = new com.google.android.gms.internal.mlkit_common.zza(looper);
    }

    public static MLTaskExecutor getInstance() {
        MLTaskExecutor mLTaskExecutor;
        synchronized (zza) {
            try {
                mLTaskExecutor = zzb;
                if (mLTaskExecutor == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    MLTaskExecutor mLTaskExecutor2 = new MLTaskExecutor(handlerThread.getLooper());
                    zzb = mLTaskExecutor2;
                    mLTaskExecutor = mLTaskExecutor2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mLTaskExecutor;
    }

    public static Executor workerThreadExecutor() {
        return zzh.INSTANCE;
    }

    public static /* bridge */ /* synthetic */ Handler zza(MLTaskExecutor mLTaskExecutor) {
        return mLTaskExecutor.zzc;
    }

    public Handler getHandler() {
        return this.zzc;
    }

    public <ResultT> Task<ResultT> scheduleCallable(final Callable<ResultT> callable) {
        final epi epiVar = new epi();
        scheduleRunnable(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzf
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                epi epiVar2 = epiVar;
                try {
                    epiVar2.b(callable2.call());
                } catch (MlKitException e) {
                    epiVar2.a(e);
                } catch (Exception e2) {
                    epiVar2.a(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e2));
                }
            }
        });
        return epiVar.a;
    }

    public void scheduleRunnable(Runnable runnable) {
        workerThreadExecutor().execute(runnable);
    }

    public void scheduleRunnableDelayed(Runnable runnable, long j) {
        this.zzc.postDelayed(runnable, j);
    }

    public <ResultT> Task<ResultT> scheduleTaskCallable(Callable<Task<ResultT>> callable) {
        return scheduleCallable(callable).k(zzaw.zza(), new p55() { // from class: com.google.mlkit.common.sdkinternal.zzg
            @Override // defpackage.p55
            public final Object then(Task task) {
                return (Task) task.getResult();
            }
        });
    }
}
