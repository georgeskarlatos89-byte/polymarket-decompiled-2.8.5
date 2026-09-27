package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzan extends zzaj {
    private final transient zzai zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzan(zzai zzaiVar, Object[] objArr, int i, int i2) {
        this.zza = zzaiVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    public static /* bridge */ /* synthetic */ int zzh(zzan zzanVar) {
        return zzanVar.zzc;
    }

    public static /* bridge */ /* synthetic */ Object[] zzi(zzan zzanVar) {
        return zzanVar.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzf().zzj(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zza(Object[] objArr, int i) {
        return zzf().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj, com.google.android.gms.internal.mlkit_common.zzab
    public final zzas zzd() {
        return zzf().zzj(0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaj
    public final zzaf zzg() {
        return new zzam(this);
    }
}
