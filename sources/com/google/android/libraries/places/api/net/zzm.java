package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import defpackage.dmk;
import defpackage.p23;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzm extends FindCurrentPlaceRequest.Builder {
    private List zza;
    private p23 zzb;

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    public final p23 getCancellationToken() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    public final FindCurrentPlaceRequest.Builder setCancellationToken(p23 p23Var) {
        this.zzb = p23Var;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    public final FindCurrentPlaceRequest.Builder zza(List list) {
        if (list != null) {
            this.zza = list;
            return this;
        }
        dmk.s("Null placeFields");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    public final FindCurrentPlaceRequest zzb() {
        List list = this.zza;
        if (list != null) {
            return new zzn(list, this.zzb, null);
        }
        dmk.n("Missing required properties: placeFields");
        return null;
    }
}
