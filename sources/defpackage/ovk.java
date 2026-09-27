package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum ovk {
    VERSION("version"),
    BOARD("board"),
    BOOTLOADER("bootloader"),
    CPU_ABI1("cpu_abi1"),
    DISPLAY("display"),
    RADIO("radio"),
    FINGERPRINT("fingerprint"),
    HARDWARE("hardware"),
    MANUFACTURER("manufacturer"),
    PRODUCT("product"),
    TIME("time"),
    SYSTEM_TYPE("system_type");

    private final String a;

    ovk(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
