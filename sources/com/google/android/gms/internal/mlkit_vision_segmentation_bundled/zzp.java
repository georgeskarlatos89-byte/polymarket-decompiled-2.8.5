package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzp implements Iterator {
    Map.Entry zza;
    final /* synthetic */ Iterator zzb;
    final /* synthetic */ zzq zzc;

    public zzp(zzq zzqVar, Iterator it) {
        this.zzb = it;
        this.zzc = zzqVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.zza != null) {
            z = true;
        } else {
            z = false;
        }
        zzi.zzd(z, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzw zzwVar = this.zzc.zza;
        zzw.zzj(zzwVar, zzw.zzd(zzwVar) - collection.size());
        collection.clear();
        this.zza = null;
    }
}
