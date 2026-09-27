package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.pm.PackageManager;
import defpackage.yw8;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class CommonUtils {
    private static final yw8 zza = new yw8("CommonUtils", "");

    private CommonUtils() {
    }

    public static String getAppVersion(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            zza.b("CommonUtils", "Exception thrown when trying to get app version ".concat(e.toString()));
            return "";
        }
    }

    public static String languageTagFromLocale(Locale locale) {
        return locale.toLanguageTag();
    }
}
