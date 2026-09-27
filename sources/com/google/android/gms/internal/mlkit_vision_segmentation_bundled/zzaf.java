package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaf extends AbstractSet {
    final /* synthetic */ zzal zza;

    public zzaf(zzal zzalVar) {
        this.zza = zzalVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int zzd = zzal.zzd(this.zza, entry.getKey());
            if (zzd != -1 && zzh.zza(zzal.zzj(this.zza, zzd), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzal zzalVar = this.zza;
        Map zzl = zzalVar.zzl();
        if (zzl != null) {
            return zzl.entrySet().iterator();
        }
        return new zzad(zzalVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzal zzalVar = this.zza;
            if (!zzalVar.zzr()) {
                int zzc = zzal.zzc(zzalVar);
                Object key = entry.getKey();
                Object value = entry.getValue();
                zzal zzalVar2 = this.zza;
                int zzb = zzam.zzb(key, value, zzc, zzal.zzi(zzalVar2), zzal.zzs(zzalVar2), zzal.zzt(zzalVar2), zzal.zzu(zzalVar2));
                if (zzb != -1) {
                    this.zza.zzq(zzb, zzc);
                    zzal.zzm(this.zza, zzal.zzb(r10) - 1);
                    this.zza.zzo();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
