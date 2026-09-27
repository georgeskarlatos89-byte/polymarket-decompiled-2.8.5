package com.google.android.libraries.places.internal;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzceu implements Runnable {
    final /* synthetic */ zzccd zza;
    final /* synthetic */ zzcfg zzb;

    public zzceu(zzcfg zzcfgVar, zzccd zzccdVar) {
        this.zza = zzccdVar;
        Objects.requireNonNull(zzcfgVar);
        this.zzb = zzcfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzccd zzccdVar = this.zza;
        this.zzb.zzm().zze(zzccdVar.zzh(), zzccdVar.zzi());
    }
}
