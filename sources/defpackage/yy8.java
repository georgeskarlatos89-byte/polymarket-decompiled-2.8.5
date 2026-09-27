package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class yy8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ yy8[] $VALUES;
    public static final yy8 Full;
    public static final yy8 Min;
    private final String code;

    static {
        yy8 yy8Var = new yy8("Min", 0, "MIN");
        Min = yy8Var;
        yy8 yy8Var2 = new yy8("Full", 1, "FULL");
        Full = yy8Var2;
        yy8[] yy8VarArr = {yy8Var, yy8Var2};
        $VALUES = yy8VarArr;
        $ENTRIES = new wg7(yy8VarArr);
    }

    public yy8(String str, int i, String str2) {
        this.code = str2;
    }

    public static yy8 valueOf(String str) {
        return (yy8) Enum.valueOf(yy8.class, str);
    }

    public static yy8[] values() {
        return (yy8[]) $VALUES.clone();
    }
}
