package com.google.android.libraries.places.internal;

import defpackage.dmk;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbya {
    static final Logger zza = Logger.getLogger(zzbya.class.getName());
    public static final zzbya zzb = new zzbya();

    private zzbya() {
    }

    public static zzbya zza() {
        zzbya zzc = zzbxy.zza.zzc();
        if (zzc == null) {
            return zzb;
        }
        return zzc;
    }

    public static Object zze(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        dmk.s((String) obj2);
        return null;
    }

    public final zzbya zzb() {
        zzbya zza2 = zzbxy.zza.zza(this);
        if (zza2 == null) {
            return zzb;
        }
        return zza2;
    }

    public final void zzc(zzbya zzbyaVar) {
        zze(zzbyaVar, "toAttach");
        zzbxy.zza.zzb(this, zzbyaVar);
    }

    public final void zzd(zzbxx zzbxxVar, Executor executor) {
        zze(executor, "executor");
    }
}
