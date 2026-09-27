package bo.app;

import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.b69;
import defpackage.dmk;
import defpackage.eqc;
import defpackage.lvf;
import defpackage.n1l;
import defpackage.pm1;
import defpackage.qvf;
import defpackage.sv6;
import defpackage.vka;
import defpackage.zv5;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class w1 implements t9 {
    public static final v1 g;
    public static final /* synthetic */ vka[] h;
    public final r8 a;
    public final JSONObject b;
    public final double c;
    public final String d;
    public final pb e;
    public final pb f;

    static {
        eqc eqcVar = new eqc(w1.class, "userId", "getUserId()Ljava/lang/String;", 0);
        qvf qvfVar = lvf.a;
        h = new vka[]{qvfVar.mutableProperty1(eqcVar), qvfVar.mutableProperty1(new eqc(w1.class, "sessionId", "getSessionId()Lcom/braze/models/SessionId;", 0))};
        g = new v1();
    }

    public w1(r8 r8Var, JSONObject jSONObject, double d, String str) {
        r8Var.getClass();
        jSONObject.getClass();
        str.getClass();
        this.a = r8Var;
        this.b = jSONObject;
        this.c = d;
        this.d = str;
        this.e = new pb();
        this.f = new pb();
        if (r8Var != r8.J) {
            return;
        }
        dmk.v("Event type cannot be unknown.");
        throw null;
    }

    public static final String b() {
        return "Caught exception creating Braze event json";
    }

    public final void a(ag agVar) {
        this.f.setValue(this, h[1], agVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.areEqual(getClass(), obj.getClass())) {
            return Intrinsics.areEqual(this.d, ((w1) obj).d);
        }
        return false;
    }

    @Override // defpackage.yj9
    public final JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Keys.KEY_NAME, this.a.a);
            jSONObject.put(ApiConstant.KEY_DATA, this.b);
            jSONObject.put("time", this.c);
            pb pbVar = this.e;
            vka[] vkaVarArr = h;
            vka vkaVar = vkaVarArr[0];
            pbVar.getClass();
            vkaVar.getClass();
            String str = (String) pbVar.a;
            if (str != null && str.length() != 0) {
                pb pbVar2 = this.e;
                vka vkaVar2 = vkaVarArr[0];
                pbVar2.getClass();
                vkaVar2.getClass();
                jSONObject.put("user_id", (String) pbVar2.a);
            }
            pb pbVar3 = this.f;
            vka vkaVar3 = vkaVarArr[1];
            pbVar3.getClass();
            vkaVar3.getClass();
            ag agVar = (ag) pbVar3.a;
            if (agVar != null) {
                jSONObject.put(Keys.KEY_SESSION_ID, agVar.b);
            }
            return jSONObject;
        } catch (JSONException e) {
            b69.h(this, pm1.E, e, false, new n1l(13), 4);
            return jSONObject;
        }
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        String jSONObject = forJsonPut().toString();
        jSONObject.getClass();
        return jSONObject;
    }

    public w1(r8 r8Var, JSONObject jSONObject, double d, int i) {
        this(r8Var, (i & 2) != 0 ? new JSONObject() : jSONObject, (i & 4) != 0 ? zv5.e() / 1000.0d : d, sv6.i());
    }

    @Override // defpackage.yj9
    public final /* bridge */ /* synthetic */ Object forJsonPut() {
        return forJsonPut();
    }
}
