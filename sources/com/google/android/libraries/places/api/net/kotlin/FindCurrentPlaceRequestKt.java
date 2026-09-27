package com.google.android.libraries.places.api.net.kotlin;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import defpackage.hm6;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "Lcom/google/android/libraries/places/api/model/Place$Field;", "placeFields", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/FindCurrentPlaceRequest$Builder;", "", "actions", "Lcom/google/android/libraries/places/api/net/FindCurrentPlaceRequest;", "findCurrentPlaceRequest", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/net/FindCurrentPlaceRequest;", "java.com.google.android.libraries.places.api.net.kotlin_kotlin_3p"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FindCurrentPlaceRequestKt {
    @hm6
    public static final FindCurrentPlaceRequest findCurrentPlaceRequest(List<? extends Place.Field> list, Function1<? super FindCurrentPlaceRequest.Builder, Unit> function1) {
        list.getClass();
        FindCurrentPlaceRequest.Builder builder = FindCurrentPlaceRequest.builder(list);
        if (function1 != null) {
            function1.invoke(builder);
        }
        FindCurrentPlaceRequest build = builder.build();
        build.getClass();
        return build;
    }

    public static /* synthetic */ FindCurrentPlaceRequest findCurrentPlaceRequest$default(List list, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return findCurrentPlaceRequest(list, function1);
    }
}
