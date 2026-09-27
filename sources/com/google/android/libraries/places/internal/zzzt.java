package com.google.android.libraries.places.internal;

import defpackage.dr9;
import defpackage.jr9;
import defpackage.u8n;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzzt {
    private static final WeakHashMap zza = new WeakHashMap();
    private static final WeakHashMap zzb = new WeakHashMap();

    public static void zza(Throwable th) {
        Throwable th2;
        boolean z;
        zzaav zzaavVar;
        zzaal zzaalVar;
        WeakHashMap weakHashMap = zzb;
        synchronized (weakHashMap) {
            th2 = th;
            while (th2 != null) {
                try {
                    if (weakHashMap.containsKey(th2)) {
                        break;
                    } else {
                        th2 = th2.getCause();
                    }
                } finally {
                }
            }
            if (th2 != null) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(th, Boolean.valueOf(z));
        }
        if (th2 == null) {
            WeakHashMap weakHashMap2 = zza;
            synchronized (weakHashMap2) {
                Throwable th3 = th;
                while (th3 != null) {
                    try {
                        if (weakHashMap2.containsKey(th3)) {
                            break;
                        } else {
                            th3 = th3.getCause();
                        }
                    } finally {
                    }
                }
                if (th3 == null) {
                    zzaavVar = null;
                } else {
                    zzaap zzaapVar = (zzaap) weakHashMap2.get(th3);
                    weakHashMap2.put(th, zzaapVar);
                    zzaavVar = new zzaav(th3, zzaapVar);
                }
            }
            if (zzaavVar == null && (zzaalVar = zzzx.zzd().zzb) != null) {
                ArrayList arrayList = new ArrayList();
                for (zzaalVar = zzzx.zzd().zzb; zzaalVar != null; zzaalVar = null) {
                    arrayList.add(zzaalVar);
                }
                zzzo zzzoVar = new zzzo();
                zzzoVar.zzc(((zzaal) arrayList.get(0)).zzc());
                ((zzaal) arrayList.get(0)).zzi();
                zzzoVar.zzd(-1L);
                dr9 l = jr9.l(arrayList.size());
                dr9 l2 = jr9.l(arrayList.size());
                for (zzaal zzaalVar2 : u8n.d(arrayList)) {
                    l2.a(zzaalVar2.zze());
                    l.a(zzaalVar2.zzg());
                }
                WeakHashMap weakHashMap3 = zza;
                synchronized (weakHashMap3) {
                    zzzoVar.zza(l2.g());
                    zzzoVar.zzb(l.g());
                    weakHashMap3.put(th, zzzoVar.zze());
                }
            }
        }
    }
}
