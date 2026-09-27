package com.stripe.android.model;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.ug7;
import defpackage.wg7;
import defpackage.z7i;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0005j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"com/stripe/android/model/StripeIntent$NextActionType", "", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "", "toString", "()Ljava/lang/String;", ApiConstant.KEY_CODE, "Ljava/lang/String;", "a", "Companion", "z7i", "RedirectToUrl", "UseStripeSdk", "DisplayOxxoDetails", "AlipayRedirect", "BlikAuthorize", "WeChatPayRedirect", "VerifyWithMicrodeposits", "CashAppRedirect", "DisplayBoletoDetails", "DisplayKonbiniDetails", "DisplayMultibancoDetails", "DisplayPayNowDetails", "DisplayPromptPayDetails", "SwishRedirect", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StripeIntent$NextActionType {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ StripeIntent$NextActionType[] $VALUES;
    public static final StripeIntent$NextActionType AlipayRedirect;
    public static final StripeIntent$NextActionType BlikAuthorize;
    public static final StripeIntent$NextActionType CashAppRedirect;
    public static final z7i Companion;
    public static final StripeIntent$NextActionType DisplayBoletoDetails;
    public static final StripeIntent$NextActionType DisplayKonbiniDetails;
    public static final StripeIntent$NextActionType DisplayMultibancoDetails;
    public static final StripeIntent$NextActionType DisplayOxxoDetails;
    public static final StripeIntent$NextActionType DisplayPayNowDetails;
    public static final StripeIntent$NextActionType DisplayPromptPayDetails;
    public static final StripeIntent$NextActionType RedirectToUrl;
    public static final StripeIntent$NextActionType SwishRedirect;
    public static final StripeIntent$NextActionType UseStripeSdk;
    public static final StripeIntent$NextActionType VerifyWithMicrodeposits;
    public static final StripeIntent$NextActionType WeChatPayRedirect;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, z7i] */
    static {
        StripeIntent$NextActionType stripeIntent$NextActionType = new StripeIntent$NextActionType("RedirectToUrl", 0, "redirect_to_url");
        RedirectToUrl = stripeIntent$NextActionType;
        StripeIntent$NextActionType stripeIntent$NextActionType2 = new StripeIntent$NextActionType("UseStripeSdk", 1, "use_stripe_sdk");
        UseStripeSdk = stripeIntent$NextActionType2;
        StripeIntent$NextActionType stripeIntent$NextActionType3 = new StripeIntent$NextActionType("DisplayOxxoDetails", 2, "oxxo_display_details");
        DisplayOxxoDetails = stripeIntent$NextActionType3;
        StripeIntent$NextActionType stripeIntent$NextActionType4 = new StripeIntent$NextActionType("AlipayRedirect", 3, "alipay_handle_redirect");
        AlipayRedirect = stripeIntent$NextActionType4;
        StripeIntent$NextActionType stripeIntent$NextActionType5 = new StripeIntent$NextActionType("BlikAuthorize", 4, "blik_authorize");
        BlikAuthorize = stripeIntent$NextActionType5;
        StripeIntent$NextActionType stripeIntent$NextActionType6 = new StripeIntent$NextActionType("WeChatPayRedirect", 5, "wechat_pay_redirect_to_android_app");
        WeChatPayRedirect = stripeIntent$NextActionType6;
        StripeIntent$NextActionType stripeIntent$NextActionType7 = new StripeIntent$NextActionType("VerifyWithMicrodeposits", 6, "verify_with_microdeposits");
        VerifyWithMicrodeposits = stripeIntent$NextActionType7;
        StripeIntent$NextActionType stripeIntent$NextActionType8 = new StripeIntent$NextActionType("CashAppRedirect", 7, "cashapp_handle_redirect_or_display_qr_code");
        CashAppRedirect = stripeIntent$NextActionType8;
        StripeIntent$NextActionType stripeIntent$NextActionType9 = new StripeIntent$NextActionType("DisplayBoletoDetails", 8, "boleto_display_details");
        DisplayBoletoDetails = stripeIntent$NextActionType9;
        StripeIntent$NextActionType stripeIntent$NextActionType10 = new StripeIntent$NextActionType("DisplayKonbiniDetails", 9, "konbini_display_details");
        DisplayKonbiniDetails = stripeIntent$NextActionType10;
        StripeIntent$NextActionType stripeIntent$NextActionType11 = new StripeIntent$NextActionType("DisplayMultibancoDetails", 10, "multibanco_display_details");
        DisplayMultibancoDetails = stripeIntent$NextActionType11;
        StripeIntent$NextActionType stripeIntent$NextActionType12 = new StripeIntent$NextActionType("DisplayPayNowDetails", 11, "paynow_display_qr_code");
        DisplayPayNowDetails = stripeIntent$NextActionType12;
        StripeIntent$NextActionType stripeIntent$NextActionType13 = new StripeIntent$NextActionType("DisplayPromptPayDetails", 12, "promptpay_display_qr_code");
        DisplayPromptPayDetails = stripeIntent$NextActionType13;
        StripeIntent$NextActionType stripeIntent$NextActionType14 = new StripeIntent$NextActionType("SwishRedirect", 13, "swish_handle_redirect_or_display_qr_code");
        SwishRedirect = stripeIntent$NextActionType14;
        StripeIntent$NextActionType[] stripeIntent$NextActionTypeArr = {stripeIntent$NextActionType, stripeIntent$NextActionType2, stripeIntent$NextActionType3, stripeIntent$NextActionType4, stripeIntent$NextActionType5, stripeIntent$NextActionType6, stripeIntent$NextActionType7, stripeIntent$NextActionType8, stripeIntent$NextActionType9, stripeIntent$NextActionType10, stripeIntent$NextActionType11, stripeIntent$NextActionType12, stripeIntent$NextActionType13, stripeIntent$NextActionType14};
        $VALUES = stripeIntent$NextActionTypeArr;
        $ENTRIES = new wg7(stripeIntent$NextActionTypeArr);
        Companion = new Object();
    }

    public StripeIntent$NextActionType(String str, int i, String str2) {
        this.code = str2;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static StripeIntent$NextActionType valueOf(String str) {
        return (StripeIntent$NextActionType) Enum.valueOf(StripeIntent$NextActionType.class, str);
    }

    public static StripeIntent$NextActionType[] values() {
        return (StripeIntent$NextActionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.code;
    }
}
