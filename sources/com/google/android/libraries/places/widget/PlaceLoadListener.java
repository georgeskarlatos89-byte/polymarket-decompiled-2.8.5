package com.google.android.libraries.places.widget;

import com.google.android.libraries.places.api.model.Place;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceLoadListener;", "", "onSuccess", "", "place", "Lcom/google/android/libraries/places/api/model/Place;", "onFailure", "e", "Ljava/lang/Exception;", "java.com.google.android.libraries.places.widget_place_load_listener_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PlaceLoadListener {
    void onFailure(Exception e);

    void onSuccess(Place place);
}
