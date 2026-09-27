package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.Landmark;
import defpackage.k84;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzay extends Landmark {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final Landmark.SpatialRelationship zzf;
    private final Double zzg;
    private final Double zzh;

    public zzay(String str, String str2, String str3, String str4, List list, Landmark.SpatialRelationship spatialRelationship, Double d, Double d2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = list;
        this.zzf = spatialRelationship;
        this.zzg = d;
        this.zzh = d2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Landmark) {
            Landmark landmark = (Landmark) obj;
            String str = this.zza;
            if (str != null ? str.equals(landmark.getResourceName()) : landmark.getResourceName() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(landmark.getId()) : landmark.getId() == null) {
                    String str3 = this.zzc;
                    if (str3 != null ? str3.equals(landmark.getDisplayName()) : landmark.getDisplayName() == null) {
                        String str4 = this.zzd;
                        if (str4 != null ? str4.equals(landmark.getDisplayNameLanguageCode()) : landmark.getDisplayNameLanguageCode() == null) {
                            List list = this.zze;
                            if (list != null ? list.equals(landmark.getTypes()) : landmark.getTypes() == null) {
                                Landmark.SpatialRelationship spatialRelationship = this.zzf;
                                if (spatialRelationship != null ? spatialRelationship.equals(landmark.getSpatialRelationship()) : landmark.getSpatialRelationship() == null) {
                                    Double d = this.zzg;
                                    if (d != null ? d.equals(landmark.getStraightLineDistanceMeters()) : landmark.getStraightLineDistanceMeters() == null) {
                                        Double d2 = this.zzh;
                                        if (d2 != null ? d2.equals(landmark.getTravelDistanceMeters()) : landmark.getTravelDistanceMeters() == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.Landmark
    public final String getDisplayName() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.Landmark
    public final String getDisplayNameLanguageCode() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.Landmark
    public final String getId() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Landmark
    public final String getResourceName() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Landmark
    public final Landmark.SpatialRelationship getSpatialRelationship() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.Landmark
    public final Double getStraightLineDistanceMeters() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.Landmark
    public final Double getTravelDistanceMeters() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.model.Landmark
    public final List<String> getTypes() {
        return this.zze;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        String str = this.zza;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.zzb;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        String str3 = this.zzc;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        String str4 = this.zzd;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        List list = this.zze;
        if (list == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list.hashCode();
        }
        int i5 = (i4 ^ hashCode5) * 1000003;
        Landmark.SpatialRelationship spatialRelationship = this.zzf;
        if (spatialRelationship == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = spatialRelationship.hashCode();
        }
        int i6 = (i5 ^ hashCode6) * 1000003;
        Double d = this.zzg;
        if (d == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = d.hashCode();
        }
        int i7 = (i6 ^ hashCode7) * 1000003;
        Double d2 = this.zzh;
        if (d2 != null) {
            i = d2.hashCode();
        }
        return i7 ^ i;
    }

    public final String toString() {
        Landmark.SpatialRelationship spatialRelationship = this.zzf;
        String valueOf = String.valueOf(this.zze);
        String valueOf2 = String.valueOf(spatialRelationship);
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzc;
        int length3 = String.valueOf(str3).length();
        String str4 = this.zzd;
        int length4 = String.valueOf(str4).length();
        int length5 = valueOf.length();
        int length6 = valueOf2.length();
        Double d = this.zzg;
        int length7 = String.valueOf(d).length();
        Double d2 = this.zzh;
        StringBuilder sb = new StringBuilder(length + 27 + length2 + 14 + length3 + 26 + length4 + 8 + length5 + 22 + length6 + 29 + length7 + 23 + String.valueOf(d2).length() + 1);
        k84.q(sb, "Landmark{resourceName=", str, ", id=", str2);
        k84.q(sb, ", displayName=", str3, ", displayNameLanguageCode=", str4);
        k84.q(sb, ", types=", valueOf, ", spatialRelationship=", valueOf2);
        sb.append(", straightLineDistanceMeters=");
        sb.append(d);
        sb.append(", travelDistanceMeters=");
        sb.append(d2);
        sb.append("}");
        return sb.toString();
    }
}
