package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class kj7 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ kj7[] $VALUES;
    public static final kj7 CAPTURED_TYPE_SCOPE;
    public static final kj7 ERASED_RECEIVER_TYPE_SCOPE;
    public static final kj7 ERROR_TYPE_SCOPE;
    public static final kj7 INTEGER_LITERAL_TYPE_SCOPE;
    public static final kj7 NON_CLASSIFIER_SUPER_TYPE_SCOPE;
    public static final kj7 SCOPE_FOR_ABBREVIATION_TYPE;
    public static final kj7 SCOPE_FOR_ERROR_CLASS;
    public static final kj7 SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE;
    public static final kj7 STUB_TYPE_SCOPE;
    public static final kj7 UNSUPPORTED_TYPE_SCOPE;
    private final String debugMessage;

    static {
        kj7 kj7Var = new kj7("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");
        CAPTURED_TYPE_SCOPE = kj7Var;
        kj7 kj7Var2 = new kj7("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");
        INTEGER_LITERAL_TYPE_SCOPE = kj7Var2;
        kj7 kj7Var3 = new kj7("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");
        ERASED_RECEIVER_TYPE_SCOPE = kj7Var3;
        kj7 kj7Var4 = new kj7("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");
        SCOPE_FOR_ABBREVIATION_TYPE = kj7Var4;
        kj7 kj7Var5 = new kj7("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");
        STUB_TYPE_SCOPE = kj7Var5;
        kj7 kj7Var6 = new kj7("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");
        NON_CLASSIFIER_SUPER_TYPE_SCOPE = kj7Var6;
        kj7 kj7Var7 = new kj7("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");
        ERROR_TYPE_SCOPE = kj7Var7;
        kj7 kj7Var8 = new kj7("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");
        UNSUPPORTED_TYPE_SCOPE = kj7Var8;
        kj7 kj7Var9 = new kj7("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");
        SCOPE_FOR_ERROR_CLASS = kj7Var9;
        kj7 kj7Var10 = new kj7("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s");
        SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE = kj7Var10;
        kj7[] kj7VarArr = {kj7Var, kj7Var2, kj7Var3, kj7Var4, kj7Var5, kj7Var6, kj7Var7, kj7Var8, kj7Var9, kj7Var10};
        $VALUES = kj7VarArr;
        $ENTRIES = new wg7(kj7VarArr);
    }

    public kj7(String str, int i, String str2) {
        this.debugMessage = str2;
    }

    public static kj7 valueOf(String str) {
        return (kj7) Enum.valueOf(kj7.class, str);
    }

    public static kj7[] values() {
        return (kj7[]) $VALUES.clone();
    }

    public final String a() {
        return this.debugMessage;
    }
}
