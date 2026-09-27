package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.CircularBounds;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"circularBounds", "Lcom/google/android/libraries/places/api/model/CircularBounds;", "center", "Lcom/google/android/gms/maps/model/LatLng;", "radius", "", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CircularBoundsKt {
    public static final CircularBounds circularBounds(LatLng latLng, double d) {
        latLng.getClass();
        CircularBounds newInstance = CircularBounds.newInstance(latLng, d);
        newInstance.getClass();
        return newInstance;
    }
}
