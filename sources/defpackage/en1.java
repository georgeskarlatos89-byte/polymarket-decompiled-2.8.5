package defpackage;

import bo.app.t2;
import bo.app.u2;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class en1 implements yj9 {
    public static final t2 b = new t2();
    public final JSONObject a;

    public en1(JSONObject jSONObject) {
        this.a = new JSONObject();
        c(jSONObject, true);
        this.a = jSONObject;
    }

    public static JSONObject c(JSONObject jSONObject, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            next.getClass();
            arrayList.add(next);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            if (z && !b.a(str)) {
                jSONObject.remove(str);
            } else {
                Object obj2 = jSONObject.get(str);
                if (obj2 instanceof Date) {
                    jSONObject.put(str, zv5.c((Date) obj2, ul1.LONG));
                }
                if (obj2 instanceof JSONArray) {
                    jSONObject.put(str, u2.a((JSONArray) obj2));
                }
                if (obj2 instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    c(jSONObject2, false);
                    jSONObject.put(str, jSONObject2);
                }
            }
        }
        return jSONObject;
    }

    public final void b(Object obj, String str) {
        en1 en1Var;
        JSONException jSONException;
        boolean z;
        JSONObject jSONObject;
        str.getClass();
        if (!b.a(str)) {
            return;
        }
        try {
            z = obj instanceof Long;
            jSONObject = this.a;
        } catch (JSONException e) {
            e = e;
            en1Var = this;
        }
        try {
            if (z) {
                jSONObject.put(f3k.a(str), ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                jSONObject.put(f3k.a(str), ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Double) {
                jSONObject.put(f3k.a(str), ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Boolean) {
                jSONObject.put(f3k.a(str), ((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof Date) {
                jSONObject.put(f3k.a(str), zv5.c((Date) obj, ul1.LONG));
                return;
            }
            if (obj instanceof String) {
                jSONObject.put(f3k.a(str), f3k.a((String) obj));
                return;
            }
            if (obj instanceof JSONArray) {
                jSONObject.put(f3k.a(str), u2.a((JSONArray) obj));
                return;
            }
            if (obj instanceof JSONObject) {
                String a = f3k.a(str);
                JSONObject jSONObject2 = (JSONObject) obj;
                c(jSONObject2, true);
                jSONObject.put(a, jSONObject2);
                return;
            }
            if (obj instanceof Map) {
                String a2 = f3k.a(str);
                JSONObject jSONObject3 = new JSONObject(u2.a((Map) obj));
                c(jSONObject3, true);
                jSONObject.put(a2, jSONObject3);
                return;
            }
            if (obj == null) {
                jSONObject.put(f3k.a(str), JSONObject.NULL);
                return;
            }
            en1Var = this;
            try {
                b69.h(en1Var, pm1.W, null, false, new xl1(str, 22), 6);
            } catch (JSONException e2) {
                e = e2;
                jSONException = e;
                b69.h(en1Var, pm1.E, jSONException, false, new dn1(21), 4);
            }
        } catch (JSONException e3) {
            jSONException = e3;
            en1Var = this;
            b69.h(en1Var, pm1.E, jSONException, false, new dn1(21), 4);
        }
    }

    public final en1 d() {
        try {
            return new en1(new JSONObject(this.a.toString()));
        } catch (Exception e) {
            b69.h(this, pm1.W, e, false, new dn1(22), 4);
            return null;
        }
    }

    @Override // defpackage.yj9
    public final Object forJsonPut() {
        return this.a;
    }

    public en1() {
        this.a = new JSONObject();
    }
}
