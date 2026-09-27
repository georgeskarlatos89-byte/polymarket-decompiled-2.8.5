package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class z77 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ z77[] $VALUES;
    public static final z77 ELEMENTS_DISABLE_FC_LITE;
    public static final z77 ELEMENTS_DISABLE_LINK_GLOBAL_HOLDBACK_LOOKUP;
    public static final z77 ELEMENTS_ENABLE_LINK_SPM;
    public static final z77 ELEMENTS_ENABLE_PASSIVE_CAPTCHA;
    public static final z77 ELEMENTS_MOBILE_ALLOW_STRIPECARDSCAN;
    public static final z77 ELEMENTS_MOBILE_ANDROID_NFC_SCANNING_ENABLED;
    public static final z77 ELEMENTS_MOBILE_ANDROID_TAP_TO_ADD_ENABLED;
    public static final z77 ELEMENTS_MOBILE_ATTEST_ON_INTENT_CONFIRMATION;
    public static final z77 ELEMENTS_MOBILE_CARDSCAN_DISABLE_SSDOCR;
    public static final z77 ELEMENTS_MOBILE_CARDSCAN_USE_MLKIT;
    public static final z77 ELEMENTS_MOBILE_CARD_FUND_FILTERING;
    public static final z77 ELEMENTS_MOBILE_FORCE_SETUP_FUTURE_USE_BEHAVIOR_AND_NEW_MANDATE_TEXT;
    public static final z77 ELEMENTS_MOBILE_FORCE_VERTICAL_PAYMENT_METHOD_LAYOUT;
    public static final z77 ELEMENTS_MOBILE_LINK_INLINE_SIGNUP_WITH_SAVED_PM_ENABLED;
    public static final z77 ELEMENTS_PREFER_FC_LITE;
    public static final z77 OCS_MOBILE_SHOULD_USE_AUTOCOMPLETE_PROXY_ENDPOINTS;
    private final String flagValue;

    static {
        z77 z77Var = new z77("ELEMENTS_DISABLE_FC_LITE", 0, "elements_disable_fc_lite");
        ELEMENTS_DISABLE_FC_LITE = z77Var;
        z77 z77Var2 = new z77("ELEMENTS_PREFER_FC_LITE", 1, "elements_prefer_fc_lite");
        ELEMENTS_PREFER_FC_LITE = z77Var2;
        z77 z77Var3 = new z77("ELEMENTS_DISABLE_LINK_GLOBAL_HOLDBACK_LOOKUP", 2, "elements_disable_link_global_holdback_lookup");
        ELEMENTS_DISABLE_LINK_GLOBAL_HOLDBACK_LOOKUP = z77Var3;
        z77 z77Var4 = new z77("ELEMENTS_ENABLE_LINK_SPM", 3, "elements_enable_link_spm");
        ELEMENTS_ENABLE_LINK_SPM = z77Var4;
        z77 z77Var5 = new z77("ELEMENTS_ENABLE_PASSIVE_CAPTCHA", 4, "elements_enable_passive_captcha");
        ELEMENTS_ENABLE_PASSIVE_CAPTCHA = z77Var5;
        z77 z77Var6 = new z77("ELEMENTS_MOBILE_FORCE_SETUP_FUTURE_USE_BEHAVIOR_AND_NEW_MANDATE_TEXT", 5, "elements_mobile_force_setup_future_use_behavior_and_new_mandate_text");
        ELEMENTS_MOBILE_FORCE_SETUP_FUTURE_USE_BEHAVIOR_AND_NEW_MANDATE_TEXT = z77Var6;
        z77 z77Var7 = new z77("ELEMENTS_MOBILE_ATTEST_ON_INTENT_CONFIRMATION", 6, "elements_mobile_attest_on_intent_confirmation");
        ELEMENTS_MOBILE_ATTEST_ON_INTENT_CONFIRMATION = z77Var7;
        z77 z77Var8 = new z77("ELEMENTS_MOBILE_CARD_FUND_FILTERING", 7, "elements_mobile_card_funding_filtering");
        ELEMENTS_MOBILE_CARD_FUND_FILTERING = z77Var8;
        z77 z77Var9 = new z77("ELEMENTS_MOBILE_ANDROID_TAP_TO_ADD_ENABLED", 8, "elements_mobile_android_tap_to_add_enabled");
        ELEMENTS_MOBILE_ANDROID_TAP_TO_ADD_ENABLED = z77Var9;
        z77 z77Var10 = new z77("ELEMENTS_MOBILE_ANDROID_NFC_SCANNING_ENABLED", 9, "elements_mobile_android_nfc_scanning_enabled");
        ELEMENTS_MOBILE_ANDROID_NFC_SCANNING_ENABLED = z77Var10;
        z77 z77Var11 = new z77("ELEMENTS_MOBILE_LINK_INLINE_SIGNUP_WITH_SAVED_PM_ENABLED", 10, "elements_mobile_link_inline_signup_with_saved_pm_enabled");
        ELEMENTS_MOBILE_LINK_INLINE_SIGNUP_WITH_SAVED_PM_ENABLED = z77Var11;
        z77 z77Var12 = new z77("ELEMENTS_MOBILE_ALLOW_STRIPECARDSCAN", 11, "elements_mobile_allow_stripecardscan");
        ELEMENTS_MOBILE_ALLOW_STRIPECARDSCAN = z77Var12;
        z77 z77Var13 = new z77("ELEMENTS_MOBILE_CARDSCAN_USE_MLKIT", 12, "elements_mobile_cardscan_use_mlkit");
        ELEMENTS_MOBILE_CARDSCAN_USE_MLKIT = z77Var13;
        z77 z77Var14 = new z77("ELEMENTS_MOBILE_CARDSCAN_DISABLE_SSDOCR", 13, "elements_mobile_cardscan_disable_ssdocr");
        ELEMENTS_MOBILE_CARDSCAN_DISABLE_SSDOCR = z77Var14;
        z77 z77Var15 = new z77("ELEMENTS_MOBILE_FORCE_VERTICAL_PAYMENT_METHOD_LAYOUT", 14, "elements_mobile_force_vertical_payment_method_layout");
        ELEMENTS_MOBILE_FORCE_VERTICAL_PAYMENT_METHOD_LAYOUT = z77Var15;
        z77 z77Var16 = new z77("OCS_MOBILE_SHOULD_USE_AUTOCOMPLETE_PROXY_ENDPOINTS", 15, "ocs_mobile_should_use_autocomplete_proxy_endpoints");
        OCS_MOBILE_SHOULD_USE_AUTOCOMPLETE_PROXY_ENDPOINTS = z77Var16;
        z77[] z77VarArr = {z77Var, z77Var2, z77Var3, z77Var4, z77Var5, z77Var6, z77Var7, z77Var8, z77Var9, z77Var10, z77Var11, z77Var12, z77Var13, z77Var14, z77Var15, z77Var16};
        $VALUES = z77VarArr;
        $ENTRIES = new wg7(z77VarArr);
    }

    public z77(String str, int i, String str2) {
        this.flagValue = str2;
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static z77 valueOf(String str) {
        return (z77) Enum.valueOf(z77.class, str);
    }

    public static z77[] values() {
        return (z77[]) $VALUES.clone();
    }

    public final String b() {
        return this.flagValue;
    }
}
