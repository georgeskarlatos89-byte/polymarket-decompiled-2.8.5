package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.FuelPrice;
import com.google.android.libraries.places.api.model.Money;
import java.time.Instant;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"fuelPrice", "Lcom/google/android/libraries/places/api/model/FuelPrice;", "type", "Lcom/google/android/libraries/places/api/model/FuelPrice$FuelType;", "price", "Lcom/google/android/libraries/places/api/model/Money;", "updateTime", "Ljava/time/Instant;", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FuelPriceKt {
    public static final FuelPrice fuelPrice(FuelPrice.FuelType fuelType, Money money, Instant instant) {
        fuelType.getClass();
        money.getClass();
        instant.getClass();
        FuelPrice newInstance = FuelPrice.newInstance(fuelType, money, instant);
        newInstance.getClass();
        return newInstance;
    }
}
