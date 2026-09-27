package com.google.android.libraries.places.internal;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbuc extends zzbue {
    public zzbuc(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.libraries.places.internal.zzbue
    public final boolean zza(Object obj, long j) {
        if (zzbuf.zza) {
            return zzbuf.zzp(obj, j);
        }
        return zzbuf.zzq(obj, j);
    }

    @Override // com.google.android.libraries.places.internal.zzbue
    public final void zzb(Object obj, long j, boolean z) {
        if (zzbuf.zza) {
            zzbuf.zzr(obj, j, z);
        } else {
            zzbuf.zzs(obj, j, z);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbue
    public final float zzc(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.libraries.places.internal.zzbue
    public final void zzd(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.libraries.places.internal.zzbue
    public final double zze(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.libraries.places.internal.zzbue
    public final void zzf(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }
}
