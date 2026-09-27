package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class zzhv {
    private long zza;

    private zzhv(long j) {
        this.zza = j;
    }

    public static zzhv zzd(long j) {
        return new zzhv(j);
    }

    private final native long zzf(long j);

    private final native long zzg(long j);

    private final native void zzh(long j);

    public long zza() {
        return this.zza;
    }

    public final long zzb() {
        return zzg(this.zza);
    }

    public final zzhv zzc() {
        return new zzhv(zzf(this.zza));
    }

    public void zze() {
        long j = this.zza;
        if (j != 0) {
            zzh(j);
            this.zza = 0L;
        }
    }
}
