package com.google.android.libraries.places.internal;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzccy implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzccz zzb;

    public zzccy(zzccz zzcczVar, zzctl zzctlVar, int i) {
        this.zza = i;
        Objects.requireNonNull(zzcczVar);
        this.zzb = zzcczVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = zzctm.zza;
            this.zzb.zzx().zzc(this.zza);
        } catch (Throwable th) {
            this.zzb.zzE(th);
        }
    }
}
