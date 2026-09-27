package bo.app;

import defpackage.b69;
import defpackage.oga;
import defpackage.pm1;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c {
    public final ArrayList a(JSONArray jSONArray) {
        c cVar;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("banner_id");
                long j = jSONObject.getLong("dismissal_time");
                string.getClass();
                arrayList.add(new d(string, j));
                cVar = this;
            } catch (Exception e) {
                cVar = this;
                b69.h(cVar, pm1.W, e, false, new oga(i, jSONArray, 1), 4);
            }
            i++;
            this = cVar;
        }
        return arrayList;
    }

    public static final String a(int i, JSONArray jSONArray) {
        return "Skipping malformed acknowledged dismissal at index " + i + " in array " + jSONArray;
    }
}
