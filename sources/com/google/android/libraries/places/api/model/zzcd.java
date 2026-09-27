package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcd extends zzie {
    private LatLng zza;
    private LatLng zzb;

    public final zzie zza(LatLng latLng) {
        if (latLng != null) {
            this.zza = latLng;
            return this;
        }
        dmk.s("Null southwest");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.zzie
    public final zzie zzb(LatLng latLng) {
        if (latLng != null) {
            this.zzb = latLng;
            return this;
        }
        dmk.s("Null northeast");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.zzie
    public final RectangularBounds zzc() {
        LatLng latLng;
        LatLng latLng2 = this.zza;
        if (latLng2 != null && (latLng = this.zzb) != null) {
            return new zzgs(latLng2, latLng);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" southwest");
        }
        if (this.zzb == null) {
            sb.append(" northeast");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
