package bo.app;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.d2i;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tc implements oa {
    public final String a;

    public tc(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(ApiConstant.KEY_DATA);
        if (optJSONObject != null && !optJSONObject.isNull("product_id")) {
            this.a = optJSONObject.optString("product_id", null);
        }
    }

    @Override // bo.app.aa
    public final boolean a(pa paVar) {
        if (paVar instanceof uc) {
            if (d2i.d(this.a)) {
                return true;
            }
            uc ucVar = (uc) paVar;
            if (!d2i.d(ucVar.f) && ucVar.f.equals(this.a)) {
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
            jSONObject.put("type", "purchase");
            if (this.a != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("product_id", this.a);
                jSONObject.putOpt(ApiConstant.KEY_DATA, jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
