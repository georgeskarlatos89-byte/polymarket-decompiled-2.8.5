package bo.app;

import defpackage.yj9;
import defpackage.zv5;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ef implements yj9 {
    public final String a;
    public final long b;

    public ef(String str) {
        long e = zv5.e();
        this.a = str;
        this.b = e;
    }

    @Override // defpackage.yj9
    public final Object forJsonPut() {
        return new JSONObject().put("log", this.a).put("time", this.b);
    }
}
