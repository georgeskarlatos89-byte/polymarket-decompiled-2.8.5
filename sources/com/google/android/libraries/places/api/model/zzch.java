package com.google.android.libraries.places.api.model;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzch extends zzif {
    private String zza;
    private zzdg zzb;
    private Integer zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private LocalDate zzl;

    @Override // com.google.android.libraries.places.api.model.zzif
    public final zzif zza(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        dmk.s("Null reviewPostResourceName");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.zzif
    public final zzif zzb(zzdg zzdgVar) {
        this.zzb = zzdgVar;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzif
    public final zzif zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzif
    public final zzif zzd(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzif
    public final zzif zze(String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzif
    public final zzif zzf(String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzif
    public final zzif zzg(String str) {
        this.zzg = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzif
    public final zzif zzh(String str) {
        this.zzh = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzif
    public final zzif zzi(String str) {
        this.zzi = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzif
    public final zzif zzj(String str) {
        this.zzj = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzif
    public final zzif zzk(String str) {
        this.zzk = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzif
    public final zzif zzl(LocalDate localDate) {
        this.zzl = localDate;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzif
    public final zzig zzm() {
        String str = this.zza;
        if (str != null) {
            return new zzgw(str, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl);
        }
        dmk.n("Missing required properties: reviewPostResourceName");
        return null;
    }
}
