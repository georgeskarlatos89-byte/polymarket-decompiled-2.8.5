package com.google.android.libraries.places.internal;

import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzael {
    private static final zzael zza = new zzaef();

    public /* synthetic */ zzael(byte[] bArr) {
    }

    public static zzael zzh(zzadu zzaduVar, zzadu zzaduVar2) {
        int zza2 = zzaduVar2.zza();
        if (zza2 == 0) {
            return zza;
        }
        if (zza2 <= 28) {
            return new zzaej(zzaduVar, zzaduVar2, null);
        }
        return new zzaek(zzaduVar, zzaduVar2, null);
    }

    public abstract void zza(zzaeb zzaebVar, Object obj);

    public abstract int zzb();

    public abstract Set zzc();
}
