package com.google.android.libraries.places.internal;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcfb implements Runnable {
    final /* synthetic */ zzcas zza;
    final /* synthetic */ zzcff zzb;

    public zzcfb(zzcff zzcffVar, zzcas zzcasVar) {
        this.zza = zzcasVar;
        Objects.requireNonNull(zzcffVar);
        this.zzb = zzcffVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzf(this.zza);
    }
}
