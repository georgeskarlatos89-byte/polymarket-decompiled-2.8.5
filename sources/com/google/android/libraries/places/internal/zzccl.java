package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzccl implements Executor {
    private final Thread.UncaughtExceptionHandler zza;
    private final Queue zzb = new ConcurrentLinkedQueue();
    private final AtomicReference zzc = new AtomicReference();

    public zzccl(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        brn.m(uncaughtExceptionHandler, "uncaughtExceptionHandler");
        this.zza = uncaughtExceptionHandler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        zzb(runnable);
        zza();
    }

    public final void zza() {
        do {
            AtomicReference atomicReference = this.zzc;
            Thread currentThread = Thread.currentThread();
            while (!atomicReference.compareAndSet(null, currentThread)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.zzb.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.zza.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.zzc.set(null);
                    throw th2;
                }
            }
            this.zzc.set(null);
        } while (!this.zzb.isEmpty());
    }

    public final void zzb(Runnable runnable) {
        brn.m(runnable, "runnable is null");
        this.zzb.add(runnable);
    }

    public final void zzc() {
        boolean z;
        if (Thread.currentThread() == this.zzc.get()) {
            z = true;
        } else {
            z = false;
        }
        brn.r("Not called from the SynchronizationContext", z);
    }

    public final zzcck zzd(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzccj zzccjVar = new zzccj(runnable);
        return new zzcck(zzccjVar, scheduledExecutorService.schedule(new zzcci(this, zzccjVar, runnable), j, timeUnit), null);
    }
}
