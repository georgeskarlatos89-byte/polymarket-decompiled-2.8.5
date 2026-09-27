package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import defpackage.k84;
import defpackage.p23;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzb extends FetchPhotoRequest {
    private final Integer zza;
    private final Integer zzb;
    private final PhotoMetadata zzc;
    private final p23 zzd;

    public /* synthetic */ zzb(Integer num, Integer num2, PhotoMetadata photoMetadata, p23 p23Var, byte[] bArr) {
        this.zza = num;
        this.zzb = num2;
        this.zzc = photoMetadata;
        this.zzd = p23Var;
    }

    public final boolean equals(Object obj) {
        p23 p23Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPhotoRequest) {
            FetchPhotoRequest fetchPhotoRequest = (FetchPhotoRequest) obj;
            Integer num = this.zza;
            if (num != null ? num.equals(fetchPhotoRequest.getMaxWidth()) : fetchPhotoRequest.getMaxWidth() == null) {
                Integer num2 = this.zzb;
                if (num2 != null ? num2.equals(fetchPhotoRequest.getMaxHeight()) : fetchPhotoRequest.getMaxHeight() == null) {
                    if (this.zzc.equals(fetchPhotoRequest.getPhotoMetadata()) && ((p23Var = this.zzd) != null ? p23Var.equals(fetchPhotoRequest.getCancellationToken()) : fetchPhotoRequest.getCancellationToken() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest, com.google.android.libraries.places.internal.zzqk
    public final p23 getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    public final Integer getMaxHeight() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    public final Integer getMaxWidth() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    public final PhotoMetadata getPhotoMetadata() {
        return this.zzc;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.zza;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        Integer num2 = this.zzb;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int hashCode3 = ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ this.zzc.hashCode();
        p23 p23Var = this.zzd;
        if (p23Var != null) {
            i = p23Var.hashCode();
        }
        return (hashCode3 * 1000003) ^ i;
    }

    public final String toString() {
        p23 p23Var = this.zzd;
        String obj = this.zzc.toString();
        String valueOf = String.valueOf(p23Var);
        Integer num = this.zza;
        int length = String.valueOf(num).length();
        Integer num2 = this.zzb;
        int length2 = String.valueOf(num2).length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 16 + obj.length() + 20 + valueOf.length() + 1);
        sb.append("FetchPhotoRequest{maxWidth=");
        sb.append(num);
        sb.append(", maxHeight=");
        sb.append(num2);
        k84.q(sb, ", photoMetadata=", obj, ", cancellationToken=", valueOf);
        sb.append("}");
        return sb.toString();
    }
}
