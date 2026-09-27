package com.google.android.libraries.places.internal;

import defpackage.pq8;
import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzky implements pq8 {
    final /* synthetic */ zzlb zza;

    public zzky(zzlb zzlbVar) {
        Objects.requireNonNull(zzlbVar);
        this.zza = zzlbVar;
    }

    @Override // defpackage.pq8
    public final void onFailure(Throwable th) {
        zzlb zzlbVar = this.zza;
        zzlbVar.zzd = null;
        zzlbVar.zze = null;
        zzlbVar.zzf = null;
    }

    @Override // defpackage.pq8
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        final zzlb zzlbVar = this.zza;
        zzlbVar.zzd = Long.valueOf(r5.zzc() & 4294967295L);
        zzlbVar.zze = ((zzbvb) obj).zze();
        Long l = zzlbVar.zzd;
        if (l != null) {
            zzlbVar.zzf = zzlbVar.zzc(l.longValue());
        }
        if (zzlbVar.zze != null) {
            long zzc = (r5.zzc() - 3600) - Instant.now().getEpochSecond();
            if (zzc > 0) {
                zzlbVar.zzb.schedule(new Callable() { // from class: com.google.android.libraries.places.internal.zzkz
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzlb.this.zzb();
                    }
                }, zzc, TimeUnit.SECONDS);
            }
        }
    }
}
