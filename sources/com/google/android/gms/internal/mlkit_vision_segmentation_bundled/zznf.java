package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import defpackage.bd0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zznf {
    private zzng zza;
    private Integer zzb;

    public static /* bridge */ /* synthetic */ zzng zzc(zznf zznfVar) {
        return zznfVar.zza;
    }

    public static /* bridge */ /* synthetic */ Integer zze(zznf zznfVar) {
        return zznfVar.zzb;
    }

    public final zznf zza(zzng zzngVar) {
        this.zza = zzngVar;
        return this;
    }

    public final zznf zzb(Integer num) {
        this.zzb = Integer.valueOf(num.intValue() & bd0.API_PRIORITY_OTHER);
        return this;
    }

    public final zzni zzd() {
        return new zzni(this, null);
    }
}
