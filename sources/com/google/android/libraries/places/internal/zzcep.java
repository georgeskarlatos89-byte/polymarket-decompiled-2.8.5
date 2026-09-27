package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzcep implements Runnable {
    private final zzbya zza;

    public zzcep(zzbya zzbyaVar) {
        this.zza = zzbyaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbya zzb = this.zza.zzb();
        try {
            zza();
        } finally {
            this.zza.zzc(zzb);
        }
    }

    public abstract void zza();
}
