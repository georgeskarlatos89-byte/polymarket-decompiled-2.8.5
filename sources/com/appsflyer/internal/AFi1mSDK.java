package com.appsflyer.internal;

import defpackage.ace;
import defpackage.ix2;
import defpackage.woa;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFi1mSDK {
    public final String AFAdRevenueData;
    public final long getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public final long getMonetizationNetwork;

    public AFi1mSDK(long j, long j2, String str, String str2) {
        this.getMonetizationNetwork = j;
        this.getCurrencyIso4217Code = j2;
        this.AFAdRevenueData = str;
        this.getMediationNetwork = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1mSDK)) {
            return false;
        }
        AFi1mSDK aFi1mSDK = (AFi1mSDK) obj;
        if (this.getMonetizationNetwork == aFi1mSDK.getMonetizationNetwork && this.getCurrencyIso4217Code == aFi1mSDK.getCurrencyIso4217Code && Intrinsics.areEqual(this.AFAdRevenueData, aFi1mSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getMediationNetwork, aFi1mSDK.getMediationNetwork)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int d = woa.d(Long.hashCode(this.getMonetizationNetwork) * 31, 31, this.getCurrencyIso4217Code);
        String str = this.AFAdRevenueData;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (d + hashCode) * 31;
        String str2 = this.getMediationNetwork;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        long j = this.getMonetizationNetwork;
        long j2 = this.getCurrencyIso4217Code;
        String str = this.AFAdRevenueData;
        String str2 = this.getMediationNetwork;
        StringBuilder p = ace.p(j, "PlayIntegrityApiData(piaTimestamp=", ", ttrMillis=");
        p.append(j2);
        p.append(", piaToken=");
        p.append(str);
        return ix2.p(p, ", errorCode=", str2, ")");
    }
}
