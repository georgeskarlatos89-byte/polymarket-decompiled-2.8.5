package defpackage;

import io.radar.sdk.RadarTrackingOptions;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mr6 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final List d;

    public mr6(Map map, Map map2, LinkedHashMap linkedHashMap, List list) {
        this.a = map;
        this.b = map2;
        this.c = linkedHashMap;
        this.d = list;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        Map map = this.a;
        if (map != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
            }
            jSONObject.put("tags", jSONObject2);
        }
        Map map2 = this.b;
        if (map2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry entry2 : map2.entrySet()) {
                jSONObject3.put((String) entry2.getKey(), ((Number) entry2.getValue()).longValue());
            }
            jSONObject.put("counters", jSONObject3);
        }
        Map map3 = this.c;
        if (map3 != null) {
            JSONObject jSONObject4 = new JSONObject();
            for (Map.Entry entry3 : map3.entrySet()) {
                String str = (String) entry3.getKey();
                d89 d89Var = (d89) entry3.getValue();
                d89Var.getClass();
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("count", d89Var.a);
                jSONObject5.put("min", d89Var.b);
                jSONObject5.put("max", d89Var.c);
                jSONObject5.put("avg", d89Var.d);
                jSONObject4.put(str, jSONObject5);
            }
            jSONObject.put("histogram", jSONObject4);
        }
        List list = this.d;
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((lr6) it.next()).a());
            }
            jSONObject.put(RadarTrackingOptions.RadarTrackingOptionsSync.EVENTS_STR, jSONArray);
        }
        String jSONObject6 = jSONObject.toString();
        jSONObject6.getClass();
        return jSONObject6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr6)) {
            return false;
        }
        mr6 mr6Var = (mr6) obj;
        if (Intrinsics.areEqual(this.a, mr6Var.a) && Intrinsics.areEqual(this.b, mr6Var.b) && Intrinsics.areEqual(this.c, mr6Var.c) && Intrinsics.areEqual(this.d, mr6Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        Map map = this.a;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i2 = hashCode * 31;
        Map map2 = this.b;
        if (map2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Map map3 = this.c;
        if (map3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = map3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        List list = this.d;
        if (list != null) {
            i = list.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiagnosticsPayload(tags=");
        sb.append(this.a);
        sb.append(", counters=");
        sb.append(this.b);
        sb.append(", histograms=");
        sb.append(this.c);
        sb.append(", events=");
        return sv6.r(sb, this.d, ')');
    }
}
