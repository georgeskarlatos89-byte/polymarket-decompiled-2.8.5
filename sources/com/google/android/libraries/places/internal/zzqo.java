package com.google.android.libraries.places.internal;

import android.content.Context;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzqo implements zzbwm {
    private final zzbwp zza;
    private final zzbwp zzb;

    private zzqo(zzbwp zzbwpVar, zzbwp zzbwpVar2, zzbwp zzbwpVar3) {
        this.zza = zzbwpVar;
        this.zzb = zzbwpVar3;
    }

    public static zzqo zza(zzbwp zzbwpVar, zzbwp zzbwpVar2, zzbwp zzbwpVar3) {
        return new zzqo(zzbwpVar, zzbwpVar2, zzbwpVar3);
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfv((Context) this.zza.zzb(), zzfo.zzc(), (zzfd) this.zzb.zzb());
    }
}
