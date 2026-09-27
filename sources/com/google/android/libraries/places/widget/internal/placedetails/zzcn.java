package com.google.android.libraries.places.widget.internal.placedetails;

import com.google.android.libraries.places.internal.zzbwm;
import com.google.android.libraries.places.internal.zzbwp;
import com.google.android.libraries.places.internal.zzpn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcn implements zzbwm {
    private final zzbwp zza;
    private final zzbwp zzb;

    private zzcn(zzbwp zzbwpVar, zzbwp zzbwpVar2) {
        this.zza = zzbwpVar;
        this.zzb = zzbwpVar2;
    }

    public static zzcn zzc(zzbwp zzbwpVar, zzbwp zzbwpVar2) {
        return new zzcn(zzbwpVar, zzbwpVar2);
    }

    public final zzcm zza() {
        return new zzcm(((zzpn) this.zza).zza(), (zzcc) this.zzb.zzb());
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza();
    }
}
