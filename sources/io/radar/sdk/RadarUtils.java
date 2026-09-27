package io.radar.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.display.DisplayManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.provider.Settings;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.d1c;
import defpackage.d55;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.AttributeType;
import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.e;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0002\b\u0019J!\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b\u001eJ\u0015\u0010\u001f\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b!J\u0017\u0010\"\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b#J\u0015\u0010$\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b%J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b'J\u0015\u0010(\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b*J\u0010\u0010+\u001a\u00020,2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0015\u0010-\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b.J\u0015\u0010/\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b0J\u000e\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006J\r\u00103\u001a\u00020)H\u0000¢\u0006\u0002\b4J\u0018\u00105\u001a\u00020)2\u0006\u00106\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0004H\u0002J\u0019\u00108\u001a\u0004\u0018\u00010\u00182\b\u00109\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b:J\u0015\u0010;\u001a\u00020)2\u0006\u0010<\u001a\u00020=H\u0000¢\u0006\u0002\b>R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00060\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\n \n*\u0004\u0018\u00010\u00060\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u001c\u0010\u000e\u001a\n \n*\u0004\u0018\u00010\u00060\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u000e\u0010\u0010\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006?"}, d2 = {"Lio/radar/sdk/RadarUtils;", "", "()V", "DEGREE_EPSILON", "", "country", "", "getCountry$sdk_release", "()Ljava/lang/String;", "deviceMake", "kotlin.jvm.PlatformType", "getDeviceMake$sdk_release", "deviceModel", "getDeviceModel$sdk_release", "deviceOS", "getDeviceOS$sdk_release", "deviceType", "sdkVersion", "timeZoneOffset", "", "getTimeZoneOffset$sdk_release", "()I", "dateToISOString", AttributeType.DATE, "Ljava/util/Date;", "dateToISOString$sdk_release", "getApplicationInfo", "", "context", "Landroid/content/Context;", "getApplicationInfo$sdk_release", "getConnectionType", "Lio/radar/sdk/ConnectionType;", "getConnectionType$sdk_release", "getDeviceId", "getDeviceId$sdk_release", "getLocationAccuracyAuthorization", "getLocationAccuracyAuthorization$sdk_release", "getLocationAuthorization", "getLocationAuthorization$sdk_release", "getLocationEnabled", "", "getLocationEnabled$sdk_release", "getSharedPreferences", "Landroid/content/SharedPreferences;", "hasMultipleDisplays", "hasMultipleDisplays$sdk_release", "hasVirtualInputDevice", "hasVirtualInputDevice$sdk_release", "hashSHA256", MetricTracker.Object.INPUT, "isEmulator", "isEmulator$sdk_release", "isWithinDegreeEpsilon", "firstValue", "secondValue", "isoStringToDate", "str", "isoStringToDate$sdk_release", "valid", "location", "Landroid/location/Location;", "valid$sdk_release", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadarUtils {
    private static final double DEGREE_EPSILON = 1.0E-8d;
    public static final String deviceType = "Android";
    public static final String sdkVersion = "3.35.0";
    public static final RadarUtils INSTANCE = new RadarUtils();
    private static final String deviceModel = Build.MODEL;
    private static final String deviceOS = Build.VERSION.RELEASE;
    private static final String deviceMake = Build.MANUFACTURER;

    private RadarUtils() {
    }

    private final SharedPreferences getSharedPreferences(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("RadarSDK", 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    private final boolean isWithinDegreeEpsilon(double firstValue, double secondValue) {
        if (Math.abs(firstValue - secondValue) < DEGREE_EPSILON) {
            return true;
        }
        return false;
    }

    public final String dateToISOString$sdk_release(Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    public final Map<String, String> getApplicationInfo$sdk_release(Context context) {
        context.getClass();
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            applicationInfo.getClass();
            String obj = packageManager.getApplicationLabel(applicationInfo).toString();
            String str = packageInfo.versionName;
            if (str == null) {
                str = "Unknown";
            }
            return d1c.e(new Pair(Keys.KEY_NAME, obj), new Pair("appVersion", str), new Pair("build", String.valueOf(packageInfo.getLongVersionCode())), new Pair("bundleId", packageName));
        } catch (Exception unused) {
            return d1c.e(new Pair(Keys.KEY_NAME, "Unknown"), new Pair("appVersion", "Unknown"), new Pair("build", "Unknown"), new Pair("bundleId", context.getPackageName()));
        }
    }

    public final ConnectionType getConnectionType$sdk_release(Context context) {
        NetworkCapabilities networkCapabilities;
        context.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        ConnectionType connectionType = ConnectionType.unknown;
        if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null) {
            if (networkCapabilities.hasTransport(1)) {
                return ConnectionType.wifi;
            }
            if (networkCapabilities.hasTransport(0)) {
                return ConnectionType.cellular;
            }
        }
        return connectionType;
    }

    public final String getCountry$sdk_release() {
        String country = Locale.getDefault().getCountry();
        country.getClass();
        return country;
    }

    public final String getDeviceId$sdk_release(Context context) {
        context.getClass();
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public final String getDeviceMake$sdk_release() {
        return deviceMake;
    }

    public final String getDeviceModel$sdk_release() {
        return deviceModel;
    }

    public final String getDeviceOS$sdk_release() {
        return deviceOS;
    }

    public final String getLocationAccuracyAuthorization$sdk_release(Context context) {
        context.getClass();
        if (d55.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return "FULL";
        }
        return "REDUCED";
    }

    public final String getLocationAuthorization$sdk_release(Context context) {
        String str;
        context.getClass();
        if (RadarSettings.INSTANCE.getPermissionsDenied$sdk_release(context)) {
            str = ConstantsKt.DENIED;
        } else {
            str = "NOT_DETERMINED";
        }
        if (d55.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || d55.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            str = "GRANTED_FOREGROUND";
        }
        if (d55.a(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
            return "GRANTED_BACKGROUND";
        }
        return str;
    }

    public final boolean getLocationEnabled$sdk_release(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("location");
        systemService.getClass();
        LocationManager locationManager = (LocationManager) systemService;
        if (!locationManager.isProviderEnabled("gps") && !locationManager.isProviderEnabled("network")) {
            return false;
        }
        return true;
    }

    public final int getTimeZoneOffset$sdk_release() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        return rawOffset / 1000;
    }

    public final boolean hasMultipleDisplays$sdk_release(Context context) {
        context.getClass();
        if (((DisplayManager) context.getSystemService("display")).getDisplays().length > 1) {
            return true;
        }
        return false;
    }

    public final boolean hasVirtualInputDevice$sdk_release(Context context) {
        context.getClass();
        return RadarSettings.INSTANCE.getSharing$sdk_release(context);
    }

    public final String hashSHA256(String input) {
        input.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = input.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] digest = messageDigest.digest(bytes);
        StringBuilder sb = new StringBuilder(digest.length * 2);
        for (byte b : digest) {
            String hexString = Integer.toHexString(b & MessagePack.Code.EXT_TIMESTAMP);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public final boolean isEmulator$sdk_release() {
        String str = Build.BRAND;
        str.getClass();
        if (e.u(str, "generic", false)) {
            String str2 = Build.DEVICE;
            str2.getClass();
            if (e.u(str2, "generic", false)) {
                return true;
            }
        }
        String str3 = Build.FINGERPRINT;
        str3.getClass();
        if (!e.u(str3, "generic", false) && !e.u(str3, "unknown", false)) {
            String str4 = Build.HARDWARE;
            str4.getClass();
            if (!StringsKt.L(str4, "goldfish", false) && !StringsKt.L(str4, "ranchu", false)) {
                String str5 = Build.MODEL;
                str5.getClass();
                if (!StringsKt.L(str5, "google_sdk", false) && !StringsKt.L(str5, "Emulator", false) && !StringsKt.L(str5, "Android SDK built for x86", false)) {
                    String str6 = Build.MANUFACTURER;
                    str6.getClass();
                    if (!StringsKt.L(str6, "Genymotion", false)) {
                        String str7 = Build.PRODUCT;
                        str7.getClass();
                        if (!StringsKt.L(str7, "sdk_google", false) && !StringsKt.L(str7, "google_sdk", false) && !StringsKt.L(str7, "sdk", false) && !StringsKt.L(str7, "sdk_x86", false) && !StringsKt.L(str7, "vbox86p", false) && !StringsKt.L(str7, "emulator", false) && !StringsKt.L(str7, "simulator", false)) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final Date isoStringToDate$sdk_release(String str) {
        Date date = null;
        if (str == null) {
            return null;
        }
        try {
            return Date.from(ZonedDateTime.parse(str).toInstant());
        } catch (Exception | NoClassDefFoundError unused) {
            Locale locale = Locale.US;
            String[] strArr = {"yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "yyyy-MM-dd'T'HH:mm:ssZ", "yyyy-MM-dd'T'HH:mm:ss'Z'"};
            String replace = new Regex("([+-]\\d{2}):(\\d{2})$").replace(str, "$1$2");
            for (int i = 0; i < 4; i++) {
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strArr[i], locale);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    return simpleDateFormat.parse(replace);
                } catch (ParseException unused2) {
                }
            }
            return date;
        }
    }

    public final boolean valid$sdk_release(Location location) {
        boolean z;
        boolean z2;
        boolean z3;
        location.getClass();
        if (!isWithinDegreeEpsilon(location.getLatitude(), ConstantsKt.UNSET) && location.getLatitude() > -90.0d && location.getLatitude() < 90.0d) {
            z = true;
        } else {
            z = false;
        }
        if (!isWithinDegreeEpsilon(location.getLongitude(), ConstantsKt.UNSET) && location.getLongitude() > -180.0d && location.getLongitude() < 180.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (location.getAccuracy() > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }
}
