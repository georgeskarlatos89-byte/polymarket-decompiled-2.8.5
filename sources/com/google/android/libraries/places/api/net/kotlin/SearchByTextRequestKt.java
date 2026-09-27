package com.google.android.libraries.places.api.net.kotlin;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.SearchByTextRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "textQuery", "", "Lcom/google/android/libraries/places/api/model/Place$Field;", "placeFields", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/SearchByTextRequest$Builder;", "", "actions", "Lcom/google/android/libraries/places/api/net/SearchByTextRequest;", "searchByTextRequest", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/net/SearchByTextRequest;", "java.com.google.android.libraries.places.api.net.kotlin_kotlin_3p"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchByTextRequestKt {
    public static final SearchByTextRequest searchByTextRequest(String str, List<? extends Place.Field> list, Function1<? super SearchByTextRequest.Builder, Unit> function1) {
        str.getClass();
        list.getClass();
        SearchByTextRequest.Builder builder = SearchByTextRequest.builder(str, list);
        if (function1 != null) {
            function1.invoke(builder);
        }
        SearchByTextRequest build = builder.build();
        build.getClass();
        return build;
    }

    public static /* synthetic */ SearchByTextRequest searchByTextRequest$default(String str, List list, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return searchByTextRequest(str, list, function1);
    }
}
