package defpackage;

import com.stripe.android.model.LinkBrand;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class y9e {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[c6e.values().length];
        try {
            iArr[c6e.Card.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c6e.SepaDebit.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c6e.USBankAccount.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c6e.Link.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[r43.values().length];
        try {
            iArr2[r43.Visa.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[r43.AmericanExpress.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[r43.Discover.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[r43.JCB.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[r43.DinersClub.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[r43.MasterCard.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[r43.UnionPay.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[r43.CartesBancaires.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[r43.Interac.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[r43.Unknown.ordinal()] = 10;
        } catch (NoSuchFieldError unused14) {
        }
        b = iArr2;
        int[] iArr3 = new int[LinkBrand.values().length];
        try {
            iArr3[LinkBrand.Link.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[LinkBrand.Onelink.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        c = iArr3;
        int[] iArr4 = new int[rk9.values().length];
        try {
            iArr4[rk9.Filled.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[rk9.Outlined.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        d = iArr4;
    }
}
