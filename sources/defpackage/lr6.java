package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lr6 {
    public final String a;
    public final double b;
    public final Map c;

    public lr6(String str, double d, Map map) {
        str.getClass();
        this.a = str;
        this.b = d;
        this.c = map;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_name", this.a);
        jSONObject.put("time", this.b);
        Map map = this.c;
        if (map != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject2.put((String) entry.getKey(), swn.e(entry.getValue()));
            }
            jSONObject.put("event_properties", jSONObject2);
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr6)) {
            return false;
        }
        lr6 lr6Var = (lr6) obj;
        if (Intrinsics.areEqual(this.a, lr6Var.a) && Double.compare(this.b, lr6Var.b) == 0 && Intrinsics.areEqual(this.c, lr6Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c = hdi.c(this.a.hashCode() * 31, 31, this.b);
        Map map = this.c;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return c + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiagnosticsEvent(eventName=");
        sb.append(this.a);
        sb.append(", time=");
        sb.append(this.b);
        sb.append(", eventProperties=");
        return hdi.s(sb, this.c, ')');
    }
}
