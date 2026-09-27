package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcjj implements Executor {
    private final zzclc zza;
    private Executor zzb;

    public zzcjj(zzclc zzclcVar) {
        brn.m(zzclcVar, "executorPool");
        this.zza = zzclcVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        zza().execute(runnable);
    }

    public final synchronized Executor zza() {
        Executor executor;
        executor = this.zzb;
        if (executor == null) {
            executor = (Executor) this.zza.zza();
            brn.l(executor, this.zzb, "%s.getObject()");
            this.zzb = executor;
        }
        return executor;
    }

    public final synchronized void zzb() {
        Executor executor = this.zzb;
        if (executor != null) {
            this.zza.zzb(executor);
            this.zzb = null;
        }
    }
}
