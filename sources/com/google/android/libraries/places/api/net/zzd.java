package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import defpackage.dmk;
import defpackage.p23;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzd extends FetchPlaceRequest.Builder {
    private String zza;
    private List zzb;
    private AutocompleteSessionToken zzc;
    private p23 zzd;
    private String zze;

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final p23 getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final String getRegionCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final AutocompleteSessionToken getSessionToken() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final FetchPlaceRequest.Builder setCancellationToken(p23 p23Var) {
        this.zzd = p23Var;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final FetchPlaceRequest.Builder setRegionCode(String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final FetchPlaceRequest.Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken) {
        this.zzc = autocompleteSessionToken;
        return this;
    }

    public final FetchPlaceRequest.Builder zza(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        dmk.s("Null placeId");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final FetchPlaceRequest.Builder zzb(List list) {
        if (list != null) {
            this.zzb = list;
            return this;
        }
        dmk.s("Null placeFields");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest.Builder
    public final FetchPlaceRequest zzc() {
        List list;
        String str = this.zza;
        if (str != null && (list = this.zzb) != null) {
            return new zze(str, list, this.zzc, this.zzd, this.zze, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" placeId");
        }
        if (this.zzb == null) {
            sb.append(" placeFields");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
