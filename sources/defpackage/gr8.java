package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gr8 {
    private static final /* synthetic */ gr8[] $VALUES;
    public static final gr8 DEFAULT;
    public static final gr8 UNKNOWN;
    public static final gr8 YUV;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, gr8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, gr8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, gr8] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        UNKNOWN = r0;
        ?? r1 = new Enum("DEFAULT", 1);
        DEFAULT = r1;
        ?? r2 = new Enum("YUV", 2);
        YUV = r2;
        $VALUES = new gr8[]{r0, r1, r2};
    }

    public static gr8 valueOf(String str) {
        return (gr8) Enum.valueOf(gr8.class, str);
    }

    public static gr8[] values() {
        return (gr8[]) $VALUES.clone();
    }
}
