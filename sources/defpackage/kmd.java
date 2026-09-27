package defpackage;

import com.polymarket.usviewmodels.OrderBookViewModel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class kmd {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderBookViewModel.EmptyStatePresentation.Action.values().length];
        try {
            iArr[OrderBookViewModel.EmptyStatePresentation.Action.openLimitOrder.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderBookViewModel.EmptyStatePresentation.Action.retry.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
