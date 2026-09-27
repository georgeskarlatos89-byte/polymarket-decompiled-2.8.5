package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.PlaceLikelihood;
import defpackage.jr9;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Deprecated
/* loaded from: classes3.dex */
public abstract class FindCurrentPlaceResponse {
    public static FindCurrentPlaceResponse newInstance(List<PlaceLikelihood> list) {
        return new zzo(jr9.m(list));
    }

    public abstract List<PlaceLikelihood> getPlaceLikelihoods();
}
