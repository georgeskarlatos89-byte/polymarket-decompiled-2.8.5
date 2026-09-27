package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pm1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ pm1[] $VALUES;
    public static final pm1 D;
    public static final pm1 E;
    public static final pm1 I;
    public static final pm1 V;
    public static final pm1 W;
    private final int logLevel;

    static {
        pm1 pm1Var = new pm1("D", 0, 3);
        D = pm1Var;
        pm1 pm1Var2 = new pm1("I", 1, 4);
        I = pm1Var2;
        pm1 pm1Var3 = new pm1("E", 2, 6);
        E = pm1Var3;
        pm1 pm1Var4 = new pm1("V", 3, 2);
        V = pm1Var4;
        pm1 pm1Var5 = new pm1("W", 4, 5);
        W = pm1Var5;
        pm1[] pm1VarArr = {pm1Var, pm1Var2, pm1Var3, pm1Var4, pm1Var5};
        $VALUES = pm1VarArr;
        $ENTRIES = new wg7(pm1VarArr);
    }

    public pm1(String str, int i, int i2) {
        this.logLevel = i2;
    }

    public static pm1 valueOf(String str) {
        return (pm1) Enum.valueOf(pm1.class, str);
    }

    public static pm1[] values() {
        return (pm1[]) $VALUES.clone();
    }

    public final int a() {
        return this.logLevel;
    }
}
