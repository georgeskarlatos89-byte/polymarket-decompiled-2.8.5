package com.google.android.libraries.places.api.model;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzcv extends SpecialDay {
    private final LocalDate zza;
    private final boolean zzb;

    public zzcv(LocalDate localDate, boolean z) {
        if (localDate != null) {
            this.zza = localDate;
            this.zzb = z;
        } else {
            dmk.s("Null date");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SpecialDay) {
            SpecialDay specialDay = (SpecialDay) obj;
            if (this.zza.equals(specialDay.getDate()) && this.zzb == specialDay.isExceptional()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay
    public final LocalDate getDate() {
        return this.zza;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.zza.hashCode() ^ 1000003;
        if (true != this.zzb) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i ^ (hashCode * 1000003);
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay
    public final boolean isExceptional() {
        return this.zzb;
    }

    public final String toString() {
        String localDate = this.zza.toString();
        int length = localDate.length();
        boolean z = this.zzb;
        StringBuilder sb = new StringBuilder(length + 30 + String.valueOf(z).length() + 1);
        sb.append("SpecialDay{date=");
        sb.append(localDate);
        sb.append(", exceptional=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
