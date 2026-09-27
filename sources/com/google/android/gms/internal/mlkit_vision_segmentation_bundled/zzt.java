package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import defpackage.f27;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
class zzt extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzt zzc;
    final Collection zzd;
    final /* synthetic */ zzw zze;

    public zzt(zzw zzwVar, Object obj, Collection collection, zzt zztVar) {
        Collection collection2;
        this.zze = zzwVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zztVar;
        if (zztVar == null) {
            collection2 = null;
        } else {
            collection2 = zztVar.zzb;
        }
        this.zzd = collection2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (add) {
            zzw zzwVar = this.zze;
            zzw.zzj(zzwVar, zzw.zzd(zzwVar) + 1);
            if (isEmpty) {
                zza();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzw zzwVar = this.zze;
            zzw.zzj(zzwVar, zzw.zzd(zzwVar) + (size2 - size));
            if (size == 0) {
                zza();
                return true;
            }
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzw zzwVar = this.zze;
        zzw.zzj(zzwVar, zzw.zzd(zzwVar) - size);
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzs(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            zzw.zzj(this.zze, zzw.zzd(r0) - 1);
            zzc();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            int size2 = this.zzb.size();
            zzw zzwVar = this.zze;
            zzw.zzj(zzwVar, zzw.zzd(zzwVar) + (size2 - size));
            zzc();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            int size2 = this.zzb.size();
            zzw zzwVar = this.zze;
            zzw.zzj(zzwVar, zzw.zzd(zzwVar) + (size2 - size));
            zzc();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.zzb.toString();
    }

    public final void zza() {
        zzt zztVar = this.zzc;
        if (zztVar != null) {
            zztVar.zza();
            return;
        }
        zzw zzwVar = this.zze;
        zzw.zzg(zzwVar).put(this.zza, this.zzb);
    }

    public final void zzb() {
        zzt zztVar = this.zzc;
        if (zztVar != null) {
            zztVar.zzb();
            zzt zztVar2 = this.zzc;
            if (zztVar2.zzb != this.zzd) {
                f27.g();
                return;
            }
            return;
        }
        if (this.zzb.isEmpty()) {
            zzw zzwVar = this.zze;
            Collection collection = (Collection) zzw.zzg(zzwVar).get(this.zza);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    public final void zzc() {
        zzt zztVar = this.zzc;
        if (zztVar != null) {
            zztVar.zzc();
        } else if (this.zzb.isEmpty()) {
            zzw zzwVar = this.zze;
            zzw.zzg(zzwVar).remove(this.zza);
        }
    }
}
