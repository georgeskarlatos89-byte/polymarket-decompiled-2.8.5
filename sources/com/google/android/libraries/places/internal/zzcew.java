package com.google.android.libraries.places.internal;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcew implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzcfg zzb;

    public zzcew(zzcfg zzcfgVar, int i) {
        this.zza = i;
        Objects.requireNonNull(zzcfgVar);
        this.zzb = zzcfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzm().zzc(this.zza);
    }
}
