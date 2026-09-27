package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.FuelPrice;
import defpackage.dmk;
import java.time.Instant;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzar extends FuelPrice.Builder {
    private FuelPrice.FuelType zza;
    private Money zzb;
    private Instant zzc;

    @Override // com.google.android.libraries.places.api.model.FuelPrice.Builder
    public final FuelPrice build() {
        Money money;
        Instant instant;
        FuelPrice.FuelType fuelType = this.zza;
        if (fuelType != null && (money = this.zzb) != null && (instant = this.zzc) != null) {
            return new zzfe(fuelType, money, instant);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" type");
        }
        if (this.zzb == null) {
            sb.append(" price");
        }
        if (this.zzc == null) {
            sb.append(" updateTime");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.FuelPrice.Builder
    public final FuelPrice.Builder setPrice(Money money) {
        if (money != null) {
            this.zzb = money;
            return this;
        }
        dmk.s("Null price");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.FuelPrice.Builder
    public final FuelPrice.Builder setType(FuelPrice.FuelType fuelType) {
        if (fuelType != null) {
            this.zza = fuelType;
            return this;
        }
        dmk.s("Null type");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.FuelPrice.Builder
    public final FuelPrice.Builder setUpdateTime(Instant instant) {
        if (instant != null) {
            this.zzc = instant;
            return this;
        }
        dmk.s("Null updateTime");
        return null;
    }
}
