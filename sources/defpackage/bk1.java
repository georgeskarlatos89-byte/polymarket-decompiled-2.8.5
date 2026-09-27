package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bk1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ bk1[] $VALUES;
    public static final bk1 GOOGLE_PAY;
    public static final bk1 LOCAL_PAYMENT;
    public static final bk1 PAYPAL;
    public static final bk1 SEPA_DEBIT;
    public static final bk1 THREE_D_SECURE;
    public static final bk1 VENMO;

    @hm6
    public static final bk1 VISA_CHECKOUT;
    private final int code;

    static {
        bk1 bk1Var = new bk1("THREE_D_SECURE", 0, 13487);
        THREE_D_SECURE = bk1Var;
        bk1 bk1Var2 = new bk1("VENMO", 1, 13488);
        VENMO = bk1Var2;
        bk1 bk1Var3 = new bk1("PAYPAL", 2, 13591);
        PAYPAL = bk1Var3;
        bk1 bk1Var4 = new bk1("VISA_CHECKOUT", 3, 13592);
        VISA_CHECKOUT = bk1Var4;
        bk1 bk1Var5 = new bk1("GOOGLE_PAY", 4, 13593);
        GOOGLE_PAY = bk1Var5;
        bk1 bk1Var6 = new bk1("LOCAL_PAYMENT", 5, 13596);
        LOCAL_PAYMENT = bk1Var6;
        bk1 bk1Var7 = new bk1("SEPA_DEBIT", 6, 13597);
        SEPA_DEBIT = bk1Var7;
        bk1[] bk1VarArr = {bk1Var, bk1Var2, bk1Var3, bk1Var4, bk1Var5, bk1Var6, bk1Var7};
        $VALUES = bk1VarArr;
        $ENTRIES = new wg7(bk1VarArr);
    }

    public bk1(String str, int i, int i2) {
        this.code = i2;
    }

    public static bk1 valueOf(String str) {
        return (bk1) Enum.valueOf(bk1.class, str);
    }

    public static bk1[] values() {
        return (bk1[]) $VALUES.clone();
    }

    public final int a() {
        return this.code;
    }
}
