package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class psl {
    public static final w97 a = new w97(3);
    public static eq9 b;

    public static ArrayList a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        IntRange k = lnf.k(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.w(k));
        Iterator it = k.iterator();
        while (((g1a) it).c) {
            arrayList.add(jSONArray.get(((y0a) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof JSONArray) {
                next = a((JSONArray) next);
            } else if (next instanceof JSONObject) {
                next = b((JSONObject) next);
            } else if (Intrinsics.areEqual(next, "null")) {
                next = null;
            }
            if (next != null) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static Map b(JSONObject jSONObject) {
        Map map;
        if (jSONObject == null) {
            return null;
        }
        JSONArray names = jSONObject.names();
        if (names == null) {
            names = new JSONArray();
        }
        IntRange k = lnf.k(0, names.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.w(k));
        Iterator it = k.iterator();
        while (((g1a) it).c) {
            ace.v((y0a) it, names, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            Object opt = jSONObject.opt(str);
            if (opt != null && !Intrinsics.areEqual(opt, "null")) {
                if (opt instanceof JSONObject) {
                    opt = b((JSONObject) opt);
                } else if (opt instanceof JSONArray) {
                    opt = a((JSONArray) opt);
                }
                map = ace.q(opt, str);
            } else {
                map = null;
            }
            if (map != null) {
                arrayList2.add(map);
            }
        }
        Map map2 = zc7.a;
        map2.getClass();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            map2 = d1c.j(map2, (Map) it3.next());
        }
        return map2;
    }

    public static JSONArray c(List list) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof Map) {
                obj = d((Map) obj);
            } else if (obj instanceof List) {
                obj = c((List) obj);
            } else if (!(obj instanceof Number) && !(obj instanceof Boolean)) {
                obj = String.valueOf(obj);
            }
            jSONArray.put(obj);
        }
        return jSONArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject d(Map map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj != null) {
                try {
                    if (obj instanceof Map) {
                        jSONObject.put(str, d((Map) obj));
                    } else if (obj instanceof List) {
                        jSONObject.put(str, c((List) obj));
                    } else {
                        if (!(obj instanceof Number) && !(obj instanceof Boolean)) {
                            jSONObject.put(str, obj.toString());
                        }
                        jSONObject.put(str, obj);
                    }
                } catch (ClassCastException | JSONException unused) {
                }
            }
            while (r1.hasNext()) {
            }
        }
        return jSONObject;
    }

    public static /* synthetic */ String e(String str) {
        if (str != null && !Intrinsics.areEqual("null", str) && str.length() != 0) {
            return str;
        }
        return null;
    }

    public static final String f(JSONObject jSONObject) {
        jSONObject.getClass();
        String e = e(jSONObject.optString("currency"));
        if (e != null && e.length() == 3) {
            return e;
        }
        return null;
    }

    public static final String g(JSONObject jSONObject, String str) {
        String str2;
        if (jSONObject != null) {
            str2 = jSONObject.optString(str);
        } else {
            str2 = null;
        }
        return e(str2);
    }
}
