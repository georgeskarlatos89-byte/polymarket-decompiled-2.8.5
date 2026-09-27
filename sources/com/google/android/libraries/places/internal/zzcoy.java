package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcoy {
    private static final zzcow zza = new zzcow(zzcot.zza);
    private final zzcot zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private final zzciu zzg;
    private volatile long zzh;

    public zzcoy() {
        this.zzg = zzciv.zza();
        this.zzb = zzcot.zza;
    }

    public static zzcow zze() {
        return zza;
    }

    public final void zza() {
        this.zzc++;
        this.zzb.zza();
    }

    public final void zzb(boolean z) {
        if (z) {
            this.zzd++;
        } else {
            this.zze++;
        }
    }

    public final void zzc(int i) {
        if (i == 0) {
            return;
        }
        this.zzf += i;
        this.zzb.zza();
    }

    public final void zzd() {
        this.zzg.zza(1L);
        this.zzh = this.zzb.zza();
    }

    public /* synthetic */ zzcoy(zzcot zzcotVar, byte[] bArr) {
        this.zzg = zzciv.zza();
        this.zzb = zzcotVar;
    }
}
