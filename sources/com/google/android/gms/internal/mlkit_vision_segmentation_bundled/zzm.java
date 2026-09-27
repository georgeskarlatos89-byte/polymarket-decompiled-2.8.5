package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzm extends zzbd {
    final /* synthetic */ zzo zza;

    public zzm(zzo zzoVar) {
        this.zza = zzoVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzbd, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.zza.zza.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzn(this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzbd, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzo zzoVar = this.zza;
        zzw.zzk(zzoVar.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzbd
    public final Map zza() {
        return this.zza;
    }
}
