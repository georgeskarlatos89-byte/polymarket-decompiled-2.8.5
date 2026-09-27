package com.google.android.libraries.places.widget.internal.placedetails;

import com.google.android.libraries.places.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcz {
    private final int zza;
    private final boolean zzb;

    public zzcz(int i, boolean z) {
        this.zza = i;
        this.zzb = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcz)) {
            return false;
        }
        zzcz zzczVar = (zzcz) obj;
        if (this.zza == zzczVar.zza && this.zzb == zzczVar.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.zzb) + (Integer.hashCode(this.zza) * 31);
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        boolean z = this.zzb;
        StringBuilder sb = new StringBuilder(length + 40 + String.valueOf(z).length() + 1);
        sb.append("StarsModel(numWholeStars=");
        sb.append(i);
        sb.append(", showHalfStar=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int zza(int i) {
        int i2 = this.zza;
        if (i < i2) {
            return R.drawable.ratings_full_star;
        }
        if (i == i2) {
            if (this.zzb) {
                return R.drawable.ratings_half_star;
            }
            return R.drawable.ratings_empty_star;
        }
        return R.drawable.ratings_empty_star;
    }
}
