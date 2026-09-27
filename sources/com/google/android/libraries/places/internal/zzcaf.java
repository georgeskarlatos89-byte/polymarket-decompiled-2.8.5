package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcaf {
    private static final Logger zza = Logger.getLogger(zzcaf.class.getName());
    private static zzcaf zzb;
    private final LinkedHashSet zzc = new LinkedHashSet();
    private final LinkedHashMap zzd = new LinkedHashMap();

    public static synchronized zzcaf zza() {
        zzcaf zzcafVar;
        synchronized (zzcaf.class) {
            try {
                if (zzb == null) {
                    zzcac.class.getClassLoader();
                    List<zzcac> zza2 = zzcbz.zza(zzcac.class, Collections.singletonList(zzclw.class.getDeclaredConstructor(null).newInstance(null)).iterator(), zzcae.zza, new zzcad());
                    zzb = new zzcaf();
                    for (zzcac zzcacVar : zza2) {
                        zza.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(zzcacVar)));
                        zzb.zzd(zzcacVar);
                    }
                    zzb.zze();
                }
                zzcafVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcafVar;
    }

    public static List zzc() {
        ArrayList arrayList = new ArrayList();
        try {
            int i = zzclw.zzb;
            arrayList.add(zzclw.class);
        } catch (ClassNotFoundException e) {
            zza.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            int i2 = zzctj.a;
            arrayList.add(zzctj.class);
        } catch (ClassNotFoundException e2) {
            zza.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final synchronized void zzd(zzcac zzcacVar) {
        zzcacVar.zzb();
        this.zzc.add(zzcacVar);
    }

    private final synchronized void zze() {
        try {
            LinkedHashMap linkedHashMap = this.zzd;
            linkedHashMap.clear();
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzcac zzcacVar = (zzcac) it.next();
                String zzd = zzcacVar.zzd();
                if (((zzcac) linkedHashMap.get(zzd)) != null) {
                    zzcacVar.zzc();
                } else {
                    linkedHashMap.put(zzd, zzcacVar);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzcac zzb(String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.zzd;
        brn.m(str, "policy");
        return (zzcac) linkedHashMap.get(str);
    }
}
