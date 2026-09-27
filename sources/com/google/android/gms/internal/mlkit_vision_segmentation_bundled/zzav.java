package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import defpackage.dmk;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzav extends zzaq implements List, RandomAccess {
    private static final zzbu zza = new zzat(zzbk.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzav zzg(Object[] objArr, int i) {
        if (i == 0) {
            return zzbk.zza;
        }
        return new zzbk(objArr, i);
    }

    public static zzav zzh(Object obj) {
        Object[] objArr = {obj};
        if (obj != null) {
            return zzg(objArr, 1);
        }
        dmk.s("at index 0");
        return null;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzaq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!zzh.zza(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !zzh.zza(it.next(), it2.next())) {
                return false;
            }
        }
        if (!it2.hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzi(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return zzi(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzaq
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzaq
    public final zzbt zzd() {
        return zzi(0);
    }

    public zzav zzf(int i, int i2) {
        zzi.zzc(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzbk.zza;
        }
        return new zzau(this, i, i3);
    }

    public final zzbu zzi(int i) {
        zzi.zzb(i, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new zzat(this, i);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return zzi(i);
    }
}
