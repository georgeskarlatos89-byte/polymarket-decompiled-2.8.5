package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class f44 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ f44[] $VALUES;
    public static final f44 ANNOTATION_CLASS;
    public static final f44 CLASS;
    public static final f44 COMPANION_OBJECT;
    public static final f44 ENUM_CLASS;
    public static final f44 ENUM_ENTRY;
    public static final f44 INTERFACE;
    public static final f44 OBJECT;
    private final d78 flag;

    static {
        f44 f44Var = new f44("CLASS", 0, 0);
        CLASS = f44Var;
        f44 f44Var2 = new f44("INTERFACE", 1, 1);
        INTERFACE = f44Var2;
        f44 f44Var3 = new f44("ENUM_CLASS", 2, 2);
        ENUM_CLASS = f44Var3;
        f44 f44Var4 = new f44("ENUM_ENTRY", 3, 3);
        ENUM_ENTRY = f44Var4;
        f44 f44Var5 = new f44("ANNOTATION_CLASS", 4, 4);
        ANNOTATION_CLASS = f44Var5;
        f44 f44Var6 = new f44("OBJECT", 5, 5);
        OBJECT = f44Var6;
        f44 f44Var7 = new f44("COMPANION_OBJECT", 6, 6);
        COMPANION_OBJECT = f44Var7;
        f44[] f44VarArr = {f44Var, f44Var2, f44Var3, f44Var4, f44Var5, f44Var6, f44Var7};
        $VALUES = f44VarArr;
        $ENTRIES = new wg7(f44VarArr);
    }

    public f44(String str, int i, int i2) {
        h78 h78Var = j78.f;
        h78Var.getClass();
        this.flag = new d78(h78Var, i2);
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static f44 valueOf(String str) {
        return (f44) Enum.valueOf(f44.class, str);
    }

    public static f44[] values() {
        return (f44[]) $VALUES.clone();
    }

    public final d78 b() {
        return this.flag;
    }
}
