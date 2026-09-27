package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.RectangularBounds;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"rectangularBounds", "Lcom/google/android/libraries/places/api/model/RectangularBounds;", "bounds", "Lcom/google/android/gms/maps/model/LatLngBounds;", "southwest", "Lcom/google/android/gms/maps/model/LatLng;", "northeast", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RectangularBoundsKt {
    public static final RectangularBounds rectangularBounds(LatLng latLng, LatLng latLng2) {
        latLng.getClass();
        latLng2.getClass();
        RectangularBounds newInstance = RectangularBounds.newInstance(latLng, latLng2);
        newInstance.getClass();
        return newInstance;
    }

    public static final RectangularBounds rectangularBounds(LatLngBounds latLngBounds) {
        latLngBounds.getClass();
        RectangularBounds newInstance = RectangularBounds.newInstance(latLngBounds);
        newInstance.getClass();
        return newInstance;
    }
}
