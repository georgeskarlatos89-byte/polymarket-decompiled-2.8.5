package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class qga {
    public static final String a = "Braze v43.1.1 .".concat("JsonUtils");

    public static final boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject.length() == jSONObject2.length()) {
            Iterator<String> keys = jSONObject.keys();
            keys.getClass();
            while (keys.hasNext()) {
                String next = keys.next();
                if (jSONObject2.has(next)) {
                    Object opt = jSONObject.opt(next);
                    Object opt2 = jSONObject2.opt(next);
                    if ((opt instanceof JSONObject) && (opt2 instanceof JSONObject)) {
                        if (!a((JSONObject) opt, (JSONObject) opt2)) {
                            return false;
                        }
                    } else if (opt != null && opt2 != null && !Intrinsics.areEqual(opt, opt2)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final Map b(JSONObject jSONObject) {
        if (jSONObject == null) {
            zc7 zc7Var = zc7.a;
            zc7Var.getClass();
            return zc7Var;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        while (keys.hasNext()) {
            String next = keys.next();
            linkedHashMap.put(next, jSONObject.getString(next));
        }
        return linkedHashMap;
    }

    public static final Integer c(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        if (jSONObject.has(str)) {
            try {
                return Integer.valueOf(jSONObject.getInt(str));
            } catch (Throwable th) {
                b69.o(a, pm1.E, th, false, new hv9(23), 8);
            }
        }
        return null;
    }

    public static final String d(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public static final String e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        try {
            String jSONObject2 = jSONObject.toString(2);
            jSONObject2.getClass();
            return jSONObject2;
        } catch (Throwable th) {
            b69.o(a, pm1.E, th, false, new hv9(20), 8);
            return "";
        }
    }

    public static final JSONObject f(JSONObject jSONObject, JSONObject jSONObject2) {
        jSONObject.getClass();
        jSONObject2.getClass();
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject3.put(next, jSONObject.get(next));
            } catch (JSONException e) {
                b69.o(a, pm1.E, e, false, new uz5(next, 28), 8);
            }
        }
        Iterator<String> keys2 = jSONObject2.keys();
        keys2.getClass();
        while (keys2.hasNext()) {
            String next2 = keys2.next();
            try {
                jSONObject3.put(next2, jSONObject2.get(next2));
            } catch (JSONException e2) {
                b69.o(a, pm1.E, e2, false, new uz5(next2, 29), 8);
            }
        }
        return jSONObject3;
    }

    public static final Enum g(JSONObject jSONObject, String str, Class cls, Enum r3) {
        Enum valueOf;
        jSONObject.getClass();
        try {
            String string = jSONObject.getString(str);
            string.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = string.toUpperCase(locale);
            upperCase.getClass();
            valueOf = Enum.valueOf(cls, upperCase);
        } catch (Exception unused) {
        }
        if (valueOf != null) {
            return valueOf;
        }
        return r3;
    }

    public static final Bundle h(String str) {
        Bundle bundle = new Bundle();
        if (str != null && !StringsKt.T(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            } catch (Exception e) {
                b69.o(a, pm1.E, e, false, new hv9(21), 8);
            }
        }
        return bundle;
    }
}
