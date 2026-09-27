package defpackage;

import com.polymarket.clients.ClientPayPalWallet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ly {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ClientPayPalWallet.values().length];
        try {
            iArr[ClientPayPalWallet.venmo.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClientPayPalWallet.paypal.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
