package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbdz {
    private final zzcas zza;
    private final zzbxa zzb;
    private final String zzc;

    private zzbdz(int i, zzcax zzcaxVar, String str, zzbxa zzbxaVar, zzcas zzcasVar, String str2) {
        this.zzb = zzbxaVar;
        this.zza = zzcasVar;
        this.zzc = str2;
    }

    public static zzbdz zza(zzcax zzcaxVar, zzbxa zzbxaVar, zzcas zzcasVar, String str) {
        zzcaxVar.getClass();
        zzbxaVar.getClass();
        zzcasVar.getClass();
        str.getClass();
        return new zzbdz(2, zzcaxVar, null, zzbxaVar, zzcasVar, str);
    }

    public final zzcas zzb() {
        return this.zza;
    }

    public final zzbxa zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }
}
