package com.google.android.gms.internal.mlkit_common;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzae extends zzaf {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzaf zzc;

    public zzae(zzaf zzafVar, int i, int i2) {
        this.zzc = zzafVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzt.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaf, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaf
    public final zzaf zzf(int i, int i2) {
        zzt.zzd(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.zzf(i + i3, i2 + i3);
    }
}
