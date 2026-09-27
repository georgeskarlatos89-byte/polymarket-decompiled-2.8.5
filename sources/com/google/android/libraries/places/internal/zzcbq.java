package com.google.android.libraries.places.internal;

import defpackage.bxf;
import defpackage.mr9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcbq {
    private static final Logger zza = Logger.getLogger(zzcbq.class.getName());
    private static zzcbq zzb;
    private String zzc;
    private final LinkedHashSet zzd;
    private mr9 zze;

    public zzcbq() {
        new zzcbn(this, null);
        this.zzc = "unknown";
        this.zzd = new LinkedHashSet();
        this.zze = bxf.g;
    }

    public static synchronized zzcbq zzc() {
        zzcbq zzcbqVar;
        synchronized (zzcbq.class) {
            try {
                if (zzb == null) {
                    zzcbm.class.getClassLoader();
                    List<zzcbm> zza2 = zzcbz.zza(zzcbm.class, Collections.singletonList(zzcgq.class.getDeclaredConstructor(null).newInstance(null)).iterator(), zzcbp.zza, new zzcbo(null));
                    if (zza2.isEmpty()) {
                        zza.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                    }
                    zzb = new zzcbq();
                    for (zzcbm zzcbmVar : zza2) {
                        zza.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(zzcbmVar)));
                        zzb.zzf(zzcbmVar);
                    }
                    zzb.zzg();
                }
                zzcbqVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcbqVar;
    }

    public static List zze() {
        ArrayList arrayList = new ArrayList();
        try {
            int i = zzcgq.a;
            arrayList.add(zzcgq.class);
        } catch (ClassNotFoundException e) {
            zza.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.binder.internal.IntentNameResolverProvider"));
        } catch (ClassNotFoundException e2) {
            zza.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find IntentNameResolverProvider", (Throwable) e2);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final synchronized void zzf(zzcbm zzcbmVar) {
        zzcbmVar.zzd();
        this.zzd.add(zzcbmVar);
    }

    private final synchronized void zzg() {
        try {
            HashMap hashMap = new HashMap();
            Iterator it = this.zzd.iterator();
            String str = "unknown";
            char c = 0;
            while (it.hasNext()) {
                zzcbm zzcbmVar = (zzcbm) it.next();
                String zzc = zzcbmVar.zzc();
                if (((zzcbm) hashMap.get(zzc)) != null) {
                    zzcbmVar.zze();
                } else {
                    hashMap.put(zzc, zzcbmVar);
                }
                zzcbmVar.zze();
                if (c < 5) {
                    zzcbmVar.zze();
                    str = zzcbmVar.zzc();
                }
                c = 5;
            }
            this.zze = mr9.b(hashMap);
            this.zzc = str;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized String zza() {
        return this.zzc;
    }

    public final zzcbm zzb(String str) {
        if (str == null) {
            return null;
        }
        return (zzcbm) zzd().get(str.toLowerCase(Locale.US));
    }

    public final synchronized Map zzd() {
        return this.zze;
    }
}
