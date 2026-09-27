package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ze6 implements cmi {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ze6[] $VALUES;
    public static final ze6 CardBrandNotSupportedByMerchant;
    public static final ze6 FailureFromMerchantCardPresentCallback;
    public static final ze6 NoCardPresentCallbackFailure;
    public static final ze6 NoCustomer;
    private final String value;

    static {
        ze6 ze6Var = new ze6("NoCustomer", 0, "noCustomer");
        NoCustomer = ze6Var;
        ze6 ze6Var2 = new ze6("NoCardPresentCallbackFailure", 1, "noCardPresentCallbackFailure");
        NoCardPresentCallbackFailure = ze6Var2;
        ze6 ze6Var3 = new ze6("FailureFromMerchantCardPresentCallback", 2, "failureFromMerchantCardPresentCallback");
        FailureFromMerchantCardPresentCallback = ze6Var3;
        ze6 ze6Var4 = new ze6("CardBrandNotSupportedByMerchant", 3, "cardBrandNotSupportedByMerchant");
        CardBrandNotSupportedByMerchant = ze6Var4;
        ze6[] ze6VarArr = {ze6Var, ze6Var2, ze6Var3, ze6Var4};
        $VALUES = ze6VarArr;
        $ENTRIES = new wg7(ze6VarArr);
    }

    public ze6(String str, int i, String str2) {
        this.value = str2;
    }

    public static ze6 valueOf(String str) {
        return (ze6) Enum.valueOf(ze6.class, str);
    }

    public static ze6[] values() {
        return (ze6[]) $VALUES.clone();
    }

    @Override // defpackage.cmi
    public final String getValue() {
        return this.value;
    }
}
