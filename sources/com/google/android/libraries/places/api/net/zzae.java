package com.google.android.libraries.places.api.net;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzae extends zzan {
    private String zza;
    private String zzb;
    private int zzc;

    public final zzan zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.zzan
    public final zzan zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.zzan
    public final zzao zzc() {
        String str = this.zza;
        if (str != null) {
            return new zzaf(str, this.zzb, this.zzc, null, null, null);
        }
        dmk.n("Missing required properties: placeResourceName");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.zzan
    public final zzan zzd(int i) {
        this.zzc = i;
        return this;
    }
}
