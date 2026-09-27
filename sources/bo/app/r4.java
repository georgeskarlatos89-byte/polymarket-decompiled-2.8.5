package bo.app;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.d2i;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class r4 implements oa {
    public final String a;

    public r4(JSONObject jSONObject) {
        this.a = jSONObject.getJSONObject(ApiConstant.KEY_DATA).getString("event_name");
    }

    @Override // bo.app.aa
    public final boolean a(pa paVar) {
        if (paVar instanceof s4) {
            s4 s4Var = (s4) paVar;
            if (!d2i.d(s4Var.f) && s4Var.f.equals(this.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.yj9
    public final Object forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "custom_event");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_name", this.a);
            jSONObject.put(ApiConstant.KEY_DATA, jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
