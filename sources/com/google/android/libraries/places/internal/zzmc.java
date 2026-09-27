package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzmc {
    public static final List zza(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbis zzbisVar = (zzbis) it.next();
            int zza = zzbisVar.zza();
            int zzc = zzbisVar.zzc() - zzbisVar.zza();
            com.google.android.libraries.places.api.model.zzhp zzc2 = com.google.android.libraries.places.api.model.zzhq.zzc();
            zzc2.zza(zza);
            zzc2.zzb(zzc);
            arrayList.add(zzc2.zzc());
        }
        return arrayList;
    }
}
