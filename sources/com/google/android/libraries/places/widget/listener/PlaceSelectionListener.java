package com.google.android.libraries.places.widget.listener;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.Place;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public interface PlaceSelectionListener {
    void onError(Status status);

    void onPlaceSelected(Place place);
}
