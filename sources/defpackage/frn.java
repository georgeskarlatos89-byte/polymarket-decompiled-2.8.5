package defpackage;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.socure.docv.capturesdk.api.Keys;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class frn {
    public static void a(Object obj) {
        if (obj != null) {
            return;
        }
        dmk.s("Cannot return null from a non-@Nullable @Provides method");
    }

    public static final Pair b(Map map) {
        Map map2;
        Object obj;
        map.getClass();
        Object obj2 = map.get("billing_details");
        Map map3 = null;
        if (obj2 instanceof Map) {
            map2 = (Map) obj2;
        } else {
            map2 = null;
        }
        if (map2 != null) {
            obj = map2.get(PlaceTypes.ADDRESS);
        } else {
            obj = null;
        }
        if (obj instanceof Map) {
            map3 = (Map) obj;
        }
        if (map3 != null) {
            Map e = d1c.e(new Pair("country_code", map3.get("country")), new Pair(PlaceTypes.POSTAL_CODE, map3.get(PlaceTypes.POSTAL_CODE)), new Pair("line_1", map3.get("line1")), new Pair("line_2", map3.get("line2")), new Pair(PlaceTypes.LOCALITY, map3.get("city")), new Pair("administrative_area", map3.get("state")), new Pair(Keys.KEY_NAME, map2.get(Keys.KEY_NAME)));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : e.entrySet()) {
                Object value = entry.getValue();
                if (value != null && value.toString().length() > 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new Pair("billing_address", linkedHashMap);
        }
        return new Pair("billing_address", hdi.v("country_code", Locale.getDefault().getCountry()));
    }
}
