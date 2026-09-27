package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcnh {
    final boolean zza;
    final List zzb;
    final Collection zzc;
    final Collection zzd;
    final int zze;
    final zzcnq zzf;
    final boolean zzg;
    final boolean zzh;

    public zzcnh(List list, Collection collection, Collection collection2, zzcnq zzcnqVar, boolean z, boolean z2, boolean z3, int i) {
        boolean z4;
        boolean z5;
        boolean z6;
        this.zzb = list;
        brn.m(collection, "drainedSubstreams");
        this.zzc = collection;
        this.zzf = zzcnqVar;
        this.zzd = collection2;
        this.zzg = z;
        this.zza = z2;
        this.zzh = z3;
        this.zze = i;
        if (!z2 || list == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        brn.r("passThrough should imply buffer is null", z4);
        if (!z2 || zzcnqVar != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        brn.r("passThrough should imply winningSubstream != null", z5);
        if (!z2 || ((collection.size() == 1 && collection.contains(zzcnqVar)) || (collection.size() == 0 && zzcnqVar.zzb))) {
            z6 = true;
        } else {
            z6 = false;
        }
        brn.r("passThrough should imply winningSubstream is drained", z6);
        brn.r("cancelled should imply committed", (z && zzcnqVar == null) ? false : true);
    }

    public final zzcnh zza(zzcnq zzcnqVar) {
        boolean z;
        boolean z2 = true;
        brn.r("Already passThrough", !this.zza);
        boolean z3 = zzcnqVar.zzb;
        Collection collection = this.zzc;
        if (!z3) {
            if (collection.isEmpty()) {
                collection = Collections.singletonList(zzcnqVar);
            } else {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.add(zzcnqVar);
                collection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection2 = collection;
        zzcnq zzcnqVar2 = this.zzf;
        if (zzcnqVar2 != null) {
            z = true;
        } else {
            z = false;
        }
        List list = this.zzb;
        if (z) {
            if (zzcnqVar2 != zzcnqVar) {
                z2 = false;
            }
            brn.r("Another RPC attempt has already committed", z2);
            list = null;
        }
        return new zzcnh(list, collection2, this.zzd, zzcnqVar2, this.zzg, z, this.zzh, this.zze);
    }

    public final zzcnh zzb() {
        if (this.zzh) {
            return this;
        }
        return new zzcnh(this.zzb, this.zzc, this.zzd, this.zzf, this.zzg, this.zza, true, this.zze);
    }

    public final zzcnh zzc(zzcnq zzcnqVar) {
        boolean z;
        Collection unmodifiableCollection;
        boolean z2 = this.zzh;
        brn.r("hedging frozen", !z2);
        zzcnq zzcnqVar2 = this.zzf;
        if (zzcnqVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        brn.r("already committed", z);
        Collection collection = this.zzd;
        if (collection == null) {
            unmodifiableCollection = Collections.singleton(zzcnqVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(zzcnqVar);
            unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new zzcnh(this.zzb, this.zzc, unmodifiableCollection, zzcnqVar2, this.zzg, this.zza, z2, this.zze + 1);
    }
}
