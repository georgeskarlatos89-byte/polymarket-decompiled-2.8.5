package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.RouteModifiers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/RouteModifiers$Builder;", "", "actions", "Lcom/google/android/libraries/places/api/model/RouteModifiers;", "routeModifiers", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/model/RouteModifiers;", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RouteModifiersKt {
    public static final RouteModifiers routeModifiers(Function1<? super RouteModifiers.Builder, Unit> function1) {
        RouteModifiers.Builder builder = RouteModifiers.builder();
        if (function1 != null) {
            function1.invoke(builder);
        }
        RouteModifiers build = builder.build();
        build.getClass();
        return build;
    }

    public static /* synthetic */ RouteModifiers routeModifiers$default(Function1 function1, int i, Object obj) {
        if (1 == (i & 1)) {
            function1 = null;
        }
        return routeModifiers(function1);
    }
}
