package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFd1bSDK implements AFe1wSDK<Map<String, String>> {
    @Override // com.appsflyer.internal.AFe1wSDK
    public final /* synthetic */ Map<String, String> getCurrencyIso4217Code(String str) {
        HashMap hashMap = new HashMap();
        if (!str.trim().isEmpty()) {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        }
        return hashMap;
    }
}
