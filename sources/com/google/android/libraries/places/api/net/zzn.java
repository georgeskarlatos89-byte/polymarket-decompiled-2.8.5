package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;
import defpackage.k84;
import defpackage.p23;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzn extends FindCurrentPlaceRequest {
    private final List zza;
    private final p23 zzb;

    public /* synthetic */ zzn(List list, p23 p23Var, byte[] bArr) {
        this.zza = list;
        this.zzb = p23Var;
    }

    public final boolean equals(Object obj) {
        p23 p23Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindCurrentPlaceRequest) {
            FindCurrentPlaceRequest findCurrentPlaceRequest = (FindCurrentPlaceRequest) obj;
            if (this.zza.equals(findCurrentPlaceRequest.getPlaceFields()) && ((p23Var = this.zzb) != null ? p23Var.equals(findCurrentPlaceRequest.getCancellationToken()) : findCurrentPlaceRequest.getCancellationToken() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest, com.google.android.libraries.places.internal.zzqk
    public final p23 getCancellationToken() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest
    public final List<Place.Field> getPlaceFields() {
        return this.zza;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.zza.hashCode() ^ 1000003;
        p23 p23Var = this.zzb;
        if (p23Var == null) {
            hashCode = 0;
        } else {
            hashCode = p23Var.hashCode();
        }
        return hashCode ^ (hashCode2 * 1000003);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(length + 56 + valueOf.length() + 1);
        k84.q(sb, "FindCurrentPlaceRequest{placeFields=", obj, ", cancellationToken=", valueOf);
        sb.append("}");
        return sb.toString();
    }
}
