package com.google.android.libraries.places.internal;

import java.util.logging.Level;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzacd extends zzabt {
    private static final zzacc zza = new zzacc(null);

    public zzacd(zzadq zzadqVar) {
        super(zzadqVar);
    }

    @Deprecated
    public static zzacd zzf(String str) {
        return new zzacd(zzaeo.zzd("com.google.android.libraries.mapsplatform.common.api.configs.AuxLibConfigs"));
    }

    @Override // com.google.android.libraries.places.internal.zzabt
    public final /* bridge */ /* synthetic */ zzact zza(Level level) {
        return zzg(level);
    }

    public final zzaca zzg(Level level) {
        boolean zzd = zzd(level);
        zzaeo.zzh(zzc(), level, zzd);
        if (!zzd) {
            return zza;
        }
        return new zzacb(this, level, false);
    }
}
