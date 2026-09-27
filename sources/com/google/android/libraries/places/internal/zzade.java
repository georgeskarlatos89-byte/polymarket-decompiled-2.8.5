package com.google.android.libraries.places.internal;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzade extends zzadb {
    private static final zzacq zzb = new zzadc();
    private static final ThreadLocal zze = new zzadd();
    final AtomicInteger zza = new AtomicInteger();

    public static zzadb zza(zzadu zzaduVar, zzaco zzacoVar) {
        int i;
        Integer num = (Integer) zzaduVar.zzd(zzaci.zzc);
        if (num != null && num.intValue() > 0) {
            zzade zzadeVar = (zzade) zzb.zzb(zzacoVar, zzaduVar);
            if (((Random) zze.get()).nextInt(num.intValue()) == 0) {
                i = zzadeVar.zza.incrementAndGet();
            } else {
                i = zzadeVar.zza.get();
            }
            if (i > 0) {
                return zzadeVar;
            }
            return zzadb.zzc;
        }
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzadb
    public final void zzb() {
        this.zza.decrementAndGet();
    }
}
