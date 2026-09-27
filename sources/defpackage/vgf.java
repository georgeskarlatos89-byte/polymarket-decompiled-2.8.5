package defpackage;

import android.util.Base64;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class vgf {
    public static byte[] a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = wgf.a;
        String optString = jSONObject.optString("challenge", "");
        optString.getClass();
        if (optString.length() != 0) {
            byte[] decode = Base64.decode(optString, 11);
            decode.getClass();
            return decode;
        }
        throw new JSONException("Challenge not found in request or is unexpectedly empty");
    }
}
