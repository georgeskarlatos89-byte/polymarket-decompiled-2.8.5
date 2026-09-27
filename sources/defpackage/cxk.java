package defpackage;

import java.util.BitSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class cxk extends huk {
    public static BitSet c = null;
    public static boolean d = false;
    public static JSONArray e;
    public JSONObject b;

    public static boolean h(String str) {
        Integer valueOf;
        wsk.a(0, cxk.class, "entering shouldUseCachedConfiguration");
        String[] split = str.split("\\.");
        String[] split2 = "5.0".split("\\.");
        wsk.a(0, cxk.class, "Comparing Cached version is " + str + " default version is 5.0");
        int i = 0;
        while (i < split.length && i < split2.length && split[i].equals(split2[i])) {
            i++;
        }
        if (i < split.length && i < split2.length) {
            valueOf = Integer.valueOf(Integer.signum(Integer.valueOf(split[i]).compareTo(Integer.valueOf(split2[i]))));
        } else {
            valueOf = Integer.valueOf(Integer.signum(split.length - split2.length));
        }
        if (valueOf.intValue() < 0) {
            return false;
        }
        return true;
    }

    public static void i(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(zvk.NOT_COLLECTABLE.toString());
        if (optJSONArray != null) {
            e = optJSONArray;
        }
        BitSet bitSet = new BitSet(128);
        c = bitSet;
        bitSet.set(0, 128, true);
        for (int i = 0; optJSONArray != null && i < optJSONArray.length(); i++) {
            try {
                c.set(optJSONArray.getInt(i), false);
            } catch (JSONException e2) {
                wsk.b(cxk.class, e2);
            }
        }
    }
}
