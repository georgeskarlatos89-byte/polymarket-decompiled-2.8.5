package com.google.android.libraries.places.internal;

import defpackage.bd0;
import defpackage.dmk;
import defpackage.hdi;
import defpackage.qp7;
import defpackage.tp1;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcqq {
    final /* synthetic */ zzcqt zza;
    private final tp1 zzb;
    private final int zzc;
    private int zzd;
    private int zze;
    private final zzcqp zzf;
    private boolean zzg;

    /* JADX WARN: Type inference failed for: r1v1, types: [tp1, java.lang.Object] */
    public zzcqq(zzcqt zzcqtVar, int i, int i2, zzcqp zzcqpVar) {
        Objects.requireNonNull(zzcqtVar);
        this.zza = zzcqtVar;
        this.zzb = new Object();
        this.zzg = false;
        this.zzc = i;
        this.zzd = i2;
        this.zzf = zzcqpVar;
    }

    public final int zza() {
        return this.zzd;
    }

    public final void zzb(int i) {
        this.zze += i;
    }

    public final int zzc() {
        return this.zze;
    }

    public final int zzd() {
        return Math.max(0, Math.min(this.zzd, (int) this.zzb.b)) - this.zze;
    }

    public final void zze() {
        this.zze = 0;
    }

    public final int zzf(int i) {
        if (i > 0 && bd0.API_PRIORITY_OTHER - i < this.zzd) {
            int i2 = this.zzc;
            dmk.v(hdi.l(i2, "Window size overflow for stream: ", new StringBuilder(String.valueOf(i2).length() + 33)));
            return 0;
        }
        int i3 = this.zzd + i;
        this.zzd = i3;
        return i3;
    }

    public final int zzg() {
        return Math.min(this.zzd, this.zza.zzh().zzd);
    }

    public final boolean zzh() {
        if (this.zzb.b > 0) {
            return true;
        }
        return false;
    }

    public final int zzi(int i, zzcqs zzcqsVar) {
        int min = Math.min(i, zzg());
        int i2 = 0;
        while (zzh() && min > 0) {
            tp1 tp1Var = this.zzb;
            long j = min;
            long j2 = tp1Var.b;
            if (j >= j2) {
                i2 += (int) j2;
                zzj(tp1Var, (int) j2, this.zzg);
            } else {
                i2 += min;
                zzj(tp1Var, min, false);
            }
            zzcqsVar.zza++;
            min = Math.min(i - i2, zzg());
        }
        zzh();
        return i2;
    }

    public final void zzj(tp1 tp1Var, int i, boolean z) {
        do {
            zzcqt zzcqtVar = this.zza;
            int min = Math.min(i, zzcqtVar.zzg().zzg());
            int i2 = -min;
            zzcqtVar.zzh().zzf(i2);
            zzf(i2);
            try {
                boolean z2 = false;
                if (tp1Var.b == min && z) {
                    z2 = true;
                }
                zzcqtVar.zzg().zzh(z2, this.zzc, tp1Var, min);
                this.zzf.zzt(min);
                i -= min;
            } catch (IOException e) {
                qp7.n(e);
                return;
            }
        } while (i > 0);
    }

    public final void zzk(tp1 tp1Var, int i, boolean z) {
        this.zzb.write(tp1Var, i);
        this.zzg |= z;
    }
}
