package com.google.android.libraries.places.internal;

import defpackage.brn;
import defpackage.ix2;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcjp extends zzcbh {
    final zzcjn zza;
    final zzcbl zzb;
    final /* synthetic */ zzckf zzc;

    public zzcjp(zzckf zzckfVar, zzcjn zzcjnVar, zzcbl zzcblVar) {
        Objects.requireNonNull(zzckfVar);
        this.zzc = zzckfVar;
        brn.m(zzcjnVar, "helperImpl");
        this.zza = zzcjnVar;
        brn.m(zzcblVar, "resolver");
        this.zzb = zzcblVar;
    }

    private final void zzc(zzccd zzccdVar) {
        Logger logger = zzckf.zza;
        Level level = Level.WARNING;
        zzckf zzckfVar = this.zzc;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{zzckfVar.zzc(), zzccdVar});
        zzckfVar.zzY().zzd();
        if (zzckfVar.zzal() != 3) {
            zzckfVar.zzW().zzb(3, "Failed to resolve name: {0}", zzccdVar);
            zzckfVar.zzam(3);
        }
        zzcjn zzcjnVar = this.zza;
        if (zzcjnVar != zzckfVar.zzF()) {
            return;
        }
        zzcjnVar.zza.zzb(zzccdVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcbh
    public final zzccd zza(zzcbj zzcbjVar) {
        zzckp zzckpVar;
        zzccd zzccdVar;
        zzckp zzckpVar2;
        String str;
        zzckf zzckfVar = this.zzc;
        zzccl zzcclVar = zzckfVar.zze;
        zzcclVar.zzc();
        if (zzckfVar.zzE() != this.zzb) {
            return zzccd.zza;
        }
        zzccf zzb = zzcbjVar.zzb();
        if (!zzb.zzc()) {
            zzc(zzb.zze());
            return zzb.zze();
        }
        List list = (List) zzb.zzd();
        zzckfVar.zzW().zzb(1, "Resolved address: {0}, config={1}", list, zzcbjVar.zzc());
        if (zzckfVar.zzal() != 2) {
            zzckfVar.zzW().zzb(2, "Address resolved: {0}", list);
            zzckfVar.zzam(2);
        }
        zzcbf zzd = zzcbjVar.zzd();
        zzbyz zzbyzVar = (zzbyz) zzcbjVar.zzc().zza(zzbyz.zza);
        if (zzd != null && zzd.zzc() != null) {
            zzckpVar = (zzckp) zzd.zzc();
        } else {
            zzckpVar = null;
        }
        if (zzd != null) {
            zzccdVar = zzd.zzd();
        } else {
            zzccdVar = null;
        }
        if (!zzckfVar.zzad()) {
            if (zzckpVar != null) {
                zzckfVar.zzW().zza(2, "Service config from name resolver discarded by channel settings");
            }
            if (zzbyzVar != null) {
                zzckfVar.zzW().zza(2, "Config selector from name resolver discarded by channel settings");
            }
            zzcjz zzY = zzckfVar.zzY();
            zzckpVar2 = zzckf.zzr();
            zzY.zzc(zzckpVar2.zzb());
        } else {
            if (zzckpVar != null) {
                if (zzbyzVar != null) {
                    zzckfVar.zzY().zzc(zzbyzVar);
                    if (zzckpVar.zzb() != null) {
                        zzckfVar.zzW().zza(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                    }
                } else {
                    zzckfVar.zzY().zzc(zzckpVar.zzb());
                }
            } else if (zzccdVar != null) {
                if (!zzckfVar.zzab()) {
                    zzckfVar.zzW().zza(2, "Fallback to error due to invalid first service config without default config");
                    zzccd zzd2 = zzd.zzd();
                    brn.g("the error status must not be OK", !zzd2.zzj());
                    zzcclVar.zzb(new zzcjo(this, zzd2));
                    zzcclVar.zza();
                    return zzd.zzd();
                }
                zzckpVar = zzckfVar.zzZ();
            } else {
                zzckfVar.zzY().zzc(null);
                zzckpVar = zzckf.zzr();
            }
            if (!zzckpVar.equals(zzckfVar.zzZ())) {
                if (zzckpVar == zzckf.zzr()) {
                    str = " to empty";
                } else {
                    str = "";
                }
                zzckfVar.zzW().zzb(2, "Service config changed{0}", str);
                zzckfVar.zzaa(zzckpVar);
                zzckfVar.zzai().zza = zzckpVar.zzd();
            }
            try {
                zzckfVar.zzac(true);
            } catch (RuntimeException e) {
                zzckf zzckfVar2 = this.zzc;
                Logger logger = zzckf.zza;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(zzckfVar2.zzc());
                logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "onResult2", ix2.p(new StringBuilder(valueOf.length() + 51), "[", valueOf, "] Unexpected exception from parsing service config"), (Throwable) e);
            }
            zzckpVar2 = zzckpVar;
        }
        zzbww zzc = zzcbjVar.zzc();
        zzcjn zzcjnVar = this.zza;
        if (zzcjnVar == this.zzc.zzF()) {
            zzbwu zzc2 = zzc.zzc();
            zzc2.zzb(zzbyz.zza);
            Map zza = zzckpVar2.zza();
            if (zza != null) {
                zzc2.zza(zzcaa.zza, zza);
                zzc2.zzc();
            }
            zzbww zzc3 = zzc2.zzc();
            zzbzv zza2 = zzbzw.zza();
            zza2.zza((List) zzb.zzd());
            zza2.zzb(zzc3);
            zza2.zzc(zzckpVar2.zzc());
            return zzcjnVar.zza.zza(zza2.zzd());
        }
        return zzccd.zza;
    }

    public final /* synthetic */ void zzb(zzccd zzccdVar) {
        zzc(zzccdVar);
    }
}
