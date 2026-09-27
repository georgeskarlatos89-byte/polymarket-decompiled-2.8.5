package com.google.android.gms.internal.mlkit_vision_common;

import java.util.AbstractMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzv extends zzp {
    final /* synthetic */ zzw zza;

    public zzv(zzw zzwVar) {
        this.zza = zzwVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzf.zza(i, zzw.zzh(this.zza), "index");
        zzw zzwVar = this.zza;
        int i2 = i + i;
        Object obj = zzw.zzi(zzwVar)[i2];
        obj.getClass();
        Object obj2 = zzw.zzi(zzwVar)[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return zzw.zzh(this.zza);
    }
}
