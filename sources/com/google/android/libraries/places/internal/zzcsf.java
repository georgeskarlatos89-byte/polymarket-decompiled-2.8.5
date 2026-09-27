package com.google.android.libraries.places.internal;

import defpackage.ix2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcsf {
    private final zzcsd zza;
    private final zzcra zzb;

    public /* synthetic */ zzcsf(zzcse zzcseVar, byte[] bArr) {
        this.zza = zzcseVar.zzd();
        this.zzb = zzcseVar.zze().zzb();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        return ix2.p(new StringBuilder(valueOf.length() + 13), "Request{url=", valueOf, "}");
    }

    public final zzcsd zza() {
        return this.zza;
    }

    public final zzcra zzb() {
        return this.zzb;
    }
}
