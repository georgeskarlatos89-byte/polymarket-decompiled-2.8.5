package com.google.android.libraries.places.internal;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcci implements Runnable {
    final /* synthetic */ zzccj zza;
    final /* synthetic */ Runnable zzb;
    final /* synthetic */ zzccl zzc;

    public zzcci(zzccl zzcclVar, zzccj zzccjVar, Runnable runnable) {
        this.zza = zzccjVar;
        this.zzb = runnable;
        Objects.requireNonNull(zzcclVar);
        this.zzc = zzcclVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzccl zzcclVar = this.zzc;
        zzcclVar.zzb(this.zza);
        zzcclVar.zza();
    }

    public final String toString() {
        return String.valueOf(this.zzb.toString()).concat("(scheduled in SynchronizationContext)");
    }
}
