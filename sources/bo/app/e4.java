package bo.app;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class e4 {
    public static final d4 d = new d4();
    public final int a;
    public final long b;
    public final Map c;

    public e4(int i, long j, Map map) {
        map.getClass();
        this.a = i;
        this.b = j;
        this.c = map;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : this.c.entrySet()) {
            jSONObject.put((String) entry.getKey(), new JSONObject().put("xxhash64", (String) entry.getValue()));
        }
        JSONObject put = new JSONObject().put("version", this.a).put("generated_at", this.b).put(((wh) this).e, jSONObject);
        put.getClass();
        return put;
    }
}
