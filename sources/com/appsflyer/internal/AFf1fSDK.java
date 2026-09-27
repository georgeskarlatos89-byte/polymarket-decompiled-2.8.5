package com.appsflyer.internal;

import defpackage.k84;
import defpackage.m51;
import defpackage.woa;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFf1fSDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;
    final int getMediationNetwork;
    final int getMonetizationNetwork;
    final String getRevenue;

    public AFf1fSDK(int i, int i2, int i3, int i4, String str) {
        str.getClass();
        this.getCurrencyIso4217Code = i;
        this.getMediationNetwork = i2;
        this.getMonetizationNetwork = i3;
        this.AFAdRevenueData = i4;
        this.getRevenue = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1fSDK)) {
            return false;
        }
        AFf1fSDK aFf1fSDK = (AFf1fSDK) obj;
        if (this.getCurrencyIso4217Code == aFf1fSDK.getCurrencyIso4217Code && this.getMediationNetwork == aFf1fSDK.getMediationNetwork && this.getMonetizationNetwork == aFf1fSDK.getMonetizationNetwork && this.AFAdRevenueData == aFf1fSDK.AFAdRevenueData && Intrinsics.areEqual(this.getRevenue, aFf1fSDK.getRevenue)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.getRevenue.hashCode() + woa.b(this.AFAdRevenueData, woa.b(this.getMonetizationNetwork, woa.b(this.getMediationNetwork, Integer.hashCode(this.getCurrencyIso4217Code) * 31, 31), 31), 31);
    }

    public final String toString() {
        int i = this.getCurrencyIso4217Code;
        int i2 = this.getMediationNetwork;
        int i3 = this.getMonetizationNetwork;
        int i4 = this.AFAdRevenueData;
        String str = this.getRevenue;
        StringBuilder n = m51.n(i, "CmpTcfData(policyVersion=", i2, ", gdprApplies=", ", cmpSdkId=");
        k84.i(i3, i4, ", cmpSdkVersion=", ", tcString=", n);
        return woa.r(n, str, ")");
    }
}
