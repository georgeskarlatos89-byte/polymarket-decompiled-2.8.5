package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wz2 {
    private static final /* synthetic */ wz2[] $VALUES;
    public static final wz2 OFF;
    public static final wz2 ON_CONTINUOUS_AUTO;
    public static final wz2 ON_MANUAL_AUTO;
    public static final wz2 UNKNOWN;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wz2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wz2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, wz2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, wz2] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        UNKNOWN = r0;
        ?? r1 = new Enum("OFF", 1);
        OFF = r1;
        ?? r2 = new Enum("ON_MANUAL_AUTO", 2);
        ON_MANUAL_AUTO = r2;
        ?? r3 = new Enum("ON_CONTINUOUS_AUTO", 3);
        ON_CONTINUOUS_AUTO = r3;
        $VALUES = new wz2[]{r0, r1, r2, r3};
    }

    public static wz2 valueOf(String str) {
        return (wz2) Enum.valueOf(wz2.class, str);
    }

    public static wz2[] values() {
        return (wz2[]) $VALUES.clone();
    }
}
