package com.google.android.libraries.places.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbyw {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = Logger.getLogger(zzbyw.class.getName());
    private static final zzbyw zzc = new zzbyw();
    private final ConcurrentNavigableMap zzd;
    private final ConcurrentMap zze;
    private final ConcurrentMap zzf;

    public zzbyw() {
        new ConcurrentSkipListMap();
        this.zzd = new ConcurrentSkipListMap();
        this.zze = new ConcurrentHashMap();
        this.zzf = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static zzbyw zza() {
        return zzc;
    }

    public static /* synthetic */ Logger zzh() {
        return zzb;
    }

    private static void zzi(Map map, zzbze zzbzeVar) {
    }

    private static void zzj(Map map, zzbze zzbzeVar) {
    }

    public final void zzb(zzbze zzbzeVar) {
        zzi(this.zze, zzbzeVar);
    }

    public final void zzc(zzbze zzbzeVar) {
        zzi(this.zzd, zzbzeVar);
    }

    public final void zzd(zzbze zzbzeVar) {
        zzi(this.zzf, zzbzeVar);
    }

    public final void zze(zzbze zzbzeVar) {
        zzj(this.zze, zzbzeVar);
    }

    public final void zzf(zzbze zzbzeVar) {
        zzj(this.zzd, zzbzeVar);
    }

    public final void zzg(zzbze zzbzeVar) {
        zzj(this.zzf, zzbzeVar);
    }
}
