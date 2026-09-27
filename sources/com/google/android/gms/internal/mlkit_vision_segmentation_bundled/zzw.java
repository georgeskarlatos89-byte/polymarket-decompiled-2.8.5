package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import defpackage.dmk;
import defpackage.omf;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzw extends zzy implements Serializable {
    private transient Map zza;
    private transient int zzb;

    public zzw(Map map) {
        if (map.isEmpty()) {
            this.zza = map;
        } else {
            omf.a();
            throw null;
        }
    }

    public static /* bridge */ /* synthetic */ int zzd(zzw zzwVar) {
        return zzwVar.zzb;
    }

    public static /* bridge */ /* synthetic */ Map zzg(zzw zzwVar) {
        return zzwVar.zza;
    }

    public static /* bridge */ /* synthetic */ void zzj(zzw zzwVar, int i) {
        zzwVar.zzb = i;
    }

    public static /* bridge */ /* synthetic */ void zzk(zzw zzwVar, Object obj) {
        Object obj2;
        Map map = zzwVar.zza;
        map.getClass();
        try {
            obj2 = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzwVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Object obj, Collection collection) {
        throw null;
    }

    public final Collection zze(Object obj) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            collection = zza();
        }
        return zzb(obj, collection);
    }

    public final List zzf(Object obj, List list, zzt zztVar) {
        if (list instanceof RandomAccess) {
            return new zzr(this, obj, list, zztVar);
        }
        return new zzv(this, obj, list, zztVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzy
    public final Map zzh() {
        return new zzo(this, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzy
    public final Set zzi() {
        return new zzq(this, this.zza);
    }

    public final void zzl() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzy, com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzbi
    public final boolean zzm(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            Collection zza = zza();
            if (zza.add(obj2)) {
                this.zzb++;
                this.zza.put(obj, zza);
                return true;
            }
            dmk.i("New Collection violated the Collection spec");
            return false;
        }
        if (!collection.add(obj2)) {
            return false;
        }
        this.zzb++;
        return true;
    }
}
