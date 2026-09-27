package bo.app;

import defpackage.b69;
import defpackage.pm1;
import defpackage.pyk;
import defpackage.r2g;
import defpackage.v61;
import defpackage.znj;
import io.radar.sdk.RadarTrackingOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l0 extends v2 {
    public final ArrayList l;
    public final List m;
    public final x9 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ArrayList arrayList, List list, wf wfVar, String str, String str2) {
        super(new r2g(str.concat("banners/sync"), false), str2, wfVar, null, 8);
        list.getClass();
        str.getClass();
        this.l = arrayList;
        this.m = list;
        this.n = x9.m;
    }

    public static final String m() {
        return "Experienced JSONException while creating Banners Sync request. Returning null.";
    }

    @Override // bo.app.v2, bo.app.y9
    public final JSONObject a() {
        JSONObject a = super.a();
        if (a == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, ((Pair) obj).getFirst());
                jSONArray.put(jSONObject);
            }
            String str = this.b;
            if (str != null && !StringsKt.T(str)) {
                a.put("user_id", this.b);
            }
            Object obj2 = this.f;
            if (obj2 != null) {
                a.put("time_ms", obj2);
            }
            a.put("placements", jSONArray);
            if (!this.m.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (v61 v61Var : this.m) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("banner_id", v61Var.a);
                    jSONObject2.put("stable_key", v61Var.b);
                    jSONObject2.put("dismissal_time", v61Var.c);
                    jSONArray2.put(jSONObject2);
                }
                a.put("pending_dismissals", jSONArray2);
            }
            return a;
        } catch (JSONException e) {
            b69.h(this, pm1.W, e, false, new pyk(17), 4);
            return null;
        }
    }

    @Override // bo.app.y9
    public final x9 b() {
        return this.n;
    }

    @Override // bo.app.y9
    public final boolean d() {
        return false;
    }

    public final LinkedHashSet n() {
        ArrayList arrayList = this.l;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            linkedHashSet.add((String) ((Pair) obj).getFirst());
        }
        return linkedHashSet;
    }

    @Override // bo.app.v2, bo.app.la
    public final void a(m8 m8Var, ha haVar, kc kcVar) {
        haVar.getClass();
        b69.h(this, pm1.I, null, false, new znj(this, 23), 6);
        m8Var.b(new k0(this), k0.class);
    }

    public static final String a(l0 l0Var) {
        return "BannersSyncRequest executed successfully. placements=" + l0Var.l.size() + " pendingDismissals=" + l0Var.m.size();
    }

    @Override // bo.app.v2, bo.app.la
    public final void a(m8 m8Var, ha haVar, na naVar) {
        haVar.getClass();
        naVar.getClass();
        super.a(m8Var, haVar, naVar);
        b69.h(this, pm1.W, null, false, new com.socure.docv.capturesdk.feature.preview.presentation.ui.a(15, this, naVar), 6);
        m8Var.b(new j0(), j0.class);
    }

    public static final String a(l0 l0Var, na naVar) {
        return "BannersSyncRequest failed. placements=" + l0Var.l.size() + " pendingDismissals=" + l0Var.m.size() + " error=" + naVar.a();
    }

    @Override // bo.app.v2, bo.app.y9
    public final void a(HashMap hashMap) {
        super.a(hashMap);
        hashMap.put("X-Braze-DataRequest", "true");
        hashMap.put("X-Braze-BannersRequest", "true");
    }
}
