package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcde {
    private static final Logger zza = Logger.getLogger(zzcde.class.getName());
    private final String zzb;
    private final AtomicLong zzc;

    public zzcde(String str, long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.zzc = atomicLong;
        this.zzb = "keepalive time nanos";
        atomicLong.set(Long.MAX_VALUE);
    }

    public static /* synthetic */ Logger zzb() {
        return zza;
    }

    public final zzcdd zza() {
        return new zzcdd(this, this.zzc.get(), null);
    }

    public final /* synthetic */ String zzc() {
        return this.zzb;
    }

    public final /* synthetic */ AtomicLong zzd() {
        return this.zzc;
    }
}
