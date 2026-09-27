package com.google.android.libraries.places.api.net;

import defpackage.dmk;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzw extends zzai {
    private String zza;
    private String zzb;
    private List zzc;
    private int zzd;

    public final zzai zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.zzai
    public final zzai zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.zzai
    public final zzai zzc(List list) {
        this.zzc = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.zzai
    public final List zzd() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.zzai
    public final zzak zze() {
        String str = this.zza;
        if (str != null) {
            return new zzx(str, this.zzb, this.zzd, 0, null, this.zzc, null, null);
        }
        dmk.n("Missing required properties: placeResourceName");
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.zzai
    public final zzai zzf(int i) {
        this.zzd = i;
        return this;
    }
}
