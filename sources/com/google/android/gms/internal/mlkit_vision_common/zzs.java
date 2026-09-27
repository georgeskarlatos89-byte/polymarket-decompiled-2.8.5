package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzs extends zzl implements Set {
    private transient zzp zza;

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
        return zzaa.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return zzd();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public abstract zzab zzd();

    public final zzp zzf() {
        zzp zzpVar = this.zza;
        if (zzpVar == null) {
            zzp zzg = zzg();
            this.zza = zzg;
            return zzg;
        }
        return zzpVar;
    }

    public zzp zzg() {
        return zzp.zzg(toArray());
    }
}
