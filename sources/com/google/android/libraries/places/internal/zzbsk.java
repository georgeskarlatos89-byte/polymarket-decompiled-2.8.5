package com.google.android.libraries.places.internal;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbsk {
    protected volatile zzbsz zza;
    private final zzbsz zzb;
    private final zzbrh zzc;
    private volatile zzbqq zzd;
    private volatile boolean zze;

    public zzbsk(zzbsz zzbszVar) {
        if (zzbszVar != null) {
            this.zza = zzbszVar;
            this.zzb = zzbszVar.zzbV();
            int i = zzbrh.zzb;
            int i2 = zzbqe.zza;
            this.zzc = zzbrh.zza;
            this.zzd = null;
            this.zze = false;
            return;
        }
        dmk.v("message cannot be null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbsk) {
            zzbsk zzbskVar = (zzbsk) obj;
            if (this.zzd != null && zzbskVar.zzd != null && this.zzc == zzbskVar.zzc && this.zzd.equals(zzbskVar.zzd)) {
                return true;
            }
            return zza().equals(zzbskVar.zza());
        }
        return zza().equals(obj);
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    public final String toString() {
        return zza().toString();
    }

    public final zzbsz zza() {
        try {
            return this.zza;
        } catch (zzbsm unused) {
            zzbrh.zza();
            return this.zzb;
        }
    }

    public final int zzb() {
        if (this.zzd != null) {
            return this.zzd.zzb();
        }
        return this.zza.zzbE();
    }

    public final zzbqq zzc() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            try {
                if (this.zzd != null) {
                    return this.zzd;
                }
                this.zzd = this.zza.zzbr();
                return this.zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
