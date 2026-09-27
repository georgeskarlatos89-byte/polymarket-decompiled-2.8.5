package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class bj7 implements aj7 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ bj7[] $VALUES;
    public static final bj7 AUTH_WEB_VIEW_FAILURE;
    public static final bj7 AUTH_WEB_VIEW_NULL_ARGS;
    public static final bj7 BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND;
    public static final bj7 BROWSER_LAUNCHER_NULL_ARGS;
    public static final bj7 CREATE_CARD_PRESENT_SETUP_INTENT_CALLBACK_NULL;
    public static final bj7 CREATE_INTENT_CALLBACK_NULL;
    public static final bj7 CUSTOMER_SHEET_ADAPTER_NOT_FOUND;
    public static final bj7 CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_FAILURE;
    public static final bj7 CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE;
    public static final bj7 CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE;
    public static final bj7 CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE;
    public static final bj7 CUSTOM_PAYMENT_METHOD_CONFIRM_HANDLER_NULL;
    public static final bj7 EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL;
    public static final bj7 FRAUD_DETECTION_API_FAILURE;
    public static final bj7 GET_SAVED_PAYMENT_METHODS_FAILURE;
    public static final bj7 GOOGLE_PAY_FAILED;
    public static final bj7 GOOGLE_PAY_IS_READY_API_CALL;
    public static final bj7 GOOGLE_PAY_IS_READY_TIMEOUT;
    public static final bj7 GOOGLE_PAY_SKIPPED_DURING_LOAD;
    public static final bj7 HCAPTCHA_FAILURE;
    public static final bj7 INTENT_CONFIRMATION_CHALLENGE_CHALLENGE_CANCELLATION_REQUEST_FAILED;
    public static final bj7 INTENT_CONFIRMATION_HANDLER_ATTESTATION_REQUEST_TOKEN_FAILED;
    public static final bj7 LINK_CREATE_PAYMENT_DETAILS_FAILURE;
    public static final bj7 LINK_LOG_OUT_FAILURE;
    public static final bj7 LINK_NATIVE_FAILED_TO_ATTEST_REQUEST;
    public static final bj7 LINK_NATIVE_FAILED_TO_GET_INTEGRITY_TOKEN;
    public static final bj7 LINK_NATIVE_FAILED_TO_PREPARE_INTEGRITY_MANAGER;
    public static final bj7 LINK_SHARE_CARD_FAILURE;
    public static final bj7 PAYMENT_LAUNCHER_CONFIRMATION_INVALID_ARGS;
    public static final bj7 PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS;
    public static final bj7 PAYMENT_OPTION_CARD_ART_LOAD_FAILURE;
    public static final bj7 PLACES_FETCH_PLACE_ERROR;
    public static final bj7 PLACES_FIND_AUTOCOMPLETE_ERROR;
    public static final bj7 PREPARE_PAYMENT_METHOD_HANDLER_NULL;
    public static final bj7 SAVED_PAYMENT_METHOD_RADAR_SESSION_FAILURE;
    public static final bj7 TAP_TO_ADD_CONNECT_READER_CALL_FAILURE;
    public static final bj7 TAP_TO_ADD_DISCOVER_READERS_CALL_FAILURE;
    private final String eventName;

    static {
        bj7 bj7Var = new bj7("AUTH_WEB_VIEW_FAILURE", 0, "payments.auth_web_view.failure");
        AUTH_WEB_VIEW_FAILURE = bj7Var;
        bj7 bj7Var2 = new bj7("AUTH_WEB_VIEW_NULL_ARGS", 1, "payments.auth_web_view.null_args");
        AUTH_WEB_VIEW_NULL_ARGS = bj7Var2;
        bj7 bj7Var3 = new bj7("GET_SAVED_PAYMENT_METHODS_FAILURE", 2, "elements.customer_repository.get_saved_payment_methods_failure");
        GET_SAVED_PAYMENT_METHODS_FAILURE = bj7Var3;
        bj7 bj7Var4 = new bj7("GOOGLE_PAY_IS_READY_API_CALL", 3, "elements.google_pay_repository.is_ready_request_api_call_failure");
        GOOGLE_PAY_IS_READY_API_CALL = bj7Var4;
        bj7 bj7Var5 = new bj7("GOOGLE_PAY_IS_READY_TIMEOUT", 4, "elements.google_pay_repository.is_ready_timeout");
        GOOGLE_PAY_IS_READY_TIMEOUT = bj7Var5;
        bj7 bj7Var6 = new bj7("CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE", 5, "elements.customer_sheet.elements_session.load_failure");
        CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_FAILURE = bj7Var6;
        bj7 bj7Var7 = new bj7("CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_FAILURE", 6, "elements.customer_sheet.customer_session.elements_session.load_failure");
        CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_FAILURE = bj7Var7;
        bj7 bj7Var8 = new bj7("CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE", 7, "elements.customer_sheet.payment_methods.load_failure");
        CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_FAILURE = bj7Var8;
        bj7 bj7Var9 = new bj7("CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE", 8, "elements.customer_sheet.payment_methods.refresh_failure");
        CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE = bj7Var9;
        bj7 bj7Var10 = new bj7("CUSTOMER_SHEET_ADAPTER_NOT_FOUND", 9, "elements.customer_sheet.customer_adapter.not_found");
        CUSTOMER_SHEET_ADAPTER_NOT_FOUND = bj7Var10;
        bj7 bj7Var11 = new bj7("PLACES_FIND_AUTOCOMPLETE_ERROR", 10, "address_element.find_autocomplete.error");
        PLACES_FIND_AUTOCOMPLETE_ERROR = bj7Var11;
        bj7 bj7Var12 = new bj7("PLACES_FETCH_PLACE_ERROR", 11, "address_element.fetch_place.error");
        PLACES_FETCH_PLACE_ERROR = bj7Var12;
        bj7 bj7Var13 = new bj7("LINK_CREATE_PAYMENT_DETAILS_FAILURE", 12, "link.create_new_card.create_payment_details_failure");
        LINK_CREATE_PAYMENT_DETAILS_FAILURE = bj7Var13;
        bj7 bj7Var14 = new bj7("LINK_SHARE_CARD_FAILURE", 13, "link.create_new_card.share_payment_details_failure");
        LINK_SHARE_CARD_FAILURE = bj7Var14;
        bj7 bj7Var15 = new bj7("LINK_LOG_OUT_FAILURE", 14, "link.log_out.failure");
        LINK_LOG_OUT_FAILURE = bj7Var15;
        bj7 bj7Var16 = new bj7("LINK_NATIVE_FAILED_TO_GET_INTEGRITY_TOKEN", 15, "link.native.failed_to_get_integrity_token");
        LINK_NATIVE_FAILED_TO_GET_INTEGRITY_TOKEN = bj7Var16;
        bj7 bj7Var17 = new bj7("LINK_NATIVE_FAILED_TO_ATTEST_REQUEST", 16, "link.native.failed_to_attest_request");
        LINK_NATIVE_FAILED_TO_ATTEST_REQUEST = bj7Var17;
        bj7 bj7Var18 = new bj7("LINK_NATIVE_FAILED_TO_PREPARE_INTEGRITY_MANAGER", 17, "link.native.integrity.preparation_failed");
        LINK_NATIVE_FAILED_TO_PREPARE_INTEGRITY_MANAGER = bj7Var18;
        bj7 bj7Var19 = new bj7("PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS", 18, "payments.paymentlauncherconfirmation.null_args");
        PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS = bj7Var19;
        bj7 bj7Var20 = new bj7("PAYMENT_LAUNCHER_CONFIRMATION_INVALID_ARGS", 19, "payments.paymentlauncherconfirmation.invalid_args");
        PAYMENT_LAUNCHER_CONFIRMATION_INVALID_ARGS = bj7Var20;
        bj7 bj7Var21 = new bj7("BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND", 20, "payments.browserlauncher.activity_not_found");
        BROWSER_LAUNCHER_ACTIVITY_NOT_FOUND = bj7Var21;
        bj7 bj7Var22 = new bj7("BROWSER_LAUNCHER_NULL_ARGS", 21, "payments.browserlauncher.null_args");
        BROWSER_LAUNCHER_NULL_ARGS = bj7Var22;
        bj7 bj7Var23 = new bj7("GOOGLE_PAY_SKIPPED_DURING_LOAD", 22, "google_pay.skipped_during_load");
        GOOGLE_PAY_SKIPPED_DURING_LOAD = bj7Var23;
        bj7 bj7Var24 = new bj7("GOOGLE_PAY_FAILED", 23, "google_pay.confirm.error");
        GOOGLE_PAY_FAILED = bj7Var24;
        bj7 bj7Var25 = new bj7("FRAUD_DETECTION_API_FAILURE", 24, "fraud_detection_data_repository.api_failure");
        FRAUD_DETECTION_API_FAILURE = bj7Var25;
        bj7 bj7Var26 = new bj7("SAVED_PAYMENT_METHOD_RADAR_SESSION_FAILURE", 25, "stripe_android.saved_payment_method_radar_session_failure");
        SAVED_PAYMENT_METHOD_RADAR_SESSION_FAILURE = bj7Var26;
        bj7 bj7Var27 = new bj7("EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL", 26, "paymentsheet.external_payment_method.confirm_handler_is_null");
        EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL = bj7Var27;
        bj7 bj7Var28 = new bj7("CUSTOM_PAYMENT_METHOD_CONFIRM_HANDLER_NULL", 27, "paymentsheet.custom_payment_method.confirm_handler_is_null");
        CUSTOM_PAYMENT_METHOD_CONFIRM_HANDLER_NULL = bj7Var28;
        bj7 bj7Var29 = new bj7("CREATE_INTENT_CALLBACK_NULL", 28, "paymentsheet.create_intent_callback.is_null");
        CREATE_INTENT_CALLBACK_NULL = bj7Var29;
        bj7 bj7Var30 = new bj7("PREPARE_PAYMENT_METHOD_HANDLER_NULL", 29, "paymentsheet.prepare_payment_method_handler.is_null");
        PREPARE_PAYMENT_METHOD_HANDLER_NULL = bj7Var30;
        bj7 bj7Var31 = new bj7("CREATE_CARD_PRESENT_SETUP_INTENT_CALLBACK_NULL", 30, "elements.tap_to_add.create_card_present_setup_intent_callback.is_null");
        CREATE_CARD_PRESENT_SETUP_INTENT_CALLBACK_NULL = bj7Var31;
        bj7 bj7Var32 = new bj7("HCAPTCHA_FAILURE", 31, "elements.captcha.passive.expected_failure");
        HCAPTCHA_FAILURE = bj7Var32;
        bj7 bj7Var33 = new bj7("INTENT_CONFIRMATION_CHALLENGE_CHALLENGE_CANCELLATION_REQUEST_FAILED", 32, "intent_confirmation_challenge.challenge_cancellation_request_failed");
        INTENT_CONFIRMATION_CHALLENGE_CHALLENGE_CANCELLATION_REQUEST_FAILED = bj7Var33;
        bj7 bj7Var34 = new bj7("INTENT_CONFIRMATION_HANDLER_ATTESTATION_REQUEST_TOKEN_FAILED", 33, "intent_confirmation_handler.attestation.request_token_failed");
        INTENT_CONFIRMATION_HANDLER_ATTESTATION_REQUEST_TOKEN_FAILED = bj7Var34;
        bj7 bj7Var35 = new bj7("TAP_TO_ADD_DISCOVER_READERS_CALL_FAILURE", 34, "elements.tap_to_add.discover_readers_call.failure");
        TAP_TO_ADD_DISCOVER_READERS_CALL_FAILURE = bj7Var35;
        bj7 bj7Var36 = new bj7("TAP_TO_ADD_CONNECT_READER_CALL_FAILURE", 35, "elements.tap_to_add.connect_reader_call.failure");
        TAP_TO_ADD_CONNECT_READER_CALL_FAILURE = bj7Var36;
        bj7 bj7Var37 = new bj7("PAYMENT_OPTION_CARD_ART_LOAD_FAILURE", 36, "elements.payment_option.card_art.load_failure");
        PAYMENT_OPTION_CARD_ART_LOAD_FAILURE = bj7Var37;
        bj7[] bj7VarArr = {bj7Var, bj7Var2, bj7Var3, bj7Var4, bj7Var5, bj7Var6, bj7Var7, bj7Var8, bj7Var9, bj7Var10, bj7Var11, bj7Var12, bj7Var13, bj7Var14, bj7Var15, bj7Var16, bj7Var17, bj7Var18, bj7Var19, bj7Var20, bj7Var21, bj7Var22, bj7Var23, bj7Var24, bj7Var25, bj7Var26, bj7Var27, bj7Var28, bj7Var29, bj7Var30, bj7Var31, bj7Var32, bj7Var33, bj7Var34, bj7Var35, bj7Var36, bj7Var37};
        $VALUES = bj7VarArr;
        $ENTRIES = new wg7(bj7VarArr);
    }

    public bj7(String str, int i, String str2) {
        this.eventName = str2;
    }

    public static bj7 valueOf(String str) {
        return (bj7) Enum.valueOf(bj7.class, str);
    }

    public static bj7[] values() {
        return (bj7[]) $VALUES.clone();
    }

    @Override // defpackage.fp
    public final String c() {
        return this.eventName;
    }
}
