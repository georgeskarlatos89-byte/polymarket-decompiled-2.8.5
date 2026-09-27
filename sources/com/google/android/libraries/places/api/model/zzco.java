package com.google.android.libraries.places.api.model;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzco extends RouteModifiers {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzco(boolean z, boolean z2, boolean z3, boolean z4) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RouteModifiers) {
            RouteModifiers routeModifiers = (RouteModifiers) obj;
            if (this.zza == routeModifiers.isTollAvoided() && this.zzb == routeModifiers.isHighwayAvoided() && this.zzc == routeModifiers.isFerryAvoided() && this.zzd == routeModifiers.isIndoorAvoided()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 1231;
        if (true != this.zza) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true != this.zzb) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i5 = i ^ 1000003;
        if (true != this.zzc) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        int i6 = ((((i5 * 1000003) ^ i2) * 1000003) ^ i3) * 1000003;
        if (true != this.zzd) {
            i4 = 1237;
        }
        return i6 ^ i4;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers
    public final boolean isFerryAvoided() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers
    public final boolean isHighwayAvoided() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers
    public final boolean isIndoorAvoided() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.RouteModifiers
    public final boolean isTollAvoided() {
        return this.zza;
    }

    public final String toString() {
        boolean z = this.zza;
        int length = String.valueOf(z).length();
        boolean z2 = this.zzb;
        int length2 = String.valueOf(z2).length();
        boolean z3 = this.zzc;
        int length3 = String.valueOf(z3).length();
        boolean z4 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 44 + length2 + 15 + length3 + 16 + String.valueOf(z4).length() + 1);
        sb.append("RouteModifiers{tollAvoided=");
        sb.append(z);
        sb.append(", highwayAvoided=");
        sb.append(z2);
        sb.append(", ferryAvoided=");
        sb.append(z3);
        sb.append(", indoorAvoided=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }
}
