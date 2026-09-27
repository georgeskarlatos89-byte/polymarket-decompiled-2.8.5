package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class ysn implements rp8 {
    public static zkf a(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] c = c(context, "androidx.camera.core.quirks.FORCE_ENABLED", bundle);
        String[] c2 = c(context, "androidx.camera.core.quirks.FORCE_DISABLED", bundle);
        o9n.e(3, "QuirkSettingsLoader");
        o9n.e(3, "QuirkSettingsLoader");
        Arrays.toString(c);
        o9n.e(3, "QuirkSettingsLoader");
        Arrays.toString(c2);
        o9n.e(3, "QuirkSettingsLoader");
        return new zkf(z, new HashSet(d(c)), new HashSet(d(c2)));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [mb5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [mb5, java.lang.Object] */
    public static mb5 b(Bundle bundle, String str) {
        str.getClass();
        bundle.getClass();
        try {
            int hashCode = str.hashCode();
            if (hashCode != -1678407252) {
                if (hashCode != -543568185) {
                    if (hashCode == -95037569 && str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                            string.getClass();
                            return new hd5(bundle, string);
                        } catch (Exception unused) {
                            throw new Exception();
                        }
                    }
                } else if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    return new mb5(bundle, "android.credentials.TYPE_PASSWORD_CREDENTIAL");
                }
                throw new Exception();
            }
            if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                try {
                    String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON");
                    string2.getClass();
                    new Bundle().putString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON", string2);
                    ?? obj = new Object();
                    if (string2.length() != 0) {
                        try {
                            new JSONObject(string2);
                            return obj;
                        } catch (Exception unused2) {
                        }
                    }
                    throw new IllegalArgumentException("responseJson must not be empty, and must be a valid JSON");
                } catch (Exception unused3) {
                    throw new Exception();
                }
            }
            throw new Exception();
        } catch (po8 unused4) {
            ?? obj2 = new Object();
            if (str.length() > 0) {
                return obj2;
            }
            dmk.v("type should not be empty");
            return null;
        }
    }

    public static String[] c(Context context, String str, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            o9n.f("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException e) {
            o9n.g("QuirkSettingsLoader", "Quirk class names resource not found: " + i, e);
            return new String[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashSet d(String[] strArr) {
        Class<?> cls;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            try {
                cls = Class.forName(str);
            } catch (ClassNotFoundException e) {
                o9n.g("QuirkSettingsLoader", "Class not found: " + str, e);
            }
            if (!ykf.class.isAssignableFrom(cls)) {
                o9n.f("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
                cls = null;
                if (cls == null) {
                }
            } else {
                if (cls == null) {
                    hashSet.add(cls);
                }
            }
        }
        return hashSet;
    }
}
