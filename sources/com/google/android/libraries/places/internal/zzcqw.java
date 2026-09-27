package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcqw {
    private String[] zza;
    private String[] zzb;
    private boolean zzc;

    public zzcqw(zzcqx zzcqxVar) {
        boolean z = zzcqxVar.zzb;
        this.zza = zzcqxVar.zzc();
        this.zzb = zzcqxVar.zzd();
        this.zzc = zzcqxVar.zzc;
    }

    public final zzcqw zza(zzcqv... zzcqvVarArr) {
        String[] strArr = new String[zzcqvVarArr.length];
        for (int i = 0; i < zzcqvVarArr.length; i++) {
            strArr[i] = zzcqvVarArr[i].zzbb;
        }
        this.zza = strArr;
        return this;
    }

    public final zzcqw zzb(String... strArr) {
        String[] strArr2;
        if (strArr == null) {
            strArr2 = null;
        } else {
            strArr2 = (String[]) strArr.clone();
        }
        this.zza = strArr2;
        return this;
    }

    public final zzcqw zzc(zzcrj... zzcrjVarArr) {
        String[] strArr = new String[zzcrjVarArr.length];
        for (int i = 0; i < zzcrjVarArr.length; i++) {
            strArr[i] = zzcrjVarArr[i].zzf;
        }
        this.zzb = strArr;
        return this;
    }

    public final zzcqw zzd(String... strArr) {
        String[] strArr2;
        if (strArr == null) {
            strArr2 = null;
        } else {
            strArr2 = (String[]) strArr.clone();
        }
        this.zzb = strArr2;
        return this;
    }

    public final zzcqw zze(boolean z) {
        this.zzc = true;
        return this;
    }

    public final zzcqx zzf() {
        return new zzcqx(this, null);
    }

    public final /* synthetic */ String[] zzg() {
        return this.zza;
    }

    public final /* synthetic */ String[] zzh() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzi() {
        return this.zzc;
    }

    public zzcqw(boolean z) {
    }
}
