package bo.app;

import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g9 implements Function1 {
    public final /* synthetic */ JSONArray a;

    public g9(JSONArray jSONArray) {
        this.a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.a.opt(((Number) obj).intValue()) instanceof JSONObject);
    }
}
