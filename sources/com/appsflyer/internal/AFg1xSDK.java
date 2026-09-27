package com.appsflyer.internal;

import defpackage.woa;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFg1xSDK {
    public final String AFAdRevenueData;
    public final boolean getMediationNetwork;
    public final long getMonetizationNetwork;

    public AFg1xSDK(String str, long j, boolean z) {
        str.getClass();
        this.AFAdRevenueData = str;
        this.getMonetizationNetwork = j;
        this.getMediationNetwork = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1xSDK)) {
            return false;
        }
        AFg1xSDK aFg1xSDK = (AFg1xSDK) obj;
        if (Intrinsics.areEqual(this.AFAdRevenueData, aFg1xSDK.AFAdRevenueData) && this.getMonetizationNetwork == aFg1xSDK.getMonetizationNetwork && this.getMediationNetwork == aFg1xSDK.getMediationNetwork) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int d = woa.d(this.AFAdRevenueData.hashCode() * 31, 31, this.getMonetizationNetwork);
        boolean z = this.getMediationNetwork;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return d + i;
    }

    public final String toString() {
        return "AFUninstallToken(token=" + this.AFAdRevenueData + ", receivedTime=" + this.getMonetizationNetwork + ", isQueued=" + this.getMediationNetwork + ")";
    }
}
