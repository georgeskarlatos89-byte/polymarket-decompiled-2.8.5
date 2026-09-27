package defpackage;

import android.content.Context;
import android.os.Handler;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class qwk extends huk {
    public final JSONObject b;

    public qwk(z3d z3dVar, Handler handler) {
        JSONObject h;
        yvk.CONF_REFRESH_TIME_KEY.getClass();
        Context context = (Context) z3dVar.d;
        try {
            h = huk.a(context, "RAMP_CONFIG");
            if (h == null) {
                new xsk(xvk.RAMP_CONFIG_URL, z3dVar, handler, null).a();
                h = h();
            } else if (huk.c(h, Long.parseLong(d(context, "RAMP_CONFIG")), ivk.RAMP)) {
                wsk.a(0, qwk.class, "Cached config used while fetching.");
                new xsk(xvk.RAMP_CONFIG_URL, z3dVar, handler, null).a();
            }
        } catch (Exception e) {
            wsk.b(qwk.class, e);
            h = h();
        }
        this.b = h;
        try {
            wsk.a(0, qwk.class, h.toString(2));
        } catch (JSONException unused) {
        }
    }

    public static JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(yvk.OPEN.toString(), false);
            jSONObject.put(yvk.RAMP_THRESHOLD.toString(), 0);
            jSONObject.put(yvk.MIN_VERSION.toString(), "4.4.0");
            jSONObject.put(yvk.EXCLUDED.toString(), new JSONArray());
            jSONObject.put(yvk.APP_IDS.toString(), new JSONArray());
            jSONObject.put(yvk.APP_SOURCES.toString(), new JSONArray());
            return jSONObject;
        } catch (Exception e) {
            wsk.a(3, qwk.class, "Failed to create deafult config due to " + e.getLocalizedMessage());
            return jSONObject;
        }
    }

    public final JSONObject h() {
        wsk.a(0, qwk.class, "entering getDefaultConfig");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("s", i());
            jSONObject.put("hw", i());
            jSONObject.put("ts", i());
            jSONObject.put("td", i());
            jSONObject.put(yvk.CONF_REFRESH_TIME_KEY.toString(), 7200);
            return jSONObject;
        } catch (JSONException e) {
            wsk.b(qwk.class, e);
            return jSONObject;
        }
    }
}
