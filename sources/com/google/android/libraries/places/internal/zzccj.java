package com.google.android.libraries.places.internal;

import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzccj implements Runnable {
    final Runnable zza;
    boolean zzb;
    boolean zzc;

    public zzccj(Runnable runnable) {
        brn.m(runnable, "task");
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.zzb) {
            this.zzc = true;
            this.zza.run();
        }
    }
}
