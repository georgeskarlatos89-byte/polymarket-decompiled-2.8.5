package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaek extends zzael {
    private final Map zza;

    public /* synthetic */ zzaek(zzadu zzaduVar, zzadu zzaduVar2, byte[] bArr) {
        super(null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zzd(linkedHashMap, zzaduVar);
        zzd(linkedHashMap, zzaduVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((zzacw) entry.getKey()).zzf()) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.zza = Collections.unmodifiableMap(linkedHashMap);
    }

    private static void zzd(Map map, zzadu zzaduVar) {
        for (int i = 0; i < zzaduVar.zza(); i++) {
            zzacw zzb = zzaduVar.zzb(i);
            Object obj = map.get(zzb);
            if (zzb.zzf()) {
                List list = (List) obj;
                if (list == null) {
                    list = new ArrayList();
                    map.put(zzb, list);
                }
                list.add(zzb.zze(zzaduVar.zzc(i)));
            } else {
                map.put(zzb, zzb.zze(zzaduVar.zzc(i)));
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzael
    public final void zza(zzaeb zzaebVar, Object obj) {
        for (Map.Entry entry : this.zza.entrySet()) {
            zzacw zzacwVar = (zzacw) entry.getKey();
            Object value = entry.getValue();
            if (zzacwVar.zzf()) {
                zzaebVar.zzb(zzacwVar, ((List) value).iterator(), obj);
            } else {
                zzaebVar.zza(zzacwVar, value, obj);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzael
    public final int zzb() {
        return this.zza.size();
    }

    @Override // com.google.android.libraries.places.internal.zzael
    public final Set zzc() {
        return this.zza.keySet();
    }
}
