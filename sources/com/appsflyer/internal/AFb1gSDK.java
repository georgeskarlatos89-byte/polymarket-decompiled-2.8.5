package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFb1gSDK {
    public final String AFAdRevenueData;
    public final int getCurrencyIso4217Code;

    public AFb1gSDK(int i, String str) {
        str.getClass();
        this.getCurrencyIso4217Code = i;
        this.AFAdRevenueData = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFb1gSDK)) {
            return false;
        }
        AFb1gSDK aFb1gSDK = (AFb1gSDK) obj;
        if (this.getCurrencyIso4217Code == aFb1gSDK.getCurrencyIso4217Code && Intrinsics.areEqual(this.AFAdRevenueData, aFb1gSDK.AFAdRevenueData)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.AFAdRevenueData.hashCode() + (Integer.hashCode(this.getCurrencyIso4217Code) * 31);
    }

    public final String toString() {
        return "AppSetIdModel(scope=" + this.getCurrencyIso4217Code + ", id=" + this.AFAdRevenueData + ")";
    }
}
