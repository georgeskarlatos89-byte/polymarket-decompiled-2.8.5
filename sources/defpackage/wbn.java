package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class wbn {
    public static final wwf a = jr9.v("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(t6l t6lVar, bxf bxfVar, bxf bxfVar2, x8h x8hVar, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        qbn qbnVar;
        char c;
        int c2 = c(t6lVar);
        if (c2 > 0 && (i2 != 1 || i != 1)) {
            cArr[c2] = '2';
        }
        if (g(t6lVar, bxfVar2) == u6l.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (t6lVar == t6l.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && x8hVar.d.equals(str)) {
                if (c2 > 0 && cArr[c2] != '2') {
                    cArr[c2] = '1';
                }
                return true;
            }
            if (bxfVar.containsKey(t6lVar) && (qbnVar = (qbn) bxfVar.get(t6lVar)) != null) {
                int ordinal = qbnVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                if (g(t6lVar, bxfVar2) == u6l.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                                    return e(t6lVar, cArr, str2, z);
                                }
                                return f(t6lVar, cArr, str3, z2);
                            }
                        } else {
                            if (g(t6lVar, bxfVar2) == u6l.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                                return f(t6lVar, cArr, str3, z2);
                            }
                            return e(t6lVar, cArr, str2, z);
                        }
                    } else if (g(t6lVar, bxfVar2) != u6l.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return f(t6lVar, cArr, str3, z2);
                    }
                } else if (g(t6lVar, bxfVar2) != u6l.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return e(t6lVar, cArr, str2, z);
                }
                c = '8';
            }
            c = '0';
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
            return false;
        }
        return false;
    }

    public static final int c(t6l t6lVar) {
        if (t6lVar == t6l.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (t6lVar == t6l.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (t6lVar == t6l.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        if (t6lVar == t6l.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE) {
            return 4;
        }
        return -1;
    }

    public static final String d(t6l t6lVar, String str, String str2) {
        String str3;
        String str4 = "0";
        if (TextUtils.isEmpty(str) || str.length() < t6lVar.zza()) {
            str3 = "0";
        } else {
            str3 = String.valueOf(str.charAt(t6lVar.zza() - 1));
        }
        if (!TextUtils.isEmpty(str2) && str2.length() >= t6lVar.zza()) {
            str4 = String.valueOf(str2.charAt(t6lVar.zza() - 1));
        }
        return String.valueOf(str3).concat(String.valueOf(str4));
    }

    public static final boolean e(t6l t6lVar, char[] cArr, String str, boolean z) {
        char c;
        int c2 = c(t6lVar);
        boolean z2 = false;
        if (!z) {
            c = '4';
        } else if (str.length() < t6lVar.zza()) {
            c = '0';
        } else {
            char charAt = str.charAt(t6lVar.zza() - 1);
            char c3 = '1';
            if (charAt == '1') {
                z2 = true;
            }
            if (c2 > 0 && cArr[c2] != '2') {
                if (charAt != '1') {
                    c3 = '6';
                }
                cArr[c2] = c3;
            }
            return z2;
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
        }
        return false;
    }

    public static final boolean f(t6l t6lVar, char[] cArr, String str, boolean z) {
        char c;
        int c2 = c(t6lVar);
        boolean z2 = false;
        if (!z) {
            c = '5';
        } else if (str.length() < t6lVar.zza()) {
            c = '0';
        } else {
            char charAt = str.charAt(t6lVar.zza() - 1);
            char c3 = '1';
            if (charAt == '1') {
                z2 = true;
            }
            if (c2 > 0 && cArr[c2] != '2') {
                if (charAt != '1') {
                    c3 = '7';
                }
                cArr[c2] = c3;
            }
            return z2;
        }
        if (c2 > 0 && cArr[c2] != '2') {
            cArr[c2] = c;
        }
        return false;
    }

    public static final u6l g(t6l t6lVar, bxf bxfVar) {
        Object obj = u6l.PURPOSE_RESTRICTION_UNDEFINED;
        Object obj2 = bxfVar.get(t6lVar);
        if (obj2 != null) {
            obj = obj2;
        }
        return (u6l) obj;
    }
}
