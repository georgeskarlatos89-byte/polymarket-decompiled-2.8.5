package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.SpecialDay;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcu extends SpecialDay.Builder {
    private LocalDate zza;
    private boolean zzb;
    private byte zzc;

    @Override // com.google.android.libraries.places.api.model.SpecialDay.Builder
    public final SpecialDay build() {
        LocalDate localDate;
        if (this.zzc == 1 && (localDate = this.zza) != null) {
            return new zzhk(localDate, this.zzb);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" date");
        }
        if (this.zzc == 0) {
            sb.append(" exceptional");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay.Builder
    public final LocalDate getDate() {
        LocalDate localDate = this.zza;
        if (localDate != null) {
            return localDate;
        }
        dmk.n("Property \"date\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay.Builder
    public final boolean isExceptional() {
        if (this.zzc != 0) {
            return this.zzb;
        }
        dmk.n("Property \"exceptional\" has not been set");
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay.Builder
    public final SpecialDay.Builder setDate(LocalDate localDate) {
        if (localDate != null) {
            this.zza = localDate;
            return this;
        }
        dmk.s("Null date");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay.Builder
    public final SpecialDay.Builder setExceptional(boolean z) {
        this.zzb = z;
        this.zzc = (byte) 1;
        return this;
    }
}
