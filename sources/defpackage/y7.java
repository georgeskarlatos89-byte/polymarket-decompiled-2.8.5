package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class y7 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ y7[] $VALUES;
    public static final y7 AmericanExpress;
    public static final y7 CartesBancaires;
    public static final y7 DinersClub;
    public static final y7 Discover;
    public static final y7 JCB;
    public static final y7 Mastercard;
    public static final y7 UnionPay;
    public static final y7 Visa;
    private final r43 brand;
    private final String brandName;

    static {
        y7 y7Var = new y7("Visa", 0, "VISA", r43.Visa);
        Visa = y7Var;
        y7 y7Var2 = new y7("Mastercard", 1, "MASTERCARD", r43.MasterCard);
        Mastercard = y7Var2;
        y7 y7Var3 = new y7("AmericanExpress", 2, "AMERICAN_EXPRESS", r43.AmericanExpress);
        AmericanExpress = y7Var3;
        y7 y7Var4 = new y7("JCB", 3, "JCB", r43.JCB);
        JCB = y7Var4;
        y7 y7Var5 = new y7("DinersClub", 4, "DINERS_CLUB", r43.DinersClub);
        DinersClub = y7Var5;
        y7 y7Var6 = new y7("Discover", 5, "DISCOVER", r43.Discover);
        Discover = y7Var6;
        y7 y7Var7 = new y7("UnionPay", 6, "UNIONPAY", r43.UnionPay);
        UnionPay = y7Var7;
        y7 y7Var8 = new y7("CartesBancaires", 7, "CARTES_BANCAIRES", r43.CartesBancaires);
        CartesBancaires = y7Var8;
        y7[] y7VarArr = {y7Var, y7Var2, y7Var3, y7Var4, y7Var5, y7Var6, y7Var7, y7Var8};
        $VALUES = y7VarArr;
        $ENTRIES = new wg7(y7VarArr);
    }

    public y7(String str, int i, String str2, r43 r43Var) {
        this.brandName = str2;
        this.brand = r43Var;
    }

    public static ug7 c() {
        return $ENTRIES;
    }

    public static y7 valueOf(String str) {
        return (y7) Enum.valueOf(y7.class, str);
    }

    public static y7[] values() {
        return (y7[]) $VALUES.clone();
    }

    public final r43 a() {
        return this.brand;
    }

    public final String b() {
        return this.brandName;
    }
}
