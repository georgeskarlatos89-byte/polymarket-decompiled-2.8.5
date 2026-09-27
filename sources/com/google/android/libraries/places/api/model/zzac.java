package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.libraries.places.api.model.ConsumerAlertDetails;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzac extends ConsumerAlertDetails.Builder {
    private String zza;
    private String zzb;
    private String zzc;
    private Uri zzd;

    @Override // com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder
    public final ConsumerAlertDetails build() {
        return new zzeo(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder
    public final ConsumerAlertDetails.Builder setAboutLinkTitle(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder
    public final ConsumerAlertDetails.Builder setAboutLinkUri(Uri uri) {
        this.zzd = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder
    public final ConsumerAlertDetails.Builder setDescription(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder
    public final ConsumerAlertDetails.Builder setTitle(String str) {
        this.zza = str;
        return this;
    }
}
