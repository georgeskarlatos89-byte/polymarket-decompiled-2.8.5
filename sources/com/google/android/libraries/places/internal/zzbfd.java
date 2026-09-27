package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbfd {
    private final zzccd zza;
    private final int zzb;

    private zzbfd(int i, zzccd zzccdVar) {
        this.zzb = i;
        this.zza = zzccdVar;
    }

    public static zzbfd zzb(int i) {
        return new zzbfd(i, null);
    }

    public static zzbfd zzc(int i, zzccd zzccdVar) {
        if (i != 4) {
            i = 5;
        }
        zzccdVar.getClass();
        return new zzbfd(i, zzccdVar);
    }

    public final /* synthetic */ zzccd zza() {
        return this.zza;
    }

    public final /* synthetic */ int zzd() {
        return this.zzb;
    }
}
