package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzafa extends zzafe {
    private static final zzafa zza = new zzafa(zzafe.zze());
    private final AtomicReference zzb;

    public zzafa(zzafe zzafeVar) {
        this.zzb = new AtomicReference(zzafeVar);
    }

    public static final zzafa zza() {
        return zza;
    }

    @Override // com.google.android.libraries.places.internal.zzafe
    public final boolean zzb(String str, Level level, boolean z) {
        ((zzafe) this.zzb.get()).zzb(str, level, z);
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzafe
    public final zzafp zzc() {
        return ((zzafe) this.zzb.get()).zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzafe
    public final zzadu zzd() {
        return ((zzafe) this.zzb.get()).zzd();
    }
}
