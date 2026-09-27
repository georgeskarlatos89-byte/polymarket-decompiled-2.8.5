package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import defpackage.jr9;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class FuelOptions implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public FuelOptions build() {
            setFuelPrices(jr9.m(getFuelPrices()));
            return zza();
        }

        public abstract List<FuelPrice> getFuelPrices();

        public abstract Builder setFuelPrices(List<FuelPrice> list);

        public abstract FuelOptions zza();
    }

    public static FuelOptions newInstance(List<FuelPrice> list) {
        zzap zzapVar = new zzap();
        zzapVar.setFuelPrices(list);
        return zzapVar.build();
    }

    public abstract List<FuelPrice> getFuelPrices();
}
