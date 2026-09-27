package com.google.android.libraries.places.widget.internal.placedetails;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import defpackage.gpc;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzda {
    private final PhotoMetadata zza;
    private final int zzb;
    private final gpc zzc;

    public zzda(PhotoMetadata photoMetadata, int i, gpc gpcVar) {
        photoMetadata.getClass();
        gpcVar.getClass();
        this.zza = photoMetadata;
        this.zzb = i;
        this.zzc = gpcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzda)) {
            return false;
        }
        zzda zzdaVar = (zzda) obj;
        if (Intrinsics.areEqual(this.zza, zzdaVar.zza) && this.zzb == zzdaVar.zzb && Intrinsics.areEqual(this.zzc, zzdaVar.zzc)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.zzb) + (this.zza.hashCode() * 31);
        return this.zzc.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        PhotoMetadata photoMetadata = this.zza;
        int length = String.valueOf(photoMetadata).length();
        int i = this.zzb;
        int length2 = String.valueOf(i).length();
        gpc gpcVar = this.zzc;
        StringBuilder sb = new StringBuilder(length + 40 + length2 + 14 + String.valueOf(gpcVar).length() + 1);
        sb.append("PhotoUriRequest(metadata=");
        sb.append(photoMetadata);
        sb.append(", maxDimension=");
        sb.append(i);
        sb.append(", destination=");
        sb.append(gpcVar);
        sb.append(")");
        return sb.toString();
    }

    public final PhotoMetadata zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final gpc zzc() {
        return this.zzc;
    }
}
