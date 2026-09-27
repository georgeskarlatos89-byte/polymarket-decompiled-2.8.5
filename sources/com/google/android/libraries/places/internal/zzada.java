package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzada {
    private static final zzacq zza = new zzacz();
    private final AtomicBoolean zzb = new AtomicBoolean();
    private final AtomicInteger zzc = new AtomicInteger();

    private zzada() {
    }

    public static int zza(zzadb zzadbVar, zzaco zzacoVar, zzadu zzaduVar) {
        zzada zzadaVar = (zzada) zza.zzb(zzacoVar, zzaduVar);
        int incrementAndGet = zzadaVar.zzc.incrementAndGet();
        if (zzadbVar == zzadb.zzc || !zzadaVar.zzb.compareAndSet(false, true)) {
            return -1;
        }
        try {
            zzadbVar.zzb();
            zzadaVar.zzb.set(false);
            zzadaVar.zzc.addAndGet(-incrementAndGet);
            return incrementAndGet - 1;
        } catch (Throwable th) {
            zzadaVar.zzb.set(false);
            throw th;
        }
    }

    public /* synthetic */ zzada(byte[] bArr) {
    }
}
