package com.google.android.libraries.places.api.model;

import defpackage.k84;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzcc extends PriceRange {
    private final Money zza;
    private final Money zzb;

    public zzcc(Money money, Money money2) {
        this.zza = money;
        this.zzb = money2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PriceRange) {
            PriceRange priceRange = (PriceRange) obj;
            Money money = this.zza;
            if (money != null ? money.equals(priceRange.getStartPrice()) : priceRange.getStartPrice() == null) {
                Money money2 = this.zzb;
                if (money2 != null ? money2.equals(priceRange.getEndPrice()) : priceRange.getEndPrice() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.PriceRange
    public final Money getEndPrice() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.PriceRange
    public final Money getStartPrice() {
        return this.zza;
    }

    public final int hashCode() {
        int hashCode;
        Money money = this.zza;
        int i = 0;
        if (money == null) {
            hashCode = 0;
        } else {
            hashCode = money.hashCode();
        }
        Money money2 = this.zzb;
        if (money2 != null) {
            i = money2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        Money money = this.zzb;
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(money);
        StringBuilder sb = new StringBuilder(valueOf.length() + 33 + valueOf2.length() + 1);
        k84.q(sb, "PriceRange{startPrice=", valueOf, ", endPrice=", valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
