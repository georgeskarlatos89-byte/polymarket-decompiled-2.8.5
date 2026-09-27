package defpackage;

import android.content.SharedPreferences;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.socure.docv.capturesdk.api.Keys;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class y50 {
    public final xrb a;
    public final SharedPreferences b;
    public final kr6 c;
    public final dp7 d;
    public final LinkedHashMap e;

    public y50(String str, xrb xrbVar, SharedPreferences sharedPreferences, File file, bw4 bw4Var, kr6 kr6Var) {
        str.getClass();
        xrbVar.getClass();
        sharedPreferences.getClass();
        file.getClass();
        bw4Var.getClass();
        this.a = xrbVar;
        this.b = sharedPreferences;
        this.c = kr6Var;
        this.d = new dp7(file, str, new y20(sharedPreferences), xrbVar, bw4Var);
        this.e = new LinkedHashMap();
    }

    public final String a(yyh yyhVar) {
        yyhVar.getClass();
        return this.b.getString(yyhVar.a(), null);
    }

    public final ArrayList b() {
        dp7 dp7Var = this.d;
        File[] listFiles = dp7Var.a.listFiles(new xo7(dp7Var, 0));
        if (listFiles == null) {
            listFiles = new File[0];
        }
        List W = ArraysKt.W(listFiles, new ap7(dp7Var, 0));
        ArrayList arrayList = new ArrayList(CollectionsKt.w(W));
        Iterator it = W.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getAbsolutePath());
        }
        return arrayList;
    }

    public final void c(String str) {
        str.getClass();
        this.d.h.remove(str);
    }

    public final Unit d(yyh yyhVar) {
        SharedPreferences.Editor edit = this.b.edit();
        edit.remove(yyhVar.a());
        edit.apply();
        return Unit.INSTANCE;
    }

    public final Object e(q55 q55Var) {
        Object j = this.d.j(q55Var);
        if (j == u85.COROUTINE_SUSPENDED) {
            return j;
        }
        return Unit.INSTANCE;
    }

    public final Unit f(yyh yyhVar, String str) {
        SharedPreferences.Editor edit = this.b.edit();
        edit.putString(yyhVar.a(), str);
        edit.apply();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x01ef, code lost:
    
        if (r5.length() != 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01f2, code lost:
    
        r7.put("version", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(u81 u81Var, q55 q55Var) {
        x50 x50Var;
        int i;
        if (q55Var instanceof x50) {
            x50Var = (x50) q55Var;
            int i2 = x50Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x50Var.o = i2 - Integer.MIN_VALUE;
                Object obj = x50Var.m;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = x50Var.o;
                if (i == 0) {
                    if (i == 1) {
                        u81Var = x50Var.l;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    u81Var.getClass();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("event_type", u81Var.a());
                    String str = u81Var.a;
                    if (str != null) {
                        jSONObject.put("user_id", str);
                    }
                    String str2 = u81Var.b;
                    if (str2 != null) {
                        jSONObject.put("device_id", str2);
                    }
                    Long l = u81Var.c;
                    if (l != null) {
                        jSONObject.put("time", l);
                    }
                    jSONObject.put("event_properties", wxm.d(vxm.f(u81Var.M)));
                    jSONObject.put("user_properties", wxm.d(vxm.f(u81Var.N)));
                    jSONObject.put("groups", wxm.d(vxm.f(u81Var.O)));
                    jSONObject.put("group_properties", wxm.d(vxm.f(u81Var.P)));
                    String str3 = u81Var.i;
                    if (str3 != null) {
                        jSONObject.put("app_version", str3);
                    }
                    String str4 = u81Var.k;
                    if (str4 != null) {
                        jSONObject.put("platform", str4);
                    }
                    String str5 = u81Var.l;
                    if (str5 != null) {
                        jSONObject.put("os_name", str5);
                    }
                    String str6 = u81Var.m;
                    if (str6 != null) {
                        jSONObject.put("os_version", str6);
                    }
                    String str7 = u81Var.n;
                    if (str7 != null) {
                        jSONObject.put("device_brand", str7);
                    }
                    String str8 = u81Var.o;
                    if (str8 != null) {
                        jSONObject.put("device_manufacturer", str8);
                    }
                    String str9 = u81Var.p;
                    if (str9 != null) {
                        jSONObject.put("device_model", str9);
                    }
                    String str10 = u81Var.q;
                    if (str10 != null) {
                        jSONObject.put("carrier", str10);
                    }
                    String str11 = u81Var.r;
                    if (str11 != null) {
                        jSONObject.put("country", str11);
                    }
                    String str12 = u81Var.s;
                    if (str12 != null) {
                        jSONObject.put("region", str12);
                    }
                    String str13 = u81Var.t;
                    if (str13 != null) {
                        jSONObject.put("city", str13);
                    }
                    String str14 = u81Var.u;
                    if (str14 != null) {
                        jSONObject.put("dma", str14);
                    }
                    String str15 = u81Var.A;
                    if (str15 != null) {
                        jSONObject.put(Keys.KEY_LANGUAGE, str15);
                    }
                    Double d = u81Var.G;
                    if (d != null) {
                        jSONObject.put("price", d);
                    }
                    Integer num = u81Var.H;
                    if (num != null) {
                        jSONObject.put("quantity", num);
                    }
                    Double d2 = u81Var.F;
                    if (d2 != null) {
                        jSONObject.put("revenue", d2);
                    }
                    String str16 = u81Var.I;
                    if (str16 != null) {
                        jSONObject.put("productId", str16);
                    }
                    String str17 = u81Var.J;
                    if (str17 != null) {
                        jSONObject.put("revenueType", str17);
                    }
                    Double d3 = u81Var.g;
                    if (d3 != null) {
                        jSONObject.put("location_lat", d3);
                    }
                    Double d4 = u81Var.h;
                    if (d4 != null) {
                        jSONObject.put("location_lng", d4);
                    }
                    String str18 = u81Var.C;
                    if (str18 != null) {
                        jSONObject.put("ip", str18);
                    }
                    String str19 = u81Var.j;
                    if (str19 != null) {
                        jSONObject.put("version_name", str19);
                    }
                    String str20 = u81Var.v;
                    if (str20 != null) {
                        jSONObject.put("idfa", str20);
                    }
                    String str21 = u81Var.w;
                    if (str21 != null) {
                        jSONObject.put("idfv", str21);
                    }
                    String str22 = u81Var.x;
                    if (str22 != null) {
                        jSONObject.put("adid", str22);
                    }
                    String str23 = u81Var.z;
                    if (str23 != null) {
                        jSONObject.put("android_id", str23);
                    }
                    Long l2 = u81Var.d;
                    if (l2 != null) {
                        jSONObject.put("event_id", l2);
                    }
                    Long l3 = u81Var.e;
                    if (l3 != null) {
                        jSONObject.put(Keys.KEY_SESSION_ID, l3);
                    }
                    String str24 = u81Var.f;
                    if (str24 != null) {
                        jSONObject.put("insert_id", str24);
                    }
                    String str25 = u81Var.B;
                    if (str25 != null) {
                        jSONObject.put(PlaceTypes.LIBRARY, str25);
                    }
                    String str26 = u81Var.K;
                    if (str26 != null) {
                        jSONObject.put("partner_id", str26);
                    }
                    String str27 = u81Var.y;
                    if (str27 != null) {
                        jSONObject.put("android_app_set_id", str27);
                    }
                    yw0 yw0Var = u81Var.D;
                    if (yw0Var != null) {
                        String str28 = yw0Var.d;
                        String str29 = yw0Var.c;
                        String str30 = yw0Var.b;
                        String str31 = yw0Var.a;
                        JSONObject jSONObject2 = new JSONObject();
                        if (str31 != null) {
                            try {
                                if (str31.length() != 0) {
                                    jSONObject2.put("branch", str31);
                                }
                            } catch (JSONException unused) {
                                by4 by4Var = by4.b;
                                by4Var.getClass();
                                by4Var.d(urb.ERROR, "JSON Serialization of tacking plan object failed");
                            }
                        }
                        if (str30 != null && str30.length() != 0) {
                            jSONObject2.put("source", str30);
                        }
                        if (str28 != null && str28.length() != 0) {
                            jSONObject2.put("versionId", str28);
                        }
                        jSONObject.put("plan", jSONObject2);
                    }
                    av9 av9Var = u81Var.E;
                    if (av9Var != null) {
                        String str32 = av9Var.c;
                        String str33 = av9Var.b;
                        JSONObject jSONObject3 = new JSONObject();
                        if (str33 != null) {
                            try {
                                if (str33.length() != 0) {
                                    jSONObject3.put("source_name", str33);
                                }
                            } catch (JSONException unused2) {
                                by4 by4Var2 = by4.b;
                                by4Var2.getClass();
                                by4Var2.d(urb.ERROR, "JSON Serialization of ingestion metadata object failed");
                            }
                        }
                        if (str32 != null && str32.length() != 0) {
                            jSONObject3.put("source_version", str32);
                        }
                        jSONObject.put("ingestion_metadata", jSONObject3);
                    }
                    String jSONObject4 = jSONObject.toString();
                    jSONObject4.getClass();
                    x50Var.k = this;
                    x50Var.l = u81Var;
                    x50Var.o = 1;
                    if (this.d.k(jSONObject4, x50Var) == u85Var) {
                        return u85Var;
                    }
                }
                u81Var.getClass();
                return Unit.INSTANCE;
            }
        }
        x50Var = new x50(this, q55Var);
        Object obj2 = x50Var.m;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = x50Var.o;
        if (i == 0) {
        }
        u81Var.getClass();
        return Unit.INSTANCE;
    }
}
