package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import defpackage.dkn;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzni {
    private final zzng zza;
    private final Integer zzb;
    private final Integer zzc = null;
    private final Boolean zzd = null;

    public /* synthetic */ zzni(zznf zznfVar, zznh zznhVar) {
        this.zza = zznf.zzc(zznfVar);
        this.zzb = zznf.zze(zznfVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzni)) {
            return false;
        }
        zzni zzniVar = (zzni) obj;
        if (dkn.b(this.zza, zzniVar.zza) && dkn.b(this.zzb, zzniVar.zzb) && dkn.b(null, null) && dkn.b(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, null, null});
    }

    public final zzng zza() {
        return this.zza;
    }

    public final Integer zzb() {
        return this.zzb;
    }
}
