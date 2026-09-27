package com.google.android.libraries.places.internal;

import defpackage.af9;
import defpackage.nhn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
class zzchb extends zzcai {
    private final zzcai zza;

    public zzchb(zzcai zzcaiVar) {
        this.zza = zzcaiVar;
    }

    public final String toString() {
        af9 b = nhn.b(this);
        b.f(this.zza, "delegate");
        return b.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbxb
    public final zzbxf zza(zzcax zzcaxVar, zzbxa zzbxaVar) {
        return this.zza.zza(zzcaxVar, zzbxaVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbxb
    public final String zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzcai
    public zzcai zzd() {
        zzcai zzcaiVar = this.zza;
        ((zzckf) zzcaiVar).zzg();
        return zzcaiVar;
    }
}
