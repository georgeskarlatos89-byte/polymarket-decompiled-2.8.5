package com.google.android.libraries.places.internal;

import defpackage.brn;
import defpackage.sv6;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbxw {
    private final zzbxv zza;
    private final zzccd zzb;

    private zzbxw(zzbxv zzbxvVar, zzccd zzccdVar) {
        brn.m(zzbxvVar, "state is null");
        this.zza = zzbxvVar;
        brn.m(zzccdVar, "status is null");
        this.zzb = zzccdVar;
    }

    public static zzbxw zza(zzbxv zzbxvVar) {
        boolean z;
        if (zzbxvVar != zzbxv.TRANSIENT_FAILURE) {
            z = true;
        } else {
            z = false;
        }
        brn.g("state is TRANSIENT_ERROR. Use forError() instead", z);
        return new zzbxw(zzbxvVar, zzccd.zza);
    }

    public static zzbxw zzb(zzccd zzccdVar) {
        brn.g("The error status must not be OK", !zzccdVar.zzj());
        return new zzbxw(zzbxv.TRANSIENT_FAILURE, zzccdVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbxw)) {
            return false;
        }
        zzbxw zzbxwVar = (zzbxw) obj;
        if (!this.zza.equals(zzbxwVar.zza) || !this.zzb.equals(zzbxwVar.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ this.zzb.hashCode();
    }

    public final String toString() {
        zzccd zzccdVar = this.zzb;
        boolean zzj = zzccdVar.zzj();
        zzbxv zzbxvVar = this.zza;
        if (zzj) {
            return zzbxvVar.toString();
        }
        String valueOf = String.valueOf(zzbxvVar);
        String valueOf2 = String.valueOf(zzccdVar);
        return sv6.p(new StringBuilder(valueOf.length() + 1 + valueOf2.length() + 1), valueOf, "(", valueOf2, ")");
    }

    public final zzbxv zzc() {
        return this.zza;
    }

    public final zzccd zzd() {
        return this.zzb;
    }
}
