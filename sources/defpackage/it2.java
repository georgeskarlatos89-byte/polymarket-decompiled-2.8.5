package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class it2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ it2[] $VALUES;
    public static final it2 DISABLED;
    public static final it2 ENABLED;
    public static final it2 READ_ONLY;
    public static final it2 WRITE_ONLY;
    private final boolean readEnabled;
    private final boolean writeEnabled;

    static {
        it2 it2Var = new it2("ENABLED", 0, true, true);
        ENABLED = it2Var;
        it2 it2Var2 = new it2("READ_ONLY", 1, true, false);
        READ_ONLY = it2Var2;
        it2 it2Var3 = new it2("WRITE_ONLY", 2, false, true);
        WRITE_ONLY = it2Var3;
        it2 it2Var4 = new it2("DISABLED", 3, false, false);
        DISABLED = it2Var4;
        it2[] it2VarArr = {it2Var, it2Var2, it2Var3, it2Var4};
        $VALUES = it2VarArr;
        $ENTRIES = new wg7(it2VarArr);
    }

    public it2(String str, int i, boolean z, boolean z2) {
        this.readEnabled = z;
        this.writeEnabled = z2;
    }

    public static it2 valueOf(String str) {
        return (it2) Enum.valueOf(it2.class, str);
    }

    public static it2[] values() {
        return (it2[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.readEnabled;
    }

    public final boolean b() {
        return this.writeEnabled;
    }
}
