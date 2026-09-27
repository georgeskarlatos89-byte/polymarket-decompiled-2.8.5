package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class fy8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ fy8[] $VALUES;
    public static final fy8 Full;
    public static final fy8 Min;
    private final String code;

    static {
        fy8 fy8Var = new fy8("Min", 0, "MIN");
        Min = fy8Var;
        fy8 fy8Var2 = new fy8("Full", 1, "FULL");
        Full = fy8Var2;
        fy8[] fy8VarArr = {fy8Var, fy8Var2};
        $VALUES = fy8VarArr;
        $ENTRIES = new wg7(fy8VarArr);
    }

    public fy8(String str, int i, String str2) {
        this.code = str2;
    }

    public static fy8 valueOf(String str) {
        return (fy8) Enum.valueOf(fy8.class, str);
    }

    public static fy8[] values() {
        return (fy8[]) $VALUES.clone();
    }
}
