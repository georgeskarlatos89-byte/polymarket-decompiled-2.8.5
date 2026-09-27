package bo.app;

import defpackage.yj9;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jc implements yj9, ga {
    public final JSONObject a;
    public final JSONArray b;

    public jc(JSONObject jSONObject) {
        this.a = jSONObject;
        this.b = new JSONArray().put(jSONObject);
    }

    @Override // defpackage.yj9
    public final Object forJsonPut() {
        JSONArray jSONArray = this.b;
        jSONArray.getClass();
        return jSONArray;
    }

    @Override // bo.app.ga
    public final boolean isEmpty() {
        if (this.a.length() == 0) {
            return true;
        }
        if (this.a.length() == 1 && this.a.has("user_id")) {
            return true;
        }
        return false;
    }
}
