package com.google.android.gms.internal.mlkit_common;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzam extends zzaf {
    final /* synthetic */ zzan zza;

    public zzam(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzt.zza(i, zzan.zzh(this.zza), "index");
        int i2 = i + i;
        Object obj = zzan.zzi(this.zza)[i2];
        Objects.requireNonNull(obj);
        Object obj2 = zzan.zzi(this.zza)[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return zzan.zzh(this.zza);
    }
}
