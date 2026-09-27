package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum cwk {
    KNOWN_ROOT_APPS_PACKAGES("com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk"),
    SU_PATHS("/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/system/xbin/daemonsu/", "/system/etc/init.d/99SuperSUDaemon/", "/system/bin/.ext/.su/", "/system/etc/.has_su_daemon/", "/system/etc/.installed_su_daemon/", "/cache/", "/data/", "/dev/");

    private final String[] a;

    cwk(String... strArr) {
        this.a = strArr;
    }

    public final String[] a() {
        return this.a;
    }
}
