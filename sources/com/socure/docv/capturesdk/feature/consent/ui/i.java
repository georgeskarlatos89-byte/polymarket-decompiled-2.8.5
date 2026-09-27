package com.socure.docv.capturesdk.feature.consent.ui;

import android.os.Bundle;
import defpackage.dmk;
import defpackage.woa;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i {
    public final HashMap a = new HashMap();

    public static i fromBundle(Bundle bundle) {
        i iVar = new i();
        bundle.setClassLoader(i.class.getClassLoader());
        if (bundle.containsKey("privacyPolicyLink")) {
            String string = bundle.getString("privacyPolicyLink");
            if (string != null) {
                HashMap hashMap = iVar.a;
                hashMap.put("privacyPolicyLink", string);
                if (bundle.containsKey("closeContentDescription")) {
                    String string2 = bundle.getString("closeContentDescription");
                    if (string2 != null) {
                        hashMap.put("closeContentDescription", string2);
                        return iVar;
                    }
                    dmk.v("Argument \"closeContentDescription\" is marked as non-null but was passed a null value.");
                    return null;
                }
                dmk.v("Required argument \"closeContentDescription\" is missing and does not have an android:defaultValue");
                return null;
            }
            dmk.v("Argument \"privacyPolicyLink\" is marked as non-null but was passed a null value.");
            return null;
        }
        dmk.v("Required argument \"privacyPolicyLink\" is missing and does not have an android:defaultValue");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && i.class == obj.getClass()) {
                HashMap hashMap = ((i) obj).a;
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
        return i3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentDialogArgs{privacyPolicyLink=");
        HashMap hashMap = this.a;
        sb.append((String) hashMap.get("privacyPolicyLink"));
        sb.append(", closeContentDescription=");
        return woa.r(sb, (String) hashMap.get("closeContentDescription"), "}");
    }
}
