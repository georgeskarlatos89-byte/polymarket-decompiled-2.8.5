package com.google.android.libraries.places.internal;

import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzqr {
    public abstract zzqr zzb(int i);

    public abstract zzqr zzc(zzqs zzqsVar);

    public abstract zzqt zzd();

    public final zzqt zze() {
        zzqt zzd = zzd();
        brn.g("Package name must not be empty.", !zzd.zza().isEmpty());
        return zzd;
    }
}
