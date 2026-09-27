package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaby extends zzadb {
    private static final zzacq zza = new zzabw();
    private final AtomicLong zzb = new AtomicLong(-1);

    public static zzadb zza(zzadu zzaduVar, zzaco zzacoVar, long j) {
        boolean z;
        if (((zzabx) zzaduVar.zzd(zzaci.zzd)) == null) {
            return null;
        }
        zzaby zzabyVar = (zzaby) zza.zzb(zzacoVar, zzaduVar);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzagc.zzb(z, "timestamp cannot be negative");
        AtomicLong atomicLong = zzabyVar.zzb;
        long j2 = atomicLong.get();
        if (j2 < 0) {
            atomicLong.compareAndSet(j2, -j);
            return zzabyVar;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzadb
    public final void zzb() {
        AtomicLong atomicLong = this.zzb;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
