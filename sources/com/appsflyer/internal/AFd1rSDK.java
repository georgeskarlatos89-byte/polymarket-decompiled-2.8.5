package com.appsflyer.internal;

import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFd1rSDK {
    public static boolean getRevenue(String str, String str2) {
        str.getClass();
        str2.getClass();
        int AFAdRevenueData = AFj1aSDK.AFAdRevenueData(str);
        int AFAdRevenueData2 = AFj1aSDK.AFAdRevenueData(str2);
        Pair<Integer, Integer> mediationNetwork = AFd1pSDK.getMediationNetwork(str2);
        Pair<Integer, Integer> currencyIso4217Code = AFd1pSDK.getCurrencyIso4217Code(str2);
        if (AFAdRevenueData2 != -1 && mediationNetwork == null) {
            if (AFAdRevenueData2 == AFAdRevenueData) {
                return true;
            }
            return false;
        }
        if (currencyIso4217Code != null) {
            if (currencyIso4217Code.getFirst().intValue() <= AFAdRevenueData && AFAdRevenueData <= currencyIso4217Code.getSecond().intValue()) {
                return true;
            }
            return false;
        }
        if (mediationNetwork != null && mediationNetwork.getFirst().intValue() <= AFAdRevenueData && AFAdRevenueData <= mediationNetwork.getSecond().intValue()) {
            return true;
        }
        return false;
    }
}
