package com.google.android.libraries.places.api.model;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzu extends zzhp {
    private int zza;
    private int zzb;
    private byte zzc;

    @Override // com.google.android.libraries.places.api.model.zzhp
    public final zzhp zza(int i) {
        this.zza = i;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzhp
    public final zzhp zzb(int i) {
        this.zzb = i;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzhp
    public final zzhq zzc() {
        if (this.zzc != 3) {
            StringBuilder sb = new StringBuilder();
            if ((this.zzc & 1) == 0) {
                sb.append(" offset");
            }
            if ((this.zzc & 2) == 0) {
                sb.append(" length");
            }
            dmk.n("Missing required properties:".concat(sb.toString()));
            return null;
        }
        return new zzee(this.zza, this.zzb);
    }
}
