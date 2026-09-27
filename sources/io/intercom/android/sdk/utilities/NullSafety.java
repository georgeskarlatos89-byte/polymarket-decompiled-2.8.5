package io.intercom.android.sdk.utilities;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class NullSafety {
    public static boolean valueOrDefault(Boolean bool, boolean z) {
        if (bool == null) {
            return z;
        }
        return bool.booleanValue();
    }

    public static String valueOrEmpty(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }
}
