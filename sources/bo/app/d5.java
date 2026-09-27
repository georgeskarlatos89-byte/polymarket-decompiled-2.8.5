package bo.app;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.b69;
import defpackage.fq5;
import defpackage.ilg;
import defpackage.jn1;
import defpackage.jq6;
import defpackage.pm1;
import defpackage.qga;
import defpackage.r2g;
import defpackage.wuk;
import defpackage.yj9;
import io.radar.sdk.RadarTrackingOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d5 extends v2 {
    public ic l;
    public ilg m;
    public jc n;
    public x1 o;
    public EnumSet p;
    public String q;
    public String r;
    public wh s;
    public final x9 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(wf wfVar, String str, ic icVar, w2 w2Var) {
        super(new r2g(str.concat(ApiConstant.KEY_DATA), false), null, wfVar, w2Var, 2);
        wfVar.getClass();
        str.getClass();
        w2Var.getClass();
        this.l = icVar;
        this.t = x9.f;
    }

    public static final String m() {
        return "Remote notifications enabled field set on request, but push token field not set. Not sending remote notifications enabled field.";
    }

    public static final String n() {
        return "Experienced JSONException while retrieving parameters. Returning empty object.";
    }

    public static final String o() {
        return "Trigger dispatch completed. Alerting subscribers.";
    }

    @Override // bo.app.v2, bo.app.y9
    public final JSONObject a() {
        d5 d5Var;
        jc jcVar;
        p5 p5Var = this.j;
        if (p5Var == null || !p5Var.forJsonPut().has(jq6.NOTIFICATIONS_ENABLED.b()) || ((jcVar = this.n) != null && jcVar.a.has(fq5.PUSH_TOKEN.b()))) {
            d5Var = this;
            p5 p5Var2 = d5Var.j;
            if (p5Var2 != null) {
                p5Var2.m = true;
            }
        } else {
            d5Var = this;
            b69.h(d5Var, null, null, false, new wuk(26), 7);
            p5 p5Var3 = d5Var.j;
            if (p5Var3 != null) {
                p5Var3.m = false;
            }
        }
        JSONObject a = super.a();
        if (a == null) {
            return null;
        }
        try {
            String str = d5Var.q;
            if (str != null) {
                a.put("app_version", str);
            }
            String str2 = d5Var.r;
            if (str2 != null && !StringsKt.T(str2)) {
                a.put("app_version_code", d5Var.r);
            }
            jc jcVar2 = d5Var.n;
            if (jcVar2 != null && !jcVar2.isEmpty()) {
                JSONArray jSONArray = jcVar2.b;
                jSONArray.getClass();
                a.put("attributes", jSONArray);
            }
            x1 x1Var = d5Var.o;
            if (x1Var != null && !x1Var.b) {
                LinkedHashSet linkedHashSet = x1Var.a;
                String str3 = qga.a;
                linkedHashSet.getClass();
                JSONArray jSONArray2 = new JSONArray();
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((yj9) it.next()).forJsonPut());
                }
                a.put(RadarTrackingOptions.RadarTrackingOptionsSync.EVENTS_STR, jSONArray2);
            }
            ilg ilgVar = d5Var.m;
            if (ilgVar != null) {
                a.put("sdk_flavor", ilgVar.b());
            }
            EnumSet<jn1> enumSet = d5Var.p;
            if (enumSet != null) {
                jn1.Companion.getClass();
                ArrayList arrayList = new ArrayList(CollectionsKt.w(enumSet));
                for (jn1 jn1Var : enumSet) {
                    jn1Var.getClass();
                    arrayList.add(jn1.b(jn1Var));
                }
                a.put("sdk_metadata", new JSONArray((Collection) CollectionsKt.y0(arrayList)));
            }
            a.put("respond_with", d5Var.l.forJsonPut());
            wh whVar = d5Var.s;
            if (whVar != null) {
                a.put("triggers", new JSONObject().put("checksums", whVar.a()));
            }
            return a;
        } catch (JSONException e) {
            b69.h(d5Var, pm1.W, e, false, new wuk(27), 4);
            return null;
        }
    }

    @Override // bo.app.v2, bo.app.la
    public final void b(m8 m8Var) {
        m8Var.getClass();
        if (this.l.b()) {
            b69.h(this, null, null, false, new wuk(28), 7);
            m8Var.b(new dh(this), dh.class);
        }
    }

    @Override // bo.app.y9
    public final boolean d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.j);
        arrayList.add(this.n);
        arrayList.add(this.o);
        arrayList.add(this.l);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ga gaVar = (ga) obj;
                if (gaVar != null && !gaVar.isEmpty()) {
                    break;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.j);
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ga gaVar2 = (ga) obj2;
            if (gaVar2 != null && !gaVar2.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // bo.app.y9
    public final x9 b() {
        return this.t;
    }

    @Override // bo.app.v2, bo.app.la
    public final void a(m8 m8Var) {
        m8Var.getClass();
        if (this.l.b()) {
            m8Var.b(new eh(this), eh.class);
        }
    }

    @Override // bo.app.v2, bo.app.y9
    public final void a(HashMap hashMap) {
        super.a(hashMap);
        if (!this.l.isEmpty() && this.l.b()) {
            hashMap.put("X-Braze-TriggersRequest", "true");
            hashMap.put("X-Braze-DataRequest", "true");
        }
    }
}
