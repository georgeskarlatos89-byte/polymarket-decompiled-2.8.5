package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbxu {
    private static zzbxu zza;
    private final List zzb = Collections.EMPTY_LIST;
    private int zzc = 0;

    public static synchronized zzbxu zza() {
        zzbxu zzbxuVar;
        synchronized (zzbxu.class) {
            zzbxuVar = zza;
            if (zzbxuVar == null) {
                zzbxuVar = new zzbxu();
                zza = zzbxuVar;
            }
        }
        return zzbxuVar;
    }

    public final synchronized List zzb() {
        this.zzc++;
        return this.zzb;
    }

    public final synchronized boolean zzc() {
        return false;
    }
}
