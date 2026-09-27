package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cx5 {
    public static final cx5 InvalidCustomerData;
    public static final cx5 InvalidPaymentSessionData;
    public static final cx5 MerchantMisconfiguration;
    public static final cx5 NotEnoughFunds;
    public static final cx5 TryAgain;
    private static final /* synthetic */ cx5[] b;
    private static final /* synthetic */ ug7 c;
    private final String a;

    static {
        cx5 cx5Var = new cx5("NotEnoughFunds", 0, "not_enough_funds");
        NotEnoughFunds = cx5Var;
        cx5 cx5Var2 = new cx5("InvalidPaymentSessionData", 1, "invalid_payment_session_data");
        InvalidPaymentSessionData = cx5Var2;
        cx5 cx5Var3 = new cx5("InvalidCustomerData", 2, "invalid_customer_data");
        InvalidCustomerData = cx5Var3;
        cx5 cx5Var4 = new cx5("MerchantMisconfiguration", 3, "merchant_misconfiguration");
        MerchantMisconfiguration = cx5Var4;
        cx5 cx5Var5 = new cx5("TryAgain", 4, "try_again");
        TryAgain = cx5Var5;
        cx5[] cx5VarArr = {cx5Var, cx5Var2, cx5Var3, cx5Var4, cx5Var5};
        b = cx5VarArr;
        c = new wg7(cx5VarArr);
    }

    public cx5(String str, int i, String str2) {
        this.a = str2;
    }

    public static ug7 a() {
        return c;
    }

    public static cx5 valueOf(String str) {
        return (cx5) Enum.valueOf(cx5.class, str);
    }

    public static cx5[] values() {
        return (cx5[]) b.clone();
    }

    public final String b() {
        return this.a;
    }
}
