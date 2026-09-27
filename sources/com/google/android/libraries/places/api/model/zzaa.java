package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.ConsumerAlert;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaa extends ConsumerAlert.Builder {
    private String zza;
    private ConsumerAlertDetails zzb;
    private String zzc;

    @Override // com.google.android.libraries.places.api.model.ConsumerAlert.Builder
    public final ConsumerAlert build() {
        return new zzem(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlert.Builder
    public final ConsumerAlert.Builder setDetails(ConsumerAlertDetails consumerAlertDetails) {
        this.zzb = consumerAlertDetails;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlert.Builder
    public final ConsumerAlert.Builder setLanguageCode(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlert.Builder
    public final ConsumerAlert.Builder setOverview(String str) {
        this.zza = str;
        return this;
    }
}
