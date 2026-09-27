package com.google.android.libraries.places.internal;

import defpackage.brn;
import defpackage.tp1;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
class zzcpm implements zzcro {
    private final zzcro zza;

    public zzcpm(zzcro zzcroVar) {
        brn.m(zzcroVar, "delegate");
        this.zza = zzcroVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.close();
    }

    @Override // com.google.android.libraries.places.internal.zzcro
    public void zza(zzcsa zzcsaVar) {
        this.zza.zza(zzcsaVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcro
    public void zzb(int i, zzcrl zzcrlVar) {
        this.zza.zzb(i, zzcrlVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcro
    public void zzc(boolean z, int i, int i2) {
        this.zza.zzc(z, i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzcro
    public final void zzd() {
        this.zza.zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzcro
    public final void zze() {
        this.zza.zze();
    }

    @Override // com.google.android.libraries.places.internal.zzcro
    public final void zzf(boolean z, boolean z2, int i, int i2, List list) {
        this.zza.zzf(false, false, i, 0, list);
    }

    @Override // com.google.android.libraries.places.internal.zzcro
    public final int zzg() {
        return this.zza.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzcro
    public final void zzh(boolean z, int i, tp1 tp1Var, int i2) {
        this.zza.zzh(z, i, tp1Var, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzcro
    public final void zzi(zzcsa zzcsaVar) {
        this.zza.zzi(zzcsaVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcro
    public final void zzj(int i, zzcrl zzcrlVar, byte[] bArr) {
        this.zza.zzj(0, zzcrlVar, bArr);
    }

    @Override // com.google.android.libraries.places.internal.zzcro
    public final void zzk(int i, long j) {
        this.zza.zzk(i, j);
    }
}
