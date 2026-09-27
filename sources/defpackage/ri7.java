package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ri7 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ri7[] $VALUES;
    public static final ri7 ERROR_CLASS;
    public static final ri7 ERROR_FUNCTION;
    public static final ri7 ERROR_MODULE;
    public static final ri7 ERROR_PROPERTY;
    public static final ri7 ERROR_SCOPE;
    public static final ri7 ERROR_TYPE;
    public static final ri7 PARENT_OF_ERROR_SCOPE;
    private final String debugText;

    static {
        ri7 ri7Var = new ri7("ERROR_CLASS", 0, "<Error class: %s>");
        ERROR_CLASS = ri7Var;
        ri7 ri7Var2 = new ri7("ERROR_FUNCTION", 1, "<Error function>");
        ERROR_FUNCTION = ri7Var2;
        ri7 ri7Var3 = new ri7("ERROR_SCOPE", 2, "<Error scope>");
        ERROR_SCOPE = ri7Var3;
        ri7 ri7Var4 = new ri7("ERROR_MODULE", 3, "<Error module>");
        ERROR_MODULE = ri7Var4;
        ri7 ri7Var5 = new ri7("ERROR_PROPERTY", 4, "<Error property>");
        ERROR_PROPERTY = ri7Var5;
        ri7 ri7Var6 = new ri7("ERROR_TYPE", 5, "[Error type: %s]");
        ERROR_TYPE = ri7Var6;
        ri7 ri7Var7 = new ri7("PARENT_OF_ERROR_SCOPE", 6, "<Fake parent for error lexical scope>");
        PARENT_OF_ERROR_SCOPE = ri7Var7;
        ri7[] ri7VarArr = {ri7Var, ri7Var2, ri7Var3, ri7Var4, ri7Var5, ri7Var6, ri7Var7};
        $VALUES = ri7VarArr;
        $ENTRIES = new wg7(ri7VarArr);
    }

    public ri7(String str, int i, String str2) {
        this.debugText = str2;
    }

    public static ri7 valueOf(String str) {
        return (ri7) Enum.valueOf(ri7.class, str);
    }

    public static ri7[] values() {
        return (ri7[]) $VALUES.clone();
    }

    public final String a() {
        return this.debugText;
    }
}
