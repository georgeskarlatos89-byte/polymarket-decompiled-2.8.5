package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;
import defpackage.dmk;
import defpackage.k84;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzce extends RectangularBounds {
    private final LatLng zza;
    private final LatLng zzb;

    public zzce(LatLng latLng, LatLng latLng2) {
        if (latLng != null) {
            this.zza = latLng;
            if (latLng2 != null) {
                this.zzb = latLng2;
                return;
            } else {
                dmk.s("Null northeast");
                throw null;
            }
        }
        dmk.s("Null southwest");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RectangularBounds) {
            RectangularBounds rectangularBounds = (RectangularBounds) obj;
            if (this.zza.equals(rectangularBounds.getSouthwest()) && this.zzb.equals(rectangularBounds.getNortheast())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.RectangularBounds
    public final LatLng getNortheast() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.RectangularBounds
    public final LatLng getSouthwest() {
        return this.zza;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        return this.zzb.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        String latLng = this.zza.toString();
        int length = latLng.length();
        String latLng2 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(length + 40 + latLng2.length() + 1);
        k84.q(sb, "RectangularBounds{southwest=", latLng, ", northeast=", latLng2);
        sb.append("}");
        return sb.toString();
    }
}
