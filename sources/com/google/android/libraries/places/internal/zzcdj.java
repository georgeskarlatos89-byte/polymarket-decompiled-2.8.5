package com.google.android.libraries.places.internal;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcdj implements zzcnu {
    private static final Logger zzd = Logger.getLogger(zzcdj.class.getName());
    private final ScheduledExecutorService zza;
    private final zzccl zzb;
    private zzcck zzc;
    private zzcgs zze;

    public zzcdj(zzcgr zzcgrVar, ScheduledExecutorService scheduledExecutorService, zzccl zzcclVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzcclVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcnu
    public final void zza(Runnable runnable) {
        zzccl zzcclVar = this.zzb;
        zzcclVar.zzc();
        if (this.zze == null) {
            this.zze = new zzcgs();
        }
        zzcck zzcckVar = this.zzc;
        if (zzcckVar != null && zzcckVar.zzb()) {
            return;
        }
        long zza = this.zze.zza();
        this.zzc = zzcclVar.zzd(runnable, zza, TimeUnit.NANOSECONDS, this.zza);
        zzd.logp(Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(zza));
    }

    @Override // com.google.android.libraries.places.internal.zzcnu
    public final void zzb() {
        zzccl zzcclVar = this.zzb;
        zzcclVar.zzc();
        zzcclVar.zzb(new Runnable() { // from class: com.google.android.libraries.places.internal.zzcdi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcdj.this.zzc();
            }
        });
        zzcclVar.zza();
    }

    public final /* synthetic */ void zzc() {
        zzcck zzcckVar = this.zzc;
        if (zzcckVar != null && zzcckVar.zzb()) {
            this.zzc.zza();
        }
        this.zze = null;
    }
}
