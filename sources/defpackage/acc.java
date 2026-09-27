package defpackage;

import android.net.Uri;
import bo.app.sb;
import bo.app.tb;
import io.radar.sdk.RadarTrackingOptions;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class acc implements yj9, mj9 {
    public static final String k;
    public JSONObject a;
    public tb b;
    public int c;
    public l54 d;
    public Uri e;
    public String f;
    public boolean g;
    public int h;
    public int i;
    public int j;

    static {
        new sb();
        k = b69.s(acc.class);
    }

    @Override // defpackage.mj9
    public final void b() {
        tb tbVar = this.b;
        if (tbVar == null) {
            b69.o(k, null, null, false, new zob(15), 14);
            return;
        }
        Integer num = tbVar.a;
        if (num != null) {
            this.h = num.intValue();
        }
        Integer num2 = tbVar.b;
        if (num2 != null) {
            this.i = num2.intValue();
        }
        Integer num3 = tbVar.c;
        if (num3 != null) {
            this.j = num3.intValue();
        }
    }

    public final JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, this.c);
            jSONObject.put("click_action", this.d.toString());
            Uri uri = this.e;
            if (uri != null) {
                jSONObject.put("uri", String.valueOf(uri));
            }
            jSONObject.putOpt("text", this.f);
            jSONObject.put("bg_color", this.h);
            jSONObject.put("text_color", this.i);
            jSONObject.put("use_webview", this.g);
            jSONObject.put("border_color", this.j);
            return jSONObject;
        } catch (JSONException unused) {
            return this.a;
        }
    }

    @Override // defpackage.yj9
    public final /* bridge */ /* synthetic */ Object forJsonPut() {
        return c();
    }
}
