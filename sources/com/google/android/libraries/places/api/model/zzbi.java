package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.libraries.places.api.model.NeighborhoodSummary;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbi extends NeighborhoodSummary.Builder {
    private ContentBlock zza;
    private ContentBlock zzb;
    private Uri zzc;
    private String zzd;
    private String zze;

    @Override // com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder
    public final NeighborhoodSummary build() {
        return new zzfw(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    @Override // com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder
    public final NeighborhoodSummary.Builder setDescription(ContentBlock contentBlock) {
        this.zzb = contentBlock;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder
    public final NeighborhoodSummary.Builder setDisclosureText(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder
    public final NeighborhoodSummary.Builder setDisclosureTextLanguageCode(String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder
    public final NeighborhoodSummary.Builder setFlagContentUri(Uri uri) {
        this.zzc = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder
    public final NeighborhoodSummary.Builder setOverview(ContentBlock contentBlock) {
        this.zza = contentBlock;
        return this;
    }
}
