package com.google.android.libraries.places.internal;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcev implements Runnable {
    final /* synthetic */ Object zza;
    final /* synthetic */ zzcfg zzb;

    public zzcev(zzcfg zzcfgVar, Object obj) {
        this.zza = obj;
        Objects.requireNonNull(zzcfgVar);
        this.zzb = zzcfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzm().zzb(this.zza);
    }
}
