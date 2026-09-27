package bo.app;

import android.content.Context;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.b69;
import defpackage.d1c;
import defpackage.dmk;
import defpackage.ds9;
import defpackage.fyk;
import defpackage.ix2;
import defpackage.pec;
import defpackage.pm1;
import defpackage.pyk;
import defpackage.qga;
import defpackage.vzk;
import defpackage.w63;
import defpackage.wzk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mb extends th {
    public final ds9 g;
    public final JSONObject h;
    public final v9 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(JSONObject jSONObject, v9 v9Var) {
        super(jSONObject);
        v9Var.getClass();
        b69.h(this, pm1.V, null, false, new w63(jSONObject, 13), 6);
        JSONObject jSONObject2 = jSONObject.getJSONObject(ApiConstant.KEY_DATA);
        this.i = v9Var;
        this.h = jSONObject2;
        jSONObject2.getClass();
        ds9 a = fyk.a(jSONObject2, v9Var);
        this.g = a;
        if (a != null) {
            return;
        }
        b69.h(this, pm1.W, null, false, new pyk(20), 6);
        dmk.v("Failed to parse in-app message triggered action with JSON: ".concat(qga.e(jSONObject)));
        throw null;
    }

    public static final String b(mb mbVar) {
        return ix2.i(mbVar.b.d, " seconds.", new StringBuilder("Attempting to publish in-app message after delay of "));
    }

    public static final String c(pa paVar) {
        return "Cannot perform triggered action for " + paVar + " due to in-app message json being null";
    }

    public static final String d(pa paVar) {
        return "Cannot perform triggered action for " + paVar + " due to deserialized in-app message being null";
    }

    @Override // bo.app.sa
    public final ArrayList a() {
        List list;
        int i;
        ArrayList arrayList = new ArrayList();
        ds9 ds9Var = this.g;
        pec pecVar = null;
        if (ds9Var != null) {
            list = ds9Var.e();
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            ds9 ds9Var2 = this.g;
            if (ds9Var2 != null) {
                pecVar = ds9Var2.f();
            }
            if (pecVar == null) {
                i = -1;
            } else {
                i = lb.a[pecVar.ordinal()];
            }
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    if (i != 5) {
                        b69.h(this, pm1.W, null, false, new vzk(this, 1), 6);
                        return arrayList;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new yd(zd.FILE, (String) it.next()));
                    }
                    return arrayList;
                }
                arrayList.add(new yd(zd.IMAGE, (String) list.get(0)));
                return arrayList;
            }
            arrayList.add(new yd(zd.ZIP, (String) list.get(0)));
            return arrayList;
        }
        b69.h(this, null, null, false, new pyk(22), 7);
        return arrayList;
    }

    @Override // bo.app.rh, defpackage.yj9
    public final Object forJsonPut() {
        JSONObject jSONObject;
        try {
            JSONObject forJsonPut = super.forJsonPut();
            if (forJsonPut != null) {
                ds9 ds9Var = this.g;
                if (ds9Var != null) {
                    jSONObject = (JSONObject) ds9Var.forJsonPut();
                } else {
                    jSONObject = null;
                }
                forJsonPut.put(ApiConstant.KEY_DATA, jSONObject);
                forJsonPut.put("type", "inapp");
                return forJsonPut;
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static final String b() {
        return "In-app message has no remote assets for prefetch. Returning empty list.";
    }

    public static final String c() {
        return "Failed to parse in-app message triggered action.";
    }

    public static final String d() {
        return "Caught exception while performing triggered action.";
    }

    public static final String a(mb mbVar) {
        StringBuilder sb = new StringBuilder("Failed to return remote paths to assets for type: ");
        ds9 ds9Var = mbVar.g;
        sb.append(ds9Var != null ? ds9Var.f() : null);
        return sb.toString();
    }

    public static final String a(JSONObject jSONObject) {
        return "Attempting to parse in-app message triggered action with JSON: ".concat(qga.e(jSONObject));
    }

    @Override // bo.app.sa
    public final void a(Context context, m8 m8Var, pa paVar, long j) {
        context.getClass();
        m8Var.getClass();
        paVar.getClass();
        try {
            b69.h(this, null, null, false, new vzk(this, 0), 7);
            JSONObject jSONObject = this.h;
            if (jSONObject == null) {
                b69.h(this, pm1.W, null, false, new wzk(paVar, 0), 6);
                return;
            }
            ds9 a = fyk.a(jSONObject, this.i);
            String a2 = paVar.a();
            int i = vg.g;
            if (Intrinsics.areEqual(a2, "test")) {
                if (a != null) {
                    a.t = true;
                }
                this.h.put("is_test_send", true);
            }
            if (a == null) {
                b69.h(this, pm1.W, null, false, new wzk(paVar, 1), 6);
                return;
            }
            a.a(d1c.o(this.f));
            a.o = j;
            m8Var.b(new ib(paVar, this, a, ((r2) this.i).b), ib.class);
        } catch (Exception e) {
            b69.h(this, pm1.W, e, false, new pyk(21), 4);
        }
    }
}
