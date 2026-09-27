package com.google.android.libraries.places.api.model;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzal extends EVSearchOptions {
    private final Double zza;
    private final List zzb;

    public zzal(Double d, List list) {
        this.zza = d;
        this.zzb = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EVSearchOptions) {
            EVSearchOptions eVSearchOptions = (EVSearchOptions) obj;
            Double d = this.zza;
            if (d != null ? d.equals(eVSearchOptions.getMinimumChargingRateKw()) : eVSearchOptions.getMinimumChargingRateKw() == null) {
                List list = this.zzb;
                if (list != null ? list.equals(eVSearchOptions.getConnectorTypes()) : eVSearchOptions.getConnectorTypes() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions
    public final List<EVConnectorType> getConnectorTypes() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.EVSearchOptions
    public final Double getMinimumChargingRateKw() {
        return this.zza;
    }

    public final int hashCode() {
        int hashCode;
        Double d = this.zza;
        int i = 0;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        List list = this.zzb;
        if (list != null) {
            i = list.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        Double d = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 55 + valueOf.length() + 1);
        sb.append("EVSearchOptions{minimumChargingRateKw=");
        sb.append(d);
        sb.append(", connectorTypes=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
