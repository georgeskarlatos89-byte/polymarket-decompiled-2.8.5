package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.PriceRange;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcb extends PriceRange.Builder {
    private Money zza;
    private Money zzb;

    @Override // com.google.android.libraries.places.api.model.PriceRange.Builder
    public final PriceRange build() {
        return new zzgq(this.zza, this.zzb);
    }

    @Override // com.google.android.libraries.places.api.model.PriceRange.Builder
    public final PriceRange.Builder setEndPrice(Money money) {
        this.zzb = money;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PriceRange.Builder
    public final PriceRange.Builder setStartPrice(Money money) {
        this.zza = money;
        return this;
    }
}
