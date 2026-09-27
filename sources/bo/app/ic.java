package bo.app;

import defpackage.yj9;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ic implements yj9, ga {
    public final String a;
    public final Boolean b;
    public final gc c;

    public ic(String str, Boolean bool, gc gcVar) {
        this.a = str;
        this.b = bool;
        this.c = gcVar;
    }

    public final boolean b() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yj9
    public final JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        String str = this.a;
        if (str != null && str.length() != 0) {
            jSONObject.put("user_id", this.a);
        }
        Boolean bool = this.b;
        if (bool != null) {
            jSONObject.put("triggers", bool.booleanValue());
        }
        gc gcVar = this.c;
        if (gcVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("config_time", gcVar.a);
            jSONObject.put("config", jSONObject2);
        }
        return jSONObject;
    }

    @Override // bo.app.ga
    public final boolean isEmpty() {
        gc gcVar;
        JSONObject forJsonPut = forJsonPut();
        if (forJsonPut.length() == 0) {
            return true;
        }
        if (this.b == null && (gcVar = this.c) != null) {
            return !gcVar.b;
        }
        if (forJsonPut.length() == 1) {
            return forJsonPut.has("user_id");
        }
        return false;
    }

    @Override // defpackage.yj9
    public final /* bridge */ /* synthetic */ Object forJsonPut() {
        return forJsonPut();
    }
}
