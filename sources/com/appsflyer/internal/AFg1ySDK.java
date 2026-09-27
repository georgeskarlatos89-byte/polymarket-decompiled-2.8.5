package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface AFg1ySDK {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes.dex */
    public static final class AFa1tSDK {
        final String AFAdRevenueData;
        final float getMonetizationNetwork;

        public AFa1tSDK(float f, String str) {
            this.getMonetizationNetwork = f;
            this.AFAdRevenueData = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1tSDK)) {
                return false;
            }
            AFa1tSDK aFa1tSDK = (AFa1tSDK) obj;
            if (Float.compare(this.getMonetizationNetwork, aFa1tSDK.getMonetizationNetwork) == 0 && Intrinsics.areEqual(this.AFAdRevenueData, aFa1tSDK.AFAdRevenueData)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = Float.hashCode(this.getMonetizationNetwork) * 31;
            String str = this.AFAdRevenueData;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final String toString() {
            return "BatteryData(level=" + this.getMonetizationNetwork + ", charging=" + this.AFAdRevenueData + ")";
        }
    }

    AFa1tSDK getMonetizationNetwork(Context context);
}
