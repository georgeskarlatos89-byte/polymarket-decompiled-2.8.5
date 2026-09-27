package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jt2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ jt2[] $VALUES;
    public static final jt2 DISABLED;
    public static final jt2 ENABLED;
    public static final jt2 READ_ONLY;
    public static final jt2 WRITE_ONLY;
    private final boolean readEnabled;
    private final boolean writeEnabled;

    static {
        jt2 jt2Var = new jt2("ENABLED", 0, true, true);
        ENABLED = jt2Var;
        jt2 jt2Var2 = new jt2("READ_ONLY", 1, true, false);
        READ_ONLY = jt2Var2;
        jt2 jt2Var3 = new jt2("WRITE_ONLY", 2, false, true);
        WRITE_ONLY = jt2Var3;
        jt2 jt2Var4 = new jt2("DISABLED", 3, false, false);
        DISABLED = jt2Var4;
        jt2[] jt2VarArr = {jt2Var, jt2Var2, jt2Var3, jt2Var4};
        $VALUES = jt2VarArr;
        $ENTRIES = new wg7(jt2VarArr);
    }

    public jt2(String str, int i, boolean z, boolean z2) {
        this.readEnabled = z;
        this.writeEnabled = z2;
    }

    public static jt2 valueOf(String str) {
        return (jt2) Enum.valueOf(jt2.class, str);
    }

    public static jt2[] values() {
        return (jt2[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.readEnabled;
    }

    public final boolean b() {
        return this.writeEnabled;
    }
}
