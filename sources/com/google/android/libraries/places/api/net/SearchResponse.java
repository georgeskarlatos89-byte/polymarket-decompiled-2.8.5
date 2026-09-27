package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingSummary;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public interface SearchResponse {
    Pagination getPagination();

    List<Place> getPlaces();

    List<RoutingSummary> getRoutingSummaries();
}
