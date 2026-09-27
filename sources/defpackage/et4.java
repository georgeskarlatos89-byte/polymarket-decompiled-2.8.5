package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import io.ably.lib.realtime.Presence;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class et4 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final LinkedHashSet m;
    public final String n;

    public et4(String str) {
        String str2;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        String str3;
        JSONArray jSONArray3;
        boolean z;
        String str4;
        JSONArray jSONArray4;
        boolean z2;
        str.getClass();
        this.n = str;
        JSONObject jSONObject = new JSONObject(str);
        if (!jSONObject.isNull("assetsUrl")) {
            jSONObject.optString("assetsUrl", "").getClass();
        }
        String string = jSONObject.getString("clientApiUrl");
        string.getClass();
        this.a = string;
        this.m = new LinkedHashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray("challenges");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                LinkedHashSet linkedHashSet = this.m;
                String optString = optJSONArray.optString(i, "");
                optString.getClass();
                linkedHashSet.add(optString);
            }
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("braintreeApi");
        if (optJSONObject == null || optJSONObject.isNull("accessToken")) {
            str2 = "";
        } else {
            str2 = optJSONObject.optString("accessToken", "");
            str2.getClass();
        }
        if (optJSONObject != null && !optJSONObject.isNull("url")) {
            optJSONObject.optString("url", "").getClass();
        }
        TextUtils.isEmpty(str2);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("creditCards");
        if (optJSONObject2 != null) {
            jSONArray = optJSONObject2.optJSONArray("supportedCardTypes");
        } else {
            jSONArray = null;
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length2 = jSONArray.length();
            for (int i2 = 0; i2 < length2; i2++) {
                String optString2 = jSONArray.optString(i2, "");
                optString2.getClass();
                arrayList.add(optString2);
            }
        }
        if (optJSONObject2 != null) {
            optJSONObject2.optBoolean("collectDeviceData", false);
        }
        if (!jSONObject.isNull("cardinalAuthenticationJWT")) {
            String optString3 = jSONObject.optString("cardinalAuthenticationJWT");
            optString3.getClass();
            if (optString3.length() == 0) {
                jSONObject.isNull("cardinalAuthenticationJWT");
            }
        }
        String string2 = jSONObject.getString(ConstantsKt.ENV_FACING_MODE);
        string2.getClass();
        this.b = string2;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("androidPay");
        if (optJSONObject3 != null) {
            optJSONObject3.optBoolean("enabled", false);
        }
        dzm.a(optJSONObject3, "googleAuthorizationFingerprint");
        dzm.a(optJSONObject3, ConstantsKt.ENV_FACING_MODE);
        dzm.b(optJSONObject3, "displayName", "");
        if (optJSONObject3 != null) {
            jSONArray2 = optJSONObject3.optJSONArray("supportedNetworks");
        } else {
            jSONArray2 = null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (jSONArray2 != null) {
            int length3 = jSONArray2.length();
            for (int i3 = 0; i3 < length3; i3++) {
                try {
                    String string3 = jSONArray2.getString(i3);
                    string3.getClass();
                    arrayList2.add(string3);
                } catch (JSONException unused) {
                }
            }
        }
        if (optJSONObject3 != null && !optJSONObject3.isNull("paypalClientId")) {
            optJSONObject3.optString("paypalClientId", "").getClass();
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("graphQL");
        if (optJSONObject4 == null || optJSONObject4.isNull("url")) {
            str3 = "";
        } else {
            str3 = optJSONObject4.optString("url", "");
            str3.getClass();
        }
        if (optJSONObject4 != null) {
            jSONArray3 = optJSONObject4.optJSONArray("features");
        } else {
            jSONArray3 = null;
        }
        HashSet hashSet = new HashSet();
        if (jSONArray3 != null) {
            int length4 = jSONArray3.length();
            for (int i4 = 0; i4 < length4; i4++) {
                String optString4 = jSONArray3.optString(i4, "");
                optString4.getClass();
                hashSet.add(optString4);
            }
        }
        TextUtils.isEmpty(str3);
        this.c = jSONObject.optBoolean("paypalEnabled", false);
        jSONObject.optBoolean("threeDSecureEnabled", false);
        if (!jSONObject.isNull("merchantAccountId")) {
            String optString5 = jSONObject.optString("merchantAccountId");
            optString5.getClass();
            if (optString5.length() == 0) {
                jSONObject.isNull("merchantAccountId");
            }
        }
        String string4 = jSONObject.getString("merchantId");
        string4.getClass();
        this.e = string4;
        JSONObject optJSONObject5 = jSONObject.optJSONObject("paypal");
        TextUtils.isEmpty(dzm.a(optJSONObject5, "directBaseUrl"));
        String a = dzm.a(optJSONObject5, "displayName");
        dzm.a(optJSONObject5, Presence.GET_CLIENTID);
        dzm.a(optJSONObject5, "privacyUrl");
        dzm.a(optJSONObject5, "userAgreementUrl");
        dzm.a(optJSONObject5, ConstantsKt.ENV_FACING_MODE);
        if (optJSONObject5 != null) {
            optJSONObject5.optBoolean("touchDisabled", true);
        }
        String a2 = dzm.a(optJSONObject5, "currencyIsoCode");
        JSONObject optJSONObject6 = jSONObject.optJSONObject("payWithVenmo");
        String b = dzm.b(optJSONObject6, "accessToken", "");
        String b2 = dzm.b(optJSONObject6, ConstantsKt.ENV_FACING_MODE, "");
        String b3 = dzm.b(optJSONObject6, "merchantId", "");
        if (optJSONObject6 != null && !optJSONObject6.isNull("enrichedCustomerDataEnabled")) {
            z = optJSONObject6.optBoolean("enrichedCustomerDataEnabled", false);
        } else {
            z = false;
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(b);
        JSONObject optJSONObject7 = jSONObject.optJSONObject("visaCheckout");
        if (optJSONObject7 == null || optJSONObject7.isNull("apikey")) {
            str4 = "";
        } else {
            str4 = optJSONObject7.optString("apikey", "");
            str4.getClass();
        }
        if (optJSONObject7 != null && !optJSONObject7.isNull("externalClientId")) {
            optJSONObject7.optString("externalClientId", "").getClass();
        }
        if (optJSONObject7 != null) {
            jSONArray4 = optJSONObject7.optJSONArray("supportedCardTypes");
        } else {
            jSONArray4 = null;
        }
        ArrayList arrayList3 = new ArrayList();
        if (jSONArray4 != null) {
            int length5 = jSONArray4.length();
            z2 = z;
            int i5 = 0;
            while (i5 < length5) {
                int i6 = length5;
                String optString6 = jSONArray4.optString(i5, "");
                optString6.getClass();
                arrayList3.add(optString6);
                i5++;
                length5 = i6;
            }
        } else {
            z2 = z;
        }
        if (optJSONObject7 != null) {
            optJSONObject7.optBoolean("collectDeviceData", false);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            switch (lowerCase.hashCode()) {
                case -2038717326:
                    if (lowerCase.equals("mastercard")) {
                        arrayList4.add("MASTERCARD");
                        break;
                    } else {
                        break;
                    }
                case -1120637072:
                    if (lowerCase.equals("american express")) {
                        arrayList4.add("AMEX");
                        break;
                    } else {
                        break;
                    }
                case 3619905:
                    if (lowerCase.equals("visa")) {
                        arrayList4.add("VISA");
                        break;
                    } else {
                        break;
                    }
                case 273184745:
                    if (lowerCase.equals("discover")) {
                        arrayList4.add("DISCOVER");
                        break;
                    } else {
                        break;
                    }
            }
        }
        Intrinsics.areEqual(str4, "");
        this.m.contains("cvv");
        this.m.contains(PlaceTypes.POSTAL_CODE);
        this.d = isEmpty;
        this.f = str3;
        this.g = a2;
        this.h = a;
        this.i = b;
        this.j = b2;
        this.k = b3;
        this.l = z2;
    }
}
