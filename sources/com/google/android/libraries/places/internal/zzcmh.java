package com.google.android.libraries.places.internal;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcmh implements Runnable {
    final /* synthetic */ zzcmi zza;

    public /* synthetic */ zzcmh(zzcmi zzcmiVar, byte[] bArr) {
        Objects.requireNonNull(zzcmiVar);
        this.zza = zzcmiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcmi zzcmiVar = this.zza;
        zzcmg zzcmgVar = new zzcmg(zzcmiVar, null);
        zzccl zzcclVar = (zzccl) zzcmiVar.zze();
        zzcclVar.zzb(zzcmgVar);
        zzcclVar.zza();
    }
}
