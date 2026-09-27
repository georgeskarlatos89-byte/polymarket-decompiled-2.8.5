package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class dj5 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ dj5[] $VALUES;
    public static final dj5 AddPaymentMethod;
    public static final dj5 EditPaymentMethod;
    public static final dj5 SelectPaymentMethod;
    private final String value;

    static {
        dj5 dj5Var = new dj5("AddPaymentMethod", 0, "add_payment_method");
        AddPaymentMethod = dj5Var;
        dj5 dj5Var2 = new dj5("SelectPaymentMethod", 1, "select_payment_method");
        SelectPaymentMethod = dj5Var2;
        dj5 dj5Var3 = new dj5("EditPaymentMethod", 2, "edit_payment_method");
        EditPaymentMethod = dj5Var3;
        dj5[] dj5VarArr = {dj5Var, dj5Var2, dj5Var3};
        $VALUES = dj5VarArr;
        $ENTRIES = new wg7(dj5VarArr);
    }

    public dj5(String str, int i, String str2) {
        this.value = str2;
    }

    public static dj5 valueOf(String str) {
        return (dj5) Enum.valueOf(dj5.class, str);
    }

    public static dj5[] values() {
        return (dj5[]) $VALUES.clone();
    }
}
