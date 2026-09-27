package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class dj7 implements aj7 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ dj7[] $VALUES;
    public static final dj7 AUTH_WEB_VIEW_BLANK_CLIENT_SECRET;
    public static final dj7 CARD_ART_PREFETCH_INVOKED_FOR_CONFIRMATION;
    public static final dj7 CHECKOUT_SELECTION_SET_BEFORE_LOAD;
    public static final dj7 CUSTOMER_SESSION_ON_CUSTOMER_SHEET_ELEMENTS_SESSION_NO_CUSTOMER_FIELD;
    public static final dj7 CUSTOMER_SHEET_ATTACH_CALLED_WITH_CUSTOMER_SESSION;
    public static final dj7 CUSTOMER_SHEET_METADATA_NULL_ON_CONFIRM;
    public static final dj7 EMBEDDED_PRESENT_PAYMENT_OPTIONS_NOT_CONFIGURED;
    public static final dj7 EMBEDDED_PRESENT_PAYMENT_OPTIONS_NO_LAUNCHER;
    public static final dj7 EMBEDDED_SHEET_LAUNCHER_EMBEDDED_STATE_IS_NULL;
    public static final dj7 EXPRESS_CHECKOUT_ELEMENT_NULL_CONFIRMATION_ARGS_ON_CONFIRM;
    public static final dj7 EXPRESS_CHECKOUT_ELEMENT_NULL_STATE_ON_CONFIRM;
    public static final dj7 EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE;
    public static final dj7 EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE;
    public static final dj7 FETCH_PLACE_WITHOUT_DEPENDENCY;
    public static final dj7 FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY;
    public static final dj7 FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT;
    public static final dj7 GOOGLE_PAY_JSON_REQUEST_PARSING;
    public static final dj7 GOOGLE_PAY_MISSING_INTENT_DATA;
    public static final dj7 GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT;
    public static final dj7 GOOGLE_PAY_UNEXPECTED_STATUS_CODE;
    public static final dj7 HCAPTCHA_UNEXPECTED_FAILURE;
    public static final dj7 INTENT_CONFIRMATION_CHALLENGE_FAILED_TO_PARSE_ERROR_CALLBACK_PARAMS;
    public static final dj7 INTENT_CONFIRMATION_CHALLENGE_FAILED_TO_PARSE_SUCCESS_CALLBACK_PARAMS;
    public static final dj7 INTENT_CONFIRMATION_CHALLENGE_INTENT_NO_ATTESTATION_RESULT;
    public static final dj7 INTENT_CONFIRMATION_CHALLENGE_INTENT_PARAMETERS_UNAVAILABLE;
    public static final dj7 INTENT_CONFIRMATION_HANDLER_ATTESTATION_FAILED_TO_PREPARE;
    public static final dj7 INTENT_CONFIRMATION_HANDLER_ATTESTATION_INVOKED_WHEN_DISABLED;
    public static final dj7 INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION;
    public static final dj7 INTENT_CONFIRMATION_HANDLER_PASSIVE_CHALLENGE_PARAMS_NULL;
    public static final dj7 LINK_ATTACH_BANK_ACCOUNT_WITH_NULL_ACCOUNT;
    public static final dj7 LINK_ATTACH_CARD_WITH_NULL_ACCOUNT;
    public static final dj7 LINK_INVALID_SESSION_STATE;
    public static final dj7 LINK_WEB_FAILED_TO_PARSE_RESULT_URI;
    public static final dj7 MISSING_HOSTED_VOUCHER_URL;
    public static final dj7 MISSING_POLLING_AUTHENTICATOR;
    public static final dj7 PAYMENT_METHOD_MESSAGING_ELEMENT_UNABLE_TO_PARSE_RESPONSE;
    public static final dj7 PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND;
    public static final dj7 PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT;
    public static final dj7 PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND;
    public static final dj7 PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT;
    public static final dj7 PREFETCHED_PMS_NULL_FOR_EPHEMERAL_KEY;
    public static final dj7 TAP_TO_ADD_COLLECT_SETUP_INTENT_CANCEL_FAILURE;
    public static final dj7 TAP_TO_ADD_CONFIRM_SETUP_INTENT_CANCEL_FAILURE;
    public static final dj7 TAP_TO_ADD_DISCOVER_READERS_CANCEL_FAILURE;
    public static final dj7 TAP_TO_ADD_FLOW_CONTROLLER_RECEIVED_COMPLETE_RESULT;
    public static final dj7 TAP_TO_ADD_LOCATION_PERMISSIONS_FAILURE;
    public static final dj7 TAP_TO_ADD_NO_GENERATED_CARD_AFTER_SUCCESSFUL_INTENT_CONFIRMATION;
    public static final dj7 TAP_TO_ADD_NO_READER_FOUND;
    public static final dj7 TAP_TO_ADD_PAYMENT_SHEET_RECEIVED_CONTINUE_RESULT;
    public static final dj7 WALLET_BUTTONS_NULL_CONFIRMATION_ARGS_ON_CONFIRM;
    public static final dj7 WALLET_BUTTONS_NULL_WALLET_ARGUMENTS_ON_CONFIRM;
    private final String partialEventName;

    static {
        dj7 dj7Var = new dj7("AUTH_WEB_VIEW_BLANK_CLIENT_SECRET", 0, "payments.auth_web_view.blank_client_secret");
        AUTH_WEB_VIEW_BLANK_CLIENT_SECRET = dj7Var;
        dj7 dj7Var2 = new dj7("MISSING_HOSTED_VOUCHER_URL", 1, "payments.missing_hosted_voucher_url");
        MISSING_HOSTED_VOUCHER_URL = dj7Var2;
        dj7 dj7Var3 = new dj7("MISSING_POLLING_AUTHENTICATOR", 2, "payments.missing_polling_authenticator");
        MISSING_POLLING_AUTHENTICATOR = dj7Var3;
        dj7 dj7Var4 = new dj7("LINK_INVALID_SESSION_STATE", 3, "link.signup.failure.invalidSessionState");
        LINK_INVALID_SESSION_STATE = dj7Var4;
        dj7 dj7Var5 = new dj7("GOOGLE_PAY_JSON_REQUEST_PARSING", 4, "google_pay_repository.is_ready_request_json_parsing_failure");
        GOOGLE_PAY_JSON_REQUEST_PARSING = dj7Var5;
        dj7 dj7Var6 = new dj7("GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT", 5, "google_pay.confirm.unexpected_result");
        GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT = dj7Var6;
        dj7 dj7Var7 = new dj7("GOOGLE_PAY_UNEXPECTED_STATUS_CODE", 6, "google_pay.confirm.unexpected_status_code");
        GOOGLE_PAY_UNEXPECTED_STATUS_CODE = dj7Var7;
        dj7 dj7Var8 = new dj7("GOOGLE_PAY_MISSING_INTENT_DATA", 7, "google_pay.on_result.missing_data");
        GOOGLE_PAY_MISSING_INTENT_DATA = dj7Var8;
        dj7 dj7Var9 = new dj7("FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY", 8, "address_element.find_autocomplete.without_dependency");
        FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY = dj7Var9;
        dj7 dj7Var10 = new dj7("FETCH_PLACE_WITHOUT_DEPENDENCY", 9, "address_element.fetch_place.without_dependency");
        FETCH_PLACE_WITHOUT_DEPENDENCY = dj7Var10;
        dj7 dj7Var11 = new dj7("LINK_ATTACH_CARD_WITH_NULL_ACCOUNT", 10, "link.create_new_card.missing_link_account");
        LINK_ATTACH_CARD_WITH_NULL_ACCOUNT = dj7Var11;
        dj7 dj7Var12 = new dj7("LINK_ATTACH_BANK_ACCOUNT_WITH_NULL_ACCOUNT", 11, "link.create_new_bank_account.missing_link_account");
        LINK_ATTACH_BANK_ACCOUNT_WITH_NULL_ACCOUNT = dj7Var12;
        dj7 dj7Var13 = new dj7("LINK_WEB_FAILED_TO_PARSE_RESULT_URI", 12, "link.web.result.parsing_failed");
        LINK_WEB_FAILED_TO_PARSE_RESULT_URI = dj7Var13;
        dj7 dj7Var14 = new dj7("PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND", 13, "paymentsheet.authenticators.not_found");
        PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND = dj7Var14;
        dj7 dj7Var15 = new dj7("PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND", 14, "paymentsheet.loader.elements_session.customer.not_found");
        PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND = dj7Var15;
        dj7 dj7Var16 = new dj7("EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE", 15, "elements.external_payment_methods_serializer.error");
        EXTERNAL_PAYMENT_METHOD_SERIALIZATION_FAILURE = dj7Var16;
        dj7 dj7Var17 = new dj7("PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT", 16, "paymentsheet.no_payment_selection");
        PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT = dj7Var17;
        dj7 dj7Var18 = new dj7("PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT", 17, "paymentsheet.invalid_payment_selection");
        PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT = dj7Var18;
        dj7 dj7Var19 = new dj7("FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT", 18, "flow_controller.invalid_payment_selection");
        FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT = dj7Var19;
        dj7 dj7Var20 = new dj7("INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION", 19, "intent_confirmation_handler.invalid_payment_confirmation_option");
        INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION = dj7Var20;
        dj7 dj7Var21 = new dj7("EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE", 20, "paymentsheet.external_payment_method.unexpected_result_code");
        EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE = dj7Var21;
        dj7 dj7Var22 = new dj7("CUSTOMER_SHEET_ATTACH_CALLED_WITH_CUSTOMER_SESSION", 21, "customersheet.customer_session.attach_called");
        CUSTOMER_SHEET_ATTACH_CALLED_WITH_CUSTOMER_SESSION = dj7Var22;
        dj7 dj7Var23 = new dj7("CUSTOMER_SESSION_ON_CUSTOMER_SHEET_ELEMENTS_SESSION_NO_CUSTOMER_FIELD", 22, "customersheet.customer_session.elements_session.no_customer_field");
        CUSTOMER_SESSION_ON_CUSTOMER_SHEET_ELEMENTS_SESSION_NO_CUSTOMER_FIELD = dj7Var23;
        dj7 dj7Var24 = new dj7("EMBEDDED_SHEET_LAUNCHER_EMBEDDED_STATE_IS_NULL", 23, "embedded.embedded_sheet_launcher.embedded_state_is_null");
        EMBEDDED_SHEET_LAUNCHER_EMBEDDED_STATE_IS_NULL = dj7Var24;
        dj7 dj7Var25 = new dj7("EMBEDDED_PRESENT_PAYMENT_OPTIONS_NOT_CONFIGURED", 24, "embedded.present_payment_options.not_configured");
        EMBEDDED_PRESENT_PAYMENT_OPTIONS_NOT_CONFIGURED = dj7Var25;
        dj7 dj7Var26 = new dj7("EMBEDDED_PRESENT_PAYMENT_OPTIONS_NO_LAUNCHER", 25, "embedded.present_payment_options.no_launcher");
        EMBEDDED_PRESENT_PAYMENT_OPTIONS_NO_LAUNCHER = dj7Var26;
        dj7 dj7Var27 = new dj7("WALLET_BUTTONS_NULL_WALLET_ARGUMENTS_ON_CONFIRM", 26, "wallet_buttons.wallet_arguments.null_on_confirm");
        WALLET_BUTTONS_NULL_WALLET_ARGUMENTS_ON_CONFIRM = dj7Var27;
        dj7 dj7Var28 = new dj7("WALLET_BUTTONS_NULL_CONFIRMATION_ARGS_ON_CONFIRM", 27, "wallet_buttons.confirmation_arguments.null_on_confirm");
        WALLET_BUTTONS_NULL_CONFIRMATION_ARGS_ON_CONFIRM = dj7Var28;
        dj7 dj7Var29 = new dj7("EXPRESS_CHECKOUT_ELEMENT_NULL_STATE_ON_CONFIRM", 28, "express_checkout_element.state.null_on_confirm");
        EXPRESS_CHECKOUT_ELEMENT_NULL_STATE_ON_CONFIRM = dj7Var29;
        dj7 dj7Var30 = new dj7("EXPRESS_CHECKOUT_ELEMENT_NULL_CONFIRMATION_ARGS_ON_CONFIRM", 29, "express_checkout_element.confirmation_arguments.null_on_confirm");
        EXPRESS_CHECKOUT_ELEMENT_NULL_CONFIRMATION_ARGS_ON_CONFIRM = dj7Var30;
        dj7 dj7Var31 = new dj7("INTENT_CONFIRMATION_HANDLER_PASSIVE_CHALLENGE_PARAMS_NULL", 30, "intent_confirmation_handler.passive_challenge.params_null");
        INTENT_CONFIRMATION_HANDLER_PASSIVE_CHALLENGE_PARAMS_NULL = dj7Var31;
        dj7 dj7Var32 = new dj7("INTENT_CONFIRMATION_HANDLER_ATTESTATION_INVOKED_WHEN_DISABLED", 31, "intent_confirmation_handler.attestation.invoked_when_disabled");
        INTENT_CONFIRMATION_HANDLER_ATTESTATION_INVOKED_WHEN_DISABLED = dj7Var32;
        dj7 dj7Var33 = new dj7("INTENT_CONFIRMATION_HANDLER_ATTESTATION_FAILED_TO_PREPARE", 32, "intent_confirmation_handler.attestation.failed_to_prepare");
        INTENT_CONFIRMATION_HANDLER_ATTESTATION_FAILED_TO_PREPARE = dj7Var33;
        dj7 dj7Var34 = new dj7("INTENT_CONFIRMATION_CHALLENGE_FAILED_TO_PARSE_SUCCESS_CALLBACK_PARAMS", 33, "intent_confirmation_challenge.failed_to_parse_success_callback_params");
        INTENT_CONFIRMATION_CHALLENGE_FAILED_TO_PARSE_SUCCESS_CALLBACK_PARAMS = dj7Var34;
        dj7 dj7Var35 = new dj7("INTENT_CONFIRMATION_CHALLENGE_FAILED_TO_PARSE_ERROR_CALLBACK_PARAMS", 34, "intent_confirmation_challenge.failed_to_parse_error_callback_params");
        INTENT_CONFIRMATION_CHALLENGE_FAILED_TO_PARSE_ERROR_CALLBACK_PARAMS = dj7Var35;
        dj7 dj7Var36 = new dj7("INTENT_CONFIRMATION_CHALLENGE_INTENT_PARAMETERS_UNAVAILABLE", 35, "intent_confirmation_challenge.intent_parameters_unavailable");
        INTENT_CONFIRMATION_CHALLENGE_INTENT_PARAMETERS_UNAVAILABLE = dj7Var36;
        dj7 dj7Var37 = new dj7("INTENT_CONFIRMATION_CHALLENGE_INTENT_NO_ATTESTATION_RESULT", 36, "intent_confirmation_challenge.attestation.no_attestation_result");
        INTENT_CONFIRMATION_CHALLENGE_INTENT_NO_ATTESTATION_RESULT = dj7Var37;
        dj7 dj7Var38 = new dj7("HCAPTCHA_UNEXPECTED_FAILURE", 37, "elements.captcha.passive.unexpected_failure");
        HCAPTCHA_UNEXPECTED_FAILURE = dj7Var38;
        dj7 dj7Var39 = new dj7("PAYMENT_METHOD_MESSAGING_ELEMENT_UNABLE_TO_PARSE_RESPONSE", 38, "paymentmethodmessaging.element.unable_to_parse_response");
        PAYMENT_METHOD_MESSAGING_ELEMENT_UNABLE_TO_PARSE_RESPONSE = dj7Var39;
        dj7 dj7Var40 = new dj7("CUSTOMER_SHEET_METADATA_NULL_ON_CONFIRM", 39, "customersheet.confirmation.no_payment_method_metadata");
        CUSTOMER_SHEET_METADATA_NULL_ON_CONFIRM = dj7Var40;
        dj7 dj7Var41 = new dj7("TAP_TO_ADD_LOCATION_PERMISSIONS_FAILURE", 40, "elements.tap_to_add.location_permission_required_unexpectedly");
        TAP_TO_ADD_LOCATION_PERMISSIONS_FAILURE = dj7Var41;
        dj7 dj7Var42 = new dj7("TAP_TO_ADD_DISCOVER_READERS_CANCEL_FAILURE", 41, "elements.tap_to_add.failure_to_cancel_discover_readers_call");
        TAP_TO_ADD_DISCOVER_READERS_CANCEL_FAILURE = dj7Var42;
        dj7 dj7Var43 = new dj7("TAP_TO_ADD_COLLECT_SETUP_INTENT_CANCEL_FAILURE", 42, "elements.tap_to_add.failure_to_cancel_collect_setup_intent_call");
        TAP_TO_ADD_COLLECT_SETUP_INTENT_CANCEL_FAILURE = dj7Var43;
        dj7 dj7Var44 = new dj7("TAP_TO_ADD_CONFIRM_SETUP_INTENT_CANCEL_FAILURE", 43, "elements.tap_to_add.failure_to_cancel_confirm_setup_intent_call");
        TAP_TO_ADD_CONFIRM_SETUP_INTENT_CANCEL_FAILURE = dj7Var44;
        dj7 dj7Var45 = new dj7("TAP_TO_ADD_NO_READER_FOUND", 44, "elements.tap_to_add.no_reader_found");
        TAP_TO_ADD_NO_READER_FOUND = dj7Var45;
        dj7 dj7Var46 = new dj7("TAP_TO_ADD_FLOW_CONTROLLER_RECEIVED_COMPLETE_RESULT", 45, "elements.tap_to_add.flow_controller_received_complete_result");
        TAP_TO_ADD_FLOW_CONTROLLER_RECEIVED_COMPLETE_RESULT = dj7Var46;
        dj7 dj7Var47 = new dj7("TAP_TO_ADD_PAYMENT_SHEET_RECEIVED_CONTINUE_RESULT", 46, "elements.tap_to_add.payment_sheet_received_continue_result");
        TAP_TO_ADD_PAYMENT_SHEET_RECEIVED_CONTINUE_RESULT = dj7Var47;
        dj7 dj7Var48 = new dj7("TAP_TO_ADD_NO_GENERATED_CARD_AFTER_SUCCESSFUL_INTENT_CONFIRMATION", 47, "elements.tap_to_add.no_generated_card_after_successful_intent_confirmation");
        TAP_TO_ADD_NO_GENERATED_CARD_AFTER_SUCCESSFUL_INTENT_CONFIRMATION = dj7Var48;
        dj7 dj7Var49 = new dj7("CARD_ART_PREFETCH_INVOKED_FOR_CONFIRMATION", 48, "card_art_prefetch.invoked_for_confirmation");
        CARD_ART_PREFETCH_INVOKED_FOR_CONFIRMATION = dj7Var49;
        dj7 dj7Var50 = new dj7("PREFETCHED_PMS_NULL_FOR_EPHEMERAL_KEY", 49, "payment_methods_prefetch.null_for_ephemeral_key");
        PREFETCHED_PMS_NULL_FOR_EPHEMERAL_KEY = dj7Var50;
        dj7 dj7Var51 = new dj7("CHECKOUT_SELECTION_SET_BEFORE_LOAD", 50, "checkout.selection_set_before_load");
        CHECKOUT_SELECTION_SET_BEFORE_LOAD = dj7Var51;
        dj7[] dj7VarArr = {dj7Var, dj7Var2, dj7Var3, dj7Var4, dj7Var5, dj7Var6, dj7Var7, dj7Var8, dj7Var9, dj7Var10, dj7Var11, dj7Var12, dj7Var13, dj7Var14, dj7Var15, dj7Var16, dj7Var17, dj7Var18, dj7Var19, dj7Var20, dj7Var21, dj7Var22, dj7Var23, dj7Var24, dj7Var25, dj7Var26, dj7Var27, dj7Var28, dj7Var29, dj7Var30, dj7Var31, dj7Var32, dj7Var33, dj7Var34, dj7Var35, dj7Var36, dj7Var37, dj7Var38, dj7Var39, dj7Var40, dj7Var41, dj7Var42, dj7Var43, dj7Var44, dj7Var45, dj7Var46, dj7Var47, dj7Var48, dj7Var49, dj7Var50, dj7Var51};
        $VALUES = dj7VarArr;
        $ENTRIES = new wg7(dj7VarArr);
    }

    public dj7(String str, int i, String str2) {
        this.partialEventName = str2;
    }

    public static dj7 valueOf(String str) {
        return (dj7) Enum.valueOf(dj7.class, str);
    }

    public static dj7[] values() {
        return (dj7[]) $VALUES.clone();
    }

    @Override // defpackage.fp
    public final String c() {
        return k84.g("unexpected_error.", this.partialEventName);
    }
}
