package com.google.android.libraries.places.internal;

import defpackage.bd0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbws implements zzbwm {
    private final List zza;
    private final List zzb;

    static {
        zzbwn.zza(Collections.EMPTY_SET);
    }

    public /* synthetic */ zzbws(List list, List list2, zzbwq zzbwqVar) {
        this.zza = list;
        this.zzb = list2;
    }

    public static zzbwr zza(int i, int i2) {
        return new zzbwr(1, 0, null);
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc();
    }

    public final Set zzc() {
        int i;
        List list = this.zza;
        int size = list.size();
        List list2 = this.zzb;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Collection collection = (Collection) ((zzbwp) list2.get(i2)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        if (size < 3) {
            i = size + 1;
        } else if (size < 1073741824) {
            i = (int) ((size / 0.75f) + 1.0f);
        } else {
            i = bd0.API_PRIORITY_OTHER;
        }
        HashSet hashSet = new HashSet(i);
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object zzb = ((zzbwp) list.get(i3)).zzb();
            zzb.getClass();
            hashSet.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            for (Object obj : (Collection) arrayList.get(i4)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
