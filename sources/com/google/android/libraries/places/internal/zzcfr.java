package com.google.android.libraries.places.internal;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcfr implements Runnable {
    final /* synthetic */ zzbyg zza;
    final /* synthetic */ zzcgf zzb;

    public zzcfr(zzcgf zzcgfVar, zzbyg zzbygVar) {
        this.zza = zzbygVar;
        Objects.requireNonNull(zzcgfVar);
        this.zzb = zzcgfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzq().zzd(this.zza);
    }
}
