package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class FetchPlaceResponse {
    public static FetchPlaceResponse newInstance(Place place) {
        return new zzf(place);
    }

    public abstract Place getPlace();
}
