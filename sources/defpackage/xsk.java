package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import io.ably.lib.util.AgentHeaderCreator;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class xsk extends nwk {
    public final xvk a;
    public final HashMap b = new HashMap();
    public final Handler c;
    public final z3d d;
    public final JSONObject e;

    public xsk(xvk xvkVar, z3d z3dVar, Handler handler, JSONObject jSONObject) {
        this.a = xvkVar;
        this.d = z3dVar;
        this.c = handler;
        z3dVar.getClass();
        this.e = jSONObject;
    }

    public final void b(int i, String str) {
        wsk.a(0, xsk.class, "MagesGetRequest for " + this.a.toString() + " returned status code " + i + ", and responseString: " + str);
    }

    public final void c(String str) {
        int i = jsk.a[this.a.ordinal()];
        z3d z3dVar = this.d;
        if (i != 1) {
            if (i == 2) {
                JSONObject jSONObject = new JSONObject(str);
                huk.b((Context) z3dVar.d, jSONObject.toString(), "REMOTE_CONFIG");
                cxk.i(jSONObject);
                if (jSONObject.optJSONArray(pvk.NOT_COLLECTIBLE_LIST.toString()) != null) {
                    cxk.d = true;
                    return;
                }
                return;
            }
            return;
        }
        huk.b((Context) z3dVar.d, str, "RAMP_CONFIG");
    }

    public final String d() {
        xvk xvkVar = xvk.PRODUCTION_BEACON_URL;
        xvk xvkVar2 = this.a;
        if (xvkVar2 == xvkVar) {
            String str = null;
            JSONObject jSONObject = this.e;
            if (jSONObject == null) {
                return null;
            }
            if (jSONObject != null) {
                str = xvkVar.toString() + "?p=" + jSONObject.optString("pairing_id") + "&i=" + jSONObject.optString(tvk.IP_ADDRS.toString()) + "&t=" + String.valueOf(System.currentTimeMillis() / 1000) + "&a=" + this.d.a;
            }
            if (str != null && str.length() > 0) {
                return str;
            }
        }
        return xvkVar2.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject;
        Handler handler = this.c;
        if (handler != null) {
            xvk xvkVar = this.a;
            xvk xvkVar2 = xvk.PRODUCTION_BEACON_URL;
            HashMap hashMap = this.b;
            if (xvkVar == xvkVar2 && (jSONObject = this.e) != null) {
                hashMap.put("User-Agent", jSONObject.optString(pvk.APP_ID.toString()) + AgentHeaderCreator.AGENT_DIVIDER + jSONObject.optString(pvk.APP_VERSION.toString()) + AgentHeaderCreator.AGENT_DIVIDER + jSONObject.optString(pvk.APP_GUID.toString()) + "/Android");
                hashMap.put("Accept-Language", "en-us");
            }
            try {
                byb o = vh5.o(vvk.GET);
                String d = d();
                if (d != null) {
                    o.q(Uri.parse(d));
                    if (!hashMap.isEmpty()) {
                        o.n(hashMap);
                    }
                    if (handler != null) {
                        handler.sendMessage(Message.obtain(handler, wvk.GET_REQUEST_STARTED.b(), "Magnes Request Started for URL: ".concat(d)));
                    }
                    int i = o.i(null);
                    String str = new String(o.z(), "UTF-8");
                    b(i, str);
                    if (i == wvk.HTTP_STATUS_200.b()) {
                        c(str);
                        if (handler != null) {
                            handler.sendMessage(Message.obtain(handler, wvk.GET_REQUEST_SUCCEEDED.b(), str));
                            return;
                        }
                        return;
                    }
                    if (handler != null) {
                        handler.sendMessage(Message.obtain(handler, wvk.GET_REQUEST_ERROR.b(), i + " : " + str));
                    }
                }
            } catch (Exception e) {
                if (handler != null) {
                    handler.sendMessage(Message.obtain(handler, wvk.GET_REQUEST_ERROR.b(), e));
                }
            }
        }
    }
}
