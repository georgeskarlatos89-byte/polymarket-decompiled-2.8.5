package com.google.android.libraries.places.internal;

import defpackage.dmk;
import defpackage.hdi;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzafs {
    private final int zza;
    private final zzadl zzb;

    public zzafs(zzadl zzadlVar, int i) {
        if (zzadlVar != null) {
            if (i >= 0) {
                this.zza = i;
                this.zzb = zzadlVar;
                return;
            } else {
                dmk.v(hdi.l(i, "invalid index: ", new StringBuilder(String.valueOf(i).length() + 15)));
                throw null;
            }
        }
        dmk.v("format options cannot be null");
        throw null;
    }

    public abstract void zzb(zzaft zzaftVar, Object obj);

    public final int zzc() {
        return this.zza;
    }

    public final zzadl zzd() {
        return this.zzb;
    }

    public final void zze(zzaft zzaftVar, Object[] objArr) {
        if (this.zza <= 0) {
            Object obj = objArr[0];
            if (obj != null) {
                zzb(zzaftVar, obj);
                return;
            } else {
                zzaftVar.zzf();
                return;
            }
        }
        zzaftVar.zze();
    }
}
