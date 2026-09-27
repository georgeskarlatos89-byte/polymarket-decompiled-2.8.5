package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class nb0 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ nb0[] $VALUES;
    public static final nb0 ALWAYS_PARENTHESIZED;
    public static final nb0 NO_ARGUMENTS;
    public static final nb0 UNLESS_EMPTY;
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;

    static {
        nb0 nb0Var = new nb0("NO_ARGUMENTS", 0, 3);
        NO_ARGUMENTS = nb0Var;
        nb0 nb0Var2 = new nb0("UNLESS_EMPTY", 1, 2);
        UNLESS_EMPTY = nb0Var2;
        nb0 nb0Var3 = new nb0("ALWAYS_PARENTHESIZED", 2, true, true);
        ALWAYS_PARENTHESIZED = nb0Var3;
        nb0[] nb0VarArr = {nb0Var, nb0Var2, nb0Var3};
        $VALUES = nb0VarArr;
        $ENTRIES = new wg7(nb0VarArr);
    }

    public /* synthetic */ nb0(String str, int i, int i2) {
        this(str, i, (i2 & 1) == 0, false);
    }

    public static nb0 valueOf(String str) {
        return (nb0) Enum.valueOf(nb0.class, str);
    }

    public static nb0[] values() {
        return (nb0[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.includeAnnotationArguments;
    }

    public final boolean b() {
        return this.includeEmptyAnnotationArguments;
    }

    public nb0(String str, int i, boolean z, boolean z2) {
        this.includeAnnotationArguments = z;
        this.includeEmptyAnnotationArguments = z2;
    }
}
