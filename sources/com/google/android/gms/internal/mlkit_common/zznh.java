package com.google.android.gms.internal.mlkit_common;

import defpackage.dkn;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zznh {
    private final String zza;
    private final zznf zzc;
    private final String zze;
    private final zzne zzf;
    private final String zzb = null;
    private final String zzd = null;
    private final Long zzg = null;
    private final Boolean zzh = null;
    private final Boolean zzi = null;

    public /* synthetic */ zznh(zznd zzndVar, zzng zzngVar) {
        this.zza = zznd.zzi(zzndVar);
        this.zzc = zznd.zzf(zzndVar);
        this.zze = zznd.zzh(zzndVar);
        this.zzf = zznd.zze(zzndVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zznh)) {
            return false;
        }
        zznh zznhVar = (zznh) obj;
        if (dkn.b(this.zza, zznhVar.zza) && dkn.b(null, null) && dkn.b(this.zzc, zznhVar.zzc) && dkn.b(null, null) && dkn.b(this.zze, zznhVar.zze) && dkn.b(this.zzf, zznhVar.zzf) && dkn.b(null, null) && dkn.b(null, null) && dkn.b(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, null, this.zzc, null, this.zze, this.zzf, null, null, null});
    }

    public final zzne zza() {
        return this.zzf;
    }

    public final zznf zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zza;
    }
}
