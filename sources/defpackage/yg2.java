package defpackage;

import com.polymarket.data.EPaymentMethod;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class yg2 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[xg2.values().length];
        try {
            iArr[xg2.Filled.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xg2.Stroked.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[EPaymentMethod.MethodType.values().length];
        try {
            iArr2[EPaymentMethod.MethodType.card.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EPaymentMethod.MethodType.applePay.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EPaymentMethod.MethodType.googlePay.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EPaymentMethod.MethodType.unknown.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EPaymentMethod.MethodType.bank.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[EPaymentMethod.MethodType.paypal.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[EPaymentMethod.MethodType.venmo.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr2;
    }
}
