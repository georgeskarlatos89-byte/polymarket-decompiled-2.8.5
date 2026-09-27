package com.appsflyer.internal;

import defpackage.g1a;
import defpackage.lnf;
import defpackage.lwg;
import defpackage.ny4;
import defpackage.y0a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFj1eSDK {
    private static final List<Object> getCurrencyIso4217Code(JSONArray jSONArray) {
        IntRange k = lnf.k(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.w(k));
        Iterator it = k.iterator();
        while (((g1a) it).c) {
            Object obj = jSONArray.get(((y0a) it).nextInt());
            obj.getClass();
            arrayList.add(getCurrencyIso4217Code(obj));
        }
        return arrayList;
    }

    public static final Map<String, Object> getMonetizationNetwork(JSONObject jSONObject) {
        jSONObject.getClass();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        ny4 b = lwg.b(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = jSONObject.get((String) next);
            obj.getClass();
            linkedHashMap.put(next, getCurrencyIso4217Code(obj));
        }
        return linkedHashMap;
    }

    private static final Object getCurrencyIso4217Code(Object obj) {
        if (obj instanceof JSONArray) {
            return getCurrencyIso4217Code((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return getMonetizationNetwork((JSONObject) obj);
        }
        if (Intrinsics.areEqual(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }
}
