package com.google.android.libraries.places.internal;

import defpackage.xyh;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcmi {
    private final ScheduledExecutorService zza;
    private final Executor zzb;
    private final Runnable zzc;
    private final xyh zzd;
    private long zze;
    private boolean zzf;
    private ScheduledFuture zzg;

    public zzcmi(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, xyh xyhVar) {
        this.zzc = runnable;
        this.zzb = executor;
        this.zza = scheduledExecutorService;
        this.zzd = xyhVar;
        xyhVar.a();
    }

    private final long zzk() {
        xyh xyhVar = this.zzd;
        if (xyhVar.a) {
            return System.nanoTime() - xyhVar.b;
        }
        return 0L;
    }

    public final void zza(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        long zzk = zzk() + nanos;
        this.zzf = true;
        if (zzk - this.zze < 0 || this.zzg == null) {
            ScheduledFuture scheduledFuture = this.zzg;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.zzg = this.zza.schedule(new zzcmh(this, null), nanos, TimeUnit.NANOSECONDS);
        }
        this.zze = zzk;
    }

    public final void zzb(boolean z) {
        ScheduledFuture scheduledFuture;
        this.zzf = false;
        if (z && (scheduledFuture = this.zzg) != null) {
            scheduledFuture.cancel(false);
            this.zzg = null;
        }
    }

    public final /* synthetic */ long zzc() {
        return zzk();
    }

    public final /* synthetic */ ScheduledExecutorService zzd() {
        return this.zza;
    }

    public final /* synthetic */ Executor zze() {
        return this.zzb;
    }

    public final /* synthetic */ Runnable zzf() {
        return this.zzc;
    }

    public final /* synthetic */ long zzg() {
        return this.zze;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zzf;
    }

    public final /* synthetic */ void zzi(boolean z) {
        this.zzf = false;
    }

    public final /* synthetic */ void zzj(ScheduledFuture scheduledFuture) {
        this.zzg = scheduledFuture;
    }
}
