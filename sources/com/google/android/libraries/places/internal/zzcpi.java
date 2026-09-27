package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzcpi implements Runnable {
    final /* synthetic */ zzcpj zzb;

    public /* synthetic */ zzcpi(zzcpj zzcpjVar, byte[] bArr) {
        Objects.requireNonNull(zzcpjVar);
        this.zzb = zzcpjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.zzb.zzh() != null) {
                zza();
                return;
            }
            throw new IOException("Unable to perform write due to unavailable sink.");
        } catch (Exception e) {
            this.zzb.zze().zzg(e);
        }
    }

    public abstract void zza();
}
