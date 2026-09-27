package com.google.android.libraries.places.internal;

import defpackage.af9;
import defpackage.brn;
import defpackage.dmk;
import defpackage.nhn;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcbe {
    private final int zza;
    private final zzcbv zzb;
    private final zzccl zzc;
    private final zzcbk zzd;
    private final ScheduledExecutorService zze;
    private final zzbxd zzf;
    private final Executor zzg;
    private final zzcba zzh;
    private final zzcbq zzi;

    public /* synthetic */ zzcbe(zzcbd zzcbdVar, byte[] bArr) {
        zzcba zzcbcVar;
        Integer zzk = zzcbdVar.zzk();
        brn.m(zzk, "defaultPort not set");
        this.zza = zzk.intValue();
        zzcbv zzl = zzcbdVar.zzl();
        brn.m(zzl, "proxyDetector not set");
        this.zzb = zzl;
        zzccl zzm = zzcbdVar.zzm();
        brn.m(zzm, "syncContext not set");
        this.zzc = zzm;
        zzcbk zzn = zzcbdVar.zzn();
        brn.m(zzn, "serviceConfigParser not set");
        this.zzd = zzn;
        this.zze = zzcbdVar.zzo();
        this.zzf = zzcbdVar.zzp();
        this.zzg = zzcbdVar.zzq();
        if (zzcbdVar.zzr() != null) {
            zzcbcVar = zzcbdVar.zzr();
        } else {
            zzcbcVar = new zzcbc(this);
        }
        this.zzh = zzcbcVar;
        this.zzi = zzcbdVar.zzs();
    }

    public static zzcbd zzg() {
        return new zzcbd();
    }

    public final String toString() {
        af9 b = nhn.b(this);
        b.g("defaultPort", String.valueOf(this.zza));
        b.f(this.zzb, "proxyDetector");
        b.f(this.zzc, "syncContext");
        b.f(this.zzd, "serviceConfigParser");
        b.f(null, "customArgs");
        b.f(this.zze, "scheduledExecutorService");
        b.f(this.zzf, "channelLogger");
        b.f(this.zzg, "executor");
        b.f(null, "overrideAuthority");
        b.f(this.zzh, "metricRecorder");
        b.f(this.zzi, "nameResolverRegistry");
        return b.toString();
    }

    public final int zza() {
        return this.zza;
    }

    public final zzcbv zzb() {
        return this.zzb;
    }

    public final zzccl zzc() {
        return this.zzc;
    }

    public final ScheduledExecutorService zzd() {
        ScheduledExecutorService scheduledExecutorService = this.zze;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        dmk.n("ScheduledExecutorService not set in Builder");
        return null;
    }

    public final zzcbk zze() {
        return this.zzd;
    }

    public final Executor zzf() {
        return this.zzg;
    }
}
