package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class g44 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ g44[] $VALUES;
    public static final g44 ANNOTATION_CLASS;
    public static final g44 CLASS;
    public static final g44 ENUM_CLASS;
    public static final g44 ENUM_ENTRY;
    public static final g44 INTERFACE;
    public static final g44 OBJECT;
    private final String codeRepresentation;

    static {
        g44 g44Var = new g44("CLASS", 0, "class");
        CLASS = g44Var;
        g44 g44Var2 = new g44("INTERFACE", 1, "interface");
        INTERFACE = g44Var2;
        g44 g44Var3 = new g44("ENUM_CLASS", 2, "enum class");
        ENUM_CLASS = g44Var3;
        g44 g44Var4 = new g44("ENUM_ENTRY", 3, null);
        ENUM_ENTRY = g44Var4;
        g44 g44Var5 = new g44("ANNOTATION_CLASS", 4, "annotation class");
        ANNOTATION_CLASS = g44Var5;
        g44 g44Var6 = new g44("OBJECT", 5, "object");
        OBJECT = g44Var6;
        g44[] g44VarArr = {g44Var, g44Var2, g44Var3, g44Var4, g44Var5, g44Var6};
        $VALUES = g44VarArr;
        $ENTRIES = new wg7(g44VarArr);
    }

    public g44(String str, int i, String str2) {
        this.codeRepresentation = str2;
    }

    public static g44 valueOf(String str) {
        return (g44) Enum.valueOf(g44.class, str);
    }

    public static g44[] values() {
        return (g44[]) $VALUES.clone();
    }

    public final boolean a() {
        if (this != OBJECT && this != ENUM_ENTRY) {
            return false;
        }
        return true;
    }
}
