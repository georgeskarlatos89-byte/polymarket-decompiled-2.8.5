package bo.app;

import defpackage.b69;
import defpackage.pm1;
import defpackage.r2g;
import defpackage.ywk;
import java.util.HashMap;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f9 extends v2 {
    public final x9 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(wf wfVar, String str, String str2, w2 w2Var) {
        super(new r2g(str.concat("feature_flags/sync"), false), str2, wfVar, w2Var);
        str.getClass();
        this.l = x9.e;
    }

    public static final String m() {
        return "Experienced JSONException while creating Feature Flags request. Returning null.";
    }

    public static final String n() {
        return "FeatureFlagsSyncRequest failed.";
    }

    public static final String o() {
        return "FeatureFlagsSyncRequest executed successfully.";
    }

    @Override // bo.app.v2, bo.app.y9
    public final JSONObject a() {
        JSONObject a = super.a();
        if (a == null) {
            return null;
        }
        try {
            String str = this.b;
            if (str != null && !StringsKt.T(str)) {
                a.put("user_id", this.b);
                return a;
            }
            return a;
        } catch (JSONException e) {
            b69.h(this, pm1.W, e, false, new ywk(12), 4);
            return null;
        }
    }

    @Override // bo.app.y9
    public final x9 b() {
        return this.l;
    }

    @Override // bo.app.y9
    public final boolean d() {
        return false;
    }

    @Override // bo.app.v2, bo.app.la
    public final void a(m8 m8Var, ha haVar, kc kcVar) {
        haVar.getClass();
        b69.h(this, null, null, false, new ywk(14), 7);
        m8Var.b(new e9(this), e9.class);
    }

    @Override // bo.app.v2, bo.app.la
    public final void a(m8 m8Var, ha haVar, na naVar) {
        haVar.getClass();
        naVar.getClass();
        super.a(m8Var, haVar, naVar);
        b69.h(this, pm1.W, null, false, new ywk(13), 6);
        m8Var.b(new d9(), d9.class);
    }

    @Override // bo.app.v2, bo.app.y9
    public final void a(HashMap hashMap) {
        super.a(hashMap);
        hashMap.put("X-Braze-DataRequest", "true");
        hashMap.put("X-Braze-FeatureFlagsRequest", "true");
    }
}
