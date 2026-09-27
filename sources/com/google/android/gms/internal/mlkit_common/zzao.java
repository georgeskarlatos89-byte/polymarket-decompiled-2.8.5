package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzao extends zzaj {
    private final transient zzai zza;
    private final transient zzaf zzb;

    public zzao(zzai zzaiVar, zzaf zzafVar) {
        this.zza = zzaiVar;
        this.zzb = zzafVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.zza.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.zzj(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab
    public final zzas zzd() {
        return this.zzb.zzj(0);
    }
}
