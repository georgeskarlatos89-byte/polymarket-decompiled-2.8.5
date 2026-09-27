package com.google.android.libraries.places.internal;

import defpackage.tp1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcqn implements zzcpc {
    private final tp1 zza;
    private int zzb;
    private int zzc;

    public zzcqn(tp1 tp1Var, int i) {
        this.zza = tp1Var;
        this.zzb = i;
    }

    @Override // com.google.android.libraries.places.internal.zzcpc
    public final void zza(byte[] bArr, int i, int i2) {
        this.zza.m1395write(bArr, i, i2);
        this.zzb -= i2;
        this.zzc += i2;
    }

    @Override // com.google.android.libraries.places.internal.zzcpc
    public final void zzb(byte b) {
        this.zza.i0(b);
        this.zzb--;
        this.zzc++;
    }

    @Override // com.google.android.libraries.places.internal.zzcpc
    public final int zzc() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzcpc
    public final int zzd() {
        return this.zzc;
    }

    public final tp1 zze() {
        return this.zza;
    }
}
