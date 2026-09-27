package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcnz implements Executor {
    private static final Logger zza = Logger.getLogger(zzcnz.class.getName());
    private boolean zzb;
    private ArrayDeque zzc;

    private final void zza() {
        while (true) {
            Runnable runnable = (Runnable) this.zzc.poll();
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    zza.logp(Level.SEVERE, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", "Exception while executing runnable ".concat(runnable.toString()), th);
                }
            } else {
                return;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        brn.m(runnable, "'task' must not be null.");
        if (!this.zzb) {
            this.zzb = true;
            try {
                runnable.run();
                if (this.zzc != null) {
                    zza();
                }
                this.zzb = false;
                return;
            } catch (Throwable th) {
                try {
                    Logger logger = zza;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(runnable);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 35);
                    sb.append("Exception while executing runnable ");
                    sb.append(valueOf);
                    logger.logp(level, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "execute", sb.toString(), th);
                    if (this.zzc != null) {
                        zza();
                    }
                    this.zzb = false;
                    return;
                } catch (Throwable th2) {
                    if (this.zzc != null) {
                        zza();
                    }
                    this.zzb = false;
                    throw th2;
                }
            }
        }
        ArrayDeque arrayDeque = this.zzc;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque(4);
            this.zzc = arrayDeque;
        }
        arrayDeque.add(runnable);
    }
}
