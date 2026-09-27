package com.appsflyer.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class AFd1dSDK {
    public final long AFAdRevenueData;

    public AFd1dSDK(long j) {
        this.AFAdRevenueData = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.AFAdRevenueData == ((AFd1dSDK) obj).AFAdRevenueData) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.AFAdRevenueData;
        return (int) (j ^ (j >>> 32));
    }
}
