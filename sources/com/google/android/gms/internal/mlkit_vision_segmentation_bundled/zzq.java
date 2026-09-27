package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzq extends zzbe {
    final /* synthetic */ zzw zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzq(zzw zzwVar, Map map) {
        super(map);
        this.zza = zzwVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzbe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zzaz.zza(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.zzb.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.zzb.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzb.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzbe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzp(this, this.zzb.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzbe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.zzb.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzw zzwVar = this.zza;
            zzw.zzj(zzwVar, zzw.zzd(zzwVar) - size);
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
