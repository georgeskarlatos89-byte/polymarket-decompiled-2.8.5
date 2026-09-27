package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import defpackage.bd0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzdm {
    private zzdp zza;
    private Integer zzb;
    private zznb zzc;

    public static /* bridge */ /* synthetic */ zzdp zzd(zzdm zzdmVar) {
        return zzdmVar.zza;
    }

    public static /* bridge */ /* synthetic */ zznb zzf(zzdm zzdmVar) {
        return zzdmVar.zzc;
    }

    public static /* bridge */ /* synthetic */ Integer zzg(zzdm zzdmVar) {
        return zzdmVar.zzb;
    }

    public final zzdm zza(Integer num) {
        this.zzb = Integer.valueOf(num.intValue() & bd0.API_PRIORITY_OTHER);
        return this;
    }

    public final zzdm zzb(zznb zznbVar) {
        this.zzc = zznbVar;
        return this;
    }

    public final zzdm zzc(zzdp zzdpVar) {
        this.zza = zzdpVar;
        return this;
    }

    public final zzdr zze() {
        return new zzdr(this, null);
    }
}
