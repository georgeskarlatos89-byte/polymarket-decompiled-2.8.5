package com.appsflyer.internal;

import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class AFa1nSDK extends HashMap<Integer, String> {
    private static AFa1nSDK AFAdRevenueData;
    private final Object getMonetizationNetwork = new Object();

    private AFa1nSDK() {
    }

    public static synchronized AFa1nSDK afErrorLog() {
        AFa1nSDK aFa1nSDK;
        synchronized (AFa1nSDK.class) {
            aFa1nSDK = AFAdRevenueData;
            if (aFa1nSDK == null) {
                aFa1nSDK = new AFa1nSDK();
                AFAdRevenueData = aFa1nSDK;
            }
        }
        return aFa1nSDK;
    }

    public String put(Integer num, String str) {
        String str2;
        synchronized (this.getMonetizationNetwork) {
            str2 = (String) super.put((AFa1nSDK) num, (Integer) str);
        }
        return str2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String remove(Object obj) {
        String str;
        synchronized (this.getMonetizationNetwork) {
            str = (String) super.remove(obj);
        }
        return str;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((Integer) obj, (String) obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public boolean remove(Object obj, Object obj2) {
        boolean remove;
        synchronized (this.getMonetizationNetwork) {
            remove = super.remove(obj, obj2);
        }
        return remove;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        return remove(obj);
    }
}
