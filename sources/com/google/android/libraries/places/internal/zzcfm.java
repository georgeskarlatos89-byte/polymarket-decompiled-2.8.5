package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcfm {
    final zzbzy zza;
    final zzccd zzb;

    private zzcfm(zzbzy zzbzyVar, zzccd zzccdVar) {
        this.zza = zzbzyVar;
        this.zzb = zzccdVar;
    }

    public final zzcfm zza(zzbzy zzbzyVar) {
        return new zzcfm(zzbzyVar, this.zzb);
    }

    public final zzcfm zzb(zzccd zzccdVar) {
        return new zzcfm(this.zza, zzccdVar);
    }

    public /* synthetic */ zzcfm(zzbzy zzbzyVar, zzccd zzccdVar, byte[] bArr) {
        this(null, null);
    }
}
