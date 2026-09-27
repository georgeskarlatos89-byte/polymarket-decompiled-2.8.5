package com.google.android.libraries.places.widget.internal.placedetails;

import defpackage.sv6;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzca {
    private final boolean zza;
    private final List zzb;
    private final int zzc;
    private final int zzd;

    public zzca(boolean z, List list, int i, int i2) {
        list.getClass();
        this.zza = z;
        this.zzb = list;
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzca)) {
            return false;
        }
        zzca zzcaVar = (zzca) obj;
        if (this.zza == zzcaVar.zza && Intrinsics.areEqual(this.zzb, zzcaVar.zzb) && this.zzc == zzcaVar.zzc && this.zzd == zzcaVar.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() + (Boolean.hashCode(this.zza) * 31);
        int hashCode2 = Integer.hashCode(this.zzc);
        return Integer.hashCode(this.zzd) + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        boolean z = this.zza;
        int length = String.valueOf(z).length();
        List list = this.zzb;
        int length2 = String.valueOf(list).length();
        int i = this.zzc;
        int length3 = String.valueOf(i).length();
        int i2 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 51 + length2 + 29 + length3 + 29 + String.valueOf(i2).length() + 1);
        sb.append("RequestConfiguration(mediaRequested=");
        sb.append(z);
        sb.append(", fieldsToLoad=");
        sb.append(list);
        sv6.w(i, i2, ", thumbSizeDimensionInPixels=", ", screenMaxDimensionInPixels=", sb);
        sb.append(")");
        return sb.toString();
    }

    public final boolean zza() {
        return this.zza;
    }

    public final List zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }
}
