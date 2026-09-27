package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzaj extends zzab implements Set {
    private transient zzaf zza;

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
        return zzar.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return zzd();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public abstract zzas zzd();

    public final zzaf zzf() {
        zzaf zzafVar = this.zza;
        if (zzafVar == null) {
            zzaf zzg = zzg();
            this.zza = zzg;
            return zzg;
        }
        return zzafVar;
    }

    public zzaf zzg() {
        Object[] array = toArray();
        int i = zzaf.zzd;
        return zzaf.zzg(array, array.length);
    }
}
