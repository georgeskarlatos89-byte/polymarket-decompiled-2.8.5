package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class fw5 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ fw5[] $VALUES;
    public static final fw5 FRIDAY;
    public static final fw5 MONDAY;
    public static final fw5 SATURDAY;
    public static final fw5 SUNDAY;
    public static final fw5 THURSDAY;
    public static final fw5 TUESDAY;
    public static final fw5 WEDNESDAY;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, fw5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, fw5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, fw5] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, fw5] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, fw5] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, fw5] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, fw5] */
    static {
        ?? r0 = new Enum("MONDAY", 0);
        MONDAY = r0;
        ?? r1 = new Enum("TUESDAY", 1);
        TUESDAY = r1;
        ?? r2 = new Enum("WEDNESDAY", 2);
        WEDNESDAY = r2;
        ?? r3 = new Enum("THURSDAY", 3);
        THURSDAY = r3;
        ?? r4 = new Enum("FRIDAY", 4);
        FRIDAY = r4;
        ?? r5 = new Enum("SATURDAY", 5);
        SATURDAY = r5;
        ?? r6 = new Enum("SUNDAY", 6);
        SUNDAY = r6;
        fw5[] fw5VarArr = {r0, r1, r2, r3, r4, r5, r6};
        $VALUES = fw5VarArr;
        $ENTRIES = new wg7(fw5VarArr);
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static fw5 valueOf(String str) {
        return (fw5) Enum.valueOf(fw5.class, str);
    }

    public static fw5[] values() {
        return (fw5[]) $VALUES.clone();
    }
}
