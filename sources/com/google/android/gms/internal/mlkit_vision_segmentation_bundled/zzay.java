package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzay extends zzaq implements Set {
    private transient zzav zza;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzbr.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return zzd();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzaq
    public abstract zzbt zzd();

    public final zzav zzf() {
        zzav zzavVar = this.zza;
        if (zzavVar == null) {
            zzav zzg = zzg();
            this.zza = zzg;
            return zzg;
        }
        return zzavVar;
    }

    public zzav zzg() {
        Object[] array = toArray();
        int i = zzav.zzd;
        return zzav.zzg(array, array.length);
    }
}
