package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.libraries.places.api.model.RoutingSummary;
import defpackage.dmk;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcr extends RoutingSummary.Builder {
    private List zza;
    private Uri zzb;

    @Override // com.google.android.libraries.places.api.model.RoutingSummary.Builder
    public final RoutingSummary autoBuild() {
        List list = this.zza;
        if (list != null) {
            return new zzhg(list, this.zzb);
        }
        dmk.n("Missing required properties: legs");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingSummary.Builder
    public final List<Leg> getLegs() {
        List<Leg> list = this.zza;
        if (list != null) {
            return list;
        }
        dmk.n("Property \"legs\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingSummary.Builder
    public final RoutingSummary.Builder setDirectionsUri(Uri uri) {
        this.zzb = uri;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingSummary.Builder
    public final RoutingSummary.Builder setLegs(List<Leg> list) {
        if (list != null) {
            this.zza = list;
            return this;
        }
        dmk.s("Null legs");
        return null;
    }
}
