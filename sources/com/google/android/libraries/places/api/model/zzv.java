package com.google.android.libraries.places.api.model;

import defpackage.sv6;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzv extends zzhq {
    private final int zza;
    private final int zzb;

    public zzv(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhq) {
            zzhq zzhqVar = (zzhq) obj;
            if (this.zza == zzhqVar.zza() && this.zzb == zzhqVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 31 + String.valueOf(i2).length() + 1);
        sv6.w(i, i2, "SubstringMatch{offset=", ", length=", sb);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.zzhq
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.zzhq
    public final int zzb() {
        return this.zzb;
    }
}
