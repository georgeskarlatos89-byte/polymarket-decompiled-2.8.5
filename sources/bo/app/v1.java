package bo.app;

import bo.app.v1;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.b69;
import defpackage.dmk;
import defpackage.el1;
import defpackage.en1;
import defpackage.m0l;
import defpackage.n1l;
import defpackage.o1l;
import defpackage.pk1;
import defpackage.pm1;
import defpackage.pn1;
import defpackage.qga;
import defpackage.qh0;
import defpackage.qn1;
import defpackage.quk;
import defpackage.r2i;
import defpackage.u0l;
import defpackage.v0l;
import defpackage.vl1;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class v1 {
    public static final t9 a(en1 en1Var, String str, String str2, BigDecimal bigDecimal, int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pid", str);
        jSONObject.put("c", str2);
        bigDecimal.getClass();
        BigDecimal scale = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        scale.getClass();
        jSONObject.put("p", scale.doubleValue());
        jSONObject.put("q", i);
        if (en1Var != null) {
            JSONObject jSONObject2 = en1Var.a;
            if (jSONObject2.length() > 0) {
                jSONObject.put("pr", jSONObject2);
            }
        }
        return new w1(r8.f, jSONObject, ConstantsKt.UNSET, 12);
    }

    public static final t9 b(Throwable th, ag agVar, boolean z) {
        String str;
        StringBuilder sb = new StringBuilder("\n                original_sdk_version: 43.1.1\n                exception_class: ");
        sb.append(th.getClass().getName());
        sb.append("\n                available_cpus: ");
        sb.append(Runtime.getRuntime().availableProcessors());
        sb.append("\n                ");
        if (agVar != null) {
            str = "session_id: " + agVar;
        } else {
            str = null;
        }
        sb.append(str);
        sb.append("\n                ");
        w1.g.getClass();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        sb.append(r2i.H(5000, stringWriter2));
        sb.append("\n                ");
        JSONObject put = new JSONObject().put("e", kotlin.text.c.c(sb.toString()));
        if (!z) {
            put.put("nop", true);
        }
        r8 r8Var = r8.j;
        put.getClass();
        return new w1(r8Var, put, ConstantsKt.UNSET, 12);
    }

    public static final t9 f(String str, String str2) {
        ag agVar;
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString(Keys.KEY_NAME);
        q8 q8Var = r8.b;
        string.getClass();
        q8Var.getClass();
        Object obj = r8.c.get(string);
        if (obj == null) {
            obj = r8.J;
        }
        r8 r8Var = (r8) obj;
        JSONObject jSONObject2 = jSONObject.getJSONObject(ApiConstant.KEY_DATA);
        double d = jSONObject.getDouble("time");
        String d2 = qga.d(jSONObject, "user_id");
        String d3 = qga.d(jSONObject, Keys.KEY_SESSION_ID);
        jSONObject2.getClass();
        str2.getClass();
        w1 w1Var = new w1(r8Var, jSONObject2, d, str2);
        w1Var.e.setValue(w1Var, w1.h[0], d2);
        if (d3 != null) {
            UUID fromString = UUID.fromString(d3);
            fromString.getClass();
            agVar = new ag(fromString);
        } else {
            agVar = null;
        }
        w1Var.a(agVar);
        return w1Var;
    }

    public static final t9 h(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new w1(r8.n, jSONObject, ConstantsKt.UNSET, 12);
    }

    public static final t9 j(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new w1(r8.o, jSONObject, ConstantsKt.UNSET, 12);
    }

    public static final t9 l(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new w1(r8.m, jSONObject, ConstantsKt.UNSET, 12);
    }

    public static final t9 n(String str, String str2) {
        return new w1(r8.t, w1.g.a(str, (String) null, str2), ConstantsKt.UNSET, 12);
    }

    public static final t9 p(String str, String str2) {
        JSONObject put = new JSONObject().put("cid", str).put("a", str2);
        r8 r8Var = r8.g;
        put.getClass();
        return new w1(r8Var, put, ConstantsKt.UNSET, 12);
    }

    public static final t9 r(String str, String str2) {
        JSONObject put = new JSONObject().put("key", str).put("value", str2);
        r8 r8Var = r8.r;
        put.getClass();
        return new w1(r8Var, put, ConstantsKt.UNSET, 12);
    }

    public static final t9 t(String str, String str2) {
        JSONObject put = new JSONObject().put("a", str).put("l", str2);
        r8 r8Var = r8.x;
        put.getClass();
        return new w1(r8Var, put, ConstantsKt.UNSET, 12);
    }

    public final t9 e(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new qh0(str, str2, 29));
    }

    public final t9 g(String str) {
        return a(new u0l(str, 8));
    }

    public final t9 i(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new o1l(str, str2, 2));
    }

    public final t9 k(String str) {
        return a(new u0l(str, 7));
    }

    public final t9 m(String str, String str2) {
        str.getClass();
        return a(new o1l(str, str2, 1));
    }

    public final t9 o(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new o1l(str, str2, 4));
    }

    public final t9 q(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new o1l(str, str2, 5));
    }

    public final t9 s(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new qh0(str, str2, 28));
    }

    public final t9 k(String str, String str2) {
        return a(new o1l(str, str2, 0));
    }

    public final t9 m(String str) {
        str.getClass();
        return a(new u0l(str, 4));
    }

    public final t9 i(String str) {
        str.getClass();
        return a(new u0l(str, 6));
    }

    public final t9 e(String str) {
        return a(new u0l(str, 5));
    }

    public static final t9 n(String str) {
        return new w1(r8.v, w1.g.a(str, (String) null, (String) null), ConstantsKt.UNSET, 12);
    }

    public static final t9 j(String str, String str2) {
        return new w1(r8.w, w1.g.a(str, str2, (String) null), ConstantsKt.UNSET, 12);
    }

    public static final t9 l(String str, String str2) {
        return new w1(r8.u, w1.g.a(str, (String) null, str2), ConstantsKt.UNSET, 12);
    }

    public final t9 a(final String str, final String str2, final BigDecimal bigDecimal, final int i, final en1 en1Var) {
        str.getClass();
        str2.getClass();
        bigDecimal.getClass();
        return a(new Function0() { // from class: m1l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v1.a(en1.this, str, str2, bigDecimal, i);
            }
        });
    }

    public final t9 a(String str, en1 en1Var) {
        str.getClass();
        return a(new el1(str, en1Var, 2));
    }

    public final t9 a(Throwable th, ag agVar, boolean z) {
        th.getClass();
        return a(new pk1(th, agVar, z, 14));
    }

    public final t9 a(String str, int i) {
        str.getClass();
        return a(new vl1(str, i, 2));
    }

    public final t9 a(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new o1l(str, str2, 3));
    }

    public final t9 a(String str, String[] strArr) {
        str.getClass();
        return a(new m0l(6, str, strArr));
    }

    public final t9 a(ag agVar) {
        agVar.getClass();
        return a(new v0l(agVar, 4));
    }

    public final t9 a(long j) {
        return a(new quk(j, 8));
    }

    public final t9 a(String str, double d, double d2) {
        str.getClass();
        return a(new pn1(str, d, d2, 1));
    }

    public final t9 a(String str, JSONObject jSONObject) {
        str.getClass();
        return a(new qn1(str, jSONObject, 1));
    }

    public final t9 a(String str, ng ngVar) {
        str.getClass();
        return a(new m0l(7, str, ngVar));
    }

    public final JSONObject a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        if (str != null && str.length() != 0) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("trigger_ids", jSONArray);
        }
        if (str2 != null && str2.length() != 0) {
            jSONObject.put("bid", str2);
        }
        if (str3 != null) {
            jSONObject.put("message_extras", str3);
            return jSONObject;
        }
        b69.h(this, pm1.V, null, false, new n1l(0), 6);
        return jSONObject;
    }

    public static final String a() {
        return "Message extras are null, not adding to event";
    }

    public final t9 a(Function0 function0) {
        try {
            return (t9) function0.invoke();
        } catch (Exception e) {
            b69.h(this, pm1.E, e, false, new n1l(1), 4);
            return null;
        }
    }

    public static final t9 f(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new w1(r8.l, jSONObject, ConstantsKt.UNSET, 12);
    }

    public static final t9 b(String str, en1 en1Var) {
        JSONObject put = new JSONObject().put("n", str);
        if (en1Var != null) {
            JSONObject jSONObject = en1Var.a;
            if (jSONObject.length() > 0) {
                put.put("p", jSONObject);
            }
        }
        r8 r8Var = r8.e;
        put.getClass();
        return new w1(r8Var, put, ConstantsKt.UNSET, 12);
    }

    public static final t9 b(String str, int i) {
        JSONObject put = new JSONObject().put("key", str).put("value", i);
        r8 r8Var = r8.p;
        put.getClass();
        return new w1(r8Var, put, ConstantsKt.UNSET, 12);
    }

    public static final t9 b(String str, String str2) {
        JSONObject put = new JSONObject().put("key", str).put("value", str2);
        r8 r8Var = r8.q;
        put.getClass();
        return new w1(r8Var, put, ConstantsKt.UNSET, 12);
    }

    public static final t9 b(String str, String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", str);
        if (strArr == null) {
            jSONObject.put("value", JSONObject.NULL);
        } else {
            String str2 = qga.a;
            JSONArray jSONArray = new JSONArray();
            for (String str3 : strArr) {
                jSONArray.put(str3);
            }
            jSONObject.put("value", jSONArray);
        }
        return new w1(r8.s, jSONObject, ConstantsKt.UNSET, 12);
    }

    public static final t9 b(ag agVar) {
        w1 w1Var = new w1(r8.y, (JSONObject) null, ConstantsKt.UNSET, 14);
        w1Var.a(agVar);
        return w1Var;
    }

    public static final t9 b(long j) {
        JSONObject put = new JSONObject().put(com.socure.idplus.device.internal.mediaDevice.manager.d.d, j);
        r8 r8Var = r8.z;
        put.getClass();
        return new w1(r8Var, put, ConstantsKt.UNSET, 12);
    }

    public static final t9 b(String str, double d, double d2) {
        JSONObject put = new JSONObject().put("key", str).put("latitude", d).put("longitude", d2);
        r8 r8Var = r8.A;
        put.getClass();
        return new w1(r8Var, put, ConstantsKt.UNSET, 12);
    }

    public static final t9 b(String str, JSONObject jSONObject) {
        JSONObject put = new JSONObject().put("key", str).put("value", jSONObject);
        r8 r8Var = r8.C;
        put.getClass();
        return new w1(r8Var, put, ConstantsKt.UNSET, 12);
    }

    public static final t9 b(String str, ng ngVar) {
        String str2;
        JSONObject put = new JSONObject().put("group_id", str);
        int ordinal = ngVar.ordinal();
        if (ordinal == 0) {
            str2 = "subscribed";
        } else if (ordinal == 1) {
            str2 = "unsubscribed";
        } else {
            dmk.a();
            return null;
        }
        JSONObject put2 = put.put("status", str2);
        r8 r8Var = r8.D;
        put2.getClass();
        return new w1(r8Var, put2, ConstantsKt.UNSET, 12);
    }

    public static final String b() {
        return "Failed to create event";
    }
}
