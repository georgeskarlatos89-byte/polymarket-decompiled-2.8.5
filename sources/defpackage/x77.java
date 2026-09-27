package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class x77 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ x77[] $VALUES;
    public static final x77 CONNECTIONS_FC_LITE_VS_NATIVE;
    public static final x77 CONNECTIONS_FC_LITE_VS_NATIVE_AA;
    public static final x77 LINK_AB_TEST;
    public static final x77 LINK_GLOBAL_HOLD_BACK;
    public static final x77 LINK_GLOBAL_HOLD_BACK_AA;
    public static final x77 OCS_MOBILE_NFC_SCANNING_FEATURE_HOLDBACK;
    public static final x77 OCS_MOBILE_PAYMENT_METHOD_MESSAGING_PROMOTIONS;
    private final String experimentValue;

    static {
        x77 x77Var = new x77("LINK_GLOBAL_HOLD_BACK", 0, "link_global_holdback");
        LINK_GLOBAL_HOLD_BACK = x77Var;
        x77 x77Var2 = new x77("LINK_GLOBAL_HOLD_BACK_AA", 1, "link_global_holdback_aa");
        LINK_GLOBAL_HOLD_BACK_AA = x77Var2;
        x77 x77Var3 = new x77("LINK_AB_TEST", 2, "link_ab_test");
        LINK_AB_TEST = x77Var3;
        x77 x77Var4 = new x77("OCS_MOBILE_NFC_SCANNING_FEATURE_HOLDBACK", 3, "ocs_mobile_nfc_scanning_feature_holdback");
        OCS_MOBILE_NFC_SCANNING_FEATURE_HOLDBACK = x77Var4;
        x77 x77Var5 = new x77("OCS_MOBILE_PAYMENT_METHOD_MESSAGING_PROMOTIONS", 4, "ocs_mobile_payment_method_messaging_promotions");
        OCS_MOBILE_PAYMENT_METHOD_MESSAGING_PROMOTIONS = x77Var5;
        x77 x77Var6 = new x77("CONNECTIONS_FC_LITE_VS_NATIVE", 5, "connections_fc_lite_vs_native");
        CONNECTIONS_FC_LITE_VS_NATIVE = x77Var6;
        x77 x77Var7 = new x77("CONNECTIONS_FC_LITE_VS_NATIVE_AA", 6, "connections_fc_lite_vs_native_aa");
        CONNECTIONS_FC_LITE_VS_NATIVE_AA = x77Var7;
        x77[] x77VarArr = {x77Var, x77Var2, x77Var3, x77Var4, x77Var5, x77Var6, x77Var7};
        $VALUES = x77VarArr;
        $ENTRIES = new wg7(x77VarArr);
    }

    public x77(String str, int i, String str2) {
        this.experimentValue = str2;
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static x77 valueOf(String str) {
        return (x77) Enum.valueOf(x77.class, str);
    }

    public static x77[] values() {
        return (x77[]) $VALUES.clone();
    }

    public final String b() {
        return this.experimentValue;
    }
}
