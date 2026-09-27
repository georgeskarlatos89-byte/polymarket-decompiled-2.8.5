package com.google.android.libraries.places.api.model;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzba extends zzhu {
    private int zza;
    private int zzb;
    private int zzc;
    private byte zzd;

    public final zzhu zza(int i) {
        this.zza = i;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzhu
    public final zzhu zzb(int i) {
        this.zzb = i;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzhu
    public final zzhu zzc(int i) {
        this.zzc = i;
        this.zzd = (byte) (this.zzd | 4);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzhu
    public final LocalDate zzd() {
        if (this.zzd != 7) {
            StringBuilder sb = new StringBuilder();
            if ((this.zzd & 1) == 0) {
                sb.append(" year");
            }
            if ((this.zzd & 2) == 0) {
                sb.append(" month");
            }
            if ((this.zzd & 4) == 0) {
                sb.append(" day");
            }
            dmk.n("Missing required properties:".concat(sb.toString()));
            return null;
        }
        return new zzfo(this.zza, this.zzb, this.zzc);
    }
}
