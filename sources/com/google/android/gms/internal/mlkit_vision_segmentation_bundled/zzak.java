package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzak extends AbstractCollection {
    final /* synthetic */ zzal zza;

    public zzak(zzal zzalVar) {
        this.zza = zzalVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzal zzalVar = this.zza;
        Map zzl = zzalVar.zzl();
        if (zzl != null) {
            return zzl.values().iterator();
        }
        return new zzae(zzalVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
