package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.EVSearchOptions;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzak extends EVSearchOptions.Builder {
    private Double zza;
    private List zzb;

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions.Builder
    public final EVSearchOptions build() {
        return new zzew(this.zza, this.zzb);
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions.Builder
    public final List<EVConnectorType> getConnectorTypes() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions.Builder
    public final Double getMinimumChargingRateKw() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions.Builder
    public final EVSearchOptions.Builder setConnectorTypes(List<EVConnectorType> list) {
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions.Builder
    public final EVSearchOptions.Builder setMinimumChargingRateKw(Double d) {
        this.zza = d;
        return this;
    }
}
