package io.intercom.android.sdk.utilities;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class NameUtils {
    public static String getInitial(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return "";
        }
        return String.valueOf(trim.charAt(0));
    }
}
