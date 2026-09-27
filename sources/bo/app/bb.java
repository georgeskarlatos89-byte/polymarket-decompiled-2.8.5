package bo.app;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.d2i;
import io.radar.sdk.RadarTrackingOptions;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bb implements oa {
    public final String a;
    public final HashSet b = new HashSet();

    public bb(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(ApiConstant.KEY_DATA);
        this.a = jSONObject2.getString(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID);
        JSONArray optJSONArray = jSONObject2.optJSONArray("buttons");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.b.add(optJSONArray.getString(i));
            }
        }
    }

    @Override // bo.app.aa
    public final boolean a(pa paVar) {
        if (paVar instanceof cb) {
            cb cbVar = (cb) paVar;
            if (!d2i.d(cbVar.e) && cbVar.e.equals(this.a)) {
                int size = this.b.size();
                String str = cbVar.f;
                if (size > 0) {
                    if (d2i.d(str) || !this.b.contains(cbVar.f)) {
                        return false;
                    }
                    return true;
                }
                return d2i.d(str);
            }
        }
        return false;
    }

    @Override // defpackage.yj9
    public final Object forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "iam_click");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, this.a);
            if (this.b.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject2.put("buttons", jSONArray);
            }
            jSONObject.put(ApiConstant.KEY_DATA, jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
