package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import defpackage.dkn;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzqu {
    private final zzqs zza;
    private final Float zzb;
    private final Boolean zzc;

    public /* synthetic */ zzqu(zzqr zzqrVar, zzqt zzqtVar) {
        this.zza = zzqr.zzd(zzqrVar);
        this.zzb = zzqr.zzg(zzqrVar);
        this.zzc = zzqr.zzf(zzqrVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzqu)) {
            return false;
        }
        zzqu zzquVar = (zzqu) obj;
        if (dkn.b(this.zza, zzquVar.zza) && dkn.b(this.zzb, zzquVar.zzb) && dkn.b(this.zzc, zzquVar.zzc)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
    }

    public final zzqs zza() {
        return this.zza;
    }

    public final Boolean zzb() {
        return this.zzc;
    }

    public final Float zzc() {
        return this.zzb;
    }
}
