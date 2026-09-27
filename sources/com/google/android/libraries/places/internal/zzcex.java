package com.google.android.libraries.places.internal;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcex implements Runnable {
    final /* synthetic */ zzcfg zza;

    public zzcex(zzcfg zzcfgVar) {
        Objects.requireNonNull(zzcfgVar);
        this.zza = zzcfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzm().zzd();
    }
}
