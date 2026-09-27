package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.ConnectorAggregation;
import com.google.android.libraries.places.api.model.EVConnectorType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/android/libraries/places/api/model/EVConnectorType;", "type", "", "maxChargeRateKw", "", "count", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/ConnectorAggregation$Builder;", "", "actions", "Lcom/google/android/libraries/places/api/model/ConnectorAggregation;", "connectorAggregation", "(Lcom/google/android/libraries/places/api/model/EVConnectorType;DILkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/model/ConnectorAggregation;", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConnectorAggregationKt {
    public static final ConnectorAggregation connectorAggregation(EVConnectorType eVConnectorType, double d, int i, Function1<? super ConnectorAggregation.Builder, Unit> function1) {
        eVConnectorType.getClass();
        ConnectorAggregation.Builder builder = ConnectorAggregation.builder(eVConnectorType, Double.valueOf(d), Integer.valueOf(i));
        if (function1 != null) {
            function1.invoke(builder);
        }
        ConnectorAggregation build = builder.build();
        build.getClass();
        return build;
    }

    public static /* synthetic */ ConnectorAggregation connectorAggregation$default(EVConnectorType eVConnectorType, double d, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        return connectorAggregation(eVConnectorType, d, i, function1);
    }
}
