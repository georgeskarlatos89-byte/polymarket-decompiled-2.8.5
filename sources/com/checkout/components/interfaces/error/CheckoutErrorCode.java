package com.checkout.components.interfaces.error;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0016\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "", "<init>", "(Ljava/lang/String;I)V", "CONFIGURATION_INVALID", "PAYMENT_METHOD_ATTEMPT_FAILED", "PAYMENT_SESSION_FAILED", "PAYMENT_REQUEST_FAILED", "CARD_AUTHENTICATION_FAILED", "COMPONENT_NOT_SUPPORTED", "PAYMENT_REQUEST_DECLINED", "DEPENDENCY_NOT_PROVIDED", "COMPONENT_IS_AVAILABLE_NOT_CHECKED", "CALLBACK_NOT_PROVIDED", "METHOD_NOT_SUPPORTED", "COMPONENT_INVALID", "SUBMISSION_PARSE_ERROR", "BASE64_ENCODING_FAILED", "MERCHANT_HANDLE_SUBMIT_CALLBACK_FAILED", "UPDATE_PARAMETER_INVALID", "INVALID_SETUP", "VALIDATION_FAILED", "SERVER_COMMUNICATION_ERROR", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CheckoutErrorCode {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ CheckoutErrorCode[] $VALUES;
    public static final CheckoutErrorCode CONFIGURATION_INVALID = new CheckoutErrorCode("CONFIGURATION_INVALID", 0);
    public static final CheckoutErrorCode PAYMENT_METHOD_ATTEMPT_FAILED = new CheckoutErrorCode("PAYMENT_METHOD_ATTEMPT_FAILED", 1);
    public static final CheckoutErrorCode PAYMENT_SESSION_FAILED = new CheckoutErrorCode("PAYMENT_SESSION_FAILED", 2);
    public static final CheckoutErrorCode PAYMENT_REQUEST_FAILED = new CheckoutErrorCode("PAYMENT_REQUEST_FAILED", 3);
    public static final CheckoutErrorCode CARD_AUTHENTICATION_FAILED = new CheckoutErrorCode("CARD_AUTHENTICATION_FAILED", 4);
    public static final CheckoutErrorCode COMPONENT_NOT_SUPPORTED = new CheckoutErrorCode("COMPONENT_NOT_SUPPORTED", 5);
    public static final CheckoutErrorCode PAYMENT_REQUEST_DECLINED = new CheckoutErrorCode("PAYMENT_REQUEST_DECLINED", 6);
    public static final CheckoutErrorCode DEPENDENCY_NOT_PROVIDED = new CheckoutErrorCode("DEPENDENCY_NOT_PROVIDED", 7);
    public static final CheckoutErrorCode COMPONENT_IS_AVAILABLE_NOT_CHECKED = new CheckoutErrorCode("COMPONENT_IS_AVAILABLE_NOT_CHECKED", 8);
    public static final CheckoutErrorCode CALLBACK_NOT_PROVIDED = new CheckoutErrorCode("CALLBACK_NOT_PROVIDED", 9);
    public static final CheckoutErrorCode METHOD_NOT_SUPPORTED = new CheckoutErrorCode("METHOD_NOT_SUPPORTED", 10);
    public static final CheckoutErrorCode COMPONENT_INVALID = new CheckoutErrorCode("COMPONENT_INVALID", 11);
    public static final CheckoutErrorCode SUBMISSION_PARSE_ERROR = new CheckoutErrorCode("SUBMISSION_PARSE_ERROR", 12);
    public static final CheckoutErrorCode BASE64_ENCODING_FAILED = new CheckoutErrorCode("BASE64_ENCODING_FAILED", 13);
    public static final CheckoutErrorCode MERCHANT_HANDLE_SUBMIT_CALLBACK_FAILED = new CheckoutErrorCode("MERCHANT_HANDLE_SUBMIT_CALLBACK_FAILED", 14);
    public static final CheckoutErrorCode UPDATE_PARAMETER_INVALID = new CheckoutErrorCode("UPDATE_PARAMETER_INVALID", 15);
    public static final CheckoutErrorCode INVALID_SETUP = new CheckoutErrorCode("INVALID_SETUP", 16);
    public static final CheckoutErrorCode VALIDATION_FAILED = new CheckoutErrorCode("VALIDATION_FAILED", 17);
    public static final CheckoutErrorCode SERVER_COMMUNICATION_ERROR = new CheckoutErrorCode("SERVER_COMMUNICATION_ERROR", 18);

    private static final /* synthetic */ CheckoutErrorCode[] $values() {
        return new CheckoutErrorCode[]{CONFIGURATION_INVALID, PAYMENT_METHOD_ATTEMPT_FAILED, PAYMENT_SESSION_FAILED, PAYMENT_REQUEST_FAILED, CARD_AUTHENTICATION_FAILED, COMPONENT_NOT_SUPPORTED, PAYMENT_REQUEST_DECLINED, DEPENDENCY_NOT_PROVIDED, COMPONENT_IS_AVAILABLE_NOT_CHECKED, CALLBACK_NOT_PROVIDED, METHOD_NOT_SUPPORTED, COMPONENT_INVALID, SUBMISSION_PARSE_ERROR, BASE64_ENCODING_FAILED, MERCHANT_HANDLE_SUBMIT_CALLBACK_FAILED, UPDATE_PARAMETER_INVALID, INVALID_SETUP, VALIDATION_FAILED, SERVER_COMMUNICATION_ERROR};
    }

    static {
        CheckoutErrorCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private CheckoutErrorCode(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static CheckoutErrorCode valueOf(String str) {
        return (CheckoutErrorCode) Enum.valueOf(CheckoutErrorCode.class, str);
    }

    public static CheckoutErrorCode[] values() {
        return (CheckoutErrorCode[]) $VALUES.clone();
    }
}
