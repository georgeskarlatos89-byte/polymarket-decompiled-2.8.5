package com.google.android.libraries.places.internal;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzafm extends AbstractSet {
    final int zza;
    final /* synthetic */ zzafn zzb;

    public zzafm(zzafn zzafnVar, int i) {
        Objects.requireNonNull(zzafnVar);
        this.zzb = zzafnVar;
        this.zza = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Comparator zze;
        int i = this.zza;
        int zzb = zzb();
        int zzc = zzc();
        if (i == -1) {
            zze = zzafn.zza();
        } else {
            zze = zzafp.zze();
        }
        if (Arrays.binarySearch(this.zzb.zzb(), zzb, zzc, obj, zze) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzafl(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zzc() - zzb();
    }

    public final Object zza(int i) {
        return this.zzb.zzb()[zzb() + i];
    }

    public final int zzb() {
        int i = this.zza;
        if (i == -1) {
            return 0;
        }
        return this.zzb.zzc()[i];
    }

    public final int zzc() {
        return this.zzb.zzc()[this.zza + 1];
    }
}
