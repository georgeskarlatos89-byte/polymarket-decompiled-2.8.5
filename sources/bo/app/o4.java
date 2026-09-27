package bo.app;

import defpackage.dmk;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class o4 implements Function1 {
    public final /* synthetic */ JSONArray a;

    public o4(JSONArray jSONArray) {
        this.a = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.a.get(((Number) obj).intValue());
        if (obj2 != null) {
            return (JSONObject) obj2;
        }
        dmk.s("null cannot be cast to non-null type org.json.JSONObject");
        return null;
    }
}
