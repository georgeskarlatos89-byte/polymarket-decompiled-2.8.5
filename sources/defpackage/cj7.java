package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class cj7 implements aj7 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ cj7[] $VALUES;
    public static final cj7 CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_SUCCESS;
    public static final cj7 CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_SUCCESS;
    public static final cj7 CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_SUCCESS;
    public static final cj7 CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS;
    public static final cj7 CUSTOM_PAYMENT_METHODS_LAUNCH_SUCCESS;
    public static final cj7 EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS;
    public static final cj7 FOUND_CREATE_CARD_PRESENT_SETUP_INTENT_CALLBACK_WHILE_POLLING;
    public static final cj7 FOUND_CREATE_INTENT_CALLBACK_WHILE_POLLING;
    public static final cj7 FOUND_CREATE_INTENT_WITH_CONFIRMATION_TOKEN_CALLBACK_WHILE_POLLING;
    public static final cj7 FOUND_PREPARE_PAYMENT_METHOD_HANDLER_WHILE_POLLING;
    public static final cj7 GET_SAVED_PAYMENT_METHODS_SUCCESS;
    public static final cj7 LINK_CREATE_CARD_SUCCESS;
    public static final cj7 LINK_LOG_OUT_SUCCESS;
    public static final cj7 PLACES_FETCH_PLACE_SUCCESS;
    public static final cj7 PLACES_FIND_AUTOCOMPLETE_SUCCESS;
    public static final cj7 TAP_TO_ADD_CONNECT_READER_CALL_SUCCESS;
    public static final cj7 TAP_TO_ADD_DISCOVER_READERS_CALL_SUCCESS;
    private final String eventName;

    static {
        cj7 cj7Var = new cj7("CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_SUCCESS", 0, "elements.customer_sheet.elements_session.load_success");
        CUSTOMER_SHEET_ELEMENTS_SESSION_LOAD_SUCCESS = cj7Var;
        cj7 cj7Var2 = new cj7("CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_SUCCESS", 1, "elements.customer_sheet.customer_session.elements_session.load_success");
        CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_SUCCESS = cj7Var2;
        cj7 cj7Var3 = new cj7("CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_SUCCESS", 2, "elements.customer_sheet.payment_methods.load_success");
        CUSTOMER_SHEET_PAYMENT_METHODS_LOAD_SUCCESS = cj7Var3;
        cj7 cj7Var4 = new cj7("GET_SAVED_PAYMENT_METHODS_SUCCESS", 3, "elements.customer_repository.get_saved_payment_methods_success");
        GET_SAVED_PAYMENT_METHODS_SUCCESS = cj7Var4;
        cj7 cj7Var5 = new cj7("PLACES_FIND_AUTOCOMPLETE_SUCCESS", 4, "address_element.find_autocomplete.success");
        PLACES_FIND_AUTOCOMPLETE_SUCCESS = cj7Var5;
        cj7 cj7Var6 = new cj7("PLACES_FETCH_PLACE_SUCCESS", 5, "address_element.fetch_place.success");
        PLACES_FETCH_PLACE_SUCCESS = cj7Var6;
        cj7 cj7Var7 = new cj7("LINK_CREATE_CARD_SUCCESS", 6, "link.create_new_card.success");
        LINK_CREATE_CARD_SUCCESS = cj7Var7;
        cj7 cj7Var8 = new cj7("LINK_LOG_OUT_SUCCESS", 7, "link.log_out.success");
        LINK_LOG_OUT_SUCCESS = cj7Var8;
        cj7 cj7Var9 = new cj7("CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS", 8, "elements.customer_sheet.payment_methods.refresh_success");
        CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS = cj7Var9;
        cj7 cj7Var10 = new cj7("EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS", 9, "paymentsheet.external_payment_method.launch_success");
        EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS = cj7Var10;
        cj7 cj7Var11 = new cj7("CUSTOM_PAYMENT_METHODS_LAUNCH_SUCCESS", 10, "paymentsheet.custom_payment_method.launch_success");
        CUSTOM_PAYMENT_METHODS_LAUNCH_SUCCESS = cj7Var11;
        cj7 cj7Var12 = new cj7("FOUND_CREATE_INTENT_CALLBACK_WHILE_POLLING", 11, "paymentsheet.polling_for_create_intent_callback.found");
        FOUND_CREATE_INTENT_CALLBACK_WHILE_POLLING = cj7Var12;
        cj7 cj7Var13 = new cj7("FOUND_CREATE_INTENT_WITH_CONFIRMATION_TOKEN_CALLBACK_WHILE_POLLING", 12, "paymentsheet.polling_for_create_intent_with_confirmation_token_callback.found");
        FOUND_CREATE_INTENT_WITH_CONFIRMATION_TOKEN_CALLBACK_WHILE_POLLING = cj7Var13;
        cj7 cj7Var14 = new cj7("FOUND_PREPARE_PAYMENT_METHOD_HANDLER_WHILE_POLLING", 13, "paymentsheet.polling_for_prepare_payment_method_handler.found");
        FOUND_PREPARE_PAYMENT_METHOD_HANDLER_WHILE_POLLING = cj7Var14;
        cj7 cj7Var15 = new cj7("TAP_TO_ADD_DISCOVER_READERS_CALL_SUCCESS", 14, "elements.tap_to_add.discover_readers_call.success");
        TAP_TO_ADD_DISCOVER_READERS_CALL_SUCCESS = cj7Var15;
        cj7 cj7Var16 = new cj7("TAP_TO_ADD_CONNECT_READER_CALL_SUCCESS", 15, "elements.tap_to_add.connect_reader_call.success");
        TAP_TO_ADD_CONNECT_READER_CALL_SUCCESS = cj7Var16;
        cj7 cj7Var17 = new cj7("FOUND_CREATE_CARD_PRESENT_SETUP_INTENT_CALLBACK_WHILE_POLLING", 16, "elements.tap_to_add.polling_for_create_card_present_setup_intent_callback.success");
        FOUND_CREATE_CARD_PRESENT_SETUP_INTENT_CALLBACK_WHILE_POLLING = cj7Var17;
        cj7[] cj7VarArr = {cj7Var, cj7Var2, cj7Var3, cj7Var4, cj7Var5, cj7Var6, cj7Var7, cj7Var8, cj7Var9, cj7Var10, cj7Var11, cj7Var12, cj7Var13, cj7Var14, cj7Var15, cj7Var16, cj7Var17};
        $VALUES = cj7VarArr;
        $ENTRIES = new wg7(cj7VarArr);
    }

    public cj7(String str, int i, String str2) {
        this.eventName = str2;
    }

    public static cj7 valueOf(String str) {
        return (cj7) Enum.valueOf(cj7.class, str);
    }

    public static cj7[] values() {
        return (cj7[]) $VALUES.clone();
    }

    @Override // defpackage.fp
    public final String c() {
        return this.eventName;
    }
}
