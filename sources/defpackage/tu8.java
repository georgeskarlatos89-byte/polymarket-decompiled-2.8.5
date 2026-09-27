package defpackage;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tu8 extends rd5 {
    public final String f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tu8(String str) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", r2, r3, false, r5, 100);
        fd7 fd7Var = fd7.a;
        str.getClass();
        fd7Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
        bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
        bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
        Bundle bundle2 = new Bundle();
        bundle2.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
        bundle2.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
        bundle2.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
        this.f = str;
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        dmk.v("requestJson must not be empty, and must be a valid JSON");
        throw null;
    }
}
