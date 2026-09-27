package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import java.time.Instant;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ConnectorAggregation implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract ConnectorAggregation build();

        public abstract Instant getAvailabilityLastUpdateTime();

        public abstract Integer getAvailableCount();

        public abstract Integer getOutOfServiceCount();

        public abstract Builder setAvailabilityLastUpdateTime(Instant instant);

        public abstract Builder setAvailableCount(Integer num);

        public abstract Builder setCount(Integer num);

        public abstract Builder setMaxChargeRateKw(Double d);

        public abstract Builder setOutOfServiceCount(Integer num);

        public abstract Builder setType(EVConnectorType eVConnectorType);
    }

    public static Builder builder(EVConnectorType eVConnectorType, Double d, Integer num) {
        zzy zzyVar = new zzy();
        zzyVar.setType(eVConnectorType);
        zzyVar.setMaxChargeRateKw(d);
        zzyVar.setCount(num);
        return zzyVar;
    }

    public abstract Instant getAvailabilityLastUpdateTime();

    public abstract Integer getAvailableCount();

    public abstract Integer getCount();

    public abstract Double getMaxChargeRateKw();

    public abstract Integer getOutOfServiceCount();

    public abstract EVConnectorType getType();
}
