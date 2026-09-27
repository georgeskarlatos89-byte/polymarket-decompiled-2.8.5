package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vs4 {
    private static final /* synthetic */ vs4[] $VALUES;
    public static final vs4 ALWAYS_OVERRIDE;
    public static final vs4 HIGH_PRIORITY_REQUIRED;
    public static final vs4 OPTIONAL;
    public static final vs4 REQUIRED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vs4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vs4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, vs4] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, vs4] */
    static {
        ?? r0 = new Enum("ALWAYS_OVERRIDE", 0);
        ALWAYS_OVERRIDE = r0;
        ?? r1 = new Enum("HIGH_PRIORITY_REQUIRED", 1);
        HIGH_PRIORITY_REQUIRED = r1;
        ?? r2 = new Enum("REQUIRED", 2);
        REQUIRED = r2;
        ?? r3 = new Enum("OPTIONAL", 3);
        OPTIONAL = r3;
        $VALUES = new vs4[]{r0, r1, r2, r3};
    }

    public static vs4 valueOf(String str) {
        return (vs4) Enum.valueOf(vs4.class, str);
    }

    public static vs4[] values() {
        return (vs4[]) $VALUES.clone();
    }
}
