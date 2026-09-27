package com.socure.docv.capturesdk.feature.consent.ui;

import com.polymarket.android.R;
import defpackage.cuc;
import defpackage.woa;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class j implements cuc {
    public final HashMap a;

    public j(String str, String str2) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.put("privacyPolicyLink", str);
        hashMap.put("closeContentDescription", str2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && j.class == obj.getClass()) {
                HashMap hashMap = ((j) obj).a;
                HashMap hashMap2 = this.a;
                if (hashMap2.containsKey("privacyPolicyLink") == hashMap.containsKey("privacyPolicyLink")) {
                    if (((String) hashMap2.get("privacyPolicyLink")) != null) {
                        if (!((String) hashMap2.get("privacyPolicyLink")).equals((String) hashMap.get("privacyPolicyLink"))) {
                            return false;
                        }
                    } else if (((String) hashMap.get("privacyPolicyLink")) != null) {
                        return false;
                    }
                    if (hashMap2.containsKey("closeContentDescription") == hashMap.containsKey("closeContentDescription")) {
                        if (((String) hashMap2.get("closeContentDescription")) != null) {
                            if (((String) hashMap2.get("closeContentDescription")).equals((String) hashMap.get("closeContentDescription"))) {
                                return true;
                            }
                            return false;
                        }
                        if (((String) hashMap.get("closeContentDescription")) == null) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        HashMap hashMap = this.a;
        int i2 = 0;
        if (((String) hashMap.get("privacyPolicyLink")) != null) {
            i = ((String) hashMap.get("privacyPolicyLink")).hashCode();
        } else {
            i = 0;
        }
        int i3 = (i + 31) * 31;
        if (((String) hashMap.get("closeContentDescription")) != null) {
            i2 = ((String) hashMap.get("closeContentDescription")).hashCode();
        }
        return ((i3 + i2) * 31) + R.id.action_consent_privacy_dialog;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionConsentPrivacyDialog(actionId=2131427404){privacyPolicyLink=");
        HashMap hashMap = this.a;
        sb.append((String) hashMap.get("privacyPolicyLink"));
        sb.append(", closeContentDescription=");
        return woa.r(sb, (String) hashMap.get("closeContentDescription"), "}");
    }
}
