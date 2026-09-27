package defpackage;

import com.stripe.android.model.StripeIntent$NextActionType;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class b5d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StripeIntent$NextActionType.values().length];
        try {
            iArr[StripeIntent$NextActionType.DisplayOxxoDetails.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StripeIntent$NextActionType.DisplayBoletoDetails.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StripeIntent$NextActionType.DisplayKonbiniDetails.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StripeIntent$NextActionType.DisplayMultibancoDetails.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[StripeIntent$NextActionType.DisplayPayNowDetails.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[StripeIntent$NextActionType.DisplayPromptPayDetails.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[StripeIntent$NextActionType.RedirectToUrl.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[StripeIntent$NextActionType.UseStripeSdk.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[StripeIntent$NextActionType.AlipayRedirect.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[StripeIntent$NextActionType.BlikAuthorize.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[StripeIntent$NextActionType.WeChatPayRedirect.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[StripeIntent$NextActionType.VerifyWithMicrodeposits.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[StripeIntent$NextActionType.CashAppRedirect.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[StripeIntent$NextActionType.SwishRedirect.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        a = iArr;
    }
}
