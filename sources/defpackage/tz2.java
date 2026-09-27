package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tz2 {
    private static final /* synthetic */ tz2[] $VALUES;
    public static final tz2 ERROR;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, tz2] */
    static {
        ?? r0 = new Enum("ERROR", 0);
        ERROR = r0;
        $VALUES = new tz2[]{r0};
    }

    public static tz2 valueOf(String str) {
        return (tz2) Enum.valueOf(tz2.class, str);
    }

    public static tz2[] values() {
        return (tz2[]) $VALUES.clone();
    }
}
