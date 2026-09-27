package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.FuelOptions;
import defpackage.dmk;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzap extends FuelOptions.Builder {
    private List zza;

    @Override // com.google.android.libraries.places.api.model.FuelOptions.Builder
    public final List<FuelPrice> getFuelPrices() {
        List<FuelPrice> list = this.zza;
        if (list != null) {
            return list;
        }
        dmk.n("Property \"fuelPrices\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.FuelOptions.Builder
    public final FuelOptions.Builder setFuelPrices(List<FuelPrice> list) {
        if (list != null) {
            this.zza = list;
            return this;
        }
        dmk.s("Null fuelPrices");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.FuelOptions.Builder
    public final FuelOptions zza() {
        List list = this.zza;
        if (list != null) {
            return new zzfc(list);
        }
        dmk.n("Missing required properties: fuelPrices");
        return null;
    }
}
