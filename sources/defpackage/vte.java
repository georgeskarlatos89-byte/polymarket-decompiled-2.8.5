package defpackage;

import com.stripe.android.model.StripeIntent$Status;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class vte {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[nte.values().length];
        try {
            iArr[nte.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[nte.Failed.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[nte.Success.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[nte.Canceled.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[StripeIntent$Status.values().length];
        try {
            iArr2[StripeIntent$Status.RequiresAction.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[StripeIntent$Status.Succeeded.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[StripeIntent$Status.Canceled.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[StripeIntent$Status.Processing.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[StripeIntent$Status.RequiresConfirmation.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[StripeIntent$Status.RequiresPaymentMethod.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[StripeIntent$Status.RequiresCapture.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        b = iArr2;
    }
}
