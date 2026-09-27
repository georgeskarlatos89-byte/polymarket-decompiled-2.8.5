package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import defpackage.f27;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
class zzs implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzt zzc;

    public zzs(zzt zztVar) {
        Iterator it;
        this.zzc = zztVar;
        Collection collection = zztVar.zzb;
        this.zzb = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        zzw.zzj(this.zzc.zze, zzw.zzd(r0) - 1);
        this.zzc.zzc();
    }

    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb == this.zzb) {
            return;
        }
        f27.g();
    }

    public zzs(zzt zztVar, Iterator it) {
        this.zzc = zztVar;
        this.zzb = zztVar.zzb;
        this.zza = it;
    }
}
