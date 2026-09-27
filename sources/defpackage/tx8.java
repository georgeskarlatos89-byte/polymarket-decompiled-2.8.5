package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class tx8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ tx8[] $VALUES;
    public static final tx8 Full;
    public static final tx8 Min;
    private final String code;

    static {
        tx8 tx8Var = new tx8("Min", 0, "MIN");
        Min = tx8Var;
        tx8 tx8Var2 = new tx8("Full", 1, "FULL");
        Full = tx8Var2;
        tx8[] tx8VarArr = {tx8Var, tx8Var2};
        $VALUES = tx8VarArr;
        $ENTRIES = new wg7(tx8VarArr);
    }

    public tx8(String str, int i, String str2) {
        this.code = str2;
    }

    public static tx8 valueOf(String str) {
        return (tx8) Enum.valueOf(tx8.class, str);
    }

    public static tx8[] values() {
        return (tx8[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }
}
