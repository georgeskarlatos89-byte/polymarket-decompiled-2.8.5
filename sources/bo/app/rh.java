package bo.app;

import defpackage.b69;
import defpackage.m0l;
import defpackage.zv5;
import io.radar.sdk.RadarTrackingOptions;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class rh implements sa {
    public final String a;
    public final oe b;
    public final boolean c;
    public nh d;
    public final ArrayList e;

    public rh(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        String string = jSONObject.getString(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID);
        string.getClass();
        this.a = string;
        this.b = new oe(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("trigger_condition");
        if (jSONArray.length() > 0) {
            arrayList.addAll(oh.a(jSONArray));
        }
        this.c = jSONObject.optBoolean("prefetch", true);
    }

    public static final String a(rh rhVar, pa paVar) {
        return "Triggered action " + rhVar.a + " not eligible to be triggered by " + paVar.a() + " event. Current device time outside triggered action time window.";
    }

    public final boolean b(pa paVar) {
        oe oeVar = this.b;
        if (oeVar.a != -1) {
            long f = zv5.f();
            oe oeVar2 = this.b;
            if (f > oeVar2.a) {
                oeVar = oeVar2;
            }
            b69.h(this, null, null, false, new m0l(4, this, paVar), 7);
            return false;
        }
        if (oeVar.b == -1 || zv5.f() < this.b.b) {
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((oa) obj).a(paVar)) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 == -1) {
                return false;
            }
            return true;
        }
        b69.h(this, null, null, false, new m0l(4, this, paVar), 7);
        return false;
    }

    @Override // defpackage.yj9
    public JSONObject forJsonPut() {
        try {
            JSONObject forJsonPut = this.b.forJsonPut();
            if (forJsonPut != null) {
                forJsonPut.put(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, this.a);
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = this.e;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    jSONArray.put(((oa) obj).forJsonPut());
                }
                forJsonPut.put("trigger_condition", jSONArray);
                forJsonPut.put("prefetch", this.c);
                return forJsonPut;
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // defpackage.yj9
    public /* bridge */ /* synthetic */ Object forJsonPut() {
        return forJsonPut();
    }
}
