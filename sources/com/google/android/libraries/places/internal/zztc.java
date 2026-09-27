package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.Place;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zztc {
    public static final Place zza(Place place) {
        place.getClass();
        Place.Builder builder = Place.builder();
        builder.setId(place.getId());
        builder.setLocation(place.getLocation());
        builder.setViewport(place.getViewport());
        Place build = builder.build();
        build.getClass();
        return build;
    }
}
