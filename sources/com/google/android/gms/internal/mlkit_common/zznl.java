package com.google.android.gms.internal.mlkit_common;

import defpackage.dkn;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zznl {
    private final zznh zza;
    private final zznj zzb = null;
    private final zznj zzc = null;
    private final Boolean zzd = null;

    public /* synthetic */ zznl(zzni zzniVar, zznk zznkVar) {
        this.zza = zzni.zza(zzniVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zznl) && dkn.b(this.zza, ((zznl) obj).zza) && dkn.b(null, null) && dkn.b(null, null) && dkn.b(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, null, null, null});
    }

    public final zznh zza() {
        return this.zza;
    }
}
