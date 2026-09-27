package com.google.android.libraries.places.api.net.kotlin;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.IsOpenRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"", "placeId", "", "utcTimeMillis", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/IsOpenRequest$Builder;", "", "actions", "Lcom/google/android/libraries/places/api/net/IsOpenRequest;", "isOpenRequest", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/net/IsOpenRequest;", "Lcom/google/android/libraries/places/api/model/Place;", "place", "(Lcom/google/android/libraries/places/api/model/Place;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/net/IsOpenRequest;", "java.com.google.android.libraries.places.api.net.kotlin_kotlin_3p"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IsOpenRequestKt {
    public static final IsOpenRequest isOpenRequest(Place place, Long l, Function1<? super IsOpenRequest.Builder, Unit> function1) {
        IsOpenRequest.Builder builder;
        place.getClass();
        if (l == null) {
            builder = IsOpenRequest.builder(place);
        } else {
            builder = IsOpenRequest.builder(place, l.longValue());
        }
        if (function1 != null) {
            function1.invoke(builder);
        }
        IsOpenRequest build = builder.build();
        build.getClass();
        return build;
    }

    public static /* synthetic */ IsOpenRequest isOpenRequest$default(Place place, Long l, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        return isOpenRequest(place, l, (Function1<? super IsOpenRequest.Builder, Unit>) function1);
    }

    public static /* synthetic */ IsOpenRequest isOpenRequest$default(String str, Long l, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        return isOpenRequest(str, l, (Function1<? super IsOpenRequest.Builder, Unit>) function1);
    }

    public static final IsOpenRequest isOpenRequest(String str, Long l, Function1<? super IsOpenRequest.Builder, Unit> function1) {
        IsOpenRequest.Builder builder;
        str.getClass();
        if (l == null) {
            builder = IsOpenRequest.builder(str);
        } else {
            builder = IsOpenRequest.builder(str, l.longValue());
        }
        if (function1 != null) {
            function1.invoke(builder);
        }
        IsOpenRequest build = builder.build();
        build.getClass();
        return build;
    }
}
