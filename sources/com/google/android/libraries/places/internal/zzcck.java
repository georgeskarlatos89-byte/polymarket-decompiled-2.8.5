package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcck {
    private final zzccj zza;
    private final ScheduledFuture zzb;

    public /* synthetic */ zzcck(zzccj zzccjVar, ScheduledFuture scheduledFuture, byte[] bArr) {
        brn.m(zzccjVar, "runnable");
        this.zza = zzccjVar;
        brn.m(scheduledFuture, "future");
        this.zzb = scheduledFuture;
    }

    public final void zza() {
        this.zza.zzb = true;
        this.zzb.cancel(false);
    }

    public final boolean zzb() {
        zzccj zzccjVar = this.zza;
        if (!zzccjVar.zzc && !zzccjVar.zzb) {
            return true;
        }
        return false;
    }
}
