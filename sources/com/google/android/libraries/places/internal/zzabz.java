package com.google.android.libraries.places.internal;

import java.util.logging.Level;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzabz extends zzack implements zzact {
    public zzabz(Level level, boolean z) {
        super(level, false);
    }

    @Override // com.google.android.libraries.places.internal.zzack
    public final zzafy zza() {
        return zzafw.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzack
    public final boolean zzb(zzaco zzacoVar) {
        zzadu zzl = zzl();
        int zza = zzl.zza();
        int i = 0;
        while (true) {
            if (i >= zza) {
                break;
            }
            if (zzl.zzb(i).zzd() == "eye3tag") {
                if (zzl.zzd(zzaci.zza) == null) {
                    zzacw zzacwVar = zzaci.zzi;
                    if (zzl.zzd(zzacwVar) == null) {
                        zzm(zzacwVar, zzadg.SMALL);
                    }
                }
            } else {
                i++;
            }
        }
        return super.zzb(zzacoVar);
    }
}
