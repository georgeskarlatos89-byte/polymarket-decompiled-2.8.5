package com.appsflyer.internal;

import android.net.TrafficStats;
import defpackage.sv6;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class AFe1uSDK<Result> implements Comparable<AFe1uSDK<?>>, Callable<AFe1rSDK> {
    private static final AtomicInteger component2 = new AtomicInteger();
    public AFe1rSDK AFAdRevenueData;
    private final int areAllFieldsValid;
    private final String component1;
    private Throwable component3;
    private long component4;
    public volatile int getCurrencyIso4217Code;
    public final Set<AFe1lSDK> getMediationNetwork;
    public final AFe1lSDK getMonetizationNetwork;
    public final Set<AFe1lSDK> getRevenue;
    private boolean toString;

    public AFe1uSDK(AFe1lSDK aFe1lSDK, AFe1lSDK[] aFe1lSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.getRevenue = hashSet;
        this.getMediationNetwork = new HashSet();
        int incrementAndGet = component2.incrementAndGet();
        this.areAllFieldsValid = incrementAndGet;
        this.toString = false;
        this.getCurrencyIso4217Code = 0;
        this.getMonetizationNetwork = aFe1lSDK;
        Collections.addAll(hashSet, aFe1lSDKArr);
        if (str != null) {
            this.component1 = str;
        } else {
            this.component1 = String.valueOf(incrementAndGet);
        }
    }

    public abstract boolean AFAdRevenueData();

    @Override // java.util.concurrent.Callable
    public /* synthetic */ AFe1rSDK call() {
        return component4();
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(AFe1uSDK<?> aFe1uSDK) {
        return getMonetizationNetwork(aFe1uSDK);
    }

    public final Throwable component2() {
        return this.component3;
    }

    public final boolean component3() {
        return this.toString;
    }

    public final AFe1rSDK component4() {
        TrafficStats.setThreadStatsTag(82339054);
        this.AFAdRevenueData = null;
        this.component3 = null;
        long currentTimeMillis = System.currentTimeMillis();
        this.getCurrencyIso4217Code++;
        try {
            AFe1rSDK mediationNetwork = getMediationNetwork();
            this.AFAdRevenueData = mediationNetwork;
            return mediationNetwork;
        } finally {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1uSDK aFe1uSDK = (AFe1uSDK) obj;
        if (this.getMonetizationNetwork != aFe1uSDK.getMonetizationNetwork) {
            return false;
        }
        return this.component1.equals(aFe1uSDK.component1);
    }

    public void getCurrencyIso4217Code() {
        this.toString = true;
    }

    public abstract AFe1rSDK getMediationNetwork();

    public final int getMonetizationNetwork(AFe1uSDK<?> aFe1uSDK) {
        int i = this.getMonetizationNetwork.unregisterClient - aFe1uSDK.getMonetizationNetwork.unregisterClient;
        if (i == 0) {
            if (this.component1.equals(aFe1uSDK.component1)) {
                return 0;
            }
            return this.areAllFieldsValid - aFe1uSDK.areAllFieldsValid;
        }
        return i;
    }

    public abstract long getRevenue();

    public final int hashCode() {
        return this.component1.hashCode() + (this.getMonetizationNetwork.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getMonetizationNetwork);
        sb.append("-");
        sb.append(this.component1);
        String obj = sb.toString();
        if (!String.valueOf(this.areAllFieldsValid).equals(this.component1)) {
            StringBuilder t = sv6.t(obj, "-");
            t.append(this.areAllFieldsValid);
            return t.toString();
        }
        return obj;
    }

    public void getMonetizationNetwork(Throwable th) {
    }

    public void getMonetizationNetwork() {
    }
}
