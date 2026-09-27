package bo.app;

import defpackage.yj9;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gc implements yj9, ga {
    public final long a;
    public final boolean b;

    public gc(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    @Override // defpackage.yj9
    public final Object forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("config_time", this.a);
        return jSONObject;
    }

    @Override // bo.app.ga
    public final boolean isEmpty() {
        return !this.b;
    }
}
