package defpackage;

import com.polymarket.android.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ek1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ek1[] $VALUES;
    public static final ek1 Amex;
    public static final ek1 CartesBancaires;
    public static final dk1 Companion;
    public static final ek1 Discover;
    public static final ek1 Mastercard;
    public static final ek1 UnionPay;
    public static final ek1 Unknown;
    public static final ek1 Visa;
    private final String directoryServerName;
    private final int drawableResId;
    private final Integer nameResId;
    private final boolean shouldStretch;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, dk1] */
    static {
        ek1 ek1Var = new ek1("Visa", 0, "visa", R.drawable.stripe_3ds2_ic_visa, Integer.valueOf(R.string.stripe_3ds2_brand_visa), false);
        Visa = ek1Var;
        ek1 ek1Var2 = new ek1("Mastercard", 1, "mastercard", R.drawable.stripe_3ds2_ic_mastercard, Integer.valueOf(R.string.stripe_3ds2_brand_mastercard), false);
        Mastercard = ek1Var2;
        ek1 ek1Var3 = new ek1("Amex", 2, "american_express", R.drawable.stripe_3ds2_ic_amex, Integer.valueOf(R.string.stripe_3ds2_brand_amex), false);
        Amex = ek1Var3;
        ek1 ek1Var4 = new ek1("Discover", 3, "discover", R.drawable.stripe_3ds2_ic_discover, Integer.valueOf(R.string.stripe_3ds2_brand_discover), false);
        Discover = ek1Var4;
        ek1 ek1Var5 = new ek1("CartesBancaires", 4, "cartes_bancaires", R.drawable.stripe_3ds2_ic_cartesbancaires, Integer.valueOf(R.string.stripe_3ds2_brand_cartesbancaires), true);
        CartesBancaires = ek1Var5;
        ek1 ek1Var6 = new ek1("UnionPay", 5, "unionpay", R.drawable.stripe_3ds2_ic_unionpay, Integer.valueOf(R.string.stripe_3ds2_brand_unionpay), false);
        UnionPay = ek1Var6;
        ek1 ek1Var7 = new ek1("Unknown", 6, "unknown", R.drawable.stripe_3ds2_ic_unknown, null, false);
        Unknown = ek1Var7;
        ek1[] ek1VarArr = {ek1Var, ek1Var2, ek1Var3, ek1Var4, ek1Var5, ek1Var6, ek1Var7};
        $VALUES = ek1VarArr;
        $ENTRIES = new wg7(ek1VarArr);
        Companion = new Object();
    }

    public ek1(String str, int i, String str2, int i2, Integer num, boolean z) {
        this.directoryServerName = str2;
        this.drawableResId = i2;
        this.nameResId = num;
        this.shouldStretch = z;
    }

    public static ug7 c() {
        return $ENTRIES;
    }

    public static ek1 valueOf(String str) {
        return (ek1) Enum.valueOf(ek1.class, str);
    }

    public static ek1[] values() {
        return (ek1[]) $VALUES.clone();
    }

    public final String a() {
        return this.directoryServerName;
    }

    public final int b() {
        return this.drawableResId;
    }

    public final Integer d() {
        return this.nameResId;
    }

    public final boolean e() {
        return this.shouldStretch;
    }
}
