package defpackage;

import com.checkout.components.rememberme.model.SelectedPaymentMethod;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ezk {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SelectedPaymentMethod.values().length];
        try {
            iArr[SelectedPaymentMethod.SAVED_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectedPaymentMethod.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SelectedPaymentMethod.ADD_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
