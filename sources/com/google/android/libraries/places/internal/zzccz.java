package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzccz implements zzcdc, zzcks {
    private zzceq zzr;
    private final Object zzs = new Object();
    private final zzcoy zzt;
    private final zzckv zzu;
    private int zzv;
    private boolean zzw;
    private boolean zzx;
    private final int zzy;

    public zzccz(int i, zzcoo zzcooVar, zzcoy zzcoyVar) {
        brn.m(zzcooVar, "statsTraceCtx");
        brn.m(zzcoyVar, "transportTracer");
        this.zzt = zzcoyVar;
        zzckv zzckvVar = new zzckv(this, zzbxp.zza, i, zzcooVar, zzcoyVar);
        this.zzu = zzckvVar;
        this.zzr = zzckvVar;
        this.zzy = 32768;
    }

    private final boolean zza() {
        boolean z;
        synchronized (this.zzs) {
            try {
                z = false;
                if (this.zzw && this.zzv < this.zzy && !this.zzx) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    private final void zzc() {
        boolean zza;
        synchronized (this.zzs) {
            try {
                zza = zza();
                if (!zza) {
                    Logger zzx = zzcda.zzx();
                    Level level = Level.FINEST;
                    if (zzx.isLoggable(level)) {
                        zzcda.zzx().logp(level, "io.grpc.internal.AbstractStream$TransportState", "notifyIfReady", "Stream not ready so skip notifying listener.\ndetails: allocated/deallocated:{0}/{3}, sent queued: {1}, ready thresh: {2}", new Object[]{Boolean.valueOf(this.zzw), Integer.valueOf(this.zzv), Integer.valueOf(this.zzy), Boolean.valueOf(this.zzx)});
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zza) {
            zzh().zzd();
        }
    }

    public abstract zzcor zzh();

    public final void zzl() {
        zzckv zzckvVar = this.zzu;
        zzckvVar.zzf(this);
        this.zzr = zzckvVar;
    }

    public final void zzm(int i) {
        this.zzr.zza(i);
    }

    @Override // com.google.android.libraries.places.internal.zzcks
    public final void zzn(zzcoq zzcoqVar) {
        zzh().zzb(zzcoqVar);
    }

    public final void zzo(boolean z) {
        zzceq zzceqVar = this.zzr;
        if (z) {
            zzceqVar.close();
        } else {
            zzceqVar.zze();
        }
    }

    public final void zzp(zzcmb zzcmbVar) {
        try {
            this.zzr.zzd(zzcmbVar);
        } catch (Throwable th) {
            zzE(th);
        }
    }

    public final void zzq(zzbye zzbyeVar) {
        this.zzr.zzb(zzbyeVar);
    }

    public final void zzr() {
        boolean z;
        if (zzh() != null) {
            z = true;
        } else {
            z = false;
        }
        brn.s(z);
        synchronized (this.zzs) {
            brn.r("Already allocated", !this.zzw);
            this.zzw = true;
        }
        zzc();
    }

    public final void zzs() {
        synchronized (this.zzs) {
            this.zzx = true;
        }
    }

    public final void zzt(int i) {
        boolean z;
        synchronized (this.zzs) {
            brn.r("onStreamAllocated was not called, but it seems the stream is active", this.zzw);
            int i2 = this.zzv;
            int i3 = this.zzy;
            int i4 = i2 - i;
            this.zzv = i4;
            z = false;
            if (i2 >= i3 && i4 < i3) {
                z = true;
            }
        }
        if (z) {
            zzc();
        }
    }

    public final zzcoy zzu() {
        return this.zzt;
    }

    public final /* synthetic */ boolean zzv() {
        return zza();
    }

    public final /* synthetic */ void zzw(int i) {
        synchronized (this.zzs) {
            this.zzv += i;
        }
    }

    public final /* synthetic */ zzceq zzx() {
        return this.zzr;
    }
}
