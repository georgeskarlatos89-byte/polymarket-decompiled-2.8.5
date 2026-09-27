package com.google.android.libraries.places.api.model;

import defpackage.dmk;
import java.time.Instant;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzz extends ConnectorAggregation {
    private final EVConnectorType zza;
    private final Double zzb;
    private final Integer zzc;
    private final Integer zzd;
    private final Integer zze;
    private final Instant zzf;

    public zzz(EVConnectorType eVConnectorType, Double d, Integer num, Integer num2, Integer num3, Instant instant) {
        if (eVConnectorType != null) {
            this.zza = eVConnectorType;
            this.zzb = d;
            this.zzc = num;
            this.zzd = num2;
            this.zze = num3;
            this.zzf = instant;
            return;
        }
        dmk.s("Null type");
        throw null;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        Instant instant;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConnectorAggregation) {
            ConnectorAggregation connectorAggregation = (ConnectorAggregation) obj;
            if (this.zza.equals(connectorAggregation.getType()) && this.zzb.equals(connectorAggregation.getMaxChargeRateKw()) && this.zzc.equals(connectorAggregation.getCount()) && ((num = this.zzd) != null ? num.equals(connectorAggregation.getAvailableCount()) : connectorAggregation.getAvailableCount() == null) && ((num2 = this.zze) != null ? num2.equals(connectorAggregation.getOutOfServiceCount()) : connectorAggregation.getOutOfServiceCount() == null) && ((instant = this.zzf) != null ? instant.equals(connectorAggregation.getAvailabilityLastUpdateTime()) : connectorAggregation.getAvailabilityLastUpdateTime() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final Instant getAvailabilityLastUpdateTime() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final Integer getAvailableCount() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final Integer getCount() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final Double getMaxChargeRateKw() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final Integer getOutOfServiceCount() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation
    public final EVConnectorType getType() {
        return this.zza;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
        Integer num = this.zzd;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = ((hashCode3 * 1000003) ^ hashCode) * 1000003;
        Integer num2 = this.zze;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        Instant instant = this.zzf;
        if (instant != null) {
            i = instant.hashCode();
        }
        return i3 ^ i;
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.zzf);
        Double d = this.zzb;
        int length2 = d.toString().length();
        Integer num = this.zzc;
        int length3 = num.toString().length();
        Integer num2 = this.zzd;
        int length4 = String.valueOf(num2).length();
        Integer num3 = this.zze;
        StringBuilder sb = new StringBuilder(length + 44 + length2 + 8 + length3 + 17 + length4 + 20 + String.valueOf(num3).length() + 29 + valueOf.length() + 1);
        sb.append("ConnectorAggregation{type=");
        sb.append(obj);
        sb.append(", maxChargeRateKw=");
        sb.append(d);
        sb.append(", count=");
        sb.append(num);
        sb.append(", availableCount=");
        sb.append(num2);
        sb.append(", outOfServiceCount=");
        sb.append(num3);
        sb.append(", availabilityLastUpdateTime=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
