package defpackage;

import com.stripe.android.model.StripeIntent$NextActionType;
import com.stripe.android.model.StripeIntent$Status;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class e8i {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[StripeIntent$Status.values().length];
        try {
            iArr[StripeIntent$Status.RequiresAction.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StripeIntent$Status.Canceled.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StripeIntent$Status.RequiresPaymentMethod.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StripeIntent$Status.Succeeded.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[StripeIntent$Status.RequiresCapture.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[StripeIntent$Status.RequiresConfirmation.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[StripeIntent$Status.Processing.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
        int[] iArr2 = new int[StripeIntent$NextActionType.values().length];
        try {
            iArr2[StripeIntent$NextActionType.RedirectToUrl.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[StripeIntent$NextActionType.UseStripeSdk.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[StripeIntent$NextActionType.AlipayRedirect.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[StripeIntent$NextActionType.WeChatPayRedirect.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[StripeIntent$NextActionType.CashAppRedirect.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[StripeIntent$NextActionType.SwishRedirect.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[StripeIntent$NextActionType.DisplayPayNowDetails.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[StripeIntent$NextActionType.DisplayPromptPayDetails.ordinal()] = 8;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[StripeIntent$NextActionType.BlikAuthorize.ordinal()] = 9;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[StripeIntent$NextActionType.DisplayOxxoDetails.ordinal()] = 10;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[StripeIntent$NextActionType.DisplayBoletoDetails.ordinal()] = 11;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[StripeIntent$NextActionType.DisplayKonbiniDetails.ordinal()] = 12;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[StripeIntent$NextActionType.DisplayMultibancoDetails.ordinal()] = 13;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[StripeIntent$NextActionType.VerifyWithMicrodeposits.ordinal()] = 14;
        } catch (NoSuchFieldError unused21) {
        }
        b = iArr2;
    }
}
