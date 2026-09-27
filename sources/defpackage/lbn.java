package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleRequestExtKt;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class lbn {
    public final HashMap a;

    public lbn(Map map) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.putAll(map);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        wwf wwfVar = wbn.a;
        int i = wwfVar.d;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) wwfVar.get(i2);
            HashMap hashMap = this.a;
            if (hashMap.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) hashMap.get(str));
            }
        }
        return sb.toString();
    }

    public final Bundle b() {
        String str;
        String str2;
        String str3;
        String str4;
        HashMap hashMap = this.a;
        if (ModuleRequestExtKt.CAPTURE_DELTA.equals(hashMap.get("gdprApplies")) && ModuleRequestExtKt.CAPTURE_DELTA.equals(hashMap.get("EnableAdvertiserConsentMode"))) {
            String str5 = "denied";
            if (hashMap.get("Version") == null) {
                if (!ModuleRequestExtKt.CAPTURE_DELTA.equals(hashMap.get("GoogleConsent"))) {
                    return Bundle.EMPTY;
                }
                int c = c();
                if (c < 0) {
                    return Bundle.EMPTY;
                }
                String str6 = (String) hashMap.get("PurposeConsents");
                if (TextUtils.isEmpty(str6)) {
                    return Bundle.EMPTY;
                }
                Bundle bundle = new Bundle();
                if (str6.length() > 0) {
                    String str7 = omm.AD_STORAGE.zze;
                    if (str6.charAt(0) != '1') {
                        str4 = "denied";
                    } else {
                        str4 = "granted";
                    }
                    bundle.putString(str7, str4);
                }
                if (str6.length() > 3) {
                    String str8 = omm.AD_PERSONALIZATION.zze;
                    if (str6.charAt(2) != '1' || str6.charAt(3) != '1') {
                        str3 = "denied";
                    } else {
                        str3 = "granted";
                    }
                    bundle.putString(str8, str3);
                }
                if (str6.length() > 6 && c >= 4) {
                    String str9 = omm.AD_USER_DATA.zze;
                    if (str6.charAt(0) == '1' && str6.charAt(6) == '1') {
                        str5 = "granted";
                    }
                    bundle.putString(str9, str5);
                }
                return bundle;
            }
            if (c() >= 0) {
                Bundle bundle2 = new Bundle();
                String str10 = omm.AD_STORAGE.zze;
                if (true != Objects.equals(hashMap.get("AuthorizePurpose1"), ModuleRequestExtKt.CAPTURE_DELTA)) {
                    str = "denied";
                } else {
                    str = "granted";
                }
                bundle2.putString(str10, str);
                String str11 = omm.AD_PERSONALIZATION.zze;
                if (!Objects.equals(hashMap.get("AuthorizePurpose3"), ModuleRequestExtKt.CAPTURE_DELTA) || !Objects.equals(hashMap.get("AuthorizePurpose4"), ModuleRequestExtKt.CAPTURE_DELTA)) {
                    str2 = "denied";
                } else {
                    str2 = "granted";
                }
                bundle2.putString(str11, str2);
                if (c() >= 4) {
                    String str12 = omm.AD_USER_DATA.zze;
                    if (Objects.equals(hashMap.get("AuthorizePurpose1"), ModuleRequestExtKt.CAPTURE_DELTA) && Objects.equals(hashMap.get("AuthorizePurpose7"), ModuleRequestExtKt.CAPTURE_DELTA)) {
                        str5 = "granted";
                    }
                    bundle2.putString(str12, str5);
                }
                return bundle2;
            }
        }
        return Bundle.EMPTY;
    }

    public final int c() {
        try {
            String str = (String) this.a.get("PolicyVersion");
            if (!TextUtils.isEmpty(str)) {
                return Integer.parseInt(str);
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lbn)) {
            return false;
        }
        return a().equalsIgnoreCase(((lbn) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
