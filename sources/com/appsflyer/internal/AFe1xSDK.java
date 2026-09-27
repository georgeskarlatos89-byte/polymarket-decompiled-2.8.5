package com.appsflyer.internal;

import defpackage.hdi;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFe1xSDK {
    final String getCurrencyIso4217Code;
    final String getMonetizationNetwork;

    public AFe1xSDK(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.getMonetizationNetwork = str;
        this.getCurrencyIso4217Code = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1xSDK)) {
            return false;
        }
        AFe1xSDK aFe1xSDK = (AFe1xSDK) obj;
        if (Intrinsics.areEqual(this.getMonetizationNetwork, aFe1xSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFe1xSDK.getCurrencyIso4217Code)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.getCurrencyIso4217Code.hashCode() + (this.getMonetizationNetwork.hashCode() * 31);
    }

    public final String toString() {
        return hdi.p("HostConfig(prefix=", this.getMonetizationNetwork, ", host=", this.getCurrencyIso4217Code, ")");
    }
}
