package bo.app;

import defpackage.b69;
import defpackage.pm1;
import defpackage.w63;
import defpackage.xzb;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d4 {
    public static final String b(JSONObject jSONObject) {
        return r0.a("Failed to parse ChecksumObject fields from: ", jSONObject);
    }

    public final f4 a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            int i = jSONObject.getInt("version");
            long j = jSONObject.getLong("generated_at");
            JSONObject jSONObject2 = jSONObject.getJSONObject(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID);
            xzb xzbVar = new xzb();
            Iterator<String> keys = jSONObject2.keys();
            keys.getClass();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject2.optJSONObject(next);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("xxhash64");
                    optString.getClass();
                    if (optString.length() <= 0) {
                        optString = null;
                    }
                    if (optString != null) {
                        xzbVar.put(next, optString);
                    }
                }
            }
            return new f4(i, j, xzbVar.b());
        } catch (Exception e) {
            b69.h(this, pm1.W, e, false, new w63(jSONObject, 1), 4);
            return null;
        }
    }
}
