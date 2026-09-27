package defpackage;

import com.checkout.components.interfaces.model.PaymentMethodName;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class o5a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PaymentMethodName.values().length];
        try {
            iArr[PaymentMethodName.Card.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentMethodName.GooglePay.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentMethodName.RememberMe.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[cie.values().length];
        try {
            iArr2[cie.ActionRequired.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[cie.Approved.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[cie.Declined.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
