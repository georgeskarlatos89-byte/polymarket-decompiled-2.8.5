package com.google.android.libraries.places.internal;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzqf extends zzqi {
    private String zza;
    private String zzb;

    @Override // com.google.android.libraries.places.internal.zzqi
    public final zzqi zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzqi
    public final zzqi zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzqi
    public final zzqj zzc() {
        String str = this.zza;
        if (str != null) {
            return new zzqg(str, this.zzb, null);
        }
        dmk.n("Missing required properties: jwtToken");
        return null;
    }
}
