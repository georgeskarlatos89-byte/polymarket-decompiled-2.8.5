package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class cy8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ cy8[] $VALUES;
    public static final cy8 Estimated;
    public static final cy8 Final;
    public static final cy8 NotCurrentlyKnown;
    private final String code;

    static {
        cy8 cy8Var = new cy8("NotCurrentlyKnown", 0, "NOT_CURRENTLY_KNOWN");
        NotCurrentlyKnown = cy8Var;
        cy8 cy8Var2 = new cy8("Estimated", 1, "ESTIMATED");
        Estimated = cy8Var2;
        cy8 cy8Var3 = new cy8("Final", 2, "FINAL");
        Final = cy8Var3;
        cy8[] cy8VarArr = {cy8Var, cy8Var2, cy8Var3};
        $VALUES = cy8VarArr;
        $ENTRIES = new wg7(cy8VarArr);
    }

    public cy8(String str, int i, String str2) {
        this.code = str2;
    }

    public static cy8 valueOf(String str) {
        return (cy8) Enum.valueOf(cy8.class, str);
    }

    public static cy8[] values() {
        return (cy8[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }
}
