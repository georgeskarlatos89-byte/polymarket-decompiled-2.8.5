package io.intercom.android.sdk.user;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.socure.docv.capturesdk.api.Keys;
import io.intercom.android.sdk.api.PlatformIdentifierUtilKt;
import io.intercom.android.sdk.identity.PushTokenStore;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class DeviceData {
    public static Map<String, Object> generateDeviceData(Context context, PushTokenStore pushTokenStore) {
        HashMap hashMap = new HashMap();
        hashMap.put("platform_version", Build.VERSION.RELEASE);
        hashMap.put("sdk_type", PlatformIdentifierUtilKt.getPlatformIdentifier(context));
        hashMap.put("platform", Build.MODEL);
        hashMap.put("browser", "Intercom-Android-SDK");
        hashMap.put("version", DeviceUtils.getAppVersion(context));
        hashMap.put("application", getApplicationName(context));
        hashMap.put("application_id", DeviceUtils.getAppName(context));
        hashMap.put(Keys.KEY_LANGUAGE, Locale.getDefault().getDisplayLanguage());
        String pushToken = pushTokenStore.getPushToken();
        if (!pushToken.isEmpty()) {
            hashMap.put("device_token", pushToken);
        }
        return hashMap;
    }

    public static String getApplicationName(Context context) {
        CharSequence charSequence = "";
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
            if (applicationInfo != null) {
                charSequence = packageManager.getApplicationLabel(applicationInfo);
            }
            return charSequence.toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }
}
