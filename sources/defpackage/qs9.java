package defpackage;

import android.graphics.Color;
import bo.app.jb;
import bo.app.v9;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qs9 extends rs9 {
    public final y9h E;
    public int F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs9(JSONObject jSONObject, v9 v9Var) {
        super(jSONObject, v9Var);
        jSONObject.getClass();
        v9Var.getClass();
        y9h y9hVar = y9h.BOTTOM;
        y9h y9hVar2 = (y9h) qga.g(jSONObject, "slide_from", y9h.class, y9hVar);
        int optInt = jSONObject.optInt("close_btn_color");
        this.E = y9hVar;
        this.F = Color.parseColor("#9B9B9B");
        if (y9hVar2 != null) {
            this.E = y9hVar2;
        }
        this.F = optInt;
        xe5 xe5Var = (xe5) qga.g(jSONObject, "crop_type", xe5.class, xe5.FIT_CENTER);
        xe5Var.getClass();
        this.l = xe5Var;
        kqi kqiVar = (kqi) qga.g(jSONObject, "text_align_message", kqi.class, kqi.START);
        kqiVar.getClass();
        this.m = kqiVar;
    }

    @Override // defpackage.ds9, defpackage.mj9
    public final void b() {
        Integer num;
        super.b();
        jb jbVar = this.y;
        if (jbVar == null) {
            b69.h(this, pm1.D, null, false, new js9(16), 6);
            return;
        }
        Integer num2 = jbVar.c;
        if ((num2 == null || num2.intValue() != -1) && (num = jbVar.c) != null) {
            this.F = num.intValue();
        }
    }

    @Override // defpackage.rs9, defpackage.ds9
    public final JSONObject c() {
        JSONObject jSONObject = this.w;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject c = super.c();
        try {
            c.put("slide_from", this.E.toString());
            c.put("close_btn_color", this.F);
            c.put("type", pec.SLIDEUP.name());
            return c;
        } catch (JSONException e) {
            b69.h(this, pm1.E, e, false, new js9(17), 4);
            return c;
        }
    }

    @Override // defpackage.jj9
    public final pec f() {
        return pec.SLIDEUP;
    }

    @Override // defpackage.ds9, defpackage.yj9
    public final /* bridge */ /* synthetic */ Object forJsonPut() {
        return c();
    }
}
