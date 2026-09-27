package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.EVChargeOptions;
import defpackage.dmk;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzai extends EVChargeOptions.Builder {
    private Integer zza;
    private List zzb;

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions.Builder
    public final EVChargeOptions build() {
        List list;
        Integer num = this.zza;
        if (num != null && (list = this.zzb) != null) {
            return new zzeu(num, list);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" connectorCount");
        }
        if (this.zzb == null) {
            sb.append(" connectorAggregations");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions.Builder
    public final EVChargeOptions.Builder setConnectorAggregations(List<ConnectorAggregation> list) {
        if (list != null) {
            this.zzb = list;
            return this;
        }
        dmk.s("Null connectorAggregations");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions.Builder
    public final EVChargeOptions.Builder setConnectorCount(Integer num) {
        if (num != null) {
            this.zza = num;
            return this;
        }
        dmk.s("Null connectorCount");
        return null;
    }
}
