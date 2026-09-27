package com.google.android.libraries.places.api.model;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzbh extends Money {
    private final String zza;
    private final Long zzb;
    private final Integer zzc;

    public zzbh(String str, Long l, Integer num) {
        if (str != null) {
            this.zza = str;
            this.zzb = l;
            this.zzc = num;
            return;
        }
        dmk.s("Null currencyCode");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Money) {
            Money money = (Money) obj;
            if (this.zza.equals(money.getCurrencyCode()) && this.zzb.equals(money.getUnits()) && this.zzc.equals(money.getNanos())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.Money
    public final String getCurrencyCode() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Money
    public final Integer getNanos() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.Money
    public final Long getUnits() {
        return this.zzb;
    }

    public final int hashCode() {
        int hashCode = ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        return this.zzc.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        Long l = this.zzb;
        int length = l.toString().length();
        Integer num = this.zzc;
        int length2 = num.toString().length();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + 27 + length + 8 + length2 + 1);
        sb.append("Money{currencyCode=");
        sb.append(str);
        sb.append(", units=");
        sb.append(l);
        sb.append(", nanos=");
        sb.append(num);
        sb.append("}");
        return sb.toString();
    }
}
