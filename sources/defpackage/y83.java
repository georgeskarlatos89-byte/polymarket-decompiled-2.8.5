package defpackage;

import com.checkout.components.ui.model.CardScheme;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class y83 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardScheme.values().length];
        try {
            iArr[CardScheme.AMERICAN_EXPRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardScheme.CARTES_BANCAIRES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CardScheme.DINERS_CLUB.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CardScheme.DISCOVER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CardScheme.JCB.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CardScheme.MADA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[CardScheme.MAESTRO.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[CardScheme.MASTERCARD.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[CardScheme.UNION_PAY.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[CardScheme.VISA.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[CardScheme.UNKNOWN.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        a = iArr;
    }
}
