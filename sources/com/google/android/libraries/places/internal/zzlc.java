package com.google.android.libraries.places.internal;

import android.content.Context;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzlc implements zzbwm {
    private final zzbwp zza;
    private final zzbwp zzb;

    private zzlc(zzbwp zzbwpVar, zzbwp zzbwpVar2) {
        this.zza = zzbwpVar;
        this.zzb = zzbwpVar2;
    }

    public static zzlc zza(zzbwp zzbwpVar, zzbwp zzbwpVar2) {
        return new zzlc(zzbwpVar, zzbwpVar2);
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzlb((Context) this.zza.zzb(), (zzcai) this.zzb.zzb());
    }
}
