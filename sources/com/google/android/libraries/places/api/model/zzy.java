package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.ConnectorAggregation;
import defpackage.dmk;
import java.time.Instant;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzy extends ConnectorAggregation.Builder {
    private EVConnectorType zza;
    private Double zzb;
    private Integer zzc;
    private Integer zzd;
    private Integer zze;
    private Instant zzf;

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation build() {
        Double d;
        Integer num;
        EVConnectorType eVConnectorType = this.zza;
        if (eVConnectorType != null && (d = this.zzb) != null && (num = this.zzc) != null) {
            return new zzek(eVConnectorType, d, num, this.zzd, this.zze, this.zzf);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" type");
        }
        if (this.zzb == null) {
            sb.append(" maxChargeRateKw");
        }
        if (this.zzc == null) {
            sb.append(" count");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final Instant getAvailabilityLastUpdateTime() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final Integer getAvailableCount() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final Integer getOutOfServiceCount() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation.Builder setAvailabilityLastUpdateTime(Instant instant) {
        this.zzf = instant;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation.Builder setAvailableCount(Integer num) {
        this.zzd = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation.Builder setCount(Integer num) {
        if (num != null) {
            this.zzc = num;
            return this;
        }
        dmk.s("Null count");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation.Builder setMaxChargeRateKw(Double d) {
        if (d != null) {
            this.zzb = d;
            return this;
        }
        dmk.s("Null maxChargeRateKw");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation.Builder setOutOfServiceCount(Integer num) {
        this.zze = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.ConnectorAggregation.Builder
    public final ConnectorAggregation.Builder setType(EVConnectorType eVConnectorType) {
        if (eVConnectorType != null) {
            this.zza = eVConnectorType;
            return this;
        }
        dmk.s("Null type");
        return null;
    }
}
