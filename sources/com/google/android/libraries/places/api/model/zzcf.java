package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.libraries.places.api.model.Review;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcf extends Review.Builder {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private Double zzf;
    private AuthorAttribution zzg;
    private String zzh;
    private String zzi;
    private Uri zzj;
    private LocalDate zzk;
    private Uri zzl;

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final String getOriginalText() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final String getOriginalTextLanguageCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final String getPublishTime() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final String getRelativePublishTimeDescription() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final String getText() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final String getTextLanguageCode() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final Review.Builder setFlagContentUri(Uri uri) {
        this.zzj = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final Review.Builder setGoogleMapsUri(Uri uri) {
        this.zzl = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final Review.Builder setOriginalText(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final Review.Builder setOriginalTextLanguageCode(String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final Review.Builder setPublishTime(String str) {
        this.zzi = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final Review.Builder setRelativePublishTimeDescription(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final Review.Builder setText(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final Review.Builder setTextLanguageCode(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final Review.Builder setVisitDate(LocalDate localDate) {
        this.zzk = localDate;
        return this;
    }

    public final Review.Builder zza(Double d) {
        if (d != null) {
            this.zzf = d;
            return this;
        }
        dmk.s("Null rating");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final Review.Builder zzb(AuthorAttribution authorAttribution) {
        if (authorAttribution != null) {
            this.zzg = authorAttribution;
            return this;
        }
        dmk.s("Null authorAttribution");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final Review.Builder zzc(String str) {
        this.zzh = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Review.Builder
    public final Review zzd() {
        AuthorAttribution authorAttribution;
        String str;
        Double d = this.zzf;
        if (d != null && (authorAttribution = this.zzg) != null && (str = this.zzh) != null) {
            return new zzgu(this.zza, this.zzb, this.zzc, this.zzd, this.zze, d, authorAttribution, str, this.zzi, this.zzj, this.zzk, this.zzl);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zzf == null) {
            sb.append(" rating");
        }
        if (this.zzg == null) {
            sb.append(" authorAttribution");
        }
        if (this.zzh == null) {
            sb.append(" attribution");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
