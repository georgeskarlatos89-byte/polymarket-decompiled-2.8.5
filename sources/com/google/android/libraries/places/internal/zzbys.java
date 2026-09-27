package com.google.android.libraries.places.internal;

import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbys {
    private String zza;
    private zzbyt zzb;
    private Long zzc;
    private zzbzk zzd;

    public final zzbys zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzbys zzb(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    public final zzbys zzc(zzbyt zzbytVar) {
        this.zzb = zzbytVar;
        return this;
    }

    public final zzbys zzd(zzbzk zzbzkVar) {
        this.zzd = zzbzkVar;
        return this;
    }

    public final zzbyu zze() {
        brn.m(this.zza, "description");
        brn.m(this.zzb, "severity");
        brn.m(this.zzc, "timestampNanos");
        return new zzbyu(this.zza, this.zzb, this.zzc.longValue(), null, this.zzd, null);
    }
}
