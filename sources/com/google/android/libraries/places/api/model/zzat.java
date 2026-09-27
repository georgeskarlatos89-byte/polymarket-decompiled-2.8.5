package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.libraries.places.api.model.GenerativeSummary;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzat extends GenerativeSummary.Builder {
    private String zza;
    private String zzb;
    private Uri zzc;
    private String zzd;
    private String zze;

    @Override // com.google.android.libraries.places.api.model.GenerativeSummary.Builder
    public final GenerativeSummary build() {
        return new zzfg(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    @Override // com.google.android.libraries.places.api.model.GenerativeSummary.Builder
    public final GenerativeSummary.Builder setDisclosureText(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.GenerativeSummary.Builder
    public final GenerativeSummary.Builder setDisclosureTextLanguageCode(String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.GenerativeSummary.Builder
    public final GenerativeSummary.Builder setFlagContentUri(Uri uri) {
        this.zzc = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.GenerativeSummary.Builder
    public final GenerativeSummary.Builder setOverview(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.GenerativeSummary.Builder
    public final GenerativeSummary.Builder setOverviewLanguageCode(String str) {
        this.zzb = str;
        return this;
    }
}
