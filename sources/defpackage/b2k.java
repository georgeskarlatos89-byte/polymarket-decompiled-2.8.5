package defpackage;

import com.checkout.components.ui.model.CardScheme;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class b2k {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardScheme.values().length];
        try {
            iArr[CardScheme.AMERICAN_EXPRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardScheme.DISCOVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CardScheme.JCB.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CardScheme.VISA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CardScheme.MASTERCARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
