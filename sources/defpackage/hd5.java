package defpackage;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hd5 extends mb5 {
    public final String a;

    public hd5(Bundle bundle, String str) {
        super(bundle, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL");
        this.a = str;
        str.getClass();
        boolean z = false;
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (z) {
            return;
        }
        dmk.v("registrationResponseJson must not be empty, and must be a valid JSON");
        throw null;
    }
}
