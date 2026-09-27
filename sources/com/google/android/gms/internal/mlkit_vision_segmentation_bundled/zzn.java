package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzn implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzo zzc;

    public zzn(zzo zzoVar) {
        this.zzc = zzoVar;
        this.zza = zzoVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        Object key = entry.getKey();
        return new zzar(key, this.zzc.zzb.zzb(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.zzb != null) {
            z = true;
        } else {
            z = false;
        }
        zzi.zzd(z, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzw zzwVar = this.zzc.zzb;
        zzw.zzj(zzwVar, zzw.zzd(zzwVar) - this.zzb.size());
        this.zzb.clear();
        this.zzb = null;
    }
}
