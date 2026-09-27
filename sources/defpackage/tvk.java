package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum tvk {
    BASE_STATION_ID("base_station_id"),
    BATTERY("battery"),
    BSSID("bssid"),
    BSSID_ARRAY("bssid_array"),
    C("c"),
    CDMA_NETWORK_ID("cdma_network_id"),
    CDMA_SYSTEM_ID("cdma_system_id"),
    CELL_ID("cell_id"),
    CONF_VERSION("conf_version"),
    CONN_TYPE("conn_type"),
    DC_ID("dc_id"),
    DEVICE_ID("device_id"),
    DEVICE_UPTIME("device_uptime"),
    DISK("disk"),
    DS("ds"),
    IP_ADDRESSES("ip_addresses"),
    IP_ADDRS("ip_addrs"),
    IS_DEV_MODE_ON("dmo"),
    KNOWN_APPS("known_apps"),
    LINKER_ID("linker_id"),
    LOCALE_COUNTRY("locale_country"),
    LOCALE_LANG("locale_lang"),
    LOCATION("location"),
    LOCATION_AREA_CODE("location_area_code"),
    MEMORY("memory"),
    MG_ID("mg_id"),
    NETWORK_OPERATOR("network_operator"),
    PHONE_TYPE("phone_type"),
    PL("pl"),
    PROXY_SETTING("proxy_setting"),
    RISK_COMP_SESSION_ID("risk_comp_session_id"),
    ROAMING("roaming"),
    SCREEN("screen"),
    SERIAL_NUMBER("serial_number"),
    SIM_OPERATOR_NAME("sim_operator_name"),
    SIM_SERIAL_NUMBER("sim_serial_number"),
    SR("sr"),
    SSID("ssid"),
    SUBSCRIBER_ID("subscriber_id"),
    T("t"),
    TIMESTAMP("timestamp"),
    TZ("tz"),
    TZ_NAME("tz_name"),
    VPN_SETTING("VPN_setting");

    private final String a;

    tvk(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
