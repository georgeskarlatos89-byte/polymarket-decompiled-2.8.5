package com.google.android.libraries.places.internal;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzckm extends zzchb {
    private static final ReferenceQueue zza = new ReferenceQueue();
    private static final ConcurrentMap zzb = new ConcurrentHashMap();
    private static final Logger zzc = Logger.getLogger(zzckm.class.getName());
    private final zzckl zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzckm(zzcai zzcaiVar) {
        super(zzcaiVar);
        ReferenceQueue referenceQueue = zza;
        ConcurrentMap concurrentMap = zzb;
        this.zzd = new zzckl(this, zzcaiVar, referenceQueue, concurrentMap);
    }

    public static /* synthetic */ Logger zzc() {
        return zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzchb, com.google.android.libraries.places.internal.zzcai
    public final zzcai zzd() {
        this.zzd.zzb();
        return super.zzd();
    }
}
