package com.google.android.libraries.places.internal;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzafc extends zzaer {
    private final String zza;
    private final Level zzb;
    private final Set zzc;
    private final zzaeb zzd;
    private final int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzafc(String str, String str2, boolean z, int i, boolean z2, boolean z3) {
        super(str2);
        Level level = Level.ALL;
        int i2 = zzafd.zza;
        this.zza = "";
        this.zze = 2;
        this.zzb = level;
        this.zzc = zzafd.zzf();
        this.zzd = zzafd.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzadq
    public final boolean zzb(Level level) {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzadq
    public final void zzc(zzado zzadoVar) {
        String str = (String) zzadoVar.zzl().zzd(zzadh.zza);
        if (str == null) {
            str = zza();
        }
        if (str == null) {
            str = zzadoVar.zzg().zza();
            int indexOf = str.indexOf(36, str.lastIndexOf(46));
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
        }
        String str2 = this.zza;
        zzafd.zzh(zzadoVar, zzaew.zza(str2, str, true), 2, this.zzb, this.zzc, this.zzd);
    }
}
