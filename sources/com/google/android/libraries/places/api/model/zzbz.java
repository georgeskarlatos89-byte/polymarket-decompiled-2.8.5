package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.PostalAddress;
import defpackage.dmk;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbz extends PostalAddress.Builder {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private List zzh;
    private List zzi;
    private String zzj;

    @Override // com.google.android.libraries.places.api.model.PostalAddress.Builder
    public final PostalAddress.Builder setAddressLines(List<String> list) {
        this.zzh = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PostalAddress.Builder
    public final PostalAddress.Builder setAdministrativeArea(String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PostalAddress.Builder
    public final PostalAddress.Builder setLanguageCode(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PostalAddress.Builder
    public final PostalAddress.Builder setLocality(String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PostalAddress.Builder
    public final PostalAddress.Builder setOrganization(String str) {
        this.zzj = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PostalAddress.Builder
    public final PostalAddress.Builder setPostalCode(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PostalAddress.Builder
    public final PostalAddress.Builder setRecipients(List<String> list) {
        this.zzi = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PostalAddress.Builder
    public final PostalAddress.Builder setRegionCode(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        dmk.s("Null regionCode");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.PostalAddress.Builder
    public final PostalAddress.Builder setSortingCode(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PostalAddress.Builder
    public final PostalAddress.Builder setSublocality(String str) {
        this.zzg = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PostalAddress.Builder
    public final List zza() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.model.PostalAddress.Builder
    public final List zzb() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.PostalAddress.Builder
    public final PostalAddress zzc() {
        String str = this.zza;
        if (str != null) {
            return new zzgo(str, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj);
        }
        dmk.n("Missing required properties: regionCode");
        return null;
    }
}
