package com.google.android.libraries.places.internal;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzafb implements zzaet {
    private final String zza;
    private final Level zzb;
    private final Set zzc;
    private final zzaeb zzd;
    private final int zze;

    private zzafb() {
        this("", true, 2, Level.ALL, false, zzafd.zzf(), zzafd.zzg());
    }

    @Override // com.google.android.libraries.places.internal.zzaet
    public final zzadq zza(String str) {
        return new zzafd(this.zza, str, true, 2, this.zzb, this.zzc, this.zzd, null);
    }

    public final zzafb zzb(boolean z) {
        Set set = this.zzc;
        zzaeb zzaebVar = this.zzd;
        return new zzafb(this.zza, true, 2, Level.OFF, false, set, zzaebVar);
    }

    private zzafb(String str, boolean z, int i, Level level, boolean z2, Set set, zzaeb zzaebVar) {
        this.zza = "";
        this.zze = 2;
        this.zzb = level;
        this.zzc = set;
        this.zzd = zzaebVar;
    }

    public /* synthetic */ zzafb(byte[] bArr) {
        this("", true, 2, Level.ALL, false, zzafd.zzf(), zzafd.zzg());
    }
}
