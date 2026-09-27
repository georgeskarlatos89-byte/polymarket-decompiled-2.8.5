package com.appsflyer.internal;

import defpackage.hdi;
import defpackage.ix2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFc1uSDK {
    final String getCurrencyIso4217Code;
    final int getMediationNetwork;
    final List<AFe1lSDK> getMonetizationNetwork;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1uSDK(String str, List<? extends AFe1lSDK> list, int i) {
        str.getClass();
        list.getClass();
        this.getCurrencyIso4217Code = str;
        this.getMonetizationNetwork = list;
        this.getMediationNetwork = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1uSDK)) {
            return false;
        }
        AFc1uSDK aFc1uSDK = (AFc1uSDK) obj;
        if (Intrinsics.areEqual(this.getCurrencyIso4217Code, aFc1uSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.getMonetizationNetwork, aFc1uSDK.getMonetizationNetwork) && this.getMediationNetwork == aFc1uSDK.getMediationNetwork) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.getMediationNetwork) + hdi.f(this.getCurrencyIso4217Code.hashCode() * 31, 31, this.getMonetizationNetwork);
    }

    public final String toString() {
        String str = this.getCurrencyIso4217Code;
        List<AFe1lSDK> list = this.getMonetizationNetwork;
        int i = this.getMediationNetwork;
        StringBuilder sb = new StringBuilder("StorageConfigTypeEntry(cacheDirName=");
        sb.append(str);
        sb.append(", eventTypes=");
        sb.append(list);
        sb.append(", maxCapacity=");
        return ix2.i(i, ")", sb);
    }
}
