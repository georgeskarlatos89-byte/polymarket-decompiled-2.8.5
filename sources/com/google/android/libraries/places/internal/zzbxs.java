package com.google.android.libraries.places.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbxs {
    public static final /* synthetic */ int zza = 0;
    private static final zzbxs zzb = new zzbxs(new zzbxo(), zzbxp.zza);
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    public zzbxs(zzbxr... zzbxrVarArr) {
        for (int i = 0; i < 2; i++) {
            zzbxr zzbxrVar = zzbxrVarArr[i];
            this.zzc.put(zzbxrVar.zza(), zzbxrVar);
        }
    }

    public static zzbxs zza() {
        return zzb;
    }
}
