package com.google.android.libraries.places.internal;

import defpackage.brn;
import defpackage.ckn;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcec {
    private String zza = "unknown-authority";
    private zzbww zzb = zzbww.zza;
    private String zzc;
    private zzbyr zzd;

    public zzcec() {
        new zzceb(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcec)) {
            return false;
        }
        zzcec zzcecVar = (zzcec) obj;
        if (!this.zza.equals(zzcecVar.zza) || !this.zzb.equals(zzcecVar.zzb) || !ckn.a(this.zzc, zzcecVar.zzc) || !ckn.a(this.zzd, zzcecVar.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd});
    }

    public final String zza() {
        return this.zza;
    }

    public final zzcec zzb(String str) {
        brn.m(str, "authority");
        this.zza = str;
        return this;
    }

    public final zzbww zzc() {
        return this.zzb;
    }

    public final zzcec zzd(zzbww zzbwwVar) {
        brn.m(zzbwwVar, "eagAttributes");
        this.zzb = zzbwwVar;
        return this;
    }

    public final String zze() {
        return this.zzc;
    }

    public final zzcec zzf(String str) {
        this.zzc = str;
        return this;
    }

    public final zzbyr zzg() {
        return this.zzd;
    }

    public final zzcec zzh(zzbyr zzbyrVar) {
        this.zzd = zzbyrVar;
        return this;
    }
}
