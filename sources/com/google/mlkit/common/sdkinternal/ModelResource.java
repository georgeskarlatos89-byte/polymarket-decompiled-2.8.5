package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.internal.mlkit_common.zzrr;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import defpackage.arn;
import defpackage.epi;
import defpackage.fzn;
import defpackage.p23;
import defpackage.q23;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ModelResource {
    protected final TaskQueue taskQueue;
    private final AtomicInteger zza;
    private final AtomicBoolean zzb;

    public ModelResource() {
        this.zza = new AtomicInteger(0);
        this.zzb = new AtomicBoolean(false);
        this.taskQueue = new TaskQueue();
    }

    public <T> Task<T> callAfterLoad(final Executor executor, final Callable<T> callable, final p23 p23Var) {
        boolean z;
        if (this.zza.get() > 0) {
            z = true;
        } else {
            z = false;
        }
        arn.k(z);
        if (p23Var.a()) {
            fzn fznVar = new fzn();
            fznVar.t();
            return fznVar;
        }
        final q23 q23Var = new q23();
        final epi epiVar = new epi(q23Var.a);
        this.taskQueue.submit(new Executor() { // from class: com.google.mlkit.common.sdkinternal.zzm
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e) {
                    if (p23Var.a()) {
                        q23Var.a();
                    } else {
                        epiVar.a(e);
                    }
                    throw e;
                }
            }
        }, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzn
            @Override // java.lang.Runnable
            public final void run() {
                ModelResource.this.zza(p23Var, q23Var, callable, epiVar);
            }
        });
        return epiVar.a;
    }

    public boolean isLoaded() {
        return this.zzb.get();
    }

    public abstract void load();

    public void pin() {
        this.zza.incrementAndGet();
    }

    public abstract void release();

    public void unpin(Executor executor) {
        unpinWithTask(executor);
    }

    public Task<Void> unpinWithTask(Executor executor) {
        boolean z;
        if (this.zza.get() > 0) {
            z = true;
        } else {
            z = false;
        }
        arn.k(z);
        final epi epiVar = new epi();
        this.taskQueue.submit(executor, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzl
            @Override // java.lang.Runnable
            public final void run() {
                ModelResource.this.zzb(epiVar);
            }
        });
        return epiVar.a;
    }

    public final /* synthetic */ void zza(p23 p23Var, q23 q23Var, Callable callable, epi epiVar) {
        try {
            if (p23Var.a()) {
                q23Var.a();
                return;
            }
            try {
                if (!this.zzb.get()) {
                    load();
                    this.zzb.set(true);
                }
                if (p23Var.a()) {
                    q23Var.a();
                    return;
                }
                Object call = callable.call();
                if (p23Var.a()) {
                    q23Var.a();
                } else {
                    epiVar.b(call);
                }
            } catch (RuntimeException e) {
                throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e);
            }
        } catch (Exception e2) {
            if (p23Var.a()) {
                q23Var.a();
            } else {
                epiVar.a(e2);
            }
        }
    }

    public final /* synthetic */ void zzb(epi epiVar) {
        boolean z;
        int decrementAndGet = this.zza.decrementAndGet();
        if (decrementAndGet >= 0) {
            z = true;
        } else {
            z = false;
        }
        arn.k(z);
        if (decrementAndGet == 0) {
            release();
            this.zzb.set(false);
        }
        zzrr.zza();
        epiVar.b(null);
    }

    public ModelResource(TaskQueue taskQueue) {
        this.zza = new AtomicInteger(0);
        this.zzb = new AtomicBoolean(false);
        this.taskQueue = taskQueue;
    }
}
