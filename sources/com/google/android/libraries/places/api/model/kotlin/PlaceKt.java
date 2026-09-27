package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.Place;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/Place$Builder;", "", "actions", "Lcom/google/android/libraries/places/api/model/Place;", "place", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/model/Place;", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlaceKt {
    public static final Place place(Function1<? super Place.Builder, Unit> function1) {
        function1.getClass();
        Place.Builder builder = Place.builder();
        function1.invoke(builder);
        Place build = builder.build();
        build.getClass();
        return build;
    }
}
