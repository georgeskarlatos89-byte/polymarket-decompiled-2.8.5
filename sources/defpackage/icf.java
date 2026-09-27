package defpackage;

import com.polymarket.usviewmodels.PromotionsHubViewModel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class icf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PromotionsHubViewModel.Tab.values().length];
        try {
            iArr[PromotionsHubViewModel.Tab.active.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PromotionsHubViewModel.Tab.past.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
