package com.google.android.libraries.places.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzccm extends zzbxz {
    private static final Logger zzb = Logger.getLogger(zzccm.class.getName());
    static final ThreadLocal zza = new ThreadLocal();

    @Override // com.google.android.libraries.places.internal.zzbxz
    public final zzbya zza(zzbya zzbyaVar) {
        zzbya zzc = zzc();
        zza.set(zzbyaVar);
        return zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzbxz
    public final void zzb(zzbya zzbyaVar, zzbya zzbyaVar2) {
        if (zzc() != zzbyaVar) {
            zzb.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (zzbyaVar2 != zzbya.zzb) {
            zza.set(zzbyaVar2);
        } else {
            zza.set(null);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbxz
    public final zzbya zzc() {
        zzbya zzbyaVar = (zzbya) zza.get();
        if (zzbyaVar == null) {
            return zzbya.zzb;
        }
        return zzbyaVar;
    }
}
