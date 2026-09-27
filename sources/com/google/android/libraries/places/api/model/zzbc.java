package com.google.android.libraries.places.api.model;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbc extends zzhv {
    private int zza;
    private int zzb;
    private byte zzc;

    public final zzhv zza(int i) {
        this.zza = i;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzhv
    public final zzhv zzb(int i) {
        this.zzb = i;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzhv
    public final LocalTime zzc() {
        if (this.zzc != 3) {
            StringBuilder sb = new StringBuilder();
            if ((this.zzc & 1) == 0) {
                sb.append(" hours");
            }
            if ((this.zzc & 2) == 0) {
                sb.append(" minutes");
            }
            dmk.n("Missing required properties:".concat(sb.toString()));
            return null;
        }
        return new zzfq(this.zza, this.zzb);
    }
}
