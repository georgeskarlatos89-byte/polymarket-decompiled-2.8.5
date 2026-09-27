package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcol {
    private static final zzcol zza = new zzcol(new zzcoh());
    private final IdentityHashMap zzb = new IdentityHashMap();
    private ScheduledExecutorService zzc;

    public zzcol(zzcoh zzcohVar) {
    }

    public static Object zza(zzcok zzcokVar) {
        return zza.zzc(zzcokVar);
    }

    public static Object zzb(zzcok zzcokVar, Object obj) {
        zza.zzd(zzcokVar, obj);
        return null;
    }

    public final synchronized Object zzc(zzcok zzcokVar) {
        zzcoj zzcojVar;
        try {
            IdentityHashMap identityHashMap = this.zzb;
            zzcojVar = (zzcoj) identityHashMap.get(zzcokVar);
            if (zzcojVar == null) {
                zzcojVar = new zzcoj(zzcokVar.zzb());
                identityHashMap.put(zzcokVar, zzcojVar);
            }
            ScheduledFuture scheduledFuture = zzcojVar.zzc;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                zzcojVar.zzc = null;
            }
            zzcojVar.zzb++;
        } catch (Throwable th) {
            throw th;
        }
        return zzcojVar.zza;
    }

    public final synchronized Object zzd(zzcok zzcokVar, Object obj) {
        boolean z;
        boolean z2;
        try {
            zzcoj zzcojVar = (zzcoj) this.zzb.get(zzcokVar);
            if (zzcojVar != null) {
                boolean z3 = false;
                if (obj == zzcojVar.zza) {
                    z = true;
                } else {
                    z = false;
                }
                brn.g("Releasing the wrong instance", z);
                if (zzcojVar.zzb > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                brn.r("Refcount has already reached zero", z2);
                int i = zzcojVar.zzb - 1;
                zzcojVar.zzb = i;
                if (i == 0) {
                    if (zzcojVar.zzc == null) {
                        z3 = true;
                    }
                    brn.r("Destroy task already scheduled", z3);
                    ScheduledExecutorService scheduledExecutorService = this.zzc;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(zzchn.zzd("grpc-shared-destroyer-%d", true));
                        this.zzc = scheduledExecutorService;
                    }
                    zzcojVar.zzc = scheduledExecutorService.schedule(new zzcit(new zzcoi(this, zzcojVar, zzcokVar, obj)), 1L, TimeUnit.SECONDS);
                }
            } else {
                throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(zzcokVar)));
            }
        } catch (Throwable th) {
            throw th;
        }
        return null;
    }

    public final /* synthetic */ IdentityHashMap zze() {
        return this.zzb;
    }

    public final /* synthetic */ ScheduledExecutorService zzf() {
        return this.zzc;
    }

    public final /* synthetic */ void zzg(ScheduledExecutorService scheduledExecutorService) {
        this.zzc = null;
    }
}
