package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum xvk {
    AUDIT_JSON_URL("https://c.paypal.com/r/v1/device/mg-audit"),
    DEVICE_INFO_URL("https://c.paypal.com/r/v1/device/client-metadata"),
    PRODUCTION_BEACON_URL("https://b.stats.paypal.com/counter.cgi"),
    PRODUCTION_JSON_URL("https://c.paypal.com/r/v1/device/mg"),
    RAMP_CONFIG_URL("https://www.paypalobjects.com/rdaAssets/magnes/magnes_android_rac.json"),
    REMOTE_CONFIG_URL("https://www.paypalobjects.com/rdaAssets/magnes/magnes_android_rec.json"),
    SANDBOX_DEVICE_INFO_URL("https://c.sandbox.paypal.com/r/v1/device/client-metadata"),
    SANDBOX_AUDIT_JSON_URL("https://c.sandbox.paypal.com/r/v1/device/mg-audit"),
    SANDBOX_PROD_JSON_URL("https://c.sandbox.paypal.com/r/v1/device/mg-audit");

    private final String a;

    xvk(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
