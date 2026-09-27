package defpackage;

import com.polymarket.usviewmodels.SellLimitOrderViewModel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class mtg {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SellLimitOrderViewModel.FocusedField.values().length];
        try {
            iArr[SellLimitOrderViewModel.FocusedField.shares.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SellLimitOrderViewModel.FocusedField.price.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
