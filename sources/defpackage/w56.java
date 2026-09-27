package defpackage;

import com.stripe.android.model.StripeIntent$Status;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class w56 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StripeIntent$Status.values().length];
        try {
            iArr[StripeIntent$Status.Canceled.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StripeIntent$Status.Succeeded.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StripeIntent$Status.Processing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StripeIntent$Status.RequiresAction.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[StripeIntent$Status.RequiresConfirmation.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[StripeIntent$Status.RequiresPaymentMethod.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[StripeIntent$Status.RequiresCapture.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
