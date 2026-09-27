package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzo extends zzbg {
    final transient Map zza;
    final /* synthetic */ zzw zzb;

    public zzo(zzw zzwVar, Map map) {
        this.zzb = zzwVar;
        this.zza = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzw zzwVar = this.zzb;
        if (this.zza == zzw.zzg(zzwVar)) {
            zzwVar.zzl();
        } else {
            zzaz.zza(new zzn(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzbh.zzb(this.zza, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.zza.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zzbh.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zzb(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzbg, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.zzb.zzo();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection zza = this.zzb.zza();
        zza.addAll(collection);
        zzw zzwVar = this.zzb;
        zzw.zzj(zzwVar, zzw.zzd(zzwVar) - collection.size());
        collection.clear();
        return zza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzbg
    public final Set zza() {
        return new zzm(this);
    }
}
