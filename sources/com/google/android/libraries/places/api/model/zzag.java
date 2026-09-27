package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.ContentBlock;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzag extends ContentBlock.Builder {
    private String zza;
    private String zzb;
    private List zzc;
    private List zzd;

    @Override // com.google.android.libraries.places.api.model.ContentBlock.Builder
    public final ContentBlock.Builder setContent(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock.Builder
    public final ContentBlock.Builder setContentLanguageCode(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock.Builder
    public final ContentBlock.Builder setReferencedPlaceIds(List<String> list) {
        this.zzd = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock.Builder
    public final ContentBlock.Builder setReferencedPlaceResourceNames(List<String> list) {
        this.zzc = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock.Builder
    public final List zza() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock.Builder
    public final List zzb() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock.Builder
    public final ContentBlock zzc() {
        return new zzes(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
