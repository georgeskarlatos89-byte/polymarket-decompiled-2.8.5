package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcdd {
    final /* synthetic */ zzcde zza;
    private final long zzb;

    public /* synthetic */ zzcdd(zzcde zzcdeVar, long j, byte[] bArr) {
        Objects.requireNonNull(zzcdeVar);
        this.zza = zzcdeVar;
        this.zzb = j;
    }

    public final void zza() {
        zzcde zzcdeVar = this.zza;
        AtomicLong zzd = zzcdeVar.zzd();
        long j = this.zzb;
        long max = Math.max(j + j, j);
        if (zzd.compareAndSet(j, max)) {
            String zzc = zzcdeVar.zzc();
            zzcde.zzb().logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{zzc, Long.valueOf(max)});
        }
    }
}
