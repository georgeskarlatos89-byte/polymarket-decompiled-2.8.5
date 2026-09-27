package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class EVSearchOptions implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract EVSearchOptions build();

        public abstract List<EVConnectorType> getConnectorTypes();

        public abstract Double getMinimumChargingRateKw();

        public abstract Builder setConnectorTypes(List<EVConnectorType> list);

        public abstract Builder setMinimumChargingRateKw(Double d);
    }

    public static Builder builder() {
        return new zzak();
    }

    public abstract List<EVConnectorType> getConnectorTypes();

    public abstract Double getMinimumChargingRateKw();
}
