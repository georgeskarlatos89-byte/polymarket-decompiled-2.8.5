package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.PlusCode;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbx extends PlusCode.Builder {
    private String zza;
    private String zzb;

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final PlusCode build() {
        return new zzgm(this.zza, this.zzb);
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final String getCompoundCode() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final String getGlobalCode() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final PlusCode.Builder setCompoundCode(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final PlusCode.Builder setGlobalCode(String str) {
        this.zzb = str;
        return this;
    }
}
