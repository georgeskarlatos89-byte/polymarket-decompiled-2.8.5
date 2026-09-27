package com.google.android.libraries.places.internal;

import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcsx implements zzbxg {
    private final zzcas zza;

    public zzcsx(zzcas zzcasVar) {
        brn.m(zzcasVar, "extraHeaders");
        this.zza = zzcasVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbxg
    public final zzbxf zza(zzcax zzcaxVar, zzbxa zzbxaVar, zzbxb zzbxbVar) {
        return new zzcsw(this, zzbxbVar.zza(zzcaxVar, zzbxaVar));
    }

    public final /* synthetic */ zzcas zzb() {
        return this.zza;
    }
}
