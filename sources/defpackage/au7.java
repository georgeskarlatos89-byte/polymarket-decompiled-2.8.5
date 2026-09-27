package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class au7 {
    private static final /* synthetic */ au7[] $VALUES;
    public static final au7 INCOMPATIBLE;
    public static final au7 OVERRIDABLE;
    public static final au7 UNKNOWN;

    /* JADX WARN: Type inference failed for: r0v0, types: [au7, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [au7, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [au7, java.lang.Enum] */
    static {
        ?? r0 = new Enum("OVERRIDABLE", 0);
        OVERRIDABLE = r0;
        ?? r1 = new Enum("INCOMPATIBLE", 1);
        INCOMPATIBLE = r1;
        ?? r2 = new Enum("UNKNOWN", 2);
        UNKNOWN = r2;
        $VALUES = new au7[]{r0, r1, r2};
    }

    public static au7 valueOf(String str) {
        return (au7) Enum.valueOf(au7.class, str);
    }

    public static au7[] values() {
        return (au7[]) $VALUES.clone();
    }
}
