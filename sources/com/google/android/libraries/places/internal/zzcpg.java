package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcpg implements Runnable {
    final /* synthetic */ zzcpj zza;

    public zzcpg(zzcpj zzcpjVar) {
        Objects.requireNonNull(zzcpjVar);
        this.zza = zzcpjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzcpj zzcpjVar = this.zza;
            if (zzcpjVar.zzh() != null && zzcpjVar.zzd().b > 0) {
                zzcpjVar.zzh().write(zzcpjVar.zzd(), zzcpjVar.zzd().b);
            }
        } catch (IOException e) {
            this.zza.zze().zzg(e);
        }
        zzcpj zzcpjVar2 = this.zza;
        zzcpjVar2.zzd().getClass();
        try {
            if (zzcpjVar2.zzh() != null) {
                zzcpjVar2.zzh().close();
            }
        } catch (IOException e2) {
            this.zza.zze().zzg(e2);
        }
        try {
            zzcpj zzcpjVar3 = this.zza;
            if (zzcpjVar3.zzi() != null) {
                zzcpjVar3.zzi().close();
            }
        } catch (IOException e3) {
            this.zza.zze().zzg(e3);
        }
    }
}
