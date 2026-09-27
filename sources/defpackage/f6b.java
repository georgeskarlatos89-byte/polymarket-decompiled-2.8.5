package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum f6b {
    ERROR("ERROR", "ERROR"),
    WARN("WARN", "WARN"),
    INFO("INFO", "INFO"),
    DEBUG("DEBUG", "DEBUG"),
    TRACE("TRACE", "TRACE");

    private final int levelInt;
    private final String levelStr;

    f6b(String str, String str2) {
        this.levelInt = r2;
        this.levelStr = str2;
    }

    public final int a() {
        return this.levelInt;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.levelStr;
    }
}
