package com.google.android.libraries.places.api.model;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzj extends zzdb {
    private zzdd zza;
    private String zzb;
    private String zzc;

    @Override // com.google.android.libraries.places.api.model.zzdb
    public final zzdb zza(zzdd zzddVar) {
        this.zza = zzddVar;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzdb
    public final zzdb zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzdb
    public final zzdb zzc(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzdb
    public final zzde zzd() {
        return new zzds(this.zza, this.zzb, this.zzc);
    }
}
