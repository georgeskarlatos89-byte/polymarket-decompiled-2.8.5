package defpackage;

import io.getstream.chat.android.models.MessageType;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum pvk {
    ANDROID_ID("android_id"),
    APP_FIRST_INSTALL_TIME("app_first_install_time"),
    APP_GUID("app_guid"),
    APP_ID("app_id"),
    APP_LAST_UPDATE_TIME("app_last_update_time"),
    APP_VERSION("app_version"),
    COMP_VERSION("comp_version"),
    CONF_URL("conf_url"),
    CPU("cpu"),
    DEVICE_MODEL("device_model"),
    DEVICE_NAME("device_name"),
    DISK("disk"),
    EMULATOR_FLAGS("ef"),
    GSF_ID("gsf_id"),
    IN_TREATMENT("t"),
    IS_EMULATOR("is_emulator"),
    IS_ROOTED("is_rooted"),
    MAC_ADDRS("mac_addrs"),
    MAGNES_GUID("magnes_guid"),
    MAGNES_SOURCE("magnes_source"),
    NOT_COLLECTIBLE_LIST("nc"),
    NOTIF_TOKEN("notif_token"),
    OS_TYPE("os_type"),
    OS_VERSION("os_version"),
    PAYLOAD_TYPE("payload_type"),
    ROOTED_FLAGS("rf"),
    SCREEN("screen"),
    SENSOR_METADATA("smd"),
    SMS_ENABLED("sms_enabled"),
    SOURCE_APP_VERSION("source_app_version"),
    SYSTEM(MessageType.SYSTEM),
    T("t"),
    TOTAL_STORAGE_SPACE("total_storage_space"),
    USER_AGENT("user_agent");

    private final String a;

    pvk(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
