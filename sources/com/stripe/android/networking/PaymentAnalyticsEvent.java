package com.stripe.android.networking;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.fp;
import defpackage.k84;
import defpackage.p1e;
import defpackage.ug7;
import defpackage.wg7;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\bO\b\u0087\u0081\u0002\u0018\u0000 \t2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\nJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0005j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQ¨\u0006R"}, d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "Lfp;", "", "", "toString", "()Ljava/lang/String;", ApiConstant.KEY_CODE, "Ljava/lang/String;", "getCode", "Companion", "p1e", "TokenCreate", "ConfirmationTokenCreate", "PaymentMethodCreate", "PaymentMethodUpdate", "CustomerRetrieve", "CustomerRetrievePaymentMethods", "CustomerRetrievePaymentMethod", "CustomerAttachPaymentMethod", "CustomerDetachPaymentMethod", "CustomerDeleteSource", "CustomerSetShippingInfo", "CustomerAddSource", "CustomerSetDefaultSource", "IssuingRetrievePin", "IssuingUpdatePin", "SourceCreate", "SourceRetrieve", "PaymentIntentConfirm", "PaymentIntentRetrieve", "PaymentIntentRetrieveOrdered", "PaymentIntentCancelSource", "PaymentIntentRefresh", "SetupIntentConfirm", "SetupIntentRetrieve", "SetupIntentRetrieveOrdered", "SetupIntentCancelSource", "SetupIntentRefresh", "PaymentLauncherConfirmStarted", "PaymentLauncherConfirmFinished", "PaymentLauncherNextActionStarted", "PaymentLauncherNextActionFinished", "FileCreate", "Auth3ds1Sdk", "Auth3ds1ChallengeStart", "Auth3ds1ChallengeError", "Auth3ds1ChallengeComplete", "AuthWithWebView", "AuthWithCustomTabs", "AuthWithDefaultBrowser", "ConfirmReturnUrlNull", "ConfirmReturnUrlDefault", "ConfirmReturnUrlCustom", "FpxBankStatusesRetrieve", "StripeUrlRetrieve", "Auth3ds2RequestParamsFailed", "Auth3ds2Fingerprint", "Auth3ds2Start", "Auth3ds2Frictionless", "Auth3ds2ChallengePresented", "Auth3ds2ChallengeCanceled", "Auth3ds2ChallengeCompleted", "Auth3ds2ChallengeErrored", "Auth3ds2ChallengeTimedOut", "Auth3ds2Fallback", "AuthRedirect", "AuthError", "AuthSourceStart", "AuthSourceRedirect", "AuthSourceResult", "RadarSessionCreate", "GooglePayLauncherInit", "GooglePayPaymentMethodLauncherInit", "CardMetadataPublishableKeyAvailable", "CardMetadataPublishableKeyUnavailable", "CardMetadataLoadedTooSlow", "CardMetadataLoadFailure", "CardMetadataMissingRange", "CardMetadataExpectedExtraDigitsButUserEntered16ThenSwitchedFields", "MobileCardElementShown", "MobileCardElementInteraction", "MobileCardElementFormCompleted", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentAnalyticsEvent implements fp {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ PaymentAnalyticsEvent[] $VALUES;
    public static final PaymentAnalyticsEvent Auth3ds1ChallengeComplete;
    public static final PaymentAnalyticsEvent Auth3ds1ChallengeError;
    public static final PaymentAnalyticsEvent Auth3ds1ChallengeStart;
    public static final PaymentAnalyticsEvent Auth3ds1Sdk;
    public static final PaymentAnalyticsEvent Auth3ds2ChallengeCanceled;
    public static final PaymentAnalyticsEvent Auth3ds2ChallengeCompleted;
    public static final PaymentAnalyticsEvent Auth3ds2ChallengeErrored;
    public static final PaymentAnalyticsEvent Auth3ds2ChallengePresented;
    public static final PaymentAnalyticsEvent Auth3ds2ChallengeTimedOut;
    public static final PaymentAnalyticsEvent Auth3ds2Fallback;
    public static final PaymentAnalyticsEvent Auth3ds2Fingerprint;
    public static final PaymentAnalyticsEvent Auth3ds2Frictionless;
    public static final PaymentAnalyticsEvent Auth3ds2RequestParamsFailed;
    public static final PaymentAnalyticsEvent Auth3ds2Start;
    public static final PaymentAnalyticsEvent AuthError;
    public static final PaymentAnalyticsEvent AuthRedirect;
    public static final PaymentAnalyticsEvent AuthSourceRedirect;
    public static final PaymentAnalyticsEvent AuthSourceResult;
    public static final PaymentAnalyticsEvent AuthSourceStart;
    public static final PaymentAnalyticsEvent AuthWithCustomTabs;
    public static final PaymentAnalyticsEvent AuthWithDefaultBrowser;
    public static final PaymentAnalyticsEvent AuthWithWebView;
    public static final PaymentAnalyticsEvent CardMetadataExpectedExtraDigitsButUserEntered16ThenSwitchedFields;
    public static final PaymentAnalyticsEvent CardMetadataLoadFailure;
    public static final PaymentAnalyticsEvent CardMetadataLoadedTooSlow;
    public static final PaymentAnalyticsEvent CardMetadataMissingRange;
    public static final PaymentAnalyticsEvent CardMetadataPublishableKeyAvailable;
    public static final PaymentAnalyticsEvent CardMetadataPublishableKeyUnavailable;
    private static final p1e Companion;
    public static final PaymentAnalyticsEvent ConfirmReturnUrlCustom;
    public static final PaymentAnalyticsEvent ConfirmReturnUrlDefault;
    public static final PaymentAnalyticsEvent ConfirmReturnUrlNull;
    public static final PaymentAnalyticsEvent ConfirmationTokenCreate;
    public static final PaymentAnalyticsEvent CustomerAddSource;
    public static final PaymentAnalyticsEvent CustomerAttachPaymentMethod;
    public static final PaymentAnalyticsEvent CustomerDeleteSource;
    public static final PaymentAnalyticsEvent CustomerDetachPaymentMethod;
    public static final PaymentAnalyticsEvent CustomerRetrieve;
    public static final PaymentAnalyticsEvent CustomerRetrievePaymentMethod;
    public static final PaymentAnalyticsEvent CustomerRetrievePaymentMethods;
    public static final PaymentAnalyticsEvent CustomerSetDefaultSource;
    public static final PaymentAnalyticsEvent CustomerSetShippingInfo;
    public static final PaymentAnalyticsEvent FileCreate;
    public static final PaymentAnalyticsEvent FpxBankStatusesRetrieve;
    public static final PaymentAnalyticsEvent GooglePayLauncherInit;
    public static final PaymentAnalyticsEvent GooglePayPaymentMethodLauncherInit;
    public static final PaymentAnalyticsEvent IssuingRetrievePin;
    public static final PaymentAnalyticsEvent IssuingUpdatePin;
    public static final PaymentAnalyticsEvent MobileCardElementFormCompleted;
    public static final PaymentAnalyticsEvent MobileCardElementInteraction;
    public static final PaymentAnalyticsEvent MobileCardElementShown;
    private static final String PREFIX = "stripe_android";
    public static final PaymentAnalyticsEvent PaymentIntentCancelSource;
    public static final PaymentAnalyticsEvent PaymentIntentConfirm;
    public static final PaymentAnalyticsEvent PaymentIntentRefresh;
    public static final PaymentAnalyticsEvent PaymentIntentRetrieve;
    public static final PaymentAnalyticsEvent PaymentIntentRetrieveOrdered;
    public static final PaymentAnalyticsEvent PaymentLauncherConfirmFinished;
    public static final PaymentAnalyticsEvent PaymentLauncherConfirmStarted;
    public static final PaymentAnalyticsEvent PaymentLauncherNextActionFinished;
    public static final PaymentAnalyticsEvent PaymentLauncherNextActionStarted;
    public static final PaymentAnalyticsEvent PaymentMethodCreate;
    public static final PaymentAnalyticsEvent PaymentMethodUpdate;
    public static final PaymentAnalyticsEvent RadarSessionCreate;
    public static final PaymentAnalyticsEvent SetupIntentCancelSource;
    public static final PaymentAnalyticsEvent SetupIntentConfirm;
    public static final PaymentAnalyticsEvent SetupIntentRefresh;
    public static final PaymentAnalyticsEvent SetupIntentRetrieve;
    public static final PaymentAnalyticsEvent SetupIntentRetrieveOrdered;
    public static final PaymentAnalyticsEvent SourceCreate;
    public static final PaymentAnalyticsEvent SourceRetrieve;
    public static final PaymentAnalyticsEvent StripeUrlRetrieve;
    public static final PaymentAnalyticsEvent TokenCreate;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v72, types: [p1e, java.lang.Object] */
    static {
        PaymentAnalyticsEvent paymentAnalyticsEvent = new PaymentAnalyticsEvent("TokenCreate", 0, "token_creation");
        TokenCreate = paymentAnalyticsEvent;
        PaymentAnalyticsEvent paymentAnalyticsEvent2 = new PaymentAnalyticsEvent("ConfirmationTokenCreate", 1, "confirmation_token_creation");
        ConfirmationTokenCreate = paymentAnalyticsEvent2;
        PaymentAnalyticsEvent paymentAnalyticsEvent3 = new PaymentAnalyticsEvent("PaymentMethodCreate", 2, "payment_method_creation");
        PaymentMethodCreate = paymentAnalyticsEvent3;
        PaymentAnalyticsEvent paymentAnalyticsEvent4 = new PaymentAnalyticsEvent("PaymentMethodUpdate", 3, "payment_method_update");
        PaymentMethodUpdate = paymentAnalyticsEvent4;
        PaymentAnalyticsEvent paymentAnalyticsEvent5 = new PaymentAnalyticsEvent("CustomerRetrieve", 4, "retrieve_customer");
        CustomerRetrieve = paymentAnalyticsEvent5;
        PaymentAnalyticsEvent paymentAnalyticsEvent6 = new PaymentAnalyticsEvent("CustomerRetrievePaymentMethods", 5, "retrieve_payment_methods");
        CustomerRetrievePaymentMethods = paymentAnalyticsEvent6;
        PaymentAnalyticsEvent paymentAnalyticsEvent7 = new PaymentAnalyticsEvent("CustomerRetrievePaymentMethod", 6, "retrieve_customer_payment_method");
        CustomerRetrievePaymentMethod = paymentAnalyticsEvent7;
        PaymentAnalyticsEvent paymentAnalyticsEvent8 = new PaymentAnalyticsEvent("CustomerAttachPaymentMethod", 7, "attach_payment_method");
        CustomerAttachPaymentMethod = paymentAnalyticsEvent8;
        PaymentAnalyticsEvent paymentAnalyticsEvent9 = new PaymentAnalyticsEvent("CustomerDetachPaymentMethod", 8, "detach_payment_method");
        CustomerDetachPaymentMethod = paymentAnalyticsEvent9;
        PaymentAnalyticsEvent paymentAnalyticsEvent10 = new PaymentAnalyticsEvent("CustomerDeleteSource", 9, "delete_source");
        CustomerDeleteSource = paymentAnalyticsEvent10;
        PaymentAnalyticsEvent paymentAnalyticsEvent11 = new PaymentAnalyticsEvent("CustomerSetShippingInfo", 10, "set_shipping_info");
        CustomerSetShippingInfo = paymentAnalyticsEvent11;
        PaymentAnalyticsEvent paymentAnalyticsEvent12 = new PaymentAnalyticsEvent("CustomerAddSource", 11, "add_source");
        CustomerAddSource = paymentAnalyticsEvent12;
        PaymentAnalyticsEvent paymentAnalyticsEvent13 = new PaymentAnalyticsEvent("CustomerSetDefaultSource", 12, "default_source");
        CustomerSetDefaultSource = paymentAnalyticsEvent13;
        PaymentAnalyticsEvent paymentAnalyticsEvent14 = new PaymentAnalyticsEvent("IssuingRetrievePin", 13, "issuing_retrieve_pin");
        IssuingRetrievePin = paymentAnalyticsEvent14;
        PaymentAnalyticsEvent paymentAnalyticsEvent15 = new PaymentAnalyticsEvent("IssuingUpdatePin", 14, "issuing_update_pin");
        IssuingUpdatePin = paymentAnalyticsEvent15;
        PaymentAnalyticsEvent paymentAnalyticsEvent16 = new PaymentAnalyticsEvent("SourceCreate", 15, "source_creation");
        SourceCreate = paymentAnalyticsEvent16;
        PaymentAnalyticsEvent paymentAnalyticsEvent17 = new PaymentAnalyticsEvent("SourceRetrieve", 16, "retrieve_source");
        SourceRetrieve = paymentAnalyticsEvent17;
        PaymentAnalyticsEvent paymentAnalyticsEvent18 = new PaymentAnalyticsEvent("PaymentIntentConfirm", 17, "payment_intent_confirmation");
        PaymentIntentConfirm = paymentAnalyticsEvent18;
        PaymentAnalyticsEvent paymentAnalyticsEvent19 = new PaymentAnalyticsEvent("PaymentIntentRetrieve", 18, "payment_intent_retrieval");
        PaymentIntentRetrieve = paymentAnalyticsEvent19;
        PaymentAnalyticsEvent paymentAnalyticsEvent20 = new PaymentAnalyticsEvent("PaymentIntentRetrieveOrdered", 19, "payment_intent_retrieval_ordered");
        PaymentIntentRetrieveOrdered = paymentAnalyticsEvent20;
        PaymentAnalyticsEvent paymentAnalyticsEvent21 = new PaymentAnalyticsEvent("PaymentIntentCancelSource", 20, "payment_intent_cancel_source");
        PaymentIntentCancelSource = paymentAnalyticsEvent21;
        PaymentAnalyticsEvent paymentAnalyticsEvent22 = new PaymentAnalyticsEvent("PaymentIntentRefresh", 21, "payment_intent_refresh");
        PaymentIntentRefresh = paymentAnalyticsEvent22;
        PaymentAnalyticsEvent paymentAnalyticsEvent23 = new PaymentAnalyticsEvent("SetupIntentConfirm", 22, "setup_intent_confirmation");
        SetupIntentConfirm = paymentAnalyticsEvent23;
        PaymentAnalyticsEvent paymentAnalyticsEvent24 = new PaymentAnalyticsEvent("SetupIntentRetrieve", 23, "setup_intent_retrieval");
        SetupIntentRetrieve = paymentAnalyticsEvent24;
        PaymentAnalyticsEvent paymentAnalyticsEvent25 = new PaymentAnalyticsEvent("SetupIntentRetrieveOrdered", 24, "setup_intent_retrieval_ordered");
        SetupIntentRetrieveOrdered = paymentAnalyticsEvent25;
        PaymentAnalyticsEvent paymentAnalyticsEvent26 = new PaymentAnalyticsEvent("SetupIntentCancelSource", 25, "setup_intent_cancel_source");
        SetupIntentCancelSource = paymentAnalyticsEvent26;
        PaymentAnalyticsEvent paymentAnalyticsEvent27 = new PaymentAnalyticsEvent("SetupIntentRefresh", 26, "setup_intent_refresh");
        SetupIntentRefresh = paymentAnalyticsEvent27;
        PaymentAnalyticsEvent paymentAnalyticsEvent28 = new PaymentAnalyticsEvent("PaymentLauncherConfirmStarted", 27, "paymenthandler.confirm.started");
        PaymentLauncherConfirmStarted = paymentAnalyticsEvent28;
        PaymentAnalyticsEvent paymentAnalyticsEvent29 = new PaymentAnalyticsEvent("PaymentLauncherConfirmFinished", 28, "paymenthandler.confirm.finished");
        PaymentLauncherConfirmFinished = paymentAnalyticsEvent29;
        PaymentAnalyticsEvent paymentAnalyticsEvent30 = new PaymentAnalyticsEvent("PaymentLauncherNextActionStarted", 29, "paymenthandler.handle_next_action.started");
        PaymentLauncherNextActionStarted = paymentAnalyticsEvent30;
        PaymentAnalyticsEvent paymentAnalyticsEvent31 = new PaymentAnalyticsEvent("PaymentLauncherNextActionFinished", 30, "paymenthandler.handle_next_action.finished");
        PaymentLauncherNextActionFinished = paymentAnalyticsEvent31;
        PaymentAnalyticsEvent paymentAnalyticsEvent32 = new PaymentAnalyticsEvent("FileCreate", 31, "create_file");
        FileCreate = paymentAnalyticsEvent32;
        PaymentAnalyticsEvent paymentAnalyticsEvent33 = new PaymentAnalyticsEvent("Auth3ds1Sdk", 32, "3ds1_sdk");
        Auth3ds1Sdk = paymentAnalyticsEvent33;
        PaymentAnalyticsEvent paymentAnalyticsEvent34 = new PaymentAnalyticsEvent("Auth3ds1ChallengeStart", 33, "3ds1_challenge_start");
        Auth3ds1ChallengeStart = paymentAnalyticsEvent34;
        PaymentAnalyticsEvent paymentAnalyticsEvent35 = new PaymentAnalyticsEvent("Auth3ds1ChallengeError", 34, "3ds1_challenge_error");
        Auth3ds1ChallengeError = paymentAnalyticsEvent35;
        PaymentAnalyticsEvent paymentAnalyticsEvent36 = new PaymentAnalyticsEvent("Auth3ds1ChallengeComplete", 35, "3ds1_challenge_complete");
        Auth3ds1ChallengeComplete = paymentAnalyticsEvent36;
        PaymentAnalyticsEvent paymentAnalyticsEvent37 = new PaymentAnalyticsEvent("AuthWithWebView", 36, "auth_with_webview");
        AuthWithWebView = paymentAnalyticsEvent37;
        PaymentAnalyticsEvent paymentAnalyticsEvent38 = new PaymentAnalyticsEvent("AuthWithCustomTabs", 37, "auth_with_customtabs");
        AuthWithCustomTabs = paymentAnalyticsEvent38;
        PaymentAnalyticsEvent paymentAnalyticsEvent39 = new PaymentAnalyticsEvent("AuthWithDefaultBrowser", 38, "auth_with_defaultbrowser");
        AuthWithDefaultBrowser = paymentAnalyticsEvent39;
        PaymentAnalyticsEvent paymentAnalyticsEvent40 = new PaymentAnalyticsEvent("ConfirmReturnUrlNull", 39, "confirm_returnurl_null");
        ConfirmReturnUrlNull = paymentAnalyticsEvent40;
        PaymentAnalyticsEvent paymentAnalyticsEvent41 = new PaymentAnalyticsEvent("ConfirmReturnUrlDefault", 40, "confirm_returnurl_default");
        ConfirmReturnUrlDefault = paymentAnalyticsEvent41;
        PaymentAnalyticsEvent paymentAnalyticsEvent42 = new PaymentAnalyticsEvent("ConfirmReturnUrlCustom", 41, "confirm_returnurl_custom");
        ConfirmReturnUrlCustom = paymentAnalyticsEvent42;
        PaymentAnalyticsEvent paymentAnalyticsEvent43 = new PaymentAnalyticsEvent("FpxBankStatusesRetrieve", 42, "retrieve_fpx_bank_statuses");
        FpxBankStatusesRetrieve = paymentAnalyticsEvent43;
        PaymentAnalyticsEvent paymentAnalyticsEvent44 = new PaymentAnalyticsEvent("StripeUrlRetrieve", 43, "retrieve_stripe_url");
        StripeUrlRetrieve = paymentAnalyticsEvent44;
        PaymentAnalyticsEvent paymentAnalyticsEvent45 = new PaymentAnalyticsEvent("Auth3ds2RequestParamsFailed", 44, "3ds2_authentication_request_params_failed");
        Auth3ds2RequestParamsFailed = paymentAnalyticsEvent45;
        PaymentAnalyticsEvent paymentAnalyticsEvent46 = new PaymentAnalyticsEvent("Auth3ds2Fingerprint", 45, "3ds2_fingerprint");
        Auth3ds2Fingerprint = paymentAnalyticsEvent46;
        PaymentAnalyticsEvent paymentAnalyticsEvent47 = new PaymentAnalyticsEvent("Auth3ds2Start", 46, "3ds2_authenticate");
        Auth3ds2Start = paymentAnalyticsEvent47;
        PaymentAnalyticsEvent paymentAnalyticsEvent48 = new PaymentAnalyticsEvent("Auth3ds2Frictionless", 47, "3ds2_frictionless_flow");
        Auth3ds2Frictionless = paymentAnalyticsEvent48;
        PaymentAnalyticsEvent paymentAnalyticsEvent49 = new PaymentAnalyticsEvent("Auth3ds2ChallengePresented", 48, "3ds2_challenge_flow_presented");
        Auth3ds2ChallengePresented = paymentAnalyticsEvent49;
        PaymentAnalyticsEvent paymentAnalyticsEvent50 = new PaymentAnalyticsEvent("Auth3ds2ChallengeCanceled", 49, "3ds2_challenge_flow_canceled");
        Auth3ds2ChallengeCanceled = paymentAnalyticsEvent50;
        PaymentAnalyticsEvent paymentAnalyticsEvent51 = new PaymentAnalyticsEvent("Auth3ds2ChallengeCompleted", 50, "3ds2_challenge_flow_completed");
        Auth3ds2ChallengeCompleted = paymentAnalyticsEvent51;
        PaymentAnalyticsEvent paymentAnalyticsEvent52 = new PaymentAnalyticsEvent("Auth3ds2ChallengeErrored", 51, "3ds2_challenge_flow_errored");
        Auth3ds2ChallengeErrored = paymentAnalyticsEvent52;
        PaymentAnalyticsEvent paymentAnalyticsEvent53 = new PaymentAnalyticsEvent("Auth3ds2ChallengeTimedOut", 52, "3ds2_challenge_flow_timed_out");
        Auth3ds2ChallengeTimedOut = paymentAnalyticsEvent53;
        PaymentAnalyticsEvent paymentAnalyticsEvent54 = new PaymentAnalyticsEvent("Auth3ds2Fallback", 53, "3ds2_fallback");
        Auth3ds2Fallback = paymentAnalyticsEvent54;
        PaymentAnalyticsEvent paymentAnalyticsEvent55 = new PaymentAnalyticsEvent("AuthRedirect", 54, "url_redirect_next_action");
        AuthRedirect = paymentAnalyticsEvent55;
        PaymentAnalyticsEvent paymentAnalyticsEvent56 = new PaymentAnalyticsEvent("AuthError", 55, "auth_error");
        AuthError = paymentAnalyticsEvent56;
        PaymentAnalyticsEvent paymentAnalyticsEvent57 = new PaymentAnalyticsEvent("AuthSourceStart", 56, "auth_source_start");
        AuthSourceStart = paymentAnalyticsEvent57;
        PaymentAnalyticsEvent paymentAnalyticsEvent58 = new PaymentAnalyticsEvent("AuthSourceRedirect", 57, "auth_source_redirect");
        AuthSourceRedirect = paymentAnalyticsEvent58;
        PaymentAnalyticsEvent paymentAnalyticsEvent59 = new PaymentAnalyticsEvent("AuthSourceResult", 58, "auth_source_result");
        AuthSourceResult = paymentAnalyticsEvent59;
        PaymentAnalyticsEvent paymentAnalyticsEvent60 = new PaymentAnalyticsEvent("RadarSessionCreate", 59, "radar_session_create");
        RadarSessionCreate = paymentAnalyticsEvent60;
        PaymentAnalyticsEvent paymentAnalyticsEvent61 = new PaymentAnalyticsEvent("GooglePayLauncherInit", 60, "googlepaylauncher_init");
        GooglePayLauncherInit = paymentAnalyticsEvent61;
        PaymentAnalyticsEvent paymentAnalyticsEvent62 = new PaymentAnalyticsEvent("GooglePayPaymentMethodLauncherInit", 61, "googlepaypaymentmethodlauncher_init");
        GooglePayPaymentMethodLauncherInit = paymentAnalyticsEvent62;
        PaymentAnalyticsEvent paymentAnalyticsEvent63 = new PaymentAnalyticsEvent("CardMetadataPublishableKeyAvailable", 62, "card_metadata_pk_available");
        CardMetadataPublishableKeyAvailable = paymentAnalyticsEvent63;
        PaymentAnalyticsEvent paymentAnalyticsEvent64 = new PaymentAnalyticsEvent("CardMetadataPublishableKeyUnavailable", 63, "card_metadata_pk_unavailable");
        CardMetadataPublishableKeyUnavailable = paymentAnalyticsEvent64;
        PaymentAnalyticsEvent paymentAnalyticsEvent65 = new PaymentAnalyticsEvent("CardMetadataLoadedTooSlow", 64, "card_metadata_loaded_too_slow");
        CardMetadataLoadedTooSlow = paymentAnalyticsEvent65;
        PaymentAnalyticsEvent paymentAnalyticsEvent66 = new PaymentAnalyticsEvent("CardMetadataLoadFailure", 65, "card_metadata_load_failure");
        CardMetadataLoadFailure = paymentAnalyticsEvent66;
        PaymentAnalyticsEvent paymentAnalyticsEvent67 = new PaymentAnalyticsEvent("CardMetadataMissingRange", 66, "card_metadata_missing_range");
        CardMetadataMissingRange = paymentAnalyticsEvent67;
        PaymentAnalyticsEvent paymentAnalyticsEvent68 = new PaymentAnalyticsEvent("CardMetadataExpectedExtraDigitsButUserEntered16ThenSwitchedFields", 67, "card_metadata.expected_extra_digits_but_user_entered_16_then_switched_fields");
        CardMetadataExpectedExtraDigitsButUserEntered16ThenSwitchedFields = paymentAnalyticsEvent68;
        PaymentAnalyticsEvent paymentAnalyticsEvent69 = new PaymentAnalyticsEvent("MobileCardElementShown", 68, "mobile_card_element_shown");
        MobileCardElementShown = paymentAnalyticsEvent69;
        PaymentAnalyticsEvent paymentAnalyticsEvent70 = new PaymentAnalyticsEvent("MobileCardElementInteraction", 69, "mobile_card_element_interaction");
        MobileCardElementInteraction = paymentAnalyticsEvent70;
        PaymentAnalyticsEvent paymentAnalyticsEvent71 = new PaymentAnalyticsEvent("MobileCardElementFormCompleted", 70, "mobile_card_element_form_completed");
        MobileCardElementFormCompleted = paymentAnalyticsEvent71;
        PaymentAnalyticsEvent[] paymentAnalyticsEventArr = {paymentAnalyticsEvent, paymentAnalyticsEvent2, paymentAnalyticsEvent3, paymentAnalyticsEvent4, paymentAnalyticsEvent5, paymentAnalyticsEvent6, paymentAnalyticsEvent7, paymentAnalyticsEvent8, paymentAnalyticsEvent9, paymentAnalyticsEvent10, paymentAnalyticsEvent11, paymentAnalyticsEvent12, paymentAnalyticsEvent13, paymentAnalyticsEvent14, paymentAnalyticsEvent15, paymentAnalyticsEvent16, paymentAnalyticsEvent17, paymentAnalyticsEvent18, paymentAnalyticsEvent19, paymentAnalyticsEvent20, paymentAnalyticsEvent21, paymentAnalyticsEvent22, paymentAnalyticsEvent23, paymentAnalyticsEvent24, paymentAnalyticsEvent25, paymentAnalyticsEvent26, paymentAnalyticsEvent27, paymentAnalyticsEvent28, paymentAnalyticsEvent29, paymentAnalyticsEvent30, paymentAnalyticsEvent31, paymentAnalyticsEvent32, paymentAnalyticsEvent33, paymentAnalyticsEvent34, paymentAnalyticsEvent35, paymentAnalyticsEvent36, paymentAnalyticsEvent37, paymentAnalyticsEvent38, paymentAnalyticsEvent39, paymentAnalyticsEvent40, paymentAnalyticsEvent41, paymentAnalyticsEvent42, paymentAnalyticsEvent43, paymentAnalyticsEvent44, paymentAnalyticsEvent45, paymentAnalyticsEvent46, paymentAnalyticsEvent47, paymentAnalyticsEvent48, paymentAnalyticsEvent49, paymentAnalyticsEvent50, paymentAnalyticsEvent51, paymentAnalyticsEvent52, paymentAnalyticsEvent53, paymentAnalyticsEvent54, paymentAnalyticsEvent55, paymentAnalyticsEvent56, paymentAnalyticsEvent57, paymentAnalyticsEvent58, paymentAnalyticsEvent59, paymentAnalyticsEvent60, paymentAnalyticsEvent61, paymentAnalyticsEvent62, paymentAnalyticsEvent63, paymentAnalyticsEvent64, paymentAnalyticsEvent65, paymentAnalyticsEvent66, paymentAnalyticsEvent67, paymentAnalyticsEvent68, paymentAnalyticsEvent69, paymentAnalyticsEvent70, paymentAnalyticsEvent71};
        $VALUES = paymentAnalyticsEventArr;
        $ENTRIES = new wg7(paymentAnalyticsEventArr);
        Companion = new Object();
    }

    public PaymentAnalyticsEvent(String str, int i, String str2) {
        this.code = str2;
    }

    public static PaymentAnalyticsEvent valueOf(String str) {
        return (PaymentAnalyticsEvent) Enum.valueOf(PaymentAnalyticsEvent.class, str);
    }

    public static PaymentAnalyticsEvent[] values() {
        return (PaymentAnalyticsEvent[]) $VALUES.clone();
    }

    @Override // defpackage.fp
    public final String c() {
        return toString();
    }

    @Override // java.lang.Enum
    public String toString() {
        return k84.g("stripe_android.", this.code);
    }
}
