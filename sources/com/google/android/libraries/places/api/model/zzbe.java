package com.google.android.libraries.places.api.model;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbe extends zzhw {
    private String zza;
    private zzdg zzb;
    private zzde zzc;

    @Override // com.google.android.libraries.places.api.model.zzhw
    public final zzhw zza(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        dmk.s("Null mediaResourceName");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.zzhw
    public final zzhw zzb(zzdg zzdgVar) {
        this.zzb = zzdgVar;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzhw
    public final zzhw zzc(zzde zzdeVar) {
        this.zzc = zzdeVar;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzhw
    public final zzhx zzd() {
        String str = this.zza;
        if (str != null) {
            return new zzfs(str, this.zzb, this.zzc);
        }
        dmk.n("Missing required properties: mediaResourceName");
        return null;
    }
}
