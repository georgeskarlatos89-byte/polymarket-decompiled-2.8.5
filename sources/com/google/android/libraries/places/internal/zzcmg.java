package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcmg implements Runnable {
    final /* synthetic */ zzcmi zza;

    public /* synthetic */ zzcmg(zzcmi zzcmiVar, byte[] bArr) {
        Objects.requireNonNull(zzcmiVar);
        this.zza = zzcmiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcmi zzcmiVar = this.zza;
        if (!zzcmiVar.zzh()) {
            zzcmiVar.zzj(null);
            return;
        }
        long zzg = zzcmiVar.zzg();
        long zzc = zzcmiVar.zzc();
        if (zzg - zzc > 0) {
            zzcmiVar.zzj(zzcmiVar.zzd().schedule(new zzcmh(zzcmiVar, null), zzcmiVar.zzg() - zzc, TimeUnit.NANOSECONDS));
        } else {
            zzcmiVar.zzi(false);
            zzcmiVar.zzj(null);
            zzcmiVar.zzf().run();
        }
    }
}
