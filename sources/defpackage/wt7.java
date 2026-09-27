package defpackage;

import com.checkout.components.interfaces.Environment;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class wt7 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Environment.values().length];
        try {
            iArr[Environment.SANDBOX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Environment.PRODUCTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[cx5.values().length];
        try {
            iArr2[cx5.NotEnoughFunds.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[cx5.InvalidPaymentSessionData.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[cx5.InvalidCustomerData.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[cx5.MerchantMisconfiguration.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[cx5.TryAgain.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
