package com.appsflyer.internal;

import defpackage.hdi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFc1sSDK {
    final List<AFc1uSDK> getRevenue;

    public AFc1sSDK(List<AFc1uSDK> list) {
        list.getClass();
        this.getRevenue = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AFc1sSDK) && Intrinsics.areEqual(this.getRevenue, ((AFc1sSDK) obj).getRevenue)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.getRevenue.hashCode();
    }

    public final String toString() {
        return hdi.q("StorageConfig(typeEntries=", ")", this.getRevenue);
    }
}
