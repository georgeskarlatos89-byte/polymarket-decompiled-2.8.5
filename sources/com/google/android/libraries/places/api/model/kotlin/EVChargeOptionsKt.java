package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.ConnectorAggregation;
import com.google.android.libraries.places.api.model.EVChargeOptions;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"evChargeOptions", "Lcom/google/android/libraries/places/api/model/EVChargeOptions;", "connectorCount", "", "connectorAggregations", "", "Lcom/google/android/libraries/places/api/model/ConnectorAggregation;", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EVChargeOptionsKt {
    public static final EVChargeOptions evChargeOptions(int i, List<? extends ConnectorAggregation> list) {
        list.getClass();
        EVChargeOptions newInstance = EVChargeOptions.newInstance(Integer.valueOf(i), list);
        newInstance.getClass();
        return newInstance;
    }
}
