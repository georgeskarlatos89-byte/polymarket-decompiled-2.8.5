package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum zvk {
    CONF_VERSION("conf_version"),
    CONF_ENDPOINT_URL("endpoint_url"),
    CONF_REFRESH_TIME_KEY("conf_refresh_time_interval"),
    ANDROID_APPS_TO_CHECK("android_apps_to_check"),
    NOT_COLLECTABLE("nc"),
    MG_ID("m"),
    CALLBACK_TIMEOUT("cbt"),
    SENSOR_COLLECT_TIME("s");

    private final String a;

    zvk(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
