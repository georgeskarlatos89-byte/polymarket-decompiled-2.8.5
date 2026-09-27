package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.Area;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzh extends Area.Builder {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private Area.Containment zze;

    @Override // com.google.android.libraries.places.api.model.Area.Builder
    public final Area build() {
        return new zzdq(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    @Override // com.google.android.libraries.places.api.model.Area.Builder
    public final Area.Builder setContainment(Area.Containment containment) {
        this.zze = containment;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Area.Builder
    public final Area.Builder setDisplayName(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Area.Builder
    public final Area.Builder setDisplayNameLanguageCode(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Area.Builder
    public final Area.Builder setId(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Area.Builder
    public final Area.Builder setResourceName(String str) {
        this.zza = str;
        return this;
    }
}
