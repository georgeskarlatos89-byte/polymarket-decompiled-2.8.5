package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hue {
    public final t85 a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();

    public hue(t85 t85Var) {
        this.a = t85Var;
    }

    public static String a(Object obj, String str) {
        JSONObject jSONObject = new JSONObject();
        if (obj != null) {
            jSONObject.put("callId", obj);
        }
        jSONObject.put("error", str);
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }

    public final void b(String str, Function1 function1, Function1 function12) {
        str.getClass();
        this.b.put(str, new ze9(function12, function1, 1));
    }

    public final void c(String str, Function1 function1, Function2 function2) {
        str.getClass();
        this.c.put(str, new c95(function2, function1, null, 1));
    }
}
