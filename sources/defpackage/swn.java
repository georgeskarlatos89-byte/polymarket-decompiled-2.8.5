package defpackage;

import android.database.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class swn {
    public static xcn a;

    public static final void a(String str, fcg fcgVar) {
        fcgVar.getClass();
        lcg m1 = fcgVar.m1(str);
        try {
            m1.j1();
            dgn.a(m1, null);
        } finally {
        }
    }

    public static lr6 b(JSONObject jSONObject) {
        String optString = jSONObject.optString("event_name", "");
        optString.getClass();
        xzb xzbVar = null;
        if (!StringsKt.T(optString)) {
            double optDouble = jSONObject.optDouble("time", Double.NaN);
            if (!Double.isNaN(optDouble)) {
                JSONObject optJSONObject = jSONObject.optJSONObject("event_properties");
                if (optJSONObject != null) {
                    xzb xzbVar2 = new xzb();
                    Iterator<String> keys = optJSONObject.keys();
                    keys.getClass();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        xzbVar2.put(next, c(optJSONObject.opt(next)));
                    }
                    xzbVar = xzbVar2.b();
                }
                return new lr6(optString, optDouble, xzbVar);
            }
        }
        return null;
    }

    public static Object c(Object obj) {
        if (Intrinsics.areEqual(obj, JSONObject.NULL)) {
            return null;
        }
        if (obj instanceof JSONObject) {
            xzb xzbVar = new xzb();
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            keys.getClass();
            while (keys.hasNext()) {
                String next = keys.next();
                xzbVar.put(next, c(jSONObject.get(next)));
            }
            return xzbVar.b();
        }
        if (obj instanceof JSONArray) {
            rib b = eb4.b();
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                b.add(c(jSONArray.get(i)));
            }
            return eb4.a(b);
        }
        return obj;
    }

    public static final void d(int i, String str) {
        throw new SQLException(ace.f(i, "Error code: ") + ", message: ".concat(str));
    }

    public static Object e(Object obj) {
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key instanceof String) {
                    jSONObject.put((String) key, e(value));
                }
            }
            return jSONObject;
        }
        if (obj instanceof List) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(e(it.next()));
            }
            return jSONArray;
        }
        return obj;
    }

    public static synchronized awn f(String str) {
        awn awnVar;
        synchronized (swn.class) {
            if (str != null) {
                wun wunVar = new wun(str);
                synchronized (swn.class) {
                    try {
                        xcn xcnVar = a;
                        if (xcnVar == null) {
                            xcnVar = new xcn(2);
                            a = xcnVar;
                        }
                        awnVar = (awn) xcnVar.get(wunVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return awnVar;
            }
            throw new NullPointerException("Null libraryName");
        }
        return awnVar;
    }
}
