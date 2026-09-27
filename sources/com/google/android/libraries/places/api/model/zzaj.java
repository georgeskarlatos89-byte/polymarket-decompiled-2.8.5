package com.google.android.libraries.places.api.model;

import defpackage.dmk;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzaj extends EVChargeOptions {
    private final Integer zza;
    private final List zzb;

    public zzaj(Integer num, List list) {
        this.zza = num;
        if (list != null) {
            this.zzb = list;
        } else {
            dmk.s("Null connectorAggregations");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EVChargeOptions) {
            EVChargeOptions eVChargeOptions = (EVChargeOptions) obj;
            if (this.zza.equals(eVChargeOptions.getConnectorCount()) && this.zzb.equals(eVChargeOptions.getConnectorAggregations())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions
    public final List<ConnectorAggregation> getConnectorAggregations() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.EVChargeOptions
    public final Integer getConnectorCount() {
        return this.zza;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        return this.zzb.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        String obj = this.zzb.toString();
        Integer num = this.zza;
        StringBuilder sb = new StringBuilder(num.toString().length() + 55 + obj.length() + 1);
        sb.append("EVChargeOptions{connectorCount=");
        sb.append(num);
        sb.append(", connectorAggregations=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
