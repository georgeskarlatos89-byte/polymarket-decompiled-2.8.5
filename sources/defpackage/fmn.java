package defpackage;

import android.os.Parcelable;
import android.util.Base64;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import io.ably.lib.util.AgentHeaderCreator;
import io.radar.sdk.RadarTrackingOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.e;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class fmn {
    public static String a(String str) {
        Object m882constructorimpl;
        Object obj = null;
        if (str == null) {
            return null;
        }
        Parcelable.Creator<rd3> creator = rd3.CREATOR;
        try {
            Result.Companion companion = Result.INSTANCE;
            byte[] decode = Base64.decode(str, 8);
            decode.getClass();
            m882constructorimpl = Result.m882constructorimpl(new String(decode, Charsets.UTF_8));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m882constructorimpl instanceof r5g)) {
            obj = m882constructorimpl;
        }
        return (String) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x044d, code lost:
    
        if (kotlin.text.StringsKt.T(r22) == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0450, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x053c, code lost:
    
        if (kotlin.text.StringsKt.T(r0) == false) goto L237;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0557  */
    /* JADX WARN: Type inference failed for: r0v122 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [int] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static rd3 b(JSONObject jSONObject) {
        String str;
        boolean z;
        ArrayList arrayList;
        String str2;
        JSONObject jSONObject2;
        ?? r0;
        qtj a;
        String str3;
        boolean z2;
        String str4;
        String str5;
        ArrayList arrayList2;
        String a2;
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        String optString7;
        String optString8;
        String optString9;
        qtj qtjVar;
        String str6;
        qd3 qd3Var;
        String optString10;
        String optString11;
        qd3 qd3Var2;
        String str7;
        List list;
        boolean z3;
        naj najVar;
        String str8;
        boolean z4;
        boolean z5;
        String str9;
        Object m882constructorimpl;
        if (Intrinsics.areEqual("CRes", jSONObject.optString("messageType"))) {
            boolean z6 = true;
            boolean d = d(jSONObject, "challengeCompletionInd", true);
            llg llgVar = new llg(c(jSONObject, "sdkTransID"));
            String uuid = c(jSONObject, "threeDSServerTransID").toString();
            uuid.getClass();
            String uuid2 = c(jSONObject, "acsTransID").toString();
            uuid2.getClass();
            String optString12 = jSONObject.optString("messageVersion");
            optString12.getClass();
            if (!StringsKt.T(optString12)) {
                str = optString12;
            } else {
                str = null;
            }
            if (str != null) {
                Parcelable.Creator<fdc> creator = fdc.CREATOR;
                JSONArray optJSONArray = jSONObject.optJSONArray("messageExtension");
                int i = 64;
                if (optJSONArray == null) {
                    z = true;
                    arrayList = null;
                } else {
                    IntRange k = lnf.k(0, optJSONArray.length());
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = k.iterator();
                    while (((g1a) it).c) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(((y0a) it).nextInt());
                        if (optJSONObject != null) {
                            arrayList3.add(optJSONObject);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.w(arrayList3));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        JSONObject jSONObject3 = (JSONObject) it2.next();
                        Parcelable.Creator<fdc> creator2 = fdc.CREATOR;
                        String optString13 = jSONObject3.optString(Keys.KEY_NAME);
                        if (optString13.length() <= i) {
                            String optString14 = jSONObject3.optString(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID);
                            if (optString14.length() <= i) {
                                HashMap hashMap = new HashMap();
                                JSONObject optJSONObject2 = jSONObject3.optJSONObject(ApiConstant.KEY_DATA);
                                if (optJSONObject2 != null) {
                                    Iterator<String> keys = optJSONObject2.keys();
                                    while (keys.hasNext()) {
                                        boolean z7 = z6;
                                        String next = keys.next();
                                        String optString15 = optJSONObject2.optString(next);
                                        if (optString15.length() <= 8059) {
                                            hashMap.put(next, optString15);
                                            z6 = z7;
                                        } else {
                                            int i2 = sd3.d;
                                            throw gmn.a("messageExtension.data.value");
                                        }
                                    }
                                }
                                arrayList4.add(new fdc(optString13, optString14, jSONObject3.optBoolean("criticalityIndicator"), hashMap));
                                z6 = z6;
                                i = 64;
                            } else {
                                int i3 = sd3.d;
                                throw gmn.a("messageExtension.id");
                            }
                        } else {
                            int i4 = sd3.d;
                            throw gmn.a("messageExtension.name");
                        }
                    }
                    z = z6;
                    if (arrayList4.size() <= 10) {
                        arrayList = arrayList4;
                    } else {
                        int i5 = sd3.d;
                        throw gmn.a("messageExtensions");
                    }
                }
                if (arrayList != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : arrayList) {
                        fdc fdcVar = (fdc) obj;
                        if (fdcVar.c && !fdc.e.contains(fdcVar.a)) {
                            arrayList5.add(obj);
                        }
                    }
                    if (!arrayList5.isEmpty()) {
                        throw new sd3(fgf.UnrecognizedCriticalMessageExtensions, CollectionsKt.N(arrayList5, ",", null, null, null, 62));
                    }
                }
                boolean d2 = d(jSONObject, "challengeInfoTextIndicator", false);
                if (jSONObject.has("resendInformationLabel")) {
                    str2 = jSONObject.getString("resendInformationLabel");
                } else {
                    str2 = null;
                }
                if (str2 != null && str2.length() == 0) {
                    int i6 = sd3.d;
                    throw gmn.a("resendInformationLabel");
                }
                if (jSONObject.has("challengeSelectInfo")) {
                    jSONObject2 = jSONObject;
                } else {
                    jSONObject2 = null;
                }
                if (jSONObject2 != null) {
                    Parcelable.Creator<rd3> creator3 = rd3.CREATOR;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        m882constructorimpl = Result.m882constructorimpl(jSONObject2.getJSONArray("challengeSelectInfo"));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
                    }
                    if (Result.m883exceptionOrNullimpl(m882constructorimpl) == null) {
                        r0 = (JSONArray) m882constructorimpl;
                    } else {
                        int i7 = sd3.d;
                        throw gmn.a("challengeSelectInfo");
                    }
                } else {
                    r0 = null;
                }
                if (d) {
                    a = null;
                } else {
                    String optString16 = jSONObject.optString("acsUiType");
                    if (optString16 != null && !StringsKt.T(optString16)) {
                        qtj.Companion.getClass();
                        a = ptj.a(optString16);
                        if (a == null) {
                            int i8 = sd3.d;
                            throw gmn.a("acsUiType");
                        }
                    } else {
                        int i9 = sd3.d;
                        throw gmn.b("acsUiType");
                    }
                }
                if (a != null) {
                    Parcelable.Creator<rd3> creator4 = rd3.CREATOR;
                    if (jSONObject.has("submitAuthenticationLabel")) {
                        str9 = jSONObject.getString("submitAuthenticationLabel");
                    } else {
                        str9 = null;
                    }
                    if ((str9 != null && !StringsKt.T(str9)) || !a.c()) {
                        str3 = str9;
                    } else {
                        int i10 = sd3.d;
                        throw gmn.b("submitAuthenticationLabel");
                    }
                } else {
                    str3 = null;
                }
                if (a != null) {
                    Parcelable.Creator<rd3> creator5 = rd3.CREATOR;
                    if (jSONObject.has("acsHTML")) {
                        str8 = jSONObject.getString("acsHTML");
                    } else {
                        str8 = null;
                    }
                    if ((str8 != null && !StringsKt.T(str8)) || a != qtj.Html) {
                        if (str8 != null) {
                            z2 = false;
                            z2 = false;
                            z2 = false;
                            z2 = false;
                            z2 = false;
                            if (!StringsKt.L(str8, "\n", false) && !StringsKt.L(str8, ApiConstant.SPACE, false) && !StringsKt.L(str8, "+", false) && !StringsKt.L(str8, AgentHeaderCreator.AGENT_DIVIDER, false)) {
                                z4 = false;
                                if (str8 == null && e.n(str8, "=", z2)) {
                                    z5 = z;
                                } else {
                                    z5 = z2;
                                }
                                if (a != qtj.Html && (z4 || z5)) {
                                    int i11 = sd3.d;
                                    throw gmn.a("acsHTML");
                                }
                                str4 = a(str8);
                            }
                        } else {
                            z2 = false;
                        }
                        z4 = z;
                        if (str8 == null) {
                        }
                        z5 = z2;
                        if (a != qtj.Html) {
                        }
                        str4 = a(str8);
                    } else {
                        int i12 = sd3.d;
                        throw gmn.b("acsHTML");
                    }
                } else {
                    z2 = false;
                    str4 = null;
                }
                if (a != null) {
                    Parcelable.Creator<rd3> creator6 = rd3.CREATOR;
                    String optString17 = jSONObject.optString("oobContinueLabel");
                    if ((optString17 != null && !StringsKt.T(optString17)) || a != qtj.OutOfBand) {
                        str5 = optString17;
                    } else {
                        int i13 = sd3.d;
                        throw gmn.b("oobContinueLabel");
                    }
                } else {
                    str5 = null;
                }
                if (r0 == null) {
                    arrayList2 = null;
                } else {
                    ArrayList arrayList6 = new ArrayList();
                    int length = r0.length();
                    for (?? r12 = z2; r12 < length; r12++) {
                        JSONObject optJSONObject3 = r0.optJSONObject(r12);
                        if (optJSONObject3 != null) {
                            String next2 = optJSONObject3.keys().next();
                            String optString18 = optJSONObject3.optString(next2);
                            next2.getClass();
                            optString18.getClass();
                            arrayList6.add(new pd3(next2, optString18));
                        }
                    }
                    arrayList2 = arrayList6;
                }
                if (d) {
                    a2 = null;
                } else {
                    a2 = a(jSONObject.optString("acsHTMLRefresh"));
                }
                if (d) {
                    optString = null;
                } else {
                    optString = jSONObject.optString("challengeInfoHeader");
                }
                if (d) {
                    optString2 = null;
                } else {
                    optString2 = jSONObject.optString("challengeInfoLabel");
                }
                if (d) {
                    optString3 = null;
                } else {
                    optString3 = jSONObject.optString("challengeInfoText");
                }
                if (d) {
                    optString4 = null;
                } else {
                    optString4 = jSONObject.optString("challengeAddInfo");
                }
                if (d) {
                    optString5 = null;
                } else {
                    optString5 = jSONObject.optString("whitelistingInfoText");
                }
                if (d) {
                    optString6 = null;
                } else {
                    optString6 = jSONObject.optString("whyInfoLabel");
                }
                if (d) {
                    optString7 = null;
                } else {
                    optString7 = jSONObject.optString("whyInfoText");
                }
                if (d) {
                    optString8 = null;
                } else {
                    optString8 = jSONObject.optString("expandInfoLabel");
                }
                if (d) {
                    optString9 = null;
                } else {
                    optString9 = jSONObject.optString("expandInfoText");
                }
                JSONObject optJSONObject4 = jSONObject.optJSONObject("issuerImage");
                String str10 = str4;
                if (optJSONObject4 != null) {
                    qtjVar = a;
                    str6 = a2;
                    qd3Var = new qd3(optJSONObject4.optString(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR), optJSONObject4.optString(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH_STR), optJSONObject4.optString("extraHigh"));
                } else {
                    qtjVar = a;
                    str6 = a2;
                    qd3Var = null;
                }
                if (d) {
                    optString10 = null;
                } else {
                    optString10 = jSONObject.optString("oobAppURL");
                }
                if (d) {
                    optString11 = null;
                } else {
                    optString11 = jSONObject.optString("oobAppLabel");
                }
                JSONObject optJSONObject5 = jSONObject.optJSONObject("psImage");
                String str11 = optString10;
                if (optJSONObject5 != null) {
                    qd3Var2 = new qd3(optJSONObject5.optString(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR), optJSONObject5.optString(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH_STR), optJSONObject5.optString("extraHigh"));
                } else {
                    qd3Var2 = null;
                }
                if (d) {
                    String optString19 = jSONObject.optString("transStatus");
                    if (optString19 != null && !StringsKt.T(optString19)) {
                        naj.Companion.getClass();
                        Iterator it3 = naj.b().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                ?? next3 = it3.next();
                                if (Intrinsics.areEqual(((naj) next3).a(), optString19)) {
                                    najVar = next3;
                                    break;
                                }
                            } else {
                                najVar = null;
                                break;
                            }
                        }
                        naj najVar2 = najVar;
                        if (najVar2 != null) {
                            str7 = najVar2.a();
                        } else {
                            int i14 = sd3.d;
                            throw gmn.a("transStatus");
                        }
                    } else {
                        int i15 = sd3.d;
                        throw gmn.b("transStatus");
                    }
                } else {
                    str7 = "";
                }
                ArrayList arrayList7 = arrayList;
                qtj qtjVar2 = qtjVar;
                boolean z8 = false;
                rd3 rd3Var = new rd3(uuid, uuid2, str10, str6, qtjVar2, d, optString, optString2, optString3, optString4, d2, arrayList2, optString8, optString9, qd3Var, arrayList7, str, str11, optString11, str5, qd3Var2, str2, llgVar, str3, optString5, optString6, optString7, str7);
                String str12 = optString;
                String str13 = str5;
                if (qtjVar2 != null) {
                    if (qtjVar2 == qtj.Html) {
                        if (str10 != null) {
                        }
                        z3 = z;
                    } else {
                        if (qtjVar2 == qtj.Text || qtjVar2 == qtj.SingleSelect || qtjVar2 == qtj.MultiSelect) {
                            Set<String> l0 = ArraysKt.l0(new String[]{str12, optString2, optString3});
                            if (!(l0 instanceof Collection) || !l0.isEmpty()) {
                                for (String str14 : l0) {
                                    if (str14 == null || StringsKt.T(str14)) {
                                        break;
                                    }
                                }
                            }
                        }
                        if (qtjVar2 == qtj.OutOfBand) {
                            Set<String> l02 = ArraysKt.l0(new String[]{str12, optString3});
                            if (!(l02 instanceof Collection) || !l02.isEmpty()) {
                                for (String str15 : l02) {
                                    if (str15 == null || StringsKt.T(str15)) {
                                        break;
                                    }
                                }
                            }
                        }
                        if (str13 == null || str13.length() == 0 || ((str12 != null && str12.length() != 0) || (optString3 != null && optString3.length() != 0))) {
                            if (qtjVar2 == qtj.OutOfBand) {
                                Set<String> l03 = ArraysKt.l0(new String[]{rd3Var.s, rd3Var.r, str13});
                                if (!(l03 instanceof Collection) || !l03.isEmpty()) {
                                    for (String str16 : l03) {
                                        if (str16 == null || StringsKt.T(str16)) {
                                        }
                                    }
                                }
                            } else if ((qtjVar2 != qtj.SingleSelect && qtjVar2 != qtj.MultiSelect) || ((list = rd3Var.l) != null && !list.isEmpty())) {
                                String str17 = rd3Var.x;
                                if (str17 != null) {
                                }
                                z3 = z;
                            }
                        }
                        if (z8) {
                            String str18 = rd3Var.y;
                            if (str18 != null && str18.length() > 64) {
                                int i16 = sd3.d;
                                throw gmn.a("Whitelisting info text exceeds length.");
                            }
                            return rd3Var;
                        }
                        int i17 = sd3.d;
                        throw gmn.b("UI fields missing");
                    }
                    z8 = !z3;
                    if (z8) {
                    }
                }
                z8 = z;
                if (z8) {
                }
            } else {
                int i18 = sd3.d;
                throw gmn.b("messageVersion");
            }
        } else {
            throw new sd3(fgf.InvalidMessageReceived.a(), "Message is not CRes", "Invalid Message Type");
        }
    }

    public static UUID c(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString(str);
        if (optString != null && !StringsKt.T(optString)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                UUID fromString = UUID.fromString(optString);
                fromString.getClass();
                return fromString;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                if (Result.m883exceptionOrNullimpl(Result.m882constructorimpl(ResultKt.createFailure(th))) == null) {
                    f05.c();
                    return null;
                }
                int i = sd3.d;
                throw gmn.a(str);
            }
        }
        int i2 = sd3.d;
        throw gmn.b(str);
    }

    public static boolean d(JSONObject jSONObject, String str, boolean z) {
        String str2;
        if (z) {
            if (jSONObject.has(str)) {
                str2 = jSONObject.getString(str);
            } else {
                int i = sd3.d;
                throw gmn.b(str);
            }
        } else if (jSONObject.has(str)) {
            str2 = jSONObject.getString(str);
        } else {
            str2 = null;
        }
        if (str2 != null && !rd3.C.contains(str2)) {
            if (z && StringsKt.T(str2)) {
                int i2 = sd3.d;
                throw gmn.b(str);
            }
            int i3 = sd3.d;
            throw gmn.a(str);
        }
        return Intrinsics.areEqual("Y", str2);
    }
}
