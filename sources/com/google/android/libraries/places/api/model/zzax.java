package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.Landmark;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzax extends Landmark.Builder {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private List zze;
    private Landmark.SpatialRelationship zzf;
    private Double zzg;
    private Double zzh;

    @Override // com.google.android.libraries.places.api.model.Landmark.Builder
    public final Landmark.Builder setDisplayName(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Landmark.Builder
    public final Landmark.Builder setDisplayNameLanguageCode(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Landmark.Builder
    public final Landmark.Builder setId(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Landmark.Builder
    public final Landmark.Builder setResourceName(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Landmark.Builder
    public final Landmark.Builder setSpatialRelationship(Landmark.SpatialRelationship spatialRelationship) {
        this.zzf = spatialRelationship;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Landmark.Builder
    public final Landmark.Builder setStraightLineDistanceMeters(Double d) {
        this.zzg = d;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Landmark.Builder
    public final Landmark.Builder setTravelDistanceMeters(Double d) {
        this.zzh = d;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Landmark.Builder
    public final Landmark.Builder setTypes(List<String> list) {
        this.zze = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Landmark.Builder
    public final List zza() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.Landmark.Builder
    public final Landmark zzb() {
        return new zzfk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }
}
