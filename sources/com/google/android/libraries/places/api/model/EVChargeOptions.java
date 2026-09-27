package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class EVChargeOptions implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public abstract EVChargeOptions build();

        public abstract Builder setConnectorAggregations(List<ConnectorAggregation> list);

        public abstract Builder setConnectorCount(Integer num);
    }

    public static EVChargeOptions newInstance(Integer num, List<ConnectorAggregation> list) {
        zzai zzaiVar = new zzai();
        zzaiVar.setConnectorCount(num);
        zzaiVar.setConnectorAggregations(list);
        return zzaiVar.build();
    }

    public abstract List<ConnectorAggregation> getConnectorAggregations();

    public abstract Integer getConnectorCount();
}
