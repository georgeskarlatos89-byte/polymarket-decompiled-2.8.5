package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class vx8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ vx8[] $VALUES;
    public static final vx8 DISCOUNT;
    public static final vx8 LINE_ITEM;
    public static final vx8 SUBTOTAL;
    public static final vx8 TAX;
    private final String code;

    static {
        vx8 vx8Var = new vx8("LINE_ITEM", 0, "LINE_ITEM");
        LINE_ITEM = vx8Var;
        vx8 vx8Var2 = new vx8("SUBTOTAL", 1, "SUBTOTAL");
        SUBTOTAL = vx8Var2;
        vx8 vx8Var3 = new vx8("TAX", 2, "TAX");
        TAX = vx8Var3;
        vx8 vx8Var4 = new vx8("DISCOUNT", 3, "DISCOUNT");
        DISCOUNT = vx8Var4;
        vx8[] vx8VarArr = {vx8Var, vx8Var2, vx8Var3, vx8Var4};
        $VALUES = vx8VarArr;
        $ENTRIES = new wg7(vx8VarArr);
    }

    public vx8(String str, int i, String str2) {
        this.code = str2;
    }

    public static vx8 valueOf(String str) {
        return (vx8) Enum.valueOf(vx8.class, str);
    }

    public static vx8[] values() {
        return (vx8[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }
}
