package com.google.android.libraries.places.internal;

import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbxh extends zzbxb {
    private final zzbxb zza;
    private final zzbxg zzb;

    public /* synthetic */ zzbxh(zzbxb zzbxbVar, zzbxg zzbxgVar, byte[] bArr) {
        this.zza = zzbxbVar;
        brn.m(zzbxgVar, "interceptor");
        this.zzb = zzbxgVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbxb
    public final zzbxf zza(zzcax zzcaxVar, zzbxa zzbxaVar) {
        return this.zzb.zza(zzcaxVar, zzbxaVar, this.zza);
    }

    @Override // com.google.android.libraries.places.internal.zzbxb
    public final String zzb() {
        return this.zza.zzb();
    }
}
