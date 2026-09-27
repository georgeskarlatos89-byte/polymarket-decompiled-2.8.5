package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.Money;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbg extends Money.Builder {
    private String zza;
    private Long zzb;
    private Integer zzc;

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final Integer getNanos() {
        Integer num = this.zzc;
        if (num != null) {
            return num;
        }
        dmk.n("Property \"nanos\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final Long getUnits() {
        Long l = this.zzb;
        if (l != null) {
            return l;
        }
        dmk.n("Property \"units\" has not been set");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final Money.Builder setCurrencyCode(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        dmk.s("Null currencyCode");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final Money.Builder setNanos(Integer num) {
        if (num != null) {
            this.zzc = num;
            return this;
        }
        dmk.s("Null nanos");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final Money.Builder setUnits(Long l) {
        if (l != null) {
            this.zzb = l;
            return this;
        }
        dmk.s("Null units");
        return null;
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final Money zza() {
        Long l;
        Integer num;
        String str = this.zza;
        if (str != null && (l = this.zzb) != null && (num = this.zzc) != null) {
            return new zzfu(str, l, num);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" currencyCode");
        }
        if (this.zzb == null) {
            sb.append(" units");
        }
        if (this.zzc == null) {
            sb.append(" nanos");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
