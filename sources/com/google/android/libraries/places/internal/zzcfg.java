package com.google.android.libraries.places.internal;

import defpackage.af9;
import defpackage.brn;
import defpackage.nhn;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class zzcfg extends zzbxf {
    private static final Logger zza = Logger.getLogger(zzcfg.class.getName());
    private static final zzbxf zzl = new zzcey();
    private final ScheduledFuture zzb;
    private final Executor zzc;
    private final zzbya zzd;
    private volatile boolean zze;
    private zzbxe zzf;
    private zzcas zzg;
    private zzbxf zzh;
    private zzccd zzi;
    private List zzj = new ArrayList();
    private zzcff zzk;

    public zzcfg(Executor executor, ScheduledExecutorService scheduledExecutorService, zzbyd zzbydVar) {
        ScheduledFuture<?> scheduledFuture;
        brn.m(executor, "callExecutor");
        this.zzc = executor;
        brn.m(scheduledExecutorService, "scheduler");
        this.zzd = zzbya.zza();
        if (zzbydVar != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long zzc = zzbydVar.zzc(timeUnit);
            scheduledFuture = scheduledExecutorService.schedule(new zzces(this, zzc, "CallOptions"), zzc, timeUnit);
        } else {
            scheduledFuture = null;
        }
        this.zzb = scheduledFuture;
    }

    public static /* synthetic */ Logger zzk() {
        return zza;
    }

    private final void zzn(final zzbxe zzbxeVar) {
        final zzcas zzcasVar = this.zzg;
        this.zzg = null;
        Runnable runnable = new Runnable() { // from class: com.google.android.libraries.places.internal.zzcfa
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcfg.this.zzh(zzbxeVar, zzcasVar);
            }
        };
        zzbya zzbyaVar = this.zzd;
        zzbya zzb = zzbyaVar.zzb();
        try {
            runnable.run();
        } finally {
            zzbyaVar.zzc(zzb);
        }
    }

    private final void zzo(zzccd zzccdVar, boolean z) {
        zzbxe zzbxeVar;
        boolean z2;
        synchronized (this) {
            try {
                if (this.zzh == null) {
                    zzr(zzl);
                    zzbxeVar = this.zzf;
                    this.zzi = zzccdVar;
                    z2 = false;
                } else if (!z) {
                    zzbxeVar = null;
                    z2 = true;
                } else {
                    return;
                }
                if (z2) {
                    zzp(new zzceu(this, zzccdVar));
                } else {
                    if (zzbxeVar != null) {
                        this.zzc.execute(new zzcez(this, zzbxeVar, zzccdVar));
                    }
                    zzn(zzbxeVar);
                    zzq();
                }
                zzg();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzp(Runnable runnable) {
        synchronized (this) {
            try {
                if (!this.zze) {
                    this.zzj.add(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzq() {
        zzcff zzcffVar;
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.zzj.isEmpty()) {
                    break;
                }
                list = this.zzj;
                this.zzj = arrayList;
            }
            if (zzcffVar == null) {
                this.zzc.execute(new zzcet(this, zzcffVar));
                return;
            }
            return;
            list.clear();
            arrayList = list;
        }
        this.zzj = null;
        this.zze = true;
        zzcffVar = this.zzk;
        if (zzcffVar == null) {
        }
    }

    private final void zzr(zzbxf zzbxfVar) {
        boolean z;
        zzbxf zzbxfVar2 = this.zzh;
        if (zzbxfVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        brn.q(zzbxfVar2, "realCall already set to %s", z);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzh = zzbxfVar;
    }

    public final String toString() {
        af9 b = nhn.b(this);
        b.f(this.zzh, "realCall");
        return b.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbxf
    public final void zza(zzbxe zzbxeVar, zzcas zzcasVar) {
        boolean z;
        zzccd zzccdVar;
        boolean z2;
        brn.m(zzcasVar, "headers");
        if (this.zzf == null) {
            z = true;
        } else {
            z = false;
        }
        brn.r("already started", z);
        synchronized (this) {
            try {
                brn.m(zzbxeVar, "listener");
                this.zzf = zzbxeVar;
                zzccdVar = this.zzi;
                z2 = this.zze;
                if (!z2) {
                    zzcff zzcffVar = new zzcff(this, zzbxeVar);
                    this.zzk = zzcffVar;
                    this.zzg = zzcasVar;
                    zzbxeVar = zzcffVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzccdVar != null) {
            this.zzc.execute(new zzcez(this, zzbxeVar, zzccdVar));
        } else if (z2) {
            this.zzh.zza(zzbxeVar, zzcasVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbxf
    public final void zzb(Object obj) {
        if (this.zze) {
            this.zzh.zzb(obj);
        } else {
            zzp(new zzcev(this, obj));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbxf
    public final void zzc(int i) {
        if (this.zze) {
            this.zzh.zzc(i);
        } else {
            zzp(new zzcew(this, i));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbxf
    public final void zzd() {
        zzp(new zzcex(this));
    }

    @Override // com.google.android.libraries.places.internal.zzbxf
    public final void zze(String str, Throwable th) {
        zzccd zze;
        zzccd zzccdVar = zzccd.zzb;
        if (str != null) {
            zze = zzccdVar.zze(str);
        } else {
            zze = zzccdVar.zze("Call cancelled without message");
        }
        if (th != null) {
            zze = zze.zzd(th);
        }
        zzo(zze, false);
    }

    public final Runnable zzf(zzbxf zzbxfVar) {
        synchronized (this) {
            try {
                if (this.zzh != null) {
                    return null;
                }
                brn.m(zzbxfVar, "call");
                zzr(zzbxfVar);
                zzcff zzcffVar = this.zzk;
                if (zzcffVar == null) {
                    this.zzj = null;
                    this.zze = true;
                    return null;
                }
                zzn(zzcffVar);
                return new zzcer(this, this.zzd);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzh(zzbxe zzbxeVar, zzcas zzcasVar) {
        this.zzh.zza(zzbxeVar, zzcasVar);
    }

    public final /* synthetic */ void zzi(zzccd zzccdVar, boolean z) {
        zzo(zzccdVar, true);
    }

    public final /* synthetic */ void zzj() {
        zzq();
    }

    public final /* synthetic */ zzbya zzl() {
        return this.zzd;
    }

    public final /* synthetic */ zzbxf zzm() {
        return this.zzh;
    }

    public void zzg() {
    }
}
