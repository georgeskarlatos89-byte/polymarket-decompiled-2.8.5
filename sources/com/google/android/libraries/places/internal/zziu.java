package com.google.android.libraries.places.internal;

import defpackage.wca;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zziu {
    private final zzqj zza;

    public zziu(zzqj zzqjVar) {
        this.zza = zzqjVar;
    }

    private final String zzc(List list, boolean z, List list2) {
        ArrayList arrayList = new ArrayList(list);
        zzqj zzqjVar = this.zza;
        final String str = "attributions";
        if (zzqjVar != null) {
            arrayList.removeIf(new Predicate(str) { // from class: com.google.android.libraries.places.internal.zzit
                private final /* synthetic */ String zza = "attributions";

                @Override // java.util.function.Predicate
                public final /* synthetic */ boolean test(Object obj) {
                    return this.zza.equals(obj);
                }
            });
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList.get(i);
            if (z) {
                str2 = "places.".concat(String.valueOf(str2));
            }
            arrayList2.add(str2);
        }
        if (!arrayList.contains("attributions") && zzqjVar == null) {
            if (true == z) {
                str = "places.attributions";
            }
            arrayList2.add(str);
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((zzis) it.next()).toString());
        }
        return new wca(",").c(arrayList2);
    }

    public final String zza(List list, List list2) {
        return zzc(list, true, list2);
    }

    public final String zzb(List list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add("attributions");
        return zzc(arrayList, false, new ArrayList());
    }
}
