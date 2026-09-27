package com.google.android.libraries.places.internal;

import defpackage.b3j;
import defpackage.brn;
import defpackage.dmk;
import defpackage.tp1;
import defpackage.y8h;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.net.Socket;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcpj implements y8h {
    private final zzcod zzc;
    private final zzcpk zzd;
    private y8h zzh;
    private Socket zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private final Object zza = new Object();
    private final tp1 zzb = new Object();
    private boolean zze = false;
    private boolean zzf = false;
    private boolean zzg = false;

    /* JADX WARN: Type inference failed for: r3v2, types: [tp1, java.lang.Object] */
    private zzcpj(zzcod zzcodVar, zzcpk zzcpkVar, int i) {
        brn.m(zzcodVar, "executor");
        this.zzc = zzcodVar;
        brn.m(zzcpkVar, "exceptionHandler");
        this.zzd = zzcpkVar;
    }

    public static zzcpj zza(zzcod zzcodVar, zzcpk zzcpkVar, int i) {
        return new zzcpj(zzcodVar, zzcpkVar, 10000);
    }

    @Override // defpackage.y8h, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.zzg) {
            return;
        }
        this.zzg = true;
        this.zzc.execute(new zzcpg(this));
    }

    @Override // defpackage.y8h, java.io.Flushable
    public final void flush() {
        if (!this.zzg) {
            int i = zzctm.zza;
            synchronized (this.zza) {
                try {
                    if (this.zzf) {
                        return;
                    }
                    this.zzf = true;
                    this.zzc.execute(new zzcpf(this));
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        dmk.x(MetricTracker.Action.CLOSED);
    }

    @Override // defpackage.y8h
    public final b3j timeout() {
        return b3j.NONE;
    }

    @Override // defpackage.y8h
    public final void write(tp1 tp1Var, long j) {
        brn.m(tp1Var, "source");
        if (!this.zzg) {
            int i = zzctm.zza;
            synchronized (this.zza) {
                try {
                    tp1 tp1Var2 = this.zzb;
                    tp1Var2.write(tp1Var, j);
                    int i2 = this.zzl + this.zzk;
                    this.zzl = i2;
                    boolean z = false;
                    this.zzk = 0;
                    if (!this.zzj && i2 > 10000) {
                        this.zzj = true;
                        z = true;
                    } else {
                        if (!this.zze && !this.zzf && tp1Var2.g() > 0) {
                            this.zze = true;
                        }
                        return;
                    }
                    if (z) {
                        try {
                            this.zzi.close();
                            return;
                        } catch (IOException e) {
                            this.zzd.zzg(e);
                            return;
                        }
                    }
                    this.zzc.execute(new zzcpe(this));
                    return;
                } finally {
                }
            }
        }
        dmk.x(MetricTracker.Action.CLOSED);
    }

    public final void zzb(y8h y8hVar, Socket socket) {
        boolean z;
        if (this.zzh == null) {
            z = true;
        } else {
            z = false;
        }
        brn.r("AsyncSink's becomeConnected should only be called once.", z);
        brn.m(y8hVar, "sink");
        this.zzh = y8hVar;
        brn.m(socket, "socket");
        this.zzi = socket;
    }

    public final /* synthetic */ Object zzc() {
        return this.zza;
    }

    public final /* synthetic */ tp1 zzd() {
        return this.zzb;
    }

    public final /* synthetic */ zzcpk zze() {
        return this.zzd;
    }

    public final /* synthetic */ void zzf(boolean z) {
        this.zze = false;
    }

    public final /* synthetic */ void zzg(boolean z) {
        this.zzf = false;
    }

    public final /* synthetic */ y8h zzh() {
        return this.zzh;
    }

    public final /* synthetic */ Socket zzi() {
        return this.zzi;
    }

    public final /* synthetic */ int zzj() {
        return this.zzk;
    }

    public final /* synthetic */ void zzk(int i) {
        this.zzk = i;
    }

    public final /* synthetic */ int zzl() {
        return this.zzl;
    }

    public final /* synthetic */ void zzm(int i) {
        this.zzl = i;
    }
}
