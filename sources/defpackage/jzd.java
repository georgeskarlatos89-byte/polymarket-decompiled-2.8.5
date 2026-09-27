package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jzd implements k6e {
    public final String a;
    public final JSONObject b;
    public final o0e c;
    public final String d;
    public final String e;
    public String f;
    public final h2a g;

    public jzd(String str, JSONObject jSONObject, o0e o0eVar, String str2, String str3) {
        h2a h2aVar = h2a.CUSTOM;
        this.a = str;
        this.b = jSONObject;
        this.c = o0eVar;
        this.d = str2;
        this.e = str3;
        this.f = null;
        this.g = h2aVar;
    }

    @Override // defpackage.k6e
    public final void b(String str) {
        this.f = str;
    }

    @Override // defpackage.k6e
    public final JSONObject d() {
        String a;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("platform", "android");
        } catch (JSONException unused) {
        }
        try {
            jSONObject2.put("sessionId", this.f);
        } catch (JSONException unused2) {
        }
        try {
            jSONObject2.put("source", "form");
        } catch (JSONException unused3) {
        }
        String str = null;
        h2a h2aVar = this.g;
        if (h2aVar != null) {
            try {
                a = h2aVar.a();
            } catch (JSONException unused4) {
            }
        } else {
            a = null;
        }
        jSONObject2.put("integration", a);
        JSONObject put = jSONObject.put("_meta", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("correlationId", this.a);
        o0e o0eVar = this.c;
        if (o0eVar != null) {
            str = o0eVar.b();
        }
        jSONObject3.put("intent", str);
        if ("single-payment".equalsIgnoreCase(this.e)) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("validate", false);
            jSONObject3.put("options", jSONObject4);
        }
        JSONObject jSONObject5 = this.b;
        Iterator<String> keys = jSONObject5.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject3.put(next, jSONObject5.get(next));
        }
        Object obj = this.d;
        if (obj != null) {
            put.put("merchant_account_id", obj);
        }
        put.put("paypalAccount", jSONObject3);
        return put;
    }

    @Override // defpackage.k6e
    public final String e() {
        return "paypal_accounts";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jzd) {
                jzd jzdVar = (jzd) obj;
                if (!Intrinsics.areEqual(this.a, jzdVar.a) || !Intrinsics.areEqual(this.b, jzdVar.b) || this.c != jzdVar.c || !Intrinsics.areEqual(this.d, jzdVar.d) || !Intrinsics.areEqual(this.e, jzdVar.e) || !Intrinsics.areEqual(this.f, jzdVar.f) || !Intrinsics.areEqual("form", "form") || this.g != jzdVar.g) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode6 = (this.b.hashCode() + (hashCode * 31)) * 31;
        o0e o0eVar = this.c;
        if (o0eVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = o0eVar.hashCode();
        }
        int i2 = (hashCode6 + hashCode2) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str3 = this.e;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str4 = this.f;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i5 = (((i4 + hashCode5) * 31) + 3148996) * 31;
        h2a h2aVar = this.g;
        if (h2aVar != null) {
            i = h2aVar.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        String str = this.f;
        StringBuilder sb = new StringBuilder("PayPalAccount(clientMetadataId=");
        sb.append(this.a);
        sb.append(", urlResponseData=");
        sb.append(this.b);
        sb.append(", intent=");
        sb.append(this.c);
        sb.append(", merchantAccountId=");
        sb.append(this.d);
        sb.append(", paymentType=");
        k84.q(sb, this.e, ", sessionId=", str, ", source=form, integration=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
