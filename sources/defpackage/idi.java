package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class idi {
    private static final /* synthetic */ idi[] $VALUES;
    public static final idi WITHOUT_FEATURE_COMBO;
    public static final idi WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT;
    public static final idi WITH_FEATURE_COMBO;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, idi] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, idi] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, idi] */
    static {
        ?? r0 = new Enum("WITHOUT_FEATURE_COMBO", 0);
        WITHOUT_FEATURE_COMBO = r0;
        ?? r1 = new Enum("WITH_FEATURE_COMBO", 1);
        WITH_FEATURE_COMBO = r1;
        ?? r2 = new Enum("WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT", 2);
        WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT = r2;
        $VALUES = new idi[]{r0, r1, r2};
    }

    public static idi valueOf(String str) {
        return (idi) Enum.valueOf(idi.class, str);
    }

    public static idi[] values() {
        return (idi[]) $VALUES.clone();
    }
}
