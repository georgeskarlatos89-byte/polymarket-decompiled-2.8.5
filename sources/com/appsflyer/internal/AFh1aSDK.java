package com.appsflyer.internal;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.r5g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFh1aSDK {
    public AFi1zSDK AFAdRevenueData;
    public final AFh1bSDK getCurrencyIso4217Code;
    public final AFh1dSDK getMonetizationNetwork;

    public AFh1aSDK(JSONObject jSONObject) {
        jSONObject.getClass();
        this.AFAdRevenueData = getCurrencyIso4217Code(jSONObject);
        this.getCurrencyIso4217Code = getMonetizationNetwork(jSONObject);
        this.getMonetizationNetwork = getMediationNetwork(jSONObject);
    }

    private static AFi1zSDK getCurrencyIso4217Code(JSONObject jSONObject) {
        Object m882constructorimpl;
        AFi1zSDK aFi1zSDK;
        List emptyList;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "r_debugger");
            if (mediationNetwork != null) {
                long j = mediationNetwork.getLong("ttl");
                int i = mediationNetwork.getInt("counter");
                String optString = mediationNetwork.optString("app_ver", "");
                String optString2 = mediationNetwork.optString("sdk_ver", "");
                float optDouble = (float) mediationNetwork.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = mediationNetwork.optJSONArray("tags");
                if (optJSONArray != null) {
                    emptyList = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = optJSONArray.getString(i2);
                        string.getClass();
                        emptyList.add(string);
                    }
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                List list = emptyList;
                optString.getClass();
                optString2.getClass();
                aFi1zSDK = new AFi1zSDK(j, optDouble, list, i, optString, optString2);
            } else {
                aFi1zSDK = null;
            }
            m882constructorimpl = Result.m882constructorimpl(aFi1zSDK);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m882constructorimpl instanceof r5g)) {
            obj = m882constructorimpl;
        }
        return (AFi1zSDK) obj;
    }

    private static AFh1dSDK getMediationNetwork(JSONObject jSONObject) {
        Object m882constructorimpl;
        AFh1dSDK aFh1dSDK;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "meta_data");
            if (mediationNetwork != null) {
                aFh1dSDK = new AFh1dSDK(mediationNetwork.optDouble("send_rate", 1.0d));
            } else {
                aFh1dSDK = null;
            }
            m882constructorimpl = Result.m882constructorimpl(aFh1dSDK);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m882constructorimpl instanceof r5g)) {
            obj = m882constructorimpl;
        }
        return (AFh1dSDK) obj;
    }

    private static AFh1bSDK getMonetizationNetwork(JSONObject jSONObject) {
        Object m882constructorimpl;
        AFh1bSDK aFh1bSDK;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "exc_mngr");
            if (mediationNetwork != null) {
                aFh1bSDK = new AFh1bSDK(mediationNetwork.getString("sdk_ver"), mediationNetwork.optInt("min", -1), mediationNetwork.optInt("expire", -1), mediationNetwork.optLong("ttl", -1L));
            } else {
                aFh1bSDK = null;
            }
            m882constructorimpl = Result.m882constructorimpl(aFh1bSDK);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m882constructorimpl instanceof r5g)) {
            obj = m882constructorimpl;
        }
        return (AFh1bSDK) obj;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(AFh1aSDK.class, cls)) {
            return false;
        }
        obj.getClass();
        AFh1aSDK aFh1aSDK = (AFh1aSDK) obj;
        if (Intrinsics.areEqual(this.getCurrencyIso4217Code, aFh1aSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.getMonetizationNetwork, aFh1aSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.AFAdRevenueData, aFh1aSDK.AFAdRevenueData)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        AFh1bSDK aFh1bSDK = this.getCurrencyIso4217Code;
        int i3 = 0;
        if (aFh1bSDK != null) {
            i = aFh1bSDK.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        AFh1dSDK aFh1dSDK = this.getMonetizationNetwork;
        if (aFh1dSDK != null) {
            i2 = aFh1dSDK.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        AFi1zSDK aFi1zSDK = this.AFAdRevenueData;
        if (aFi1zSDK != null) {
            i3 = aFi1zSDK.hashCode();
        }
        return i5 + i3;
    }

    private static JSONObject getMediationNetwork(JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject(ApiConstant.KEY_DATA)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }
}
