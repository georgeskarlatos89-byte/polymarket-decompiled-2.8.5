package bo.app;

import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m4 {
    public final long a;
    public final long b;
    public final boolean c;
    public final JSONArray d;

    public m4(JSONObject jSONObject) {
        this.a = jSONObject.optLong("last_card_updated_at", -1L);
        this.b = jSONObject.optLong("last_full_sync_at", -1L);
        this.c = jSONObject.optBoolean("full_sync", false);
        this.d = jSONObject.optJSONArray("cards");
    }

    public m4(String str) {
        str.getClass();
        this.c = false;
        this.a = -1L;
        this.b = -1L;
        this.d = new JSONArray().put(new JSONObject(str));
    }
}
