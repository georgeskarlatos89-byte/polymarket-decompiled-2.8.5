package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzabv extends zzadb {
    private static final zzacq zza = new zzabu();
    private final AtomicLong zzb = new AtomicLong(2147483647L);

    public static zzadb zza(zzadu zzaduVar, zzaco zzacoVar) {
        if (((Integer) zzaduVar.zzd(zzaci.zzb)) == null) {
            return null;
        }
        zzabv zzabvVar = (zzabv) zza.zzb(zzacoVar, zzaduVar);
        if (zzabvVar.zzb.incrementAndGet() >= r0.intValue()) {
            return zzabvVar;
        }
        return zzadb.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzadb
    public final void zzb() {
        this.zzb.set(0L);
    }
}
