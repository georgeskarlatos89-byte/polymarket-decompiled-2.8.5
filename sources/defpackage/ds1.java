package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ds1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ds1[] $VALUES;
    public static final ds1 Book;
    public static final ds1 Buy;
    public static final ds1 Checkout;
    public static final ds1 Donate;
    public static final ds1 Order;
    public static final ds1 Pay;
    public static final ds1 Plain;
    public static final ds1 Subscribe;
    private final int value;

    static {
        ds1 ds1Var = new ds1("Book", 0, 2);
        Book = ds1Var;
        ds1 ds1Var2 = new ds1("Buy", 1, 1);
        Buy = ds1Var2;
        ds1 ds1Var3 = new ds1("Checkout", 2, 3);
        Checkout = ds1Var3;
        ds1 ds1Var4 = new ds1("Donate", 3, 4);
        Donate = ds1Var4;
        ds1 ds1Var5 = new ds1("Order", 4, 5);
        Order = ds1Var5;
        ds1 ds1Var6 = new ds1("Pay", 5, 6);
        Pay = ds1Var6;
        ds1 ds1Var7 = new ds1("Plain", 6, 8);
        Plain = ds1Var7;
        ds1 ds1Var8 = new ds1("Subscribe", 7, 7);
        Subscribe = ds1Var8;
        ds1[] ds1VarArr = {ds1Var, ds1Var2, ds1Var3, ds1Var4, ds1Var5, ds1Var6, ds1Var7, ds1Var8};
        $VALUES = ds1VarArr;
        $ENTRIES = new wg7(ds1VarArr);
    }

    public ds1(String str, int i, int i2) {
        this.value = i2;
    }

    public static ds1 valueOf(String str) {
        return (ds1) Enum.valueOf(ds1.class, str);
    }

    public static ds1[] values() {
        return (ds1[]) $VALUES.clone();
    }

    public final int a() {
        return this.value;
    }
}
