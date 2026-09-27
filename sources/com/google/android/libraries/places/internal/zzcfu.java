package com.google.android.libraries.places.internal;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcfu implements Runnable {
    final /* synthetic */ zzbyd zza;
    final /* synthetic */ zzcgf zzb;

    public zzcfu(zzcgf zzcgfVar, zzbyd zzbydVar) {
        this.zza = zzbydVar;
        Objects.requireNonNull(zzcgfVar);
        this.zzb = zzcgfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzq().zza(this.zza);
    }
}
