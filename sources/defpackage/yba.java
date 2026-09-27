package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class yba {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ yba[] $VALUES;
    public static final yba FLEXIBLE_LOWER_BOUND;
    public static final yba FLEXIBLE_UPPER_BOUND;
    public static final yba INFLEXIBLE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, yba] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, yba] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, yba] */
    static {
        ?? r0 = new Enum("INFLEXIBLE", 0);
        INFLEXIBLE = r0;
        ?? r1 = new Enum("FLEXIBLE_UPPER_BOUND", 1);
        FLEXIBLE_UPPER_BOUND = r1;
        ?? r2 = new Enum("FLEXIBLE_LOWER_BOUND", 2);
        FLEXIBLE_LOWER_BOUND = r2;
        yba[] ybaVarArr = {r0, r1, r2};
        $VALUES = ybaVarArr;
        $ENTRIES = new wg7(ybaVarArr);
    }

    public static yba valueOf(String str) {
        return (yba) Enum.valueOf(yba.class, str);
    }

    public static yba[] values() {
        return (yba[]) $VALUES.clone();
    }
}
