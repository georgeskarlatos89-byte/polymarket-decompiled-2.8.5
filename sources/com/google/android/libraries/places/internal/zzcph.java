package com.google.android.libraries.places.internal;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcph extends zzcpm {
    final /* synthetic */ zzcpj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcph(zzcpj zzcpjVar, zzcro zzcroVar) {
        super(zzcroVar);
        Objects.requireNonNull(zzcpjVar);
        this.zza = zzcpjVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcpm, com.google.android.libraries.places.internal.zzcro
    public final void zza(zzcsa zzcsaVar) {
        zzcpj zzcpjVar = this.zza;
        zzcpjVar.zzk(zzcpjVar.zzj() + 1);
        super.zza(zzcsaVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcpm, com.google.android.libraries.places.internal.zzcro
    public final void zzb(int i, zzcrl zzcrlVar) {
        zzcpj zzcpjVar = this.zza;
        zzcpjVar.zzk(zzcpjVar.zzj() + 1);
        super.zzb(i, zzcrlVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcpm, com.google.android.libraries.places.internal.zzcro
    public final void zzc(boolean z, int i, int i2) {
        if (z) {
            zzcpj zzcpjVar = this.zza;
            zzcpjVar.zzk(zzcpjVar.zzj() + 1);
        }
        super.zzc(z, i, i2);
    }
}
