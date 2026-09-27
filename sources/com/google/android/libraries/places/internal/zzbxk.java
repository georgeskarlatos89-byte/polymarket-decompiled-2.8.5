package com.google.android.libraries.places.internal;

import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbxk {
    private zzbxa zza = zzbxa.zza;
    private int zzb;
    private boolean zzc;
    private boolean zzd;

    public final zzbxk zza(zzbxa zzbxaVar) {
        brn.m(zzbxaVar, "callOptions cannot be null");
        this.zza = zzbxaVar;
        return this;
    }

    public final zzbxk zzb(int i) {
        this.zzb = i;
        return this;
    }

    public final zzbxk zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzbxk zzd(boolean z) {
        this.zzd = z;
        return this;
    }

    public final zzbxl zze() {
        return new zzbxl(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
