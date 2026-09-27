package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jq6 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ jq6[] $VALUES;
    public static final jq6 AD_TRACKING_ENABLED;
    public static final jq6 ANDROID_VERSION;
    public static final jq6 BRAND;
    public static final jq6 CARRIER;
    public static final jq6 GOOGLE_ADVERTISING_ID;
    public static final jq6 IS_BACKGROUND_RESTRICTED;
    public static final jq6 LOCALE;
    public static final jq6 MODEL;
    public static final jq6 NOTIFICATIONS_ENABLED;
    public static final jq6 TIMEZONE;
    private final String key;

    static {
        jq6 jq6Var = new jq6("ANDROID_VERSION", 0, "os_version");
        ANDROID_VERSION = jq6Var;
        jq6 jq6Var2 = new jq6("CARRIER", 1, "carrier");
        CARRIER = jq6Var2;
        jq6 jq6Var3 = new jq6("BRAND", 2, "brand");
        BRAND = jq6Var3;
        jq6 jq6Var4 = new jq6("MODEL", 3, ConstantsKt.KEY_MODEL);
        MODEL = jq6Var4;
        jq6 jq6Var5 = new jq6("LOCALE", 4, "locale");
        LOCALE = jq6Var5;
        jq6 jq6Var6 = new jq6("TIMEZONE", 5, "time_zone");
        TIMEZONE = jq6Var6;
        jq6 jq6Var7 = new jq6("NOTIFICATIONS_ENABLED", 6, "remote_notification_enabled");
        NOTIFICATIONS_ENABLED = jq6Var7;
        jq6 jq6Var8 = new jq6("IS_BACKGROUND_RESTRICTED", 7, "android_is_background_restricted");
        IS_BACKGROUND_RESTRICTED = jq6Var8;
        jq6 jq6Var9 = new jq6("GOOGLE_ADVERTISING_ID", 8, "google_ad_id");
        GOOGLE_ADVERTISING_ID = jq6Var9;
        jq6 jq6Var10 = new jq6("AD_TRACKING_ENABLED", 9, "ad_tracking_enabled");
        AD_TRACKING_ENABLED = jq6Var10;
        jq6[] jq6VarArr = {jq6Var, jq6Var2, jq6Var3, jq6Var4, jq6Var5, jq6Var6, jq6Var7, jq6Var8, jq6Var9, jq6Var10};
        $VALUES = jq6VarArr;
        $ENTRIES = new wg7(jq6VarArr);
    }

    public jq6(String str, int i, String str2) {
        this.key = str2;
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static jq6 valueOf(String str) {
        return (jq6) Enum.valueOf(jq6.class, str);
    }

    public static jq6[] values() {
        return (jq6[]) $VALUES.clone();
    }

    public final String b() {
        return this.key;
    }
}
