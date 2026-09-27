package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class wb0 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ wb0[] $VALUES;
    public static final wb0 FIELD;
    public static final wb0 METHOD_RETURN_TYPE;
    public static final wb0 TYPE_PARAMETER;
    public static final wb0 TYPE_PARAMETER_BOUNDS;
    public static final wb0 TYPE_USE;
    public static final wb0 VALUE_PARAMETER;
    private final String javaTarget;

    static {
        wb0 wb0Var = new wb0("METHOD_RETURN_TYPE", 0, "METHOD");
        METHOD_RETURN_TYPE = wb0Var;
        wb0 wb0Var2 = new wb0("VALUE_PARAMETER", 1, "PARAMETER");
        VALUE_PARAMETER = wb0Var2;
        wb0 wb0Var3 = new wb0("FIELD", 2, "FIELD");
        FIELD = wb0Var3;
        wb0 wb0Var4 = new wb0("TYPE_USE", 3, "TYPE_USE");
        TYPE_USE = wb0Var4;
        wb0 wb0Var5 = new wb0("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
        TYPE_PARAMETER_BOUNDS = wb0Var5;
        wb0 wb0Var6 = new wb0("TYPE_PARAMETER", 5, "TYPE_PARAMETER");
        TYPE_PARAMETER = wb0Var6;
        wb0[] wb0VarArr = {wb0Var, wb0Var2, wb0Var3, wb0Var4, wb0Var5, wb0Var6};
        $VALUES = wb0VarArr;
        $ENTRIES = new wg7(wb0VarArr);
    }

    public wb0(String str, int i, String str2) {
        this.javaTarget = str2;
    }

    public static wb0 valueOf(String str) {
        return (wb0) Enum.valueOf(wb0.class, str);
    }

    public static wb0[] values() {
        return (wb0[]) $VALUES.clone();
    }

    public final String a() {
        return this.javaTarget;
    }
}
