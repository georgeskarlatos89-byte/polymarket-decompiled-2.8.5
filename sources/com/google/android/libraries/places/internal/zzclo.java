package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzclo {
    private final zzbzx zza;
    private zzbxv zzb;
    private boolean zzc = false;
    private zzbxw zzd = zzbxw.zza(zzbxv.IDLE);

    public zzclo(zzbzx zzbzxVar, zzbxv zzbxvVar) {
        this.zza = zzbzxVar;
        this.zzb = zzbxvVar;
    }

    public final zzbzx zza() {
        return this.zza;
    }

    public final zzbxv zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzc;
    }

    public final /* synthetic */ void zzd(zzbxv zzbxvVar) {
        boolean z;
        this.zzb = zzbxvVar;
        if (zzbxvVar != zzbxv.READY && zzbxvVar != zzbxv.TRANSIENT_FAILURE) {
            if (zzbxvVar == zzbxv.IDLE) {
                z = false;
            } else {
                return;
            }
        } else {
            z = true;
        }
        this.zzc = z;
    }

    public final /* synthetic */ zzbxv zze() {
        return this.zzd.zzc();
    }

    public final /* synthetic */ zzbzx zzf() {
        return this.zza;
    }

    public final /* synthetic */ zzbxv zzg() {
        return this.zzb;
    }

    public final /* synthetic */ zzbxw zzh() {
        return this.zzd;
    }

    public final /* synthetic */ void zzi(zzbxw zzbxwVar) {
        this.zzd = zzbxwVar;
    }
}
