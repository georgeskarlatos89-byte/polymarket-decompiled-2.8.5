package com.google.android.libraries.places.internal;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcgd implements Runnable {
    final /* synthetic */ zzccd zza;
    final /* synthetic */ zzcdy zzb;
    final /* synthetic */ zzcas zzc;
    final /* synthetic */ zzcge zzd;

    public zzcgd(zzcge zzcgeVar, zzccd zzccdVar, zzcdy zzcdyVar, zzcas zzcasVar) {
        this.zza = zzccdVar;
        this.zzb = zzcdyVar;
        this.zzc = zzcasVar;
        Objects.requireNonNull(zzcgeVar);
        this.zzd = zzcgeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zzf().zzc(this.zza, this.zzb, this.zzc);
    }
}
