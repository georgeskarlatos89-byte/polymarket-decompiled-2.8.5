package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcdn {
    private final zzcot zza;
    private final zzciu zzb = zzciv.zza();
    private final zzciu zzc = zzciv.zza();
    private final zzciu zzd = zzciv.zza();
    private volatile long zze;

    public zzcdn(zzcot zzcotVar) {
        this.zza = zzcotVar;
    }

    public final void zza() {
        this.zzb.zza(1L);
        this.zze = this.zza.zza();
    }

    public final void zzb(boolean z) {
        if (z) {
            this.zzc.zza(1L);
        } else {
            this.zzd.zza(1L);
        }
    }
}
