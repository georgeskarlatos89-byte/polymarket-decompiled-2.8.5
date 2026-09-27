package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum gvk {
    MOBILE("MOBILE"),
    WIFI("WIFI"),
    VPN("VPN"),
    BLUETOOTH("Bluetooth Tethering"),
    WIFI_AWARE("WIFI AWARE"),
    LOWPAN("LOW PAN"),
    ETHERNET("Ethernet");

    private final String a;

    gvk(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
