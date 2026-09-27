package com.google.android.libraries.places.internal;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcse {
    private zzcsd zza;
    private final zzcqz zzb = new zzcqz();

    public final zzcse zza(zzcsd zzcsdVar) {
        this.zza = zzcsdVar;
        return this;
    }

    public final zzcse zzb(String str, String str2) {
        this.zzb.zza(str, str2);
        return this;
    }

    public final zzcsf zzc() {
        if (this.zza != null) {
            return new zzcsf(this, null);
        }
        dmk.n("url == null");
        return null;
    }

    public final /* synthetic */ zzcsd zzd() {
        return this.zza;
    }

    public final /* synthetic */ zzcqz zze() {
        return this.zzb;
    }
}
