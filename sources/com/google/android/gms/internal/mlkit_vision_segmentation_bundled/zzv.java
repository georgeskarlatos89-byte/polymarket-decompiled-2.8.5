package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
class zzv extends zzt implements List {
    final /* synthetic */ zzw zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzv(zzw zzwVar, Object obj, List list, zzt zztVar) {
        super(zzwVar, obj, list, zztVar);
        this.zzf = zzwVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i, obj);
        zzw zzwVar = this.zzf;
        zzw.zzj(zzwVar, zzw.zzd(zzwVar) + 1);
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i, collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzw zzwVar = this.zzf;
            zzw.zzj(zzwVar, zzw.zzd(zzwVar) + (size2 - size));
            if (size == 0) {
                zza();
                return true;
            }
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzu(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object remove = ((List) this.zzb).remove(i);
        zzw.zzj(this.zzf, zzw.zzd(r0) - 1);
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.zzb).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        List subList = ((List) this.zzb).subList(i, i2);
        zzt zztVar = this.zzc;
        if (zztVar == null) {
            zztVar = this;
        }
        return this.zzf.zzf(this.zza, subList, zztVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new zzu(this, i);
    }
}
