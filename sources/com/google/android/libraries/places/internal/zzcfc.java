package com.google.android.libraries.places.internal;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcfc implements Runnable {
    final /* synthetic */ Object zza;
    final /* synthetic */ zzcff zzb;

    public zzcfc(zzcff zzcffVar, Object obj) {
        this.zza = obj;
        Objects.requireNonNull(zzcffVar);
        this.zzb = zzcffVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzg(this.zza);
    }
}
