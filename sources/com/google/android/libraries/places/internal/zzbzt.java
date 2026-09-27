package com.google.android.libraries.places.internal;

import defpackage.af9;
import defpackage.brn;
import defpackage.ckn;
import defpackage.nhn;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbzt {
    private static final zzbzt zza = new zzbzt(null, null, zzccd.zza, false);
    private final zzbzx zzb;
    private final zzbxj zzc = null;
    private final zzccd zzd;
    private final boolean zze;

    private zzbzt(zzbzx zzbzxVar, zzbxj zzbxjVar, zzccd zzccdVar, boolean z) {
        this.zzb = zzbzxVar;
        brn.m(zzccdVar, "status");
        this.zzd = zzccdVar;
        this.zze = z;
    }

    public static zzbzt zza(zzbzx zzbzxVar, zzbxj zzbxjVar) {
        brn.m(zzbzxVar, "subchannel");
        return new zzbzt(zzbzxVar, null, zzccd.zza, false);
    }

    public static zzbzt zzb(zzccd zzccdVar) {
        brn.g("error status shouldn't be OK", !zzccdVar.zzj());
        return new zzbzt(null, null, zzccdVar, false);
    }

    public static zzbzt zzc(zzccd zzccdVar) {
        brn.g("drop status shouldn't be OK", !zzccdVar.zzj());
        return new zzbzt(null, null, zzccdVar, true);
    }

    public static zzbzt zzd() {
        return zza;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbzt)) {
            return false;
        }
        zzbzt zzbztVar = (zzbzt) obj;
        if (!ckn.a(this.zzb, zzbztVar.zzb) || !ckn.a(this.zzd, zzbztVar.zzd) || !ckn.a(null, null) || this.zze != zzbztVar.zze) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, this.zzd, null, Boolean.valueOf(this.zze)});
    }

    public final String toString() {
        af9 b = nhn.b(this);
        b.f(this.zzb, "subchannel");
        b.f(null, "streamTracerFactory");
        b.f(this.zzd, "status");
        b.c("drop", this.zze);
        b.f(null, "authority-override");
        return b.toString();
    }

    public final zzbzx zze() {
        return this.zzb;
    }

    public final zzccd zzf() {
        return this.zzd;
    }

    public final boolean zzg() {
        return this.zze;
    }

    public final boolean zzh() {
        if (this.zzb == null && this.zzd.zzj()) {
            return false;
        }
        return true;
    }
}
