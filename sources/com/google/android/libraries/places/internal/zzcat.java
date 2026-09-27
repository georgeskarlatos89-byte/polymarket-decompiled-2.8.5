package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcat {
    private zzcau zza;
    private zzcau zzb;
    private zzcav zzc;
    private String zzd;
    private boolean zze;

    public /* synthetic */ zzcat(byte[] bArr) {
    }

    public final zzcat zza(zzcau zzcauVar) {
        this.zza = zzcauVar;
        return this;
    }

    public final zzcat zzb(zzcau zzcauVar) {
        this.zzb = zzcauVar;
        return this;
    }

    public final zzcat zzc(zzcav zzcavVar) {
        this.zzc = zzcavVar;
        return this;
    }

    public final zzcat zzd(String str) {
        this.zzd = str;
        return this;
    }

    public final zzcat zze(boolean z) {
        this.zze = true;
        return this;
    }

    public final zzcax zzf() {
        return new zzcax(this.zzc, this.zzd, this.zza, this.zzb, null, false, false, this.zze, null);
    }

    private zzcat() {
        throw null;
    }
}
