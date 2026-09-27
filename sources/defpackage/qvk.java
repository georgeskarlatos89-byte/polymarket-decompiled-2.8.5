package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum qvk {
    CURRENT("current"),
    LEVEL("level"),
    METHOD("method"),
    LOW_POWER("low_power"),
    STATE("state"),
    TEMP("temp"),
    VOLTAGE("voltage");

    private final String a;

    qvk(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
