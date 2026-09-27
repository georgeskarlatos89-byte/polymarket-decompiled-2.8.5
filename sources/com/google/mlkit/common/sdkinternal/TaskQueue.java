package com.google.mlkit.common.sdkinternal;

import defpackage.arn;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class TaskQueue {
    private boolean zzb;
    private final Object zza = new Object();
    private final Queue zzc = new ArrayDeque();
    private final AtomicReference zzd = new AtomicReference();

    public static /* bridge */ /* synthetic */ AtomicReference zza(TaskQueue taskQueue) {
        return taskQueue.zzd;
    }

    public static /* bridge */ /* synthetic */ void zzb(TaskQueue taskQueue) {
        taskQueue.zzc();
    }

    private final void zzc() {
        synchronized (this.zza) {
            try {
                if (this.zzc.isEmpty()) {
                    this.zzb = false;
                } else {
                    zzv zzvVar = (zzv) this.zzc.remove();
                    zzd(zzvVar.zza, zzvVar.zzb);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzd(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzt
                @Override // java.lang.Runnable
                public final void run() {
                    zzx zzxVar = new zzx(TaskQueue.this, null);
                    try {
                        runnable.run();
                        zzxVar.close();
                    } catch (Throwable th) {
                        try {
                            zzxVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            zzc();
        }
    }

    public void checkIsRunningOnCurrentThread() {
        arn.k(Thread.currentThread().equals(this.zzd.get()));
    }

    public void submit(Executor executor, Runnable runnable) {
        synchronized (this.zza) {
            try {
                if (this.zzb) {
                    this.zzc.add(new zzv(executor, runnable, null));
                } else {
                    this.zzb = true;
                    zzd(executor, runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
