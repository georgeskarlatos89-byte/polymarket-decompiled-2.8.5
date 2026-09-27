package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "photoReference", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/PhotoMetadata$Builder;", "", "actions", "Lcom/google/android/libraries/places/api/model/PhotoMetadata;", "photoMetadata", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/model/PhotoMetadata;", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhotoMetadataKt {
    public static final PhotoMetadata photoMetadata(String str, Function1<? super PhotoMetadata.Builder, Unit> function1) {
        str.getClass();
        PhotoMetadata.Builder builder = PhotoMetadata.builder(str);
        if (function1 != null) {
            function1.invoke(builder);
        }
        PhotoMetadata build = builder.build();
        build.getClass();
        return build;
    }

    public static /* synthetic */ PhotoMetadata photoMetadata$default(String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return photoMetadata(str, function1);
    }
}
