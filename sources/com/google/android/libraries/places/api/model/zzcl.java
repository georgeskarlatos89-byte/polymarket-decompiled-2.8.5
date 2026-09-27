package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.libraries.places.api.model.ReviewSummary;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcl extends ReviewSummary.Builder {
    private String zza;
    private String zzb;
    private Uri zzc;
    private String zzd;
    private String zze;
    private Uri zzf;

    @Override // com.google.android.libraries.places.api.model.ReviewSummary.Builder
    public final ReviewSummary build() {
        return new zzha(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary.Builder
    public final ReviewSummary.Builder setDisclosureText(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary.Builder
    public final ReviewSummary.Builder setDisclosureTextLanguageCode(String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary.Builder
    public final ReviewSummary.Builder setFlagContentUri(Uri uri) {
        this.zzc = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary.Builder
    public final ReviewSummary.Builder setReviewsUri(Uri uri) {
        this.zzf = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary.Builder
    public final ReviewSummary.Builder setText(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary.Builder
    public final ReviewSummary.Builder setTextLanguageCode(String str) {
        this.zzb = str;
        return this;
    }
}
