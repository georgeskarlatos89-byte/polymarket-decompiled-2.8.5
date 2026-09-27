package com.google.android.libraries.places.widget.internal.placedetails;

import com.google.android.libraries.places.api.model.FuelPrice;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzv {
    public static final boolean zza(FuelPrice.FuelType fuelType) {
        fuelType.getClass();
        if (fuelType != FuelPrice.FuelType.REGULAR_UNLEADED && fuelType != FuelPrice.FuelType.MIDGRADE && fuelType != FuelPrice.FuelType.PREMIUM && fuelType != FuelPrice.FuelType.DIESEL) {
            return false;
        }
        return true;
    }

    public static final boolean zzb(FuelPrice fuelPrice, Instant instant) {
        fuelPrice.getClass();
        if (instant == null) {
            return false;
        }
        Instant minus = instant.minus(24L, (TemporalUnit) ChronoUnit.HOURS);
        minus.getClass();
        return fuelPrice.getUpdateTime().isBefore(minus);
    }
}
