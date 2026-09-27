package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcod implements Executor, Runnable {
    private static final Logger zza = Logger.getLogger(zzcod.class.getName());
    private static final zzcoa zzb;
    private final Executor zzc;
    private final Queue zzd = new ConcurrentLinkedQueue();
    private volatile int zze = 0;

    static {
        zzcoa zzcocVar;
        try {
            zzcocVar = new zzcob(AtomicIntegerFieldUpdater.newUpdater(zzcod.class, "zze"), null);
        } catch (Throwable th) {
            zza.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            zzcocVar = new zzcoc(null);
        }
        zzb = zzcocVar;
    }

    public zzcod(Executor executor) {
        brn.m(executor, "'executor' must not be null.");
        this.zzc = executor;
    }

    private final void zzc(Runnable runnable) {
        if (zzb.zza(this, 0, -1)) {
            try {
                this.zzc.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.zzd.remove(runnable);
                }
                zzb.zzb(this, 0);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        brn.m(runnable, "'r' must not be null.");
        this.zzd.add(runnable);
        zzc(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                Runnable runnable = (Runnable) this.zzd.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e) {
                    Logger logger = zza;
                    Level level = Level.SEVERE;
                    String obj = runnable.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 35);
                    sb.append("Exception while executing runnable ");
                    sb.append(obj);
                    logger.logp(level, "io.grpc.internal.SerializingExecutor", "run", sb.toString(), (Throwable) e);
                }
            } catch (Throwable th) {
                zzb.zzb(this, 0);
                throw th;
            }
        }
        zzb.zzb(this, 0);
        if (!this.zzd.isEmpty()) {
            zzc(null);
        }
    }

    public final /* synthetic */ int zza() {
        return this.zze;
    }

    public final /* synthetic */ void zzb(int i) {
        this.zze = i;
    }
}
