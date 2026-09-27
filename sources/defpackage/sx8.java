package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class sx8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ sx8[] $VALUES;
    public static final sx8 Production;
    public static final sx8 Test;
    private final int value;

    static {
        sx8 sx8Var = new sx8("Production", 0, 1);
        Production = sx8Var;
        sx8 sx8Var2 = new sx8("Test", 1, 3);
        Test = sx8Var2;
        sx8[] sx8VarArr = {sx8Var, sx8Var2};
        $VALUES = sx8VarArr;
        $ENTRIES = new wg7(sx8VarArr);
    }

    public sx8(String str, int i, int i2) {
        this.value = i2;
    }

    public static sx8 valueOf(String str) {
        return (sx8) Enum.valueOf(sx8.class, str);
    }

    public static sx8[] values() {
        return (sx8[]) $VALUES.clone();
    }

    public final int a() {
        return this.value;
    }
}
