package com.google.android.libraries.places.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzady extends zzaeb {
    private final Map zza;
    private final Map zzb;
    private final zzaea zzc;
    private final zzadz zzd;

    public /* synthetic */ zzady(zzadx zzadxVar, byte[] bArr) {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        HashMap hashMap2 = new HashMap();
        this.zzb = hashMap2;
        hashMap.putAll(zzadxVar.zzd());
        hashMap2.putAll(zzadxVar.zze());
        this.zzc = zzadxVar.zzf();
        this.zzd = zzadxVar.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzaeb
    public final void zza(zzacw zzacwVar, Object obj, Object obj2) {
        zzaea zzaeaVar = (zzaea) this.zza.get(zzacwVar);
        if (zzaeaVar != null) {
            zzaeaVar.zza(zzacwVar, obj, obj2);
        } else {
            this.zzc.zza(zzacwVar, obj, obj2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzaeb
    public final void zzb(zzacw zzacwVar, Iterator it, Object obj) {
        zzadz zzadzVar = (zzadz) this.zzb.get(zzacwVar);
        if (zzadzVar != null) {
            zzadzVar.zza(zzacwVar, it, obj);
            return;
        }
        zzadz zzadzVar2 = this.zzd;
        if (zzadzVar2 != null && !this.zza.containsKey(zzacwVar)) {
            zzadzVar2.zza(zzacwVar, it, obj);
        } else {
            while (it.hasNext()) {
                zza(zzacwVar, it.next(), obj);
            }
        }
    }
}
