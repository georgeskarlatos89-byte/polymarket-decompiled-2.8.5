package com.google.android.libraries.places.api.auth;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzc extends zza {
    private boolean zza;
    private String zzb;
    private String zzc;
    private byte zzd;

    @Override // com.google.android.libraries.places.api.auth.zza
    public final zza zza(boolean z) {
        this.zza = z;
        this.zzd = (byte) 1;
        return this;
    }

    @Override // com.google.android.libraries.places.api.auth.zza
    public final zza zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.auth.zza
    public final zza zzc(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.auth.zza
    public final zzb zzd() {
        if (this.zzd == 1) {
            return new zzd(this.zza, this.zzb, this.zzc, null);
        }
        dmk.n("Missing required properties: appCheckEnabled");
        return null;
    }
}
