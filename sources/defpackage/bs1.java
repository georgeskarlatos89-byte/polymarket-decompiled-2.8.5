package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class bs1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ bs1[] $VALUES;
    public static final bs1 Dark;
    public static final bs1 Light;
    private final int value;

    static {
        bs1 bs1Var = new bs1("Dark", 0, 1);
        Dark = bs1Var;
        bs1 bs1Var2 = new bs1("Light", 1, 2);
        Light = bs1Var2;
        bs1[] bs1VarArr = {bs1Var, bs1Var2};
        $VALUES = bs1VarArr;
        $ENTRIES = new wg7(bs1VarArr);
    }

    public bs1(String str, int i, int i2) {
        this.value = i2;
    }

    public static bs1 valueOf(String str) {
        return (bs1) Enum.valueOf(bs1.class, str);
    }

    public static bs1[] values() {
        return (bs1[]) $VALUES.clone();
    }

    public final int a() {
        return this.value;
    }
}
