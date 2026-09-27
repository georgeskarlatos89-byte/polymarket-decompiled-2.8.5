package defpackage;

import com.polymarket.usviewmodels.PaymentMethodsViewModel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class w9e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentMethodsViewModel.PaymentStep.values().length];
        try {
            iArr[PaymentMethodsViewModel.PaymentStep.methodSelection.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentMethodsViewModel.PaymentStep.billingAddressSearch.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentMethodsViewModel.PaymentStep.billingAddressForm.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentMethodsViewModel.PaymentStep.mfaVerification.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PaymentMethodsViewModel.PaymentStep.paymentSelection.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
