package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import defpackage.ix2;
import defpackage.k84;
import defpackage.p23;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zze extends FetchPlaceRequest {
    private final String zza;
    private final List zzb;
    private final AutocompleteSessionToken zzc;
    private final p23 zzd;
    private final String zze;

    public /* synthetic */ zze(String str, List list, AutocompleteSessionToken autocompleteSessionToken, p23 p23Var, String str2, byte[] bArr) {
        this.zza = str;
        this.zzb = list;
        this.zzc = autocompleteSessionToken;
        this.zzd = p23Var;
        this.zze = str2;
    }

    public final boolean equals(Object obj) {
        AutocompleteSessionToken autocompleteSessionToken;
        p23 p23Var;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPlaceRequest) {
            FetchPlaceRequest fetchPlaceRequest = (FetchPlaceRequest) obj;
            if (this.zza.equals(fetchPlaceRequest.getPlaceId()) && this.zzb.equals(fetchPlaceRequest.getPlaceFields()) && ((autocompleteSessionToken = this.zzc) != null ? autocompleteSessionToken.equals(fetchPlaceRequest.getSessionToken()) : fetchPlaceRequest.getSessionToken() == null) && ((p23Var = this.zzd) != null ? p23Var.equals(fetchPlaceRequest.getCancellationToken()) : fetchPlaceRequest.getCancellationToken() == null) && ((str = this.zze) != null ? str.equals(fetchPlaceRequest.getRegionCode()) : fetchPlaceRequest.getRegionCode() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest, com.google.android.libraries.places.internal.zzqk
    public final p23 getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final List<Place.Field> getPlaceFields() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final String getPlaceId() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final String getRegionCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceRequest
    public final AutocompleteSessionToken getSessionToken() {
        return this.zzc;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        AutocompleteSessionToken autocompleteSessionToken = this.zzc;
        int i = 0;
        if (autocompleteSessionToken == null) {
            hashCode = 0;
        } else {
            hashCode = autocompleteSessionToken.hashCode();
        }
        int i2 = ((hashCode3 * 1000003) ^ hashCode) * 1000003;
        p23 p23Var = this.zzd;
        if (p23Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = p23Var.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str = this.zze;
        if (str != null) {
            i = str.hashCode();
        }
        return i3 ^ i;
    }

    public final String toString() {
        String obj = this.zzb.toString();
        int length = obj.length();
        p23 p23Var = this.zzd;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(p23Var);
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        String str = this.zze;
        int length4 = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(str2.length() + 40 + length + 15 + length2 + 20 + length3 + 13 + length4 + 1);
        k84.q(sb, "FetchPlaceRequest{placeId=", str2, ", placeFields=", obj);
        k84.q(sb, ", sessionToken=", valueOf, ", cancellationToken=", valueOf2);
        return ix2.p(sb, ", regionCode=", str, "}");
    }
}
