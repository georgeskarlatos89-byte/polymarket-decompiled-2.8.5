package defpackage;

import io.ably.lib.transport.Defaults;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum nvk {
    FIFO_MAX_EVENT_COUNT("mec"),
    MAX_RANGE("mr"),
    NAME("n"),
    POWER("pwr"),
    RESOLUTION("re"),
    VENDOR(Defaults.ABLY_PROTOCOL_VERSION_PARAM),
    VERSION("ver");

    private final String a;

    nvk(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
